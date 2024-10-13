
package Controlador;

import Modelo.Usuario;
import Vista.FrmMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


public class ctrlMenu implements MouseListener, ActionListener{

    //Llamar otros paquetes
        private Usuario modeloMenu;
        private FrmMenu vistaMenu;
        
    public ctrlMenu(Usuario Modelo, FrmMenu Vista){
        
        this.iniciarReloj();
        
        //Asignar Modelo y Vista
        this.modeloMenu = Modelo;
        this.vistaMenu = Vista;
        
        //Agregar ActionListener
        this.vistaMenu.btnCartelera.addActionListener(this);
        this.vistaMenu.btnTickets.addActionListener(this);
        this.vistaMenu.btnEmpleados.addActionListener(this);
        this.vistaMenu.btnSalir.addActionListener(this);
        this.vistaMenu.btnLogOut.addActionListener(this);
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Boton Cartelera
        if (e.getSource() == vistaMenu.btnCartelera) {
        // Inicializar y mostrar la nueva ventana
        Vista.FrmCartelera.initFrmCartelera();
    
        // Ocultar la ventana actual en lugar de cerrarla de inmediato
        //vistaMenu.setVisible(false);
    
        // Liberar los recursos de la ventana actual tras un breve retardo
        SwingUtilities.invokeLater(() -> vistaMenu.dispose());
    
        System.out.println("FrmCartelera cargado exitosamente");
    }
        
        //Boton Tickets
        if (e.getSource() == vistaMenu.btnTickets){
                Vista.FrmTickets.initFrmTickets();
                SwingUtilities.invokeLater(() -> vistaMenu.dispose());
                System.out.println("FrmTickets cargado exitosamente");
        }
        
        //Boton Empleados
        if (e.getSource() == vistaMenu.btnEmpleados){
                Vista.FrmEmpleados.initFrmEmpleados();
                SwingUtilities.invokeLater(() -> vistaMenu.dispose());
                System.out.println("FrmEmpleados cargado Exitosamente");
        }
        
        if (e.getSource() == vistaMenu.btnSalir){
                System.exit(0);
        }
       
        if (e.getSource() == vistaMenu.btnLogOut) {
        // Mostrar cuadro de diálogo de confirmación
        int opcion = JOptionPane.showConfirmDialog(
            vistaMenu, 
            "¿Estás seguro de que deseas cerrar sesión?", 
            "Confirmar cierre de sesión", 
            JOptionPane.YES_NO_OPTION
        );

        // Comprobar si el usuario seleccionó "Sí"
        if (opcion == JOptionPane.YES_OPTION) {
        Vista.FrmLogin.initFrmLogin(); // Abrir formulario de inicio de sesión
        SwingUtilities.invokeLater(() -> vistaMenu.dispose()); // Cerrar ventana actual
        System.out.println("Sesión cerrada exitosamente");
        } else {
        System.out.println("Cierre de sesión cancelado");
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
            vistaMenu.lblDate.setText(fechaHoraActual);
        }
    };
    timer.scheduleAtFixedRate(task, 0, 1000); // Actualizar cada segundo (1000 ms)
}
    
    @Override
    public void mouseClicked(MouseEvent e) {
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
