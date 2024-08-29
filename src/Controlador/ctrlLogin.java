
package Controlador;

import Modelo.Usuario;
import Vista.FrmLogin;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;


public class ctrlLogin implements MouseListener {
    
    //Llamar otros paquetes
    Usuario Modelo;
    FrmLogin Vista;
    
    public ctrlLogin(Usuario Modelo, FrmLogin Vista){
        this.Modelo = Modelo;
        this.Vista = Vista;
        
        Vista.btnLogin.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
       if (e.getSource() == Vista.btnLogin) {
            Modelo.setEmail(Vista.txtEmail.getText());
            Modelo.setPassword(Vista.txtPassword.getText());

            //Creo una variable llamada "comprobar" 
            //que guardará el resultado de ejecutar el metodo iniciarSesion()            
            boolean comprobar = Modelo.Login();

            //Si la variable es "true" significa que si existe el usuario ingresado    
            if (comprobar == true) {
                JOptionPane.showMessageDialog(Vista,"Login Exitoso, ¡Bienvenido!");
            } else {
                JOptionPane.showMessageDialog(Vista, "El Usuario no Existe");

            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
