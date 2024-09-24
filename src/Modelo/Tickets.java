
package Modelo;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Vista.FrmTickets;
import java.time.LocalDateTime;

public class Tickets {

    
    private int funcionand_id;
    private int usuario_id;
    private int funcion_id;
    private int sala_id;
    private String Hora_funcion; 
    private LocalDateTime fecha_reserva;
    private double total_pago;
    private String metodo_pago;

    public int getFuncionand_id() {
        return funcionand_id;
    }

    public void setFuncionand_id(int funcionand_id) {
        this.funcionand_id = funcionand_id;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public int getFuncion_id() {
        return funcion_id;
    }

    public void setFuncion_id(int funcion_id) {
        this.funcion_id = funcion_id;
    }

    public int getSala_id() {
        return sala_id;
    }

    public void setSala_id(int sala_id) {
        this.sala_id = sala_id;
    }

    public String getHora_funcion() {
        return Hora_funcion;
    }

    public void setHora_funcion(String Hora_funcion) {
        this.Hora_funcion = Hora_funcion;
    }

    public LocalDateTime getFecha_reserva() {
        return fecha_reserva;
    }

    public void setFecha_reserva(LocalDateTime fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    public double getTotal_pago() {
        return total_pago;
    }

    public void setTotal_pago(double total_pago) {
        this.total_pago = total_pago;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

 
    
    public void EliminarTickets(JTable tabla) {
        Connection conexion = ClaseConexion.getConexion();
        int filaSeleccionada = tabla.getSelectedRow();

       
        String miId = tabla.getValueAt(filaSeleccionada, 0).toString();



        try {

            PreparedStatement deleteTickets = conexion.prepareStatement("delete from Reservas_PTC where funcionand_id = ?");

            deleteTickets.setString(1, miId);

            deleteTickets.executeUpdate();

        } catch (Exception e) {

            System.out.println("este es el error metodo de eliminar" + e);

        }
    }
         public void MostrarTickets(JTable tabla) {
    Connection conexion = ClaseConexion.getConexion();
    
    DefaultTableModel model = new DefaultTableModel();
    model.setColumnIdentifiers(new Object[]{"funcionand_id", "usuario_id", "pelicula_id","sala_id", "Hora_funcion" ,"fecha_reserva", "total_pago", "metodo_pago"});
    
    try {
        Statement statement = conexion.createStatement();
        
        // Consulta SQL modificada con JOIN
        ResultSet rs = statement.executeQuery("SELECT r.funcionand_id, r.usuario_id, u.nombre AS usuario_nombre, u.email,r.pelicula_id, p.titulo AS pelicula_titulo, r.sala_id, s.nombre AS sala_nombre, r.Hora_funcion, r.fecha_reserva, r.total_pago FROM Reservas_Android r JOIN Usuarios u ON r.usuario_id = u.usuario_id JOIN Peliculas p ON r.pelicula_id = p.pelicula_id JOIN Salas_PTC s ON r.sala_id = s.sala_id;"
        );
        
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("funcionand_id"), 
                rs.getInt("usuario_id"), 
                rs.getInt("pelicula_id"), 
                rs.getInt("sala_id"), 
                rs.getString("Hora_funcion"), 
                rs.getDate("fecha_reserva"), 
                rs.getDouble("total_pago"), 
                rs.getString("metodo_pago")
            });
        }
        
        tabla.setModel(model);
    } catch (Exception e) {
        System.out.println("[Tickets] Error en MostrarTickets: " + e);
    }
         
    
    
}
    
        
}
