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

    public void MostrarEmpleados(JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Correo");
        modelo.addColumn("Salario");

        tabla.setModel(modelo);

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tu_base_de_datos", "root", "password");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM empleados")) {

            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getInt("idEmpleado"),
                    rs.getString("nombreEmpleado"),
                    rs.getString("correoEmpleado"),
                    rs.getDouble("salarioEmpleado")
                });
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar empleados: " + e.getMessage());
        }
    }

    public void CargarDatosTabla(FrmEmpleados vista) {
        int filaSeleccionada = vista.jtbEmpleados.getSelectedRow();
        if (filaSeleccionada >= 0) {
            vista.txtNombreEmpleado.setText(vista.jtbEmpleados.getValueAt(filaSeleccionada, 1).toString());
            vista.txtCorreoEmpleado.setText(vista.jtbEmpleados.getValueAt(filaSeleccionada, 2).toString());
            vista.txtSalario.setText(vista.jtbEmpleados.getValueAt(filaSeleccionada, 3).toString());
        }
    }

    public void AgregarEmpleado() {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tu_base_de_datos", "root", "password");
             PreparedStatement ps = conn.prepareStatement("INSERT INTO empleados (nombreEmpleado, correoEmpleado, passwordEmpleado, salarioEmpleado) VALUES (?, ?, ?, ?)")) {

            ps.setString(1, this.nombreEmpleado);
            ps.setString(2, this.correoEmpleado);
            ps.setString(3, this.passwordEmpleado);
            ps.setDouble(4, this.salarioEmpleado);

            ps.executeUpdate();
            System.out.println("Empleado agregado exitosamente");
        } catch (SQLException e) {
            System.out.println("Error al agregar empleado: " + e.getMessage());
        }
    }

    public void EditarEmpleados(JTable tabla) {
        int filaSeleccionada = tabla.getSelectedRow();
        if (filaSeleccionada >= 0) {
            int idEmpleado = (int) tabla.getValueAt(filaSeleccionada, 0);

            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tu_base_de_datos", "root", "password");
                 PreparedStatement ps = conn.prepareStatement("UPDATE empleados SET nombreEmpleado = ?, correoEmpleado = ?, passwordEmpleado = ?, salarioEmpleado = ? WHERE idEmpleado = ?")) {

                ps.setString(1, this.nombreEmpleado);
                ps.setString(2, this.correoEmpleado);
                ps.setString(3, this.passwordEmpleado);
                ps.setDouble(4, this.salarioEmpleado);
                ps.setInt(5, idEmpleado);

                ps.executeUpdate();
                System.out.println("Empleado actualizado exitosamente");
            } catch (SQLException e) {
                System.out.println("Error al actualizar empleado: " + e.getMessage());
            }
        }
    }

    public void EliminarEmpleado(JTable tabla) {
        int filaSeleccionada = tabla.getSelectedRow();
        if (filaSeleccionada >= 0) {
            int idEmpleado = (int) tabla.getValueAt(filaSeleccionada, 0);

            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tu_base_de_datos", "root", "password");
                 PreparedStatement ps = conn.prepareStatement("DELETE FROM empleados WHERE idEmpleado = ?")) {

                ps.setInt(1, idEmpleado);
                ps.executeUpdate();
                System.out.println("Empleado eliminado exitosamente");
            } catch (SQLException e) {
                System.out.println("Error al eliminar empleado: " + e.getMessage());
            }
        }
    }

    public String encryptSHA256(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes("UTF-8"));
            StringBuilder hexString = new StringBuilder();

            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException | java.io.UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
