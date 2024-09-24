
package Controlador;
import Modelo.Tickets;
import Vista.FrmTickets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;


public class ctrlTickets implements MouseListener{
        
        //Llamar otros paquetes
        private FrmTickets VistaTickets;
        private Tickets modeloTickets;
        
     public ctrlTickets (FrmTickets Vista){
         this.iniciarReloj();
         //Asignar Modelo y Vista
         this.VistaTickets = Vista;
         
         //Agregar ActionListener
         this.VistaTickets.btnMenu.addMouseListener(this);
         
         this.VistaTickets.imgCartelera.addMouseListener(this);
         this.VistaTickets.imgTickets.addMouseListener(this);
         this.VistaTickets.imgEmpleados.addMouseListener(this);
         
         
         modeloTickets.MostrarTickets(VistaTickets.jtbTickets);
     }

       public void iniciarReloj(){
    Timer timer = new Timer();
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            SimpleDateFormat formatoFechaHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String fechaHoraActual = formatoFechaHora.format(new Date());
            VistaTickets.lblDate.setText(fechaHoraActual);
        }
    };
    timer.scheduleAtFixedRate(task, 0, 1000); // Actualizar cada segundo (1000 ms)
}
     
    @Override
    public void mouseClicked(MouseEvent e) {
        //Volver al Menú
        if (e.getSource() == VistaTickets.btnMenu){
                Vista.FrmMenu.initFrmMenu();
                VistaTickets.dispose();
                System.out.println("FrmMenu cargado exitosamente");
        }
        
        
        
        //Boton Cartelera
        if (e.getSource() == VistaTickets.imgCartelera){
                Vista.FrmCartelera.initFrmCartelera();
                VistaTickets.dispose();
                System.out.println("FrmCartelera cargado exitosamente");

        }
        
        //Boton Tickets
        if (e.getSource() == VistaTickets.imgTickets){
                Vista.FrmTickets.initFrmTickets();
                VistaTickets.dispose();
                System.out.println("FrmTickets cargado exitosamente");
        }
        
        //Boton Empleados
        if ( e.getSource() == VistaTickets.imgEmpleados){
                Vista.FrmEmpleados.initFrmEmpleados();
                VistaTickets.dispose();
                System.out.println("FrmEmpleados cargado Exitosamente");
        }
        
        if (e.getSource() == VistaTickets.btnDeleteTicket){
            //Mostrar JOptionPanel con Botones
            String[] buttons = {"Cancelar", "Continuar"};
            int confirm = JOptionPane.showOptionDialog(VistaTickets, "Está seguro que desea eliminar este registro?", "Eliminar", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, buttons, buttons[0]);
            
            if (confirm == 0){
                //*No hace nada*
            }
            else if (confirm == 1){
                modeloTickets.EliminarTickets(VistaTickets.jtbTickets);
                modeloTickets.MostrarTickets(VistaTickets.jtbTickets);
        
        
        
    }
        
            
        }}

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
