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

public class ctrlRegister implements ActionListener {

    private final Usuario modeloUsuario;
    public FrmRegister vistaRegister;

    public ctrlRegister(Usuario modelo, FrmRegister vista) {
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
}
