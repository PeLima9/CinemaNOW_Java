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
    
    private FrmCartelera vistaFrmCartelera;
    private Cartelera ModeloCartelera;
    private Genero ModeloGenero;
    private Clasificacion ModeloClasificacion;
    private final FrmCartelera VistaFrmCartelera;
    
    public ctrlCartelera(Cartelera cartelera, Genero genero, Clasificacion clasificacion, FrmCartelera VistaCartelera) {
        this.ModeloCartelera = cartelera;
        this.ModeloGenero = genero;
        this.ModeloClasificacion = clasificacion;
        this.VistaFrmCartelera = VistaCartelera;

        
        // Llenar los ComboBox de género y clasificación
        this.ModeloGenero.CargarComboGenero(VistaCartelera.jcbGenre);
        this.ModeloClasificacion.CargarComboClasificacion(VistaCartelera.jcbRating);

        // Registrar eventos
        VistaCartelera.btnAddMovie.addMouseListener(this);
        VistaCartelera.jtbCartelera.addMouseListener(this);
        VistaCartelera.btnDeleteMovie.addMouseListener(this);
        VistaCartelera.btnEditMovie.addMouseListener(this);

        // Cargar datos en la tabla
        ModeloCartelera.cargarDatosTabla(VistaCartelera.jtbCartelera);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == VistaFrmCartelera.btnAddMovie) {
            // Lógica para añadir una película
            ModeloCartelera.setTitulo(VistaFrmCartelera.txtMovieTitle.getText());
            ModeloCartelera.setDescripcion(VistaFrmCartelera.txtSinopsis.getText());
            ModeloCartelera.setDuracion(Integer.parseInt(VistaFrmCartelera.txtDuration.getText()));
            ModeloCartelera.setClasificacion_id(((Clasificacion) VistaFrmCartelera.jcbRating.getSelectedItem()).getClasificacion_id());
            ModeloCartelera.setGenero_id(((Genero) VistaFrmCartelera.jcbGenre.getSelectedItem()).getGenero_id());
            ModeloCartelera.setPoster(VistaFrmCartelera.txtMoviePoster1.getText());
            ModeloCartelera.setTrailer(VistaFrmCartelera.txtMovieTrailer.getText());
            
            // Guardar la nueva película y actualizar la tabla
            ModeloCartelera.Guardar();
            ModeloCartelera.Mostrar(VistaFrmCartelera.jtbCartelera);
        }
        
        if (e.getSource() == VistaFrmCartelera.btnDeleteMovie) {
            // Eliminar la película seleccionada en la tabla
            ModeloCartelera.Eliminar(VistaFrmCartelera.jtbCartelera);
            ModeloCartelera.Mostrar(VistaFrmCartelera.jtbCartelera);
        }
        
        if (e.getSource() == VistaFrmCartelera.jtbCartelera) {
            // Cargar datos de la película seleccionada en los campos de texto
            ModeloCartelera.cargarDatosTabla(VistaFrmCartelera);
        }
        
        if (e.getSource() == VistaFrmCartelera.btnEditMovie) {
            // Actualizar la película con los datos en los campos de texto
            ModeloCartelera.setTitulo(VistaFrmCartelera.txtMovieTitle.getText());
            ModeloCartelera.setDescripcion(VistaFrmCartelera.txtSinopsis.getText());
            ModeloCartelera.setDuracion(Integer.parseInt(VistaFrmCartelera.txtDuration.getText()));
            ModeloCartelera.setClasificacion_id(((Clasificacion) VistaFrmCartelera.jcbRating.getSelectedItem()).getClasificacion_id());
        ModeloCartelera.setGenero_id(((Genero) VistaFrmCartelera.jcbGenre.getSelectedItem()).getGenero());
            ModeloCartelera.setPoster(VistaFrmCartelera.txtMoviePoster1.getText());
            ModeloCartelera.setTrailer(VistaFrmCartelera.txtMovieTrailer.getText());
            
            // Actualizar la película y la tabla
            ModeloCartelera.Actualizar(VistaFrmCartelera.jtbCartelera);
            ModeloCartelera.Mostrar(VistaFrmCartelera.jtbCartelera);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // No implementado
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // No implementado
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // No implementado
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // No implementado
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // No implementado
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // No implementado
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // No implementado
    }
}
