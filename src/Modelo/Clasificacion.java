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

   
        public void CargarComboClasificacion(JComboBox<Clasificacion>  comboBox){    
        Connection conexion = ClaseConexion.getConexion();
        comboBox.removeAllItems();
        try{
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery("Select * from Clasificacion");
            while (rs.next()) {
                int idClasificacion = rs.getInt("Clasificacion_id");
                String clasificacion = rs.getString("Nombre_clasificacion");
                comboBox.addItem(new Clasificacion(idClasificacion, clasificacion));                
            }   
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();  
        }
}

    public void CargarComboClasificacion(JComboBox<String> jcbRating) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        }
        
        
