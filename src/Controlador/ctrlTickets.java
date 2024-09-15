
package Controlador;

import Vista.FrmTickets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ctrlTickets implements ActionListener{
        
        //Llamar otros paquetes
        private FrmTickets VistaTickets;
        
     public ctrlTickets (FrmTickets Vista){
         
         //Asignar Modelo y Vista
         this.VistaTickets = Vista;
         
         //Agregar ActionListener
         this.VistaTickets.btnMenu.addActionListener(this);
         
         this.VistaTickets.imgCartelera.addActionListener(this);
         this.VistaTickets.imgTickets.addActionListener(this);
         this.VistaTickets.imgEmpleados.addActionListener(this);
     }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        
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
        
    }
    
}
