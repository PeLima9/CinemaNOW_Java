
package Modelo;

import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Vista.FrmEmpleados;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Empleado {
    private int idEmpleado;
    private String nombreEmpleado;
    private String correoEmpleado;
    private String passwordEmpleado;
    private double salarioEmpleado;

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public String getPasswordEmpleado() {
        return passwordEmpleado;
    }

    public void setPasswordEmpleado(String passwordEmpleado) {
        this.passwordEmpleado = passwordEmpleado;
    }

    public double getSalarioEmpleado() {
        return salarioEmpleado;
    }

    public void setSalarioEmpleado(double salarioEmpleado) {
        this.salarioEmpleado = salarioEmpleado;
    }
    
    //Select
    public void MostrarEmpleados (JTable Table){
        //Conectar a Oracle
        Connection conexion = ClaseConexion.getConexion();
        
        //Configurar Tabla
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"idEmpleado", "nombreEmpleado", "correoEmpleado", "passwordEmpleado", "salarioEmpleado"});
        
        //Preparar Query
        try {
            Statement statement = conexion.createStatement();
            
            //SQL Query
            ResultSet rs = statement.executeQuery("SELECT * FROM Empleados");
            
            //Agregar filas con datos
            while (rs.next()){
                model.addRow(new Object[]{
                    rs.getInt ("idEmpleado"),
                    rs.getString ("nombreEmpleado"),
                    rs.getString ("correoEmpleado"),
                    rs.getString ("passwordEmpleado"),
                    rs.getDouble ("salario")
                    }
                );
            }
            
            Table.setModel(model);
        }
        catch (Exception e){
            System.out.println("[Empleados] Error en MostrarEmpleados: " + e + "\n");
        }   
    }
    
    //Select
    public void CargarDatosTabla(FrmEmpleados Vista){
        //Cargar fila seleccionada
        int selectedRow = Vista.jtbEmpleados.getSelectedRow();
        
        //Verificar fila seleccionada
        if (selectedRow != -1){
            String idTb = Vista.jtbEmpleados.getValueAt(selectedRow, 0).toString();
            String nombreTb = Vista.jtbEmpleados.getValueAt(selectedRow, 1).toString();
            String correoTb = Vista.jtbEmpleados.getValueAt(selectedRow, 2).toString();
            String passwordTb = Vista.jtbEmpleados.getValueAt(selectedRow, 3).toString();
            String salarioTb = Vista.jtbEmpleados.getValueAt(selectedRow, 4).toString();
            
            Vista.txtNombreEmpleado.setText(nombreTb);
            Vista.txtCorreoEmpleado.setText(correoTb);
            Vista.txtPasswordEmpleado.setText(passwordTb);
            Vista.txtSalario.setText(salarioTb);
        }
    }
    
    //Insert
    public void AgregarEmpleado(){
        //Obtener Conexión
        Connection conexion = ClaseConexion.getConexion();
        
        //Preparar Query
        try {
            //SQL Query
            PreparedStatement addEmpleado = conexion.prepareStatement("INSERT INTO Empleados (nombreEmpleado, correoEmpleado, passwordEmpleado, salario) VALUES (?, ?, ?, ?)");
            
            //Establecer Valores
            addEmpleado.setString(1, getNombreEmpleado());
            addEmpleado.setString(2, getCorreoEmpleado());
            addEmpleado.setString(3, getPasswordEmpleado());
            addEmpleado.setDouble(4, getSalarioEmpleado());
            
            //Ejecutar Query
            addEmpleado.executeUpdate();
            
            System.out.println("Dato guardado exitosamente\n");
            
        }
        catch (Exception e){
            System.out.println("[Empleado] Error en AgregarEmpleado: " + e + "\n");
        }
    }
    
    //Update
    public void EditarEmpleados(JTable Tabla){
        //Obtener Conexión
        Connection conexion = ClaseConexion.getConexion();
        
        //Seleccionar fila de la tabla
        int selectedRow = Tabla.getSelectedRow();
        if (selectedRow != 1) {
             
            String selectedId = Tabla.getValueAt(selectedRow, 0).toString();
            //Preparar Query
            try {
                //SQL Query
                PreparedStatement updateEmpleado = conexion.prepareStatement("UPDATE Empleados SET nombreEmpleado = ?, correoEmpleado = ?, passwordEmpleado = ?, salario = ? WHERE idEmpleado = ?");
                
                //Asignar valores
                updateEmpleado.setString(1, getNombreEmpleado());
                updateEmpleado.setString(2, getCorreoEmpleado());
                updateEmpleado.setString(3, getPasswordEmpleado());
                updateEmpleado.setDouble(4, getSalarioEmpleado());
                
                updateEmpleado.setInt(5, Integer.parseInt(selectedId));
                
                //Ejecutar Query
                updateEmpleado.executeUpdate();
                
                //Imprimir en Consola
                System.out.println("Empleado actualizado exitosamente\n");
            }
            catch (Exception e){
                System.out.println("[Empleado] Error en EditarEmpleado: " + e + "\n");
            }
        }
    }
    
    //Delete
    public void EliminarEmpleado(JTable Tabla){
        //Obtener Conexión
        Connection conexion = ClaseConexion.getConexion();

        //Seleccionar fila de la tabla
        int selectedRow = Tabla.getSelectedRow();
        String id = Tabla.getValueAt(selectedRow, 0).toString();

        //Preparar Query
        try{
            //SQL Query
            PreparedStatement deleteEmpleado = conexion.prepareStatement("DELETE FROM Empleados WHERE idEmpleado = ?");

            //Asignar valores
            deleteEmpleado.setString(1, id);

            //Ejecutar Query
            deleteEmpleado.executeUpdate();

            //Imprimir en Consola
            System.out.println("Empleado eliminado exitosamente\n");
        }
        catch (Exception e){
            System.out.println("[Empleado] Error en EliminarEmpleado: " + e + "\n");
        }
    }
    
    //Encriptación a SHA-256
    public String encryptSHA256(String password) {
	MessageDigest md = null;
	try {
		md = MessageDigest.getInstance("SHA-256");
	}
	catch (NoSuchAlgorithmException e) {
		System.out.println(e.toString());
		return null;
	}
	byte[] hash = md.digest(password.getBytes());
	StringBuffer sb = new StringBuffer();
 
	for(byte b : hash) {
		sb.append(String.format("%02x", b));
	}
 
	return sb.toString();
    }
}


