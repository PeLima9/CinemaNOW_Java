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
import javax.swing.JOptionPane;


public class ctrlCartelera implements MouseListener, KeyListener {
    
    //Conectar Modelo y Vista
    private Cartelera ModeloCartelera;
    private Genero ModeloGenero;
    private Clasificacion ModeloClasificacion;
    private FrmCartelera VistaFrmCartelera;
    
    public ctrlCartelera(Cartelera cartelera, Genero genero, Clasificacion clasificacion, FrmCartelera VistaCartelera) {

        //Asignar Modelo y Vista
        this.ModeloCartelera = cartelera;
        this.ModeloGenero = genero;
        this.ModeloClasificacion = clasificacion;
        this.VistaFrmCartelera = VistaCartelera;
        
        //Cargar ComboBox
        this.ModeloGenero.CargarComboGenero(VistaCartelera.jcbGenre);
        this.ModeloClasificacion.CargarComboClasificacion(VistaCartelera.jcbRating);
        
        //Agregar MouseListener
        VistaCartelera.btnAddMovie.addMouseListener(this);
        VistaCartelera.jtbCartelera.addMouseListener(this);
        VistaCartelera.btnDeleteMovie.addMouseListener(this);
        VistaCartelera.btnEditMovie.addMouseListener(this);
        VistaCartelera.jcbGenre.addMouseListener(this);
        VistaCartelera.btnMenu.addMouseListener(this);
        VistaCartelera.btnClear.addMouseListener(this);
        
        VistaCartelera.imgCartelera.addMouseListener(this);
        VistaCartelera.imgTickets.addMouseListener(this);
        VistaCartelera.imgEmpleados.addMouseListener(this);
        
        VistaCartelera.jcbGenre.addActionListener(e -> {
            if (e.getSource() == VistaCartelera.jcbGenre) {
                Genero selectedItem = (Genero) VistaCartelera.jcbGenre.getSelectedItem();
                if (selectedItem != null) {
                    int id = selectedItem.getGenero_id();
                    ModeloGenero.setGenero_id(id);
                }
            }
        });

        //Configurar JTable
        ModeloCartelera.MostrarCartelera(VistaCartelera.jtbCartelera);
    }    
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
        //Volver al Menú
        if (e.getSource() == VistaFrmCartelera.btnMenu){
                Vista.FrmMenu.initFrmMenu();
                VistaFrmCartelera.dispose();
                System.out.println("FrmMenu cargado exitosamente");
        }
        
         //Boton Cartelera
        if (e.getSource() == VistaFrmCartelera.imgCartelera){
                Vista.FrmCartelera.initFrmCartelera();
                VistaFrmCartelera.dispose();
                System.out.println("FrmCartelera cargado exitosamente");

        }
        
        //Boton Tickets
        if (e.getSource() == VistaFrmCartelera.imgTickets){
                Vista.FrmTickets.initFrmTickets();
                VistaFrmCartelera.dispose();
                System.out.println("FrmTickets cargado exitosamente");
        }
        
        //Boton Empleados
        if ( e.getSource() == VistaFrmCartelera.imgEmpleados){
                Vista.FrmEmpleados.initFrmEmpleados();
                VistaFrmCartelera.dispose();
                System.out.println("FrmEmpleados cargado Exitosamente");
        }
        
        //Agregar
        if (e.getSource() == VistaFrmCartelera.btnAddMovie) {
            
            //Validación de Datos
            if (VistaFrmCartelera.txtMovieTitle.getText().isEmpty() || VistaFrmCartelera.txtMovieTitle.getText().isEmpty() || VistaFrmCartelera.txtMovieTitle.getText().isEmpty() || VistaFrmCartelera.txtMovieTitle.getText().isEmpty() || VistaFrmCartelera.txtMovieTitle.getText().isEmpty()){
                //Mostrar JOptionPane
                JOptionPane.showMessageDialog(VistaFrmCartelera, "No pueden haber campos vacíos, intente nuevamente.");
            }
            else{
                ModeloCartelera.setTitulo(VistaFrmCartelera.txtMovieTitle.getText());
                ModeloCartelera.setDescripcion(VistaFrmCartelera.txtSinopsis.getText());
                ModeloCartelera.setDuracion(Integer.parseInt(VistaFrmCartelera.txtDuration.getText()));
                ModeloCartelera.setClasificacion_id(((Clasificacion) VistaFrmCartelera.jcbRating.getSelectedItem()).getClasificacion_id());
                ModeloCartelera.setGenero_id(((Genero) VistaFrmCartelera.jcbGenre.getSelectedItem()).getGenero_id());
                ModeloCartelera.setPoster(VistaFrmCartelera.txtMoviePoster.getText());
                ModeloCartelera.setTrailer(VistaFrmCartelera.txtMovieTrailer.getText());
            
                ModeloCartelera.Guardar();
                ModeloCartelera.MostrarCartelera(VistaFrmCartelera.jtbCartelera);
                System.out.println("Dato guardado exitosamente");
            
                //Vaciar campos
                VistaFrmCartelera.txtMovieTitle.setText(null);
                VistaFrmCartelera.txtSinopsis.setText(null);
                VistaFrmCartelera.txtDuration.setText(null);
                VistaFrmCartelera.txtMoviePoster.setText(null);
                VistaFrmCartelera.txtMovieTrailer.setText(null);
            }            
        }
        
