package Controlador;

/**
 *
 * @author Administrador
 */

import Modelo.Usuario;
import Vista.FrmRegister;
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

    this.vistaRegister.btnRegister.addActionListener(this);
    System.out.println("ActionListener asignado al botón de registro.");
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaRegister.btnRegister) {
            System.out.println("El botón de registro fue presionado.");
            // Obtener datos ingresados
            modeloUsuario.setNombre(vistaRegister.txtRegisterName.getText());
            modeloUsuario.setEmail(vistaRegister.txtRegisterEmail.getText());
            modeloUsuario.setContraseña(modeloUsuario.encryptSHA256(vistaRegister.txtRegisterPassword.getText()));

            // Intentar registrar el usuario
            boolean registered = modeloUsuario.registrarUsuario();
            if (registered) {
                JOptionPane.showMessageDialog(vistaRegister, "Registro Exitoso!");
                System.out.println("Usuario registrado");
                vistaRegister.dispose();
            } else {
                JOptionPane.showMessageDialog(vistaRegister, "[ERROR] No se pudo registrar el usuario");
                System.out.println("Error en el registro");
            }
        }
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
    timer.scheduleAtFixedRate(task, 0, 1000); // Actualizar cada segundo (1000 ms)
}
}
