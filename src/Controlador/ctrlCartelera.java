
package Controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import Modelo.Cartelera;
import Modelo.Clasificacion;
import Modelo.Genero;
import Vista.FrmCartelera;
  

public class ctrlCartelera {
    
    private FrmCartelera vistaFrmCartelera;
    private Cartelera ModeloCartelera;
    private Genero ModeloGenero;
    private  Clasificacion ModeloClasificacion;
    
    public ctrlCartelera(Cartelera cartelera, Genero genero,Clasificacion clasificacionm, FrmCartelera vistaCartelera){
    this.ModeloCartelera = cartelera;
    this.vistaFrmCartelera = vistaCartelera;

     vistaCartelera.btnAddMovie.addMouseListener(this);
    vistaCartelera.jtbCartelera.addMouseListener(this);
    vistaCartelera.btnDeleteMovie.addMouseListener(this);
    vistaCartelera.btnEditMovie.addMouseListener(this);
    
    ModeloGenero.Mostrar(vistaCartelera.jtbCartelera);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == Vista.btnAgregar) {
            ModeloPacientes.setNombre_paciente(Vista.txtNombre.getText());
            ModeloPacientes.setEdad(Integer.parseInt(Vista.txtEdad.getText()));
            ModeloPacientes.setUUID_Doctor(ModeloDoc.getUUID_Doctor());
            ModeloPacientes.Guardar();
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
