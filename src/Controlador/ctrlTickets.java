
package Controlador;
import Modelo.Tickets;
import Vista.FrmTickets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ctrlTickets implements MouseListener{
        
        //Llamar otros paquetes
        private FrmTickets VistaTickets;
        private Tickets modeloTickets;
        
     public ctrlTickets (FrmTickets Vista){
         
         
         //Asignar Modelo y Vista
         this.VistaTickets = Vista;
         
         //Agregar ActionListener
         this.VistaTickets.btnMenu.addMouseListener(this);
         
         this.VistaTickets.imgCartelera.addMouseListener(this);
         this.VistaTickets.imgTickets.addMouseListener(this);
         this.VistaTickets.imgEmpleados.addMouseListener(this);
         this.
         
         modeloTickets.MostrarTickets(VistaTickets.jtbTickets);
     }

    @Override
    public void mouseClicked(MouseEvent e) {
        //Volver al Menú
        if (e.getSource() == VistaTickets.btnMenu){
                Vista.FrmMenu.initFrmMenu();
                VistaTickets.dispose();
                System.out.println("FrmMenu cargado exitosamente");
        }
        
        //Boton Cartelera
        if (e.getSource() == VistaTickets.imgCartelera){
                Vista.FrmCartelera.initFrmCartelera();
                VistaTickets.dispose();
                System.out.println("FrmCartelera cargado exitosamente");

        }
        
        //Boton Tickets
        if (e.getSource() == VistaTickets.imgTickets){
                Vista.FrmTickets.initFrmTickets();
                VistaTickets.dispose();
                System.out.println("FrmTickets cargado exitosamente");
        }
        
        //Boton Empleados
        if ( e.getSource() == VistaTickets.imgEmpleados){
                Vista.FrmEmpleados.initFrmEmpleados();
                VistaTickets.dispose();
                System.out.println("FrmEmpleados cargado Exitosamente");
        }
        
         if (e.getSource() == VistaTickets.jtbTickets) {
            modeloTickets.cargarDatosTabla(modeloTickets);
            System.out.println("Datos mostrados exitosamente");

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
