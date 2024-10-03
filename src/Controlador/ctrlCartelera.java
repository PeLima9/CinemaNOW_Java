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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ctrlCartelera implements MouseListener, KeyListener {
    
    //Conectar Modelo y Vista
    private Cartelera ModeloCartelera;
    private Genero ModeloGenero;
    private Clasificacion ModeloClasificacion;
    private FrmCartelera VistaFrmCartelera;
    
    public ctrlCartelera(Cartelera cartelera, Genero genero, Clasificacion clasificacion, FrmCartelera VistaCartelera) {
        
        this.iniciarReloj();

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
        
        // Volver al Menú
        if (e.getSource() == VistaFrmCartelera.btnMenu){
            Vista.FrmMenu.initFrmMenu();
            VistaFrmCartelera.dispose();
            System.out.println("FrmMenu cargado exitosamente");
        }
        
        // Boton Cartelera
        if (e.getSource() == VistaFrmCartelera.imgCartelera){
            Vista.FrmCartelera.initFrmCartelera();
            VistaFrmCartelera.dispose();
            System.out.println("FrmCartelera cargado exitosamente");
        }
        
        // Boton Tickets
        if (e.getSource() == VistaFrmCartelera.imgTickets){
            Vista.FrmTickets.initFrmTickets();
            VistaFrmCartelera.dispose();
            System.out.println("FrmTickets cargado exitosamente");
        }
        
        // Boton Empleados
        if ( e.getSource() == VistaFrmCartelera.imgEmpleados){
            Vista.FrmEmpleados.initFrmEmpleados();
            VistaFrmCartelera.dispose();
            System.out.println("FrmEmpleados cargado Exitosamente");
        }
        
        // Agregar
        if (e.getSource() == VistaFrmCartelera.btnAddMovie) {
            if (validarCampos()) {
                // Si la validación es correcta, guardar los datos
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

                // Vaciar campos
                limpiarCampos();
            }
        }
        
        // Eliminar
        if (e.getSource() == VistaFrmCartelera.btnDeleteMovie) {
            String[] buttons = {"Cancelar", "Continuar"};
            int confirm = JOptionPane.showOptionDialog(VistaFrmCartelera, "Está seguro que desea eliminar este registro?", "Eliminar", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, buttons, buttons[0]);
            
            if (confirm == 1) {
                ModeloCartelera.Eliminar(VistaFrmCartelera.jtbCartelera);
                ModeloCartelera.MostrarCartelera(VistaFrmCartelera.jtbCartelera);
                System.out.println("Dato eliminado exitosamente");
                limpiarCampos();
            }
        }
        
        // Mostrar
        if (e.getSource() == VistaFrmCartelera.jtbCartelera) {
            ModeloCartelera.cargarDatosTabla(VistaFrmCartelera);
            System.out.println("Datos mostrados exitosamente");
        }
        
        // Actualizar
        if (e.getSource() == VistaFrmCartelera.btnEditMovie) {
            String[] buttons = {"Cancelar", "Continuar"};
            int confirm = JOptionPane.showOptionDialog(VistaFrmCartelera, "Está seguro que desea actualizar este registro?", "Actualizar", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, buttons, buttons[0]);

            if (confirm == 1 && validarCampos()) {
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
                limpiarCampos();
            }
        }
        
        // Limpiar Campos
        if (e.getSource() == VistaFrmCartelera.btnClear){
            limpiarCampos();
            System.out.println("Campos vaciados exitosamente");
        }
    }

    // Método para validar los campos
    private boolean validarCampos() {
        if (VistaFrmCartelera.txtMovieTitle.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(VistaFrmCartelera, "El título de la película es obligatorio.");
            return false;
        }
        if (VistaFrmCartelera.txtSinopsis.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(VistaFrmCartelera, "La sinopsis es obligatoria.");
            return false;
        }
        if (VistaFrmCartelera.txtDuration.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(VistaFrmCartelera, "La duración es obligatoria.");
            return false;
        }
        try {
            Integer.parseInt(VistaFrmCartelera.txtDuration.getText().trim());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(VistaFrmCartelera, "La duración debe ser un número válido.");
            return false;
        }
        if (VistaFrmCartelera.jcbRating.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(VistaFrmCartelera, "Debe seleccionar una clasificación.");
            return false;
        }
        if (VistaFrmCartelera.jcbGenre.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(VistaFrmCartelera, "Debe seleccionar un género.");
            return false;
        }
        if (VistaFrmCartelera.txtMoviePoster.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(VistaFrmCartelera, "El enlace del póster es obligatorio.");
            return false;
        }
        if (VistaFrmCartelera.txtMovieTrailer.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(VistaFrmCartelera, "El enlace del tráiler es obligatorio.");
            return false;
        }
        return true;
    }

    // Método para limpiar los campos
    private void limpiarCampos() {
        VistaFrmCartelera.txtMovieTitle.setText("");
        VistaFrmCartelera.txtSinopsis.setText("");
        VistaFrmCartelera.txtDuration.setText("");
        VistaFrmCartelera.jcbRating.setSelectedIndex(-1);
        VistaFrmCartelera.jcbGenre.setSelectedIndex(-1);
        VistaFrmCartelera.txtMoviePoster.setText("");
        VistaFrmCartelera.txtMovieTrailer.setText("");
    }

    // Método para iniciar el reloj en el label lblDate
    private void iniciarReloj() {
        Timer timer = new Timer();
        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date now = new Date();
                String strDate = sdf.format(now);
                VistaFrmCartelera.lblDate.setText(strDate);
            }
        };
        timer.scheduleAtFixedRate(tarea, 0, 1000);
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
}
