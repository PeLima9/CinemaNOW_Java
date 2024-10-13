package Controlador;

import Modelo.ClaseConexion;
import Modelo.Tickets;
import Vista.FrmTickets;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

public class ctrlTickets {
    private FrmTickets vista;
    private ArrayList<Tickets> tickets;
    private Timer timer;

    public ctrlTickets(FrmTickets vista) {
        this.vista = vista;
        tickets = new ArrayList<>();
        this.iniciarReloj();
        // Configura el temporizador para actualizar los tickets cada segundo (1000 ms)
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarTickets();
            }
        });
        
        timer.start(); // Inicia el temporizador
        
        vista.btnDeleteTicket.addActionListener(e -> eliminarTicket());
        vista.btnMenu.addActionListener(e -> abrirMenu());
        vista.imgCartelera.addActionListener(e -> abrirCartelera());
        vista.imgTickets.addActionListener(e -> abrirTickets());
        vista.imgEmpleados.addActionListener(e -> abrirEmpleados());
    }
    
    // Método que se llama cada segundo para actualizar los tickets
    private void actualizarTickets() {
        cargarTickets(); // Carga los tickets desde la base de datos
        mostrarTicketsEnTabla(); // Actualiza la tabla con los tickets cargados
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

            tickets.clear(); // Limpia la lista de tickets antes de cargar nuevos

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

            rs.close();
            pst.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void mostrarTicketsEnTabla() {
    DefaultTableModel model = (DefaultTableModel) vista.jtbTickets.getModel();
    
    // Guardar el índice de la fila seleccionada
    int selectedRow = vista.jtbTickets.getSelectedRow();
    Object selectedTicketId = null;

    // Si hay una fila seleccionada, obtener el ID del ticket seleccionado
    if (selectedRow != -1) {
        selectedTicketId = vista.jtbTickets.getValueAt(selectedRow, 0); // Asumiendo que el ID está en la primera columna
    }

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

    // Restaurar la selección si el ID sigue presente en la tabla
    if (selectedTicketId != null) {
        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).equals(selectedTicketId)) { // Comparar el ID para encontrar la fila
                vista.jtbTickets.setRowSelectionInterval(i, i);
                break;
            }
        }
    }
}

    private void eliminarTicket() {
        // Obtener la fila seleccionada
        int selectedRow = vista.jtbTickets.getSelectedRow();

        if (selectedRow == -1) {
            // Si no se seleccionó ningún ticket, mostrar mensaje de error
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
                options, 
                options[1]
        );

        // Si el usuario selecciona "No", no hacer nada
        if (confirm != JOptionPane.YES_OPTION) {
            return;
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
    
    public void iniciarReloj() {
        java.util.Timer timer = new java.util.Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                SimpleDateFormat formatoFechaHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                String fechaHoraActual = formatoFechaHora.format(new Date());
                vista.lblDate.setText(fechaHoraActual);
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000); // Actualizar cada segundo (1000 ms)
    }

    private void abrirMenu() {
        Vista.FrmMenu.initFrmMenu();  // Iniciar el formulario del menú
        vista.dispose();  // Cerrar la ventana actual (FrmTickets)
        System.out.println("FrmMenu cargado exitosamente\n");  // Imprimir en consola
    }

    private void abrirCartelera() {
        Vista.FrmCartelera.initFrmCartelera();  // Iniciar el formulario de la cartelera
        vista.dispose();  // Cerrar la ventana actual (FrmTickets)
        System.out.println("FrmCartelera cargado exitosamente\n");  // Imprimir en consola
    }

    private void abrirTickets() {
        Vista.FrmTickets.initFrmTickets();  // Iniciar el formulario de tickets
        vista.dispose();  // Cerrar la ventana actual (FrmTickets)
        System.out.println("FrmTickets cargado exitosamente\n");  // Imprimir en consola
    }

    private void abrirEmpleados() {
        Vista.FrmEmpleados.initFrmEmpleados();  // Iniciar el formulario de empleados
        vista.dispose();  // Cerrar la ventana actual (FrmTickets)
        System.out.println("FrmEmpleados cargado exitosamente\n");  // Imprimir en consola
    }
}
