package Controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import Modelo.Cartelera;
import Modelo.Clasificacion;
import Modelo.Genero;
import Vista.FrmCartelera;
import javax.swing.JComboBox;


public class ctrlCartelera implements MouseListener, KeyListener {
    
    private Cartelera ModeloCartelera;
    private Genero ModeloGenero;
    private Clasificacion ModeloClasificacion;
    private FrmCartelera VistaFrmCartelera;
    
    public ctrlCartelera(Cartelera cartelera, Genero genero, Clasificacion clasificacion, FrmCartelera VistaCartelera) {
        this.ModeloCartelera = cartelera;
        this.ModeloGenero = genero;
        this.ModeloClasificacion = clasificacion;
        this.VistaFrmCartelera = VistaCartelera;
        
        

        
        this.ModeloGenero.CargarComboGenero(VistaCartelera.jcbGenre);
        this.ModeloClasificacion.CargarComboClasificacion(VistaCartelera.jcbRating);
        
        


        VistaCartelera.btnAddMovie.addMouseListener(this);
        VistaCartelera.jtbCartelera.addMouseListener(this);
        VistaCartelera.btnDeleteMovie.addMouseListener(this);
        VistaCartelera.btnEditMovie.addMouseListener(this);
        VistaCartelera.jcbGenre.addMouseListener(this);

        VistaCartelera.jcbGenre.addActionListener(e -> {
            if (e.getSource() == VistaCartelera.jcbGenre) {
                Genero selectedItem = (Genero) VistaCartelera.jcbGenre.getSelectedItem();
                if (selectedItem != null) {
                    int id = selectedItem.getGenero_id();
                    ModeloGenero.setGenero_id(id);
                }
            }
        });

        ModeloCartelera.MostrarCartelera(VistaCartelera.jtbCartelera);
    }
    
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == VistaFrmCartelera.btnAddMovie) {
            ModeloCartelera.setTitulo(VistaFrmCartelera.txtMovieTitle.getText());
            ModeloCartelera.setDescripcion(VistaFrmCartelera.txtSinopsis.getText());
            ModeloCartelera.setDuracion(Integer.parseInt(VistaFrmCartelera.txtDuration.getText()));
            ModeloCartelera.setClasificacion_id(((Clasificacion) VistaFrmCartelera.jcbRating.getSelectedItem()).getClasificacion_id());
            ModeloCartelera.setGenero_id(((Genero) VistaFrmCartelera.jcbGenre.getSelectedItem()).getGenero_id());
            ModeloCartelera.setPoster(VistaFrmCartelera.txtMoviePoster1.getText());
            ModeloCartelera.setTrailer(VistaFrmCartelera.txtMovieTrailer.getText());
            
            ModeloCartelera.Guardar();
            ModeloCartelera.MostrarCartelera(VistaFrmCartelera.jtbCartelera);
        }
        
        if (e.getSource() == VistaFrmCartelera.btnDeleteMovie) {
        
            ModeloCartelera.Eliminar(VistaFrmCartelera.jtbCartelera);
            ModeloCartelera.MostrarCartelera(VistaFrmCartelera.jtbCartelera);
        } 
       
        if (e.getSource() == VistaFrmCartelera.jtbCartelera) {
            ModeloCartelera.cargarDatosTabla(VistaFrmCartelera);
        }
        
        if (e.getSource() == VistaFrmCartelera.btnEditMovie) {
            ModeloCartelera.setTitulo(VistaFrmCartelera.txtMovieTitle.getText());
            ModeloCartelera.setDescripcion(VistaFrmCartelera.txtSinopsis.getText());
            ModeloCartelera.setDuracion(Integer.parseInt(VistaFrmCartelera.txtDuration.getText()));
            ModeloCartelera.setClasificacion_id(((Clasificacion) VistaFrmCartelera.jcbRating.getSelectedItem()).getClasificacion_id());
        ModeloCartelera.setGenero_id(((Genero) VistaFrmCartelera.jcbGenre.getSelectedItem()).getGenero_id()); 
            ModeloCartelera.setPoster(VistaFrmCartelera.txtMoviePoster1.getText());
            ModeloCartelera.setTrailer(VistaFrmCartelera.txtMovieTrailer.getText());
            
            ModeloCartelera.Actualizar(VistaFrmCartelera.jtbCartelera);
            ModeloCartelera.MostrarCartelera(VistaFrmCartelera.jtbCartelera);
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

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
       
    }
}