        //Eliminar
        if (e.getSource() == VistaFrmCartelera.btnDeleteMovie) {
            //Mostrar JOptionPanel con botones
            String[] buttons = {"Cancelar", "Continuar"};
            int confirm = JOptionPane.showOptionDialog(VistaFrmCartelera, "Está seguro que desea eliminar este registro?", "Eliminar", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, buttons, buttons[0]);
            
            if (confirm == 0){
                //*No hace nada*
            }
            else if (confirm == 1){
                ModeloCartelera.Eliminar(VistaFrmCartelera.jtbCartelera);
                ModeloCartelera.MostrarCartelera(VistaFrmCartelera.jtbCartelera);
            
                System.out.println("Dato eliminado exitosamente");
            //Vaciar campos
            VistaFrmCartelera.txtMovieTitle.setText(null);
            VistaFrmCartelera.txtSinopsis.setText(null);
            VistaFrmCartelera.txtDuration.setText(null);
            VistaFrmCartelera.txtMoviePoster.setText(null);
            VistaFrmCartelera.txtMovieTrailer.setText(null);
            }
        }
        
        //Mostrar
        if (e.getSource() == VistaFrmCartelera.jtbCartelera) {
            ModeloCartelera.cargarDatosTabla(VistaFrmCartelera);
            System.out.println("Datos mostrados exitosamente");

        }
        
        //Actualizar
        if (e.getSource() == VistaFrmCartelera.btnEditMovie) {
            //Mostrar JOptionPanel con botones
            String[] buttons = {"Cancelar", "Continuar"};
            int confirm = JOptionPane.showOptionDialog(VistaFrmCartelera, "Está seguro que desea actualizar este registro?", "Actualizar", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, buttons, buttons[0]);
            
            if (confirm == 0){
                //*No hace nada*
            }
                else if (confirm == 1){
                
                //Validación de Datos
                if (VistaFrmCartelera.txtMovieTitle.getText().isEmpty() || VistaFrmCartelera.txtMovieTitle.getText().isEmpty() || VistaFrmCartelera.txtMovieTitle.getText().isEmpty() || VistaFrmCartelera.txtMovieTitle.getText().isEmpty() || VistaFrmCartelera.txtMovieTitle.getText().isEmpty()){
                    //Mostrar JOptionPane
                    JOptionPane.showMessageDialog(VistaFrmCartelera, "No pueden haber campos vacíos, intente nuevamente.");
                }
                else{
                    ModeloCartelera.setTitulo(VistaFrmCartelera.txtMovieTitle.getText());
                    ModeloCartelera.setDescripcion(VistaFrmCartelera.txtSinopsis.getText());
                    ModeloCartelera.setDuracion(Integer.parseInt(VistaFrmCartelera.txtDuration.getText()));
                    ModeloCartelera.setClasificacion_id(((Clasificacion) VistaFrmCartelera.jcbRating.getSelectedItem()).getClasificacion_id());
                    ModeloCartelera.setGenero_id(((Genero) VistaFrmCartelera.jcbGenre.getSelectedItem()).getGenero_id()); 
                    ModeloCartelera.setPoster(VistaFrmCartelera.txtMoviePoster.getText());
                    ModeloCartelera.setTrailer(VistaFrmCartelera.txtMovieTrailer.getText());
            
                    ModeloCartelera.Actualizar(VistaFrmCartelera.jtbCartelera);
                    ModeloCartelera.MostrarCartelera(VistaFrmCartelera.jtbCartelera);
                    System.out.println("Dato actualizado exitosamente");
            
                    //Vaciar campos
                    VistaFrmCartelera.txtMovieTitle.setText(null);
                    VistaFrmCartelera.txtSinopsis.setText(null);
                    VistaFrmCartelera.txtDuration.setText(null);
                    VistaFrmCartelera.txtMoviePoster.setText(null);
                    VistaFrmCartelera.txtMovieTrailer.setText(null);
                }
            }

        }
        
        //Limpiar Campos
        if (e.getSource() == VistaFrmCartelera.btnClear){

            VistaFrmCartelera.txtMovieTitle.setText(null);
            VistaFrmCartelera.txtSinopsis.setText(null);
            VistaFrmCartelera.txtDuration.setText(null);
            VistaFrmCartelera.txtMoviePoster.setText(null);
            VistaFrmCartelera.txtMovieTrailer.setText(null);
            System.out.println("Campos vaciados exitosamente");
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
