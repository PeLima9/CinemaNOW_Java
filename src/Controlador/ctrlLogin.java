package Controlador;

import Modelo.Usuario;
import Vista.FrmLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

public class ctrlLogin implements MouseListener, ActionListener{
    
   //Llamar otros paquetes
   private Usuario modeloLogin;
   private FrmLogin vistaLogin;
    
    public ctrlLogin(Usuario Modelo, FrmLogin Vista){
        this.modeloLogin = Modelo;
        
        this.vistaLogin = Vista;
        
        this.vistaLogin.btnLogin.addActionListener(this);

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
         //Establecer datos
        if (e.getSource() == vistaLogin.btnLogin){
           modeloLogin.setEmail(vistaLogin.txtEmail.getText());
           modeloLogin.setContraseña(modeloLogin.encryptSHA256(vistaLogin.txtPassword.getText()));
           
           //Verificar si el login es correcto
           boolean verify = modeloLogin.Login();
           if (verify == true) {
               JOptionPane.showMessageDialog(vistaLogin, "Login Exitoso, bienvenido!");
               System.out.println("Login Completado");

               Vista.FrmMenu.initFrmMenu();
               vistaLogin.dispose();
           }
           else{
               JOptionPane.showMessageDialog(vistaLogin, "[ERROR] Usuario No Existente");
                System.out.println("Login Fallido");

           }
       }
    }
    
    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }
    
}
