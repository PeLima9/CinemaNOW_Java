
package Controlador;

import Vista.FrmEmpleados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ctrlEmpleados implements ActionListener{

            //Llamar otros paquetes
            private FrmEmpleados VistaEmpleados;
        
        public ctrlEmpleados(FrmEmpleados Vista){
            
            //Asignar Modelo y Vista
            this.VistaEmpleados = Vista;
            
            //Agregar ActionListener
            this.VistaEmpleados.btnMenu.addActionListener(this);
            
            this.VistaEmpleados.imgCartelera.addActionListener(this);
            this.VistaEmpleados.imgTickets.addActionListener(this);
            this.VistaEmpleados.imgEmpleados.addActionListener(this);
            
        }
    @Override
    public void actionPerformed(ActionEvent e) {
         //Volver al Menú
        if (e.getSource() == VistaEmpleados.btnMenu){
                Vista.FrmMenu.initFrmMenu();
                VistaEmpleados.dispose();
                System.out.println("FrmMenu cargado exitosamente");
        }
        
         //Boton Cartelera
        if (e.getSource() == VistaEmpleados.imgCartelera){
                Vista.FrmCartelera.initFrmCartelera();
                VistaEmpleados.dispose();
                System.out.println("FrmCartelera cargado exitosamente");

        }
        
        //Boton Tickets
        if (e.getSource() == VistaEmpleados.imgTickets){
                Vista.FrmTickets.initFrmTickets();
                VistaEmpleados.dispose();
                System.out.println("FrmTickets cargado exitosamente");
        }
        
        //Boton Empleados
        if ( e.getSource() == VistaEmpleados.imgEmpleados){
                Vista.FrmEmpleados.initFrmEmpleados();
                VistaEmpleados.dispose();
                System.out.println("FrmEmpleados cargado Exitosamente");
        }
    }
    
}
