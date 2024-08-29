
package Modelo;

import java.sql.*;
import java.util.UUID;

public class Usuario {
    private String UUID_Usuario;
    private String Nombre;
    private String Email;
    private String Password;
    private int Rol;
    private String FotoPerfil;
    
    public String getUUID_Usuario() {
        return UUID_Usuario;
    }

    public void setUUID_Usuario(String UUID_Usuario) {
        this.UUID_Usuario = UUID_Usuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getRol() {
        return Rol;
    }

    public void setRol(int Rol) {
        this.Rol = Rol;
    }

    public String getFotoPerfil() {
        return FotoPerfil;
    }

    public void setFotoPerfil(String FotoPerfil) {
        this.FotoPerfil = FotoPerfil;
    }
    
    //Cargar usuario
    public boolean Login() {
        
        //Conectar a ClaseConexion.java
        Connection conexion = ClaseConexion.getConexion();
        boolean resultado = false;

        try {
            //Preparar Query
            String sql = "SELECT * FROM Usuario WHERE Correo = ? AND Contraseña = ?";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, getEmail());
            statement.setString(2, getPassword());
            
            //Ejecutar Query
            ResultSet resultSet = statement.executeQuery();

            //Return si el valor existe
            if (resultSet.next()) {
                resultado = true;
            }

        } catch (SQLException ex) {
            System.out.println("[Error en Modelo: Login] " + ex);
        }

        return resultado;
    }
    
}
