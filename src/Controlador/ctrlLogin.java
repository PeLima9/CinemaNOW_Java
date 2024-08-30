package Controlador;

import Modelo.Usuario;
import Vista.FrmLogin;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

public class ctrlLogin implements MouseListener{
    
    //Llamar otros paquetes
    Usuario modeloLogin;
    FrmLogin vistaLogin;
    
    public ctrlLogin(Usuario Modelo, FrmLogin Vista){
        this.modeloLogin = Modelo;
        this.vistaLogin = Vista;
        
        vistaLogin.btnLogin.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
      
        if (e.getSource() == vistaLogin.btnLogin){
           modeloLogin.setEmail(vistaLogin.txtEmail.getText());
           modeloLogin.setContraseña(vistaLogin.txtPassword.getText());
           
           boolean verify = modeloLogin.Login();
           if (verify == true) {
               JOptionPane.showMessageDialog(vistaLogin, "Login Exitoso, bienvenido!");
               Vista.FrmMenu.initFrmMenu();
               vistaLogin.dispose();
           }
           else{
               JOptionPane.showMessageDialog(vistaLogin, "[ERROR] Usuario No Existente");

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
