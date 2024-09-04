package Modelo;

import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Vista.FrmCartelera;

public class Cartelera {

    private String pelicula_id;
    private String titulo;
    private String descripcion;
    private int duracion;
    private int clasificacion_id;
    private int genero_id;
    private String poster;
    
    
    public String getPelicula_id() {
        return pelicula_id;
    }

    public void setPelicula_id(String pelicula_id) {
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
        //Creamos una variable igual a ejecutar el método de la clase de conexión
        Connection conexion = ClaseConexion.getConexion();
        try {
            //Creamos el PreparedStatement que ejecutará la Query
            PreparedStatement addMenu = conexion.prepareStatement("INSERT INTO tbmenu(UUID_menu, Nombre, Precio, Ingredientes) VALUES (?, ?, ?, ?)");
            //Establecer valores de la consulta SQL
            addMenu.setString(1, UUID.randomUUID().toString());
            addMenu.setString(2, getNombre());
            addMenu.setDouble(3, getPrecio());
            addMenu.setString(4, getIngredientes());
 
            //Ejecutar la consulta
            addMenu.executeUpdate();
 
        } catch (SQLException ex) {
            System.out.println("este es el error en el modelo:metodo guardar " + ex);
        }
        
      }
  public void Eliminar(JTable tabla) {

        //Creamos una variable igual a ejecutar el método de la clase de conexión

        Connection conexion = ClaseConexion.getConexion();
 
        //obtenemos que fila seleccionó el usuario

        int filaSeleccionada = tabla.getSelectedRow();

        //Obtenemos el id de la fila seleccionada

        String miId = tabla.getValueAt(filaSeleccionada, 0).toString();

        //borramos 

        try {

            PreparedStatement deleteEstudiante = conexion.prepareStatement("delete from tbMenu where UUID_menu = ?");

            deleteEstudiante.setString(1, miId);

            deleteEstudiante.executeUpdate();

        } catch (Exception e) {

            System.out.println("este es el error metodo de eliminar" + e);

        }

    
 
        
    }
    
      public void Mostrar(JTable tabla) {
        //Creamos una variable de la clase de conexion
        Connection conexion = ClaseConexion.getConexion();
        //Definimos el modelo de la tabla
        DefaultTableModel modeloTacos = new DefaultTableModel();
        modeloTacos.setColumnIdentifiers(new Object[]{"UUID_menu", "Nombre", "Precio", "Ingredientes"});
        try {
            //Creamos un Statement
            Statement statement = conexion.createStatement();
            //Ejecutamos el Statement con la consulta y lo asignamos a una variable de tipo ResultSet
            ResultSet rs = statement.executeQuery("SELECT * FROM tbMenu");
            //Recorremos el ResultSet
            while (rs.next()) {
                //Llenamos el modelo por cada vez que recorremos el resultSet
                modeloTacos.addRow(new Object[]{rs.getString("UUID_menu"), 
                    rs.getString("nombre"), 
                    rs.getInt("precio"), 
                    rs.getString("ingredientes")});
            }
            //Asignamos el nuevo modelo lleno a la tabla
            tabla.setModel(modeloTacos);
        } catch (Exception e) {
            System.out.println("Este es el error en el modelo, metodo mostrar " + e);
        }
        
        
    }
      
        public void cargarDatosTabla(frmMenu vista) {
        // Obtén la fila seleccionada 
        int filaSeleccionada = vista.jtbMenu.getSelectedRow();
        // Debemos asegurarnos que haya una fila seleccionada antes de acceder a sus valores
        if (filaSeleccionada != -1) {
            String UUIDDeTb = vista.jtbMenu.getValueAt(filaSeleccionada, 0).toString();
            String NombreDeTB = vista.jtbMenu.getValueAt(filaSeleccionada, 1).toString();
            String PrecioTB = vista.jtbMenu.getValueAt(filaSeleccionada, 2).toString();
            String ingredientesTB = vista.jtbMenu.getValueAt(filaSeleccionada, 3).toString();
            // Establece los valores en los campos de texto
            vista.txtNombre.setText(NombreDeTB);
            vista.txtPrecio.setText(PrecioTB);
            vista.txtIngredientes.setText(ingredientesTB);
        }
    }
        
        public void Actualizar(JTable tabla) {
        //Creamos una variable igual a ejecutar el método de la clase de conexión
        Connection conexion = ClaseConexion.getConexion();
        //obtenemos que fila seleccionó el usuario
        int filaSeleccionada = tabla.getSelectedRow();
        if (filaSeleccionada != -1) {
            //Obtenemos el id de la fila seleccionada
            String miUUId = tabla.getValueAt(filaSeleccionada, 0).toString();
            try { 
                //Ejecutamos la Query
                PreparedStatement updateUser = conexion.prepareStatement("update tbmenu set nombre= ?, precio = ?, ingredientes = ? where UUID_menu = ?");
                updateUser.setString(1, getNombre());
                updateUser.setDouble(2, getPrecio());
                updateUser.setString(3, getIngredientes());
                updateUser.setString(4, miUUId);
                updateUser.executeUpdate();
            } catch (Exception e) {
                System.out.println("este es el error en el metodo de actualizar" + e);
            }
        } else {
            System.out.println("no funciona actualizar");
        }
    }



                                                
}
