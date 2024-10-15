/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Vista.FrmLogin;
import Vista.FrmRegister;
import java.util.prefs.Preferences;

/**
 *
 * @author Administrador
 */
public class MainApp {
     public static void main(String[] args) {
        //Preferences prefs = Preferences.userRoot().node("myApp");
        //prefs.putBoolean("isFirstUse", true);
        // Llamada al método que inicia la aplicación
        launchApp();
    }

    public static void launchApp() {
        // Obtener las preferencias del usuario
        Preferences prefs = Preferences.userRoot().node("myApp");

        // Verificar si es la primera vez que se abre la aplicación
        boolean isFirstUse = prefs.getBoolean("isFirstUse", true);

        if (isFirstUse) {
            // Mostrar la pantalla de registro si es la primera vez
            FrmRegister registro = new FrmRegister();
            Vista.FrmRegister.initFrmRegister();

            // Marcar que el usuario ya abrió la aplicación
            prefs.putBoolean("isFirstUse", false);
        } else {
            // Mostrar la pantalla de login o menú principal
            FrmLogin login = new FrmLogin();
            Vista.FrmLogin.initFrmLogin();

        }
    }
}
