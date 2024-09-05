package Modelo;

import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Vista.FrmCartelera;

public class Cartelera {

    private int pelicula_id;
    private String titulo;
    private String descripcion;
    private int duracion;
    private int clasificacion_id;
    private int genero_id;
    private String poster;
    private String trailer;

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
    
    
    public int getPelicula_id() {
        return pelicula_id;
    }

    public void setPelicula_id(int pelicula_id) {
        this.pelicula_id = pelicula_id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getClasificacion_id() {
        return clasificacion_id;
    }

    public void setClasificacion_id(int clasificacion_id) {
        this.clasificacion_id = clasificacion_id;
    }

    public int getGenero_id() {
        return genero_id;
    }

    public void setGenero_id(int genero_id) {
        this.genero_id = genero_id;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
                          
 public void Guardar() {
    
    Connection conexion = ClaseConexion.getConexion();

    try {
    
        PreparedStatement addCartelera = conexion.prepareStatement(
            "INSERT INTO Peliculas (titulo, descripcion, duracion, clasificacion_id, genero_id, poster, trailer) VALUES (?, ?, ?, ?, ?, ?, ?)"
        );

        addCartelera.setString(1, getTitulo());
        addCartelera.setString(2, getDescripcion());
        addCartelera.setInt(3, getDuracion());
        addCartelera.setInt(4, getClasificacion_id());
        addCartelera.setInt(5, getGenero_id());
        addCartelera.setString(6, getPoster());
        addCartelera.setString(7, getTrailer());

       
        addCartelera.executeUpdate();
 
    } catch (SQLException ex) {
        System.out.println("[Cartelera] Error en Guardar: " + ex);
    }
}
        
      
  public void Eliminar(JTable tabla) {
        Connection conexion = ClaseConexion.getConexion();
        int filaSeleccionada = tabla.getSelectedRow();

       
        String miId = tabla.getValueAt(filaSeleccionada, 0).toString();



        try {

            PreparedStatement deleteCartelera = conexion.prepareStatement("delete from Peliculas where pelicula_id = ?");

            deleteCartelera.setString(1, miId);

            deleteCartelera.executeUpdate();

        } catch (Exception e) {

            System.out.println("este es el error metodo de eliminar" + e);

        }

    
 
        
    }
    
      public void MostrarCartelera(JTable tabla) {
    Connection conexion = ClaseConexion.getConexion();
    
    DefaultTableModel model = new DefaultTableModel();
    model.setColumnIdentifiers(new Object[]{"pelicula_id", "titulo", "descripcion", "duracion", "clasificacion_nombre", "genero_nombre", "poster", "trailer"});
    
    try {
        Statement statement = conexion.createStatement();
        
        // Consulta SQL modificada con JOIN
        ResultSet rs = statement.executeQuery("SELECT p.pelicula_id, p.titulo, p.descripcion, p.duracion, c.nombre_clasificacion AS clasificacion_nombre, g.genero AS genero_nombre, p.poster, p.trailer FROM Peliculas p JOIN Clasificacion c ON p.clasificacion_id = c.clasificacion_id JOIN GeneroPelicula g ON p.genero_id = g.genero_id"
        );
        
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("pelicula_id"), 
                rs.getString("titulo"), 
                rs.getString("descripcion"), 
                rs.getInt("duracion"), 
                rs.getString("clasificacion_nombre"), 
                rs.getString("genero_nombre"), 
                rs.getString("poster"), 
                rs.getString("trailer")
            });
        }
        
        tabla.setModel(model);
    } catch (Exception e) {
        System.out.println("[Cartelera] Error en MostrarCartelera: " + e);
    }

        
        
    }
      
        public void cargarDatosTabla(FrmCartelera Vista) {
        // Obtén la fila seleccionada 
        int filaSeleccionada = Vista.jtbCartelera.getSelectedRow();
        // Debemos asegurarnos que haya una fila seleccionada antes de acceder a sus valores
        if (filaSeleccionada != -1) {
            String IDTB = Vista.jtbCartelera.getValueAt(filaSeleccionada, 0).toString();
            String tituloTB = Vista.jtbCartelera.getValueAt(filaSeleccionada, 1).toString();
            String descripcionTBTB = Vista.jtbCartelera.getValueAt(filaSeleccionada, 2).toString();
             String duracionTB = Vista.jtbCartelera.getValueAt(filaSeleccionada, 3).toString();
            String clasificacion_idTB = Vista.jtbCartelera.getValueAt(filaSeleccionada, 4).toString();
            String genero_idTB = Vista.jtbCartelera.getValueAt(filaSeleccionada,5).toString();
            String posterTB = Vista.jtbCartelera.getValueAt(filaSeleccionada, 6).toString();
            String trailerTB = Vista.jtbCartelera.getValueAt(filaSeleccionada, 7).toString();
          

            Vista.txtMovieTitle.setText(tituloTB);
            Vista.txtSinopsis.setText(descripcionTBTB);
            Vista.txtDuration.setText(duracionTB);
            Vista.jcbRating.setSelectedItem(clasificacion_idTB);
            Vista.jcbGenre.setSelectedItem(genero_idTB);
            Vista.txtMoviePoster1.setText(posterTB);
            Vista.txtMovieTrailer.setText(trailerTB);
        }
    }

    public void Actualizar(JTable tabla) {
        Connection conexion = ClaseConexion.getConexion();
    
    int filaSeleccionada = tabla.getSelectedRow();
    
    if (filaSeleccionada != -1) {
       
        String miUUId = tabla.getValueAt(filaSeleccionada, 0).toString();
        
        try { 
            PreparedStatement updateCartelera = conexion.prepareStatement(
                "UPDATE Peliculas SET titulo = ?, descripcion = ?, duracion = ?, clasificacion_id = ?, genero_id = ?, poster = ?, trailer = ? WHERE pelicula_id = ?"
            );
            
          
            updateCartelera.setString(1, getTitulo());
            updateCartelera.setString(2, getDescripcion());
            updateCartelera.setInt(3, getDuracion());
            updateCartelera.setInt(4, getClasificacion_id());
            updateCartelera.setInt(5, getGenero_id());
            updateCartelera.setString(6, getPoster());
            updateCartelera.setString(7, getTrailer());
            
            updateCartelera.setInt(8, Integer.parseInt(miUUId));
            
            updateCartelera.executeUpdate();
            
            System.out.println("Película actualizada correctamente.");
        } catch (Exception e) {
            System.out.println("Error en el método de actualizar: " + e.getMessage());
        }
    } else {
        System.out.println("No se ha seleccionado ninguna fila para actualizar.");
    }
}
    }

    



                                                

