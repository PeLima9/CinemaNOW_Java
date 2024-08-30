
package Controlador;

import Modelo.Usuario;
import Vista.FrmLogin;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;


public class ctrlLogin implements MouseListener {
    
    //Llamar otros paquetes
    Usuario modelo;
    FrmLogin vista;
    
    public ctrlLogin(Usuario Modelo, FrmLogin Vista){
        this.modelo = Modelo;
        this.vista = Vista;
        
        Vista.btnLogin.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
       if (e.getSource() == vista.btnLogin) {
            modelo.setEmail(vista.txtEmail.getText());
            modelo.setPassword(vista.txtPassword.getText());

           //Variable para comprobar datos          
            boolean comprobar = modelo.Login();
            if (comprobar == true) {
                modelo.Login();
                JOptionPane.showMessageDialog(vista,"Login Exitoso, ¡Bienvenido!");
                System.out.println("Login Exitoso, ¡Bienvenido!");
                Vista.FrmMenu.initFrmMenu();
                vista.dispose();
                
            } else {
                JOptionPane.showMessageDialog(vista, "El Usuario no Existe");
                System.out.println("Login Fallido");

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
