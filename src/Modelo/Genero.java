package Modelo;

import java.sql.*;
import javax.swing.JTable;
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
    
    public Genero(int id, String genero)
    {
        this.genero_id = id;
        this.genero = genero;
    }
    
      @Override
    public String toString()
    {
        return genero;
    }
    
    
    //Metodo para cargar los valores en el ComboBox
    public void CargarComboDoctores(JComboBox comboBox){    
        Connection conexion = ClaseConexion.getConexion();
        comboBox.removeAllItems();
        try{
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery("Select * from GeneroPelicula");
            while (rs.next()) {
                String uuid = rs.getString("genero_id");
                String nombre = rs.getString("genero");
                comboBox.addItem(new Genero(genero_id,genero));                
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();  
        }
    }

    public void Mostrar(JTable jtbCartelera) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
