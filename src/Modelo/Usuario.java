
package Modelo;

import java.sql.*;
import java.util.UUID;

public class Usuario {

    public String getUUID_Usuario() {
        return UUID_Usuario;
    }

    public void setUUID_Usuario(String UUID_Usuario) {
        this.UUID_Usuario = UUID_Usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getRol_id() {
        return rol_id;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }

    public String getFoto_perfil() {
        return foto_perfil;
    }

    public void setFoto_perfil(String foto_perfil) {
        this.foto_perfil = foto_perfil;
    }
    private String UUID_Usuario;
    private String nombre;
    private String email;
    private String contraseña;
    private int rol_id;
    private String foto_perfil;
    
    
    
    //Cargar usuario
    public boolean Login() {
        
        //Conectar a ClaseConexion.java
        Connection conexion = ClaseConexion.getConexion();
        boolean resultado = false;

        try {
            //Preparar Query
            String sql = "SELECT * FROM Usuarios WHERE email = ? AND contraseña = ?";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, getEmail());
            statement.setString(2, getContraseña());
            
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
