
package Modelo;

import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Vista.FrmEmpleados;

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
            System.out.println("[Empleados] Error en MostrarEmpleados: " + e);
        }   
    }
    
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
            
            System.out.println("Dato guardado exitosamente");
            
        }
        catch (Exception e){
            System.out.println("[Empleado] Error en AgregarEmpleado: " + e);
        }
    }
}


