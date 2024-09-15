
package Controlador;

import Modelo.Empleado;
import Vista.FrmEmpleados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ctrlEmpleados implements MouseListener, ActionListener{

            //Llamar otros paquetes
            private FrmEmpleados VistaEmpleados;
            private Empleado ModeloEmpleados;
        
        public ctrlEmpleados(FrmEmpleados Vista, Empleado Modelo){
            
            //Asignar Modelo y Vista
            this.VistaEmpleados = Vista;
            this.ModeloEmpleados = Modelo;
            
            //Agregar MouseListener
            this.VistaEmpleados.btnMenu.addActionListener(this);
            
            this.VistaEmpleados.imgCartelera.addActionListener(this);
            this.VistaEmpleados.imgTickets.addActionListener(this);
            this.VistaEmpleados.imgEmpleados.addActionListener(this);
            
            this.VistaEmpleados.jtbEmpleados.addMouseListener(this);
            
            //Configurar JTable
            ModeloEmpleados.MostrarEmpleados(Vista.jtbEmpleados);
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
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
        //Mostrar datos en TextField
        if (e.getSource() == VistaEmpleados.jtbEmpleados) {
            ModeloEmpleados.CargarDatosTabla(VistaEmpleados);
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
