
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
        this.vistaMenu.imgCartelera.addActionListener(this);
        this.vistaMenu.imgTickets.addActionListener(this);
        this.vistaMenu.imgEmpleados.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Boton Cartelera
        if (e.getSource() == vistaMenu.btnCartelera || e.getSource() == vistaMenu.imgCartelera){
                Vista.FrmCartelera.initFrmCartelera();
                vistaMenu.dispose();
                System.out.println("FrmCartelera cargado exitosamente");

        }
        
        //Boton Tickets
        if (e.getSource() == vistaMenu.btnTickets || e.getSource() == vistaMenu.imgTickets){
                Vista.FrmTickets.initFrmTickets();
                vistaMenu.dispose();
                System.out.println("FrmTickets cargado exitosamente");
        }
        
        //Boton Empleados
        if (e.getSource() == vistaMenu.btnEmpleados || e.getSource() == vistaMenu.imgEmpleados){
                Vista.FrmEmpleados.initFrmEmpleados();
                vistaMenu.dispose();
                System.out.println("FrmEmpleados cargado Exitosamente");
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
