
package Modelo;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.UUID;

public class Usuario {
    private String nombre;
    private String email;
    private String contraseña;
    private int rol_id;
    private String foto_perfil;


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
    
    
    //Iniciar Sesión
    public boolean Login() {
        
        //Conectar a ClaseConexion.java
        Connection conexion = ClaseConexion.getConexion();
        boolean resultado = false;

        try {
            //Preparar Query
            String sql = "SELECT * FROM Usuarios WHERE email = ? AND contraseña = ? AND rol_id = 2";
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
   
    public boolean GetUserData(){
        Connection conexion = ClaseConexion.getConexion();
        
        boolean resultado = false;
        
        try{
            String sql = "SELECT nombre FROM Usuarios WHERE email = ?";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, getEmail());
            
            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()){
                resultado = true;
            }
            
            
        }
        catch (SQLException ex){
            System.out.println("[Error en Modelo: GetUserData] " + ex);
        }
        
        return resultado;
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
    
     public boolean registrarUsuario() {
        Connection con = null;
        PreparedStatement ps = null;
        
        try {
            con = ClaseConexion.getConexion();
            
            String usuario_id = UUID.randomUUID().toString();
            
            String sql = "INSERT INTO usuarios (usuario_id, nombre, email, contraseña, rol_id) VALUES (?, ?, ?, ?, ?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario_id);
            ps.setString(2, nombre);
            ps.setString(3, email);
            ps.setString(4, contraseña);
            ps.setInt(5, 2);

            int result = ps.executeUpdate();
            return result > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
   
}
