package Controlador;

import Modelo.UserSession;
import Modelo.Usuario;
import Vista.FrmLogin;
import Vista.FrmMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import Vista.FrmRegister;
import Vista.TextPrompt;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.SwingUtilities;

public class ctrlLogin implements MouseListener, ActionListener {
    
    // Llamar otros paquetes
    private Usuario modeloLogin;
    private FrmLogin vistaLogin;
    private String username;
    
    public ctrlLogin(Usuario Modelo, FrmLogin Vista) {
        this.iniciarReloj();
        
        this.modeloLogin = Modelo;
        this.vistaLogin = Vista;
        
        this.vistaLogin.btnLogin.addActionListener(this);
        
        this.vistaLogin.btnSalir.addActionListener(this);
        
        TextPrompt hintCorreo = new TextPrompt("Correo", vistaLogin.txtEmail);
        TextPrompt hintPassWord = new TextPrompt("Contraseña", vistaLogin.txtPassword);
        hintCorreo.setForeground(new java.awt.Color(255, 255, 255));
        hintPassWord.setForeground(new java.awt.Color(255, 255, 255));
        vistaLogin.txtPassword.setEchoChar('●');
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaLogin.btnSalir){
            System.exit(0);
        }
        // Establecer datos
        if (e.getSource() == vistaLogin.btnLogin) {
            // Validaciones de campos vacíos
            String email = vistaLogin.txtEmail.getText();
            String password = vistaLogin.txtPassword.getText();
            
            if (email.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(vistaLogin, "[ERROR] Por favor, complete todos los campos.");
                return;
            }

            // Validar formato de correo
            if (!validarEmail(email)) {
                JOptionPane.showMessageDialog(vistaLogin, "[ERROR] El correo electrónico no es válido.");
                return;
            }

            // Validar longitud de la contraseña 
            if (password.length() < 6) {
                JOptionPane.showMessageDialog(vistaLogin, "[ERROR] La contraseña debe tener al menos 8 caracteres.");
                return;
            }

            modeloLogin.setEmail(email);
            modeloLogin.setContraseña(modeloLogin.encryptSHA256(password));
           
            boolean verify = modeloLogin.Login();
            if (verify) {
    UserSession.setUsername(modeloLogin.getNombre());  // Almacena el nombre en UserSession
    JOptionPane.showMessageDialog(vistaLogin, "Login Exitoso, bienvenido!");
    System.out.println("Login Completado");

    Vista.FrmMenu.initFrmMenu();  // Llama a initFrmMenu sin parámetro
    SwingUtilities.invokeLater(() -> vistaLogin.dispose());
    } else {
        JOptionPane.showMessageDialog(vistaLogin, "[ERROR] Usuario o contraseña incorrectos.");
        System.out.println("Login Fallido");
    }
        } 
    }
    
    
    //Validar el formato del correo
    private boolean validarEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        return email.matches(emailRegex);
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
