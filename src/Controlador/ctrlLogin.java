package Controlador;

import Modelo.Usuario;
import Vista.FrmLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;import Vista.FrmRegister;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


public class ctrlLogin implements MouseListener, ActionListener{
    
   //Llamar otros paquetes
   private Usuario modeloLogin;
   private FrmLogin vistaLogin;
    
    public ctrlLogin(Usuario Modelo, FrmLogin Vista){
        this.iniciarReloj();
        
        this.modeloLogin = Modelo;
        
        this.vistaLogin = Vista;
        
        this.vistaLogin.btnLogin.addActionListener(this);
        this.vistaLogin.btnSignUp.addActionListener(this);

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
       } else if (e.getSource() == vistaLogin.btnSignUp) {
        FrmRegister frmRegister = new FrmRegister(); 
        frmRegister.setVisible(true);
        Vista.FrmRegister.initFrmRegister();
        vistaLogin.dispose();
    }
    }
    public void iniciarReloj() {
    Timer timer = new Timer();
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            SimpleDateFormat formatoFechaHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String fechaHoraActual = formatoFechaHora.format(new Date());
            vistaLogin.lblDate.setText(fechaHoraActual);
        }
    };
    timer.scheduleAtFixedRate(task, 0, 1000); // Actualizar cada segundo (1000 ms)
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
