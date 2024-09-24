package Controlador;

import javax.swing.JPasswordField;
import Modelo.Usuario;
import static Vista.FrmLogin.initFrmLogin;
import Vista.FrmRegister;
import Vista.TextPrompt;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ctrlRegister implements ActionListener {

    private final Usuario modeloUsuario;
    public FrmRegister vistaRegister;

    public ctrlRegister(Usuario modelo, FrmRegister vista) {
        this.iniciarReloj();
        this.modeloUsuario = modelo;
        this.vistaRegister = vista;
        
        TextPrompt hintPassword = new TextPrompt("Contraseña", vistaRegister.txtRegisterPassword);
        TextPrompt hintUsername = new TextPrompt("Usuario", vistaRegister.txtRegisterName);
        TextPrompt hintCorreo = new TextPrompt("Correo", vistaRegister.txtRegisterEmail);
        TextPrompt hintConfirmPassWord = new TextPrompt("Confirme su contraseña", vistaRegister.txtConfirmPassword);
        hintPassword.setForeground(new java.awt.Color(255, 255, 255));
        hintUsername.setForeground(new java.awt.Color(255, 255, 255));
        hintCorreo.setForeground(new java.awt.Color(255, 255, 255));
        hintConfirmPassWord.setForeground(new java.awt.Color(255, 255, 255));
        vistaRegister.txtRegisterPassword.setEchoChar('●');
        vistaRegister.txtConfirmPassword.setEchoChar('●');
    
        this.vistaRegister.btnRegister.addActionListener(this);
        System.out.println("ActionListener asignado al botón de registro.");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaRegister.btnRegister) {
            System.out.println("El botón de registro fue presionado.");
            
            // Obtener datos ingresados
            String nombre = vistaRegister.txtRegisterName.getText();
            String email = vistaRegister.txtRegisterEmail.getText();
            String password = vistaRegister.txtRegisterPassword.getText();
            String confirmPassword = vistaRegister.txtConfirmPassword.getText();
            
            // Validar campos vacíos
            if (nombre.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                JOptionPane.showMessageDialog(vistaRegister, "[ERROR] Todos los campos son obligatorios.");
                return;
            }

            // Validar formato del correo
            if (!validarEmail(email)) {
                JOptionPane.showMessageDialog(vistaRegister, "[ERROR] El correo electrónico no es válido.");
                return;
            }

            // Validar longitud de la contraseña
            if (password.length() < 6) {
                JOptionPane.showMessageDialog(vistaRegister, "[ERROR] La contraseña debe tener al menos 6 caracteres.");
                return;
            }

            // Validar que las contraseñas coincidan
            if (!password.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(vistaRegister, "[ERROR] Las contraseñas no coinciden.");
                return;
            }

            // Establecer datos en el modelo
            modeloUsuario.setNombre(nombre);
            modeloUsuario.setEmail(email);
            modeloUsuario.setContraseña(modeloUsuario.encryptSHA256(password));

            boolean registered = modeloUsuario.registrarUsuario();
            if (registered) {
                JOptionPane.showMessageDialog(vistaRegister, "Registro Exitoso!");
                System.out.println("Usuario registrado");
                initFrmLogin();
                vistaRegister.dispose();
            } else {
                JOptionPane.showMessageDialog(vistaRegister, "[ERROR] No se pudo registrar el usuario");
                System.out.println("Error en el registro");
            }
        }
    }

    // Método para validar el formato del correo electrónico
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
                vistaRegister.lblDate.setText(fechaHoraActual);
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000); 
    }
}
