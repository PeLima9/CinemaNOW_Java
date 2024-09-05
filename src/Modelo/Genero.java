package Modelo;

import java.sql.*;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import Vista.FrmCartelera;
import javax.swing.JComboBox;


public class Genero {

    private int genero_id;
    private String genero;
    
    public int getGenero_id() {
        return genero_id;
    }

    public void setGenero_id(int genero_id) {
        this.genero_id = genero_id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


//Extras para el ComboBox
    public Genero(){
        
    }
    
    public Genero(int idGenero, String genero)
    {
        this.genero_id = idGenero;
        this.genero = genero;
    }
    
      @Override
    public String toString()
    {
        return genero;
    }
    
    
   
    public void CargarComboGenero(JComboBox comboBox){    
    Connection conexion = ClaseConexion.getConexion();
    comboBox.removeAllItems();
    try{
        Statement statement = conexion.createStatement();
        ResultSet rs = statement.executeQuery("Select * from GeneroPelicula");
        while (rs.next()) {
            int idGenero = rs.getInt("genero_id");
            String nombreGenero = rs.getString("genero");
            comboBox.addItem(new Genero(idGenero, nombreGenero));                
        }   
    } catch(SQLException ex) {
        ex.printStackTrace();  
    }
}
    

  
    
}
