package Controlador;

import Modelo.ClaseConexion;
import Modelo.Tickets;
import Vista.FrmTickets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ctrlTickets {
    private FrmTickets vista;
    private ArrayList<Tickets> tickets;

    public ctrlTickets(FrmTickets vista) {
        this.vista = vista;
        tickets = new ArrayList<>();
        cargarTickets();
        mostrarTicketsEnTabla();
        vista.btnDeleteTicket.addActionListener(e -> eliminarTicket());
        vista.btnMenu.addActionListener(e -> abrirMenu());
        vista.imgCartelera.addActionListener(e -> abrirCartelera());
        vista.imgTickets.addActionListener(e -> abrirTickets());
        vista.imgEmpleados.addActionListener(e -> abrirEmpleados());
    }
    
       private void abrirCartelera() {
        Vista.FrmCartelera.initFrmCartelera();  // Iniciar el formulario de la cartelera
        vista.dispose();  // Cerrar la ventana actual (FrmTickets)
        System.out.println("FrmCartelera cargado exitosamente\n");  // Imprimir en consola
    }

    // Método para abrir el formulario de tickets
    private void abrirTickets() {
        Vista.FrmTickets.initFrmTickets();  // Iniciar el formulario de tickets
        vista.dispose();  // Cerrar la ventana actual (FrmTickets)
        System.out.println("FrmTickets cargado exitosamente\n");  // Imprimir en consola
    }

    // Método para abrir el formulario de empleados
    private void abrirEmpleados() {
        Vista.FrmEmpleados.initFrmEmpleados();  // Iniciar el formulario de empleados
        vista.dispose();  // Cerrar la ventana actual (FrmTickets)
        System.out.println("FrmEmpleados cargado exitosamente\n");  // Imprimir en consola
    }


    private void cargarTickets() {
        try {
            // Conexión a la base de datos
            Connection con = ClaseConexion.getConexion();
            
            // Consulta SQL
            String query = "SELECT r.funcionand_id, r.usuario_id, u.nombre AS usuario_nombre, u.email, r.pelicula_id, p.titulo AS pelicula_titulo, r.sala_id, s.nombre AS sala_nombre, "
                         + "r.Hora_funcion, r.fecha_reserva, r.total_pago "
                         + "FROM Reservas_Android r "
                         + "JOIN Usuarios u ON r.usuario_id = u.usuario_id "
                         + "JOIN Peliculas p ON r.pelicula_id = p.pelicula_id "
                         + "JOIN Salas_PTC s ON r.sala_id = s.sala_id";
            
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Tickets ticket = new Tickets(
                    rs.getInt("funcionand_id"),
                    rs.getString("usuario_id"),
                    rs.getString("usuario_nombre"),
                    rs.getString("email"),
                    rs.getInt("pelicula_id"),
                    rs.getString("pelicula_titulo"),
                    rs.getInt("sala_id"),
                    rs.getString("sala_nombre"),
                    rs.getString("Hora_funcion"),
                    rs.getDate("fecha_reserva"),
                    rs.getDouble("total_pago")
                );
                tickets.add(ticket);
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void mostrarTicketsEnTabla() {
        DefaultTableModel model = (DefaultTableModel) vista.jtbTickets.getModel();
        
        // Limpiar la tabla
        model.setRowCount(0);
        
        // Establecer los encabezados
        model.setColumnIdentifiers(new Object[]{"Función ID", "Usuario", "Email", "Pelicula", "Sala", "Hora Función", "Fecha Reserva", "Total Pago"});

        // Añadir los tickets a la tabla
        for (Tickets ticket : tickets) {
            model.addRow(new Object[]{
                ticket.getFuncionId(),
                ticket.getUsuarioNombre(),
                ticket.getUsuarioEmail(),
                ticket.getPeliculaTitulo(),
                ticket.getSalaNombre(),
                ticket.getHoraFuncion(),
                ticket.getFechaReserva(),
                ticket.getTotalPago()
            });
        }
    }
   private void eliminarTicket() {
        // Obtener la fila seleccionada
        int selectedRow = vista.jtbTickets.getSelectedRow();

        if (selectedRow == -1) {
            // Si no se seleccionó ningun ticket, mostrar mensaje de error
            JOptionPane.showMessageDialog(vista, "Seleccione un ticket para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Obtener el ID del ticket seleccionado
        int funcionId = (int) vista.jtbTickets.getValueAt(selectedRow, 0);

        // Preguntar al usuario si desea eliminar el ticket
        String[] options = {"Sí", "No"};
        int confirm = JOptionPane.showOptionDialog(
                vista, 
                "¿Está seguro de que desea eliminar este ticket?", 
                "Confirmar eliminación", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE, 
                null,   
                // Opciones ("Sí" y "No")
                options, 
                // Opción predeterminada (index 1, o sea, "No")
                options[1]
        );

        // Si el usuario selecciona "No" no hacer nada
        if (confirm != JOptionPane.YES_OPTION) {
            return; 
            // No hace nada
        }

        try {
            // Conexión
            Connection con = ClaseConexion.getConexion();
            
            String deleteQuery = "DELETE FROM Reservas_Android WHERE funcionand_id = ?";
            PreparedStatement pst = con.prepareStatement(deleteQuery);
            pst.setInt(1, funcionId);

            // Ejecutar la eliminación
            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                // Si se eliminó correctamente, eliminar la fila de la tabla
                ((DefaultTableModel) vista.jtbTickets.getModel()).removeRow(selectedRow);
                JOptionPane.showMessageDialog(vista, "Ticket eliminado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(vista, "No se pudo eliminar el ticket.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(vista, "Ocurrió un error al eliminar el ticket.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
   private void abrirMenu() {
        Vista.FrmMenu.initFrmMenu();  // Iniciar el formulario del menú
        vista.dispose();  // Cerrar la ventana actual (FrmTickets)
        System.out.println("FrmMenu cargado exitosamente\n");  // Imprimir en consola
    }
}