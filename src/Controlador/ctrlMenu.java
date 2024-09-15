
package Controlador;

import Modelo.Usuario;
import Vista.FrmMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ctrlMenu implements ActionListener{

    //Llamar otros paquetes
        private Usuario modeloMenu;
        private FrmMenu vistaMenu;
        
    public ctrlMenu(Usuario Modelo, FrmMenu Vista){
        
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
    
}
