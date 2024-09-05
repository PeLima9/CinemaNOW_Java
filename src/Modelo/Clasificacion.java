package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;



public class Clasificacion {

    private int clasificacion_id;
    private String nombre_clasificacion;

    public int getClasificacion_id() {
        return clasificacion_id;
    }

    public void setClasificacion_id(int clasificacion_id) {
        this.clasificacion_id = clasificacion_id;
    }

    public String getNombre_clasificacion() {
        return nombre_clasificacion;
    }

    public void setNombre_clasificacion(String nombre_clasificacion) {
        this.nombre_clasificacion = nombre_clasificacion;
    }

    //Extras para el ComboBox
    public Clasificacion(){
        
    }
    
    public Clasificacion(int idClasificacion, String clasificacion)
    {
        this.clasificacion_id = idClasificacion;
        this.nombre_clasificacion = clasificacion;
    }
    
      @Override
    public String toString()
    {
        return nombre_clasificacion;
    }

   
    public void CargarComboClasificacion(JComboBox<Clasificacion> comboBox) {    
    Connection conexion = ClaseConexion.getConexion();
    comboBox.removeAllItems(); // Asegúrate de limpiar el comboBox antes de llenarlo
    
    try {
        Statement statement = conexion.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM Clasificacion");
        
        while (rs.next()) {
            int idClasificacion = rs.getInt("Clasificacion_id");
            String clasificacionNombre = rs.getString("Nombre_clasificacion");
            comboBox.addItem(new Clasificacion(idClasificacion, clasificacionNombre));
        }
        
        rs.close(); // Asegúrate de cerrar el ResultSet
        statement.close(); // Asegúrate de cerrar el Statement
    } catch (SQLException ex) {
        ex.printStackTrace(); // Imprime la traza de pila para depuración
    } finally {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close(); // Cierra la conexión en el bloque finally
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}}
            
           
    