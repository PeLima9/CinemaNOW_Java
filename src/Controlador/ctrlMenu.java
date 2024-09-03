
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
        this.modeloMenu = Modelo;
        this.vistaMenu = Vista;
        
        this.vistaMenu.btnCartelera.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaMenu.btnCartelera){
                Vista.FrmCartelera.initFrmCartelera();
                vistaMenu.dispose();
        }
        
    }
    
}
