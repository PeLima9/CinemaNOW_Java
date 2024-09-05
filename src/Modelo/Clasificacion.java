package Modelo;

import java.sql.*;
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

   
    public void CargarComboClasificacion(JComboBox comboBox) {    
    Connection conexion = ClaseConexion.getConexion();
    comboBox.removeAllItems();     
    try {
        Statement statement = conexion.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM Clasificacion");
        
        while (rs.next()) {
            int idClasificacion = rs.getInt("Clasificacion_id");
            String clasificacionNombre = rs.getString("Nombre_clasificacion");
            comboBox.addItem(new Clasificacion(idClasificacion, clasificacionNombre));
        }
        
        rs.close(); 
        statement.close();  
        }
        catch (SQLException ex) {
            System.out.println("[Clasificacion] Error al cargar ComboBox: " + ex);
        } 
    }
}
            
           
    