
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
     }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        
         //Volver al Menú
        if (e.getSource() == VistaTickets.btnMenu){
                Vista.FrmMenu.initFrmMenu();
                VistaTickets.dispose();
                System.out.println("FrmMenu cargado exitosamente");
        }
        
    }
    
}
