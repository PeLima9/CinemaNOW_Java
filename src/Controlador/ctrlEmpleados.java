package Controlador;

import Modelo.Empleado;
import Vista.FrmEmpleados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ctrlEmpleados implements MouseListener, ActionListener {

    // Llamar otros paquetes
    private FrmEmpleados VistaEmpleados;
    private Empleado ModeloEmpleados;

    public ctrlEmpleados(FrmEmpleados Vista, Empleado Modelo) {
        this.iniciarReloj();
        // Asignar Modelo y Vista
        this.VistaEmpleados = Vista;
        this.ModeloEmpleados = Modelo;

        // Agregar ActionListener
        this.VistaEmpleados.btnMenu.addActionListener(this);

        this.VistaEmpleados.imgCartelera.addActionListener(this);
        this.VistaEmpleados.imgTickets.addActionListener(this);
        this.VistaEmpleados.imgEmpleados.addActionListener(this);

        // Agregar MouseListener
        this.VistaEmpleados.jtbEmpleados.addMouseListener(this);
        this.VistaEmpleados.btnAddEmployee.addMouseListener(this);
        this.VistaEmpleados.btnEditEmployee.addMouseListener(this);
        this.VistaEmpleados.btnDeleteEmployee.addMouseListener(this);
        this.VistaEmpleados.btnClear.addMouseListener(this);

        // Configurar JTable
        ModeloEmpleados.MostrarEmpleados(Vista.jtbEmpleados);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Volver al Menú
        if (e.getSource() == VistaEmpleados.btnMenu) {
            Vista.FrmMenu.initFrmMenu();
            VistaEmpleados.dispose();
            System.out.println("FrmMenu cargado exitosamente\n");
        }

        // Boton Cartelera
        if (e.getSource() == VistaEmpleados.imgCartelera) {
            Vista.FrmCartelera.initFrmCartelera();
            VistaEmpleados.dispose();
            System.out.println("FrmCartelera cargado exitosamente\n");
        }

        // Boton Tickets
        if (e.getSource() == VistaEmpleados.imgTickets) {
            Vista.FrmTickets.initFrmTickets();
            VistaEmpleados.dispose();
            System.out.println("FrmTickets cargado exitosamente\n");
        }

        // Boton Empleados
        if (e.getSource() == VistaEmpleados.imgEmpleados) {
            Vista.FrmEmpleados.initFrmEmpleados();
            VistaEmpleados.dispose();
            System.out.println("FrmEmpleados cargado exitosamente\n");
        }
    }

    public void iniciarReloj() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                SimpleDateFormat formatoFechaHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                String fechaHoraActual = formatoFechaHora.format(new Date());
                VistaEmpleados.lblDate.setText(fechaHoraActual);
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000); // Actualizar cada segundo (1000 ms)
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        // Mostrar datos en TextField
        if (e.getSource() == VistaEmpleados.jtbEmpleados) {
            ModeloEmpleados.CargarDatosTabla(VistaEmpleados);
            System.out.println("Datos mostrados exitosamente\n");
        }

        // Boton Agregar
        if (e.getSource() == VistaEmpleados.btnAddEmployee) {

            // Validación de Datos
            if (VistaEmpleados.txtNombreEmpleado.getText().isEmpty() || VistaEmpleados.txtCorreoEmpleado.getText().isEmpty() || VistaEmpleados.txtPasswordEmpleado.getText().isEmpty() || VistaEmpleados.txtSalario.getText().isEmpty()) {
                JOptionPane.showMessageDialog(VistaEmpleados, "No pueden haber campos vacíos, intente nuevamente.");
            } else {
                try {
                    Double.parseDouble(VistaEmpleados.txtSalario.getText().trim()); // Validar que el salario sea un número
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(VistaEmpleados, "El salario debe ser un número válido.");
                    return;
                }

                ModeloEmpleados.setNombreEmpleado(VistaEmpleados.txtNombreEmpleado.getText());
                ModeloEmpleados.setCorreoEmpleado(VistaEmpleados.txtCorreoEmpleado.getText());
                ModeloEmpleados.setPasswordEmpleado(ModeloEmpleados.encryptSHA256(VistaEmpleados.txtPasswordEmpleado.getText()));

                double salario = Double.parseDouble(VistaEmpleados.txtSalario.getText().trim());
                ModeloEmpleados.setSalarioEmpleado(salario);

                ModeloEmpleados.AgregarEmpleado();
                ModeloEmpleados.MostrarEmpleados(VistaEmpleados.jtbEmpleados);

                // Limpiar Campos
                VistaEmpleados.txtNombreEmpleado.setText(null);
                VistaEmpleados.txtCorreoEmpleado.setText(null);
                VistaEmpleados.txtPasswordEmpleado.setText(null);
                VistaEmpleados.txtSalario.setText(null);
            }
        }

        // Boton Actualizar
        if (e.getSource() == VistaEmpleados.btnEditEmployee) {
            String[] buttons = {"Cancelar", "Continuar"};
            int confirm = JOptionPane.showOptionDialog(VistaEmpleados, "Está seguro que desea actualizar este registro?", "Actualizar", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, buttons, buttons[0]);

            if (confirm == 1) {
                // Validación de Datos
                if (VistaEmpleados.txtNombreEmpleado.getText().isEmpty() || VistaEmpleados.txtCorreoEmpleado.getText().isEmpty() || VistaEmpleados.txtPasswordEmpleado.getText().isEmpty() || VistaEmpleados.txtSalario.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(VistaEmpleados, "No pueden haber campos vacíos, intente nuevamente.");
                } else {
                    try {
                        Double.parseDouble(VistaEmpleados.txtSalario.getText().trim());
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(VistaEmpleados, "El salario debe ser un número válido.");
                        return;
                    }

                    ModeloEmpleados.setNombreEmpleado(VistaEmpleados.txtNombreEmpleado.getText());
                    ModeloEmpleados.setCorreoEmpleado(VistaEmpleados.txtCorreoEmpleado.getText());
                    ModeloEmpleados.setPasswordEmpleado(ModeloEmpleados.encryptSHA256(VistaEmpleados.txtPasswordEmpleado.getText()));

                    double salario = Double.parseDouble(VistaEmpleados.txtSalario.getText().trim());
                    ModeloEmpleados.setSalarioEmpleado(salario);

                    ModeloEmpleados.EditarEmpleados(VistaEmpleados.jtbEmpleados);
                    ModeloEmpleados.MostrarEmpleados(VistaEmpleados.jtbEmpleados);

                    // Limpiar Campos
                    VistaEmpleados.txtNombreEmpleado.setText(null);
                    VistaEmpleados.txtCorreoEmpleado.setText(null);
                    VistaEmpleados.txtPasswordEmpleado.setText(null);
                    VistaEmpleados.txtSalario.setText(null);
                }
            }
        }

        // Boton Eliminar
        if (e.getSource() == VistaEmpleados.btnDeleteEmployee) {
            String[] buttons = {"Cancelar", "Continuar"};
            int confirm = JOptionPane.showOptionDialog(VistaEmpleados, "Está seguro que desea eliminar este registro?", "Eliminar", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, buttons, buttons[0]);

            if (confirm == 1) {
                ModeloEmpleados.EliminarEmpleado(VistaEmpleados.jtbEmpleados);
                ModeloEmpleados.MostrarEmpleados(VistaEmpleados.jtbEmpleados);

                // Vaciar Campos
                VistaEmpleados.txtNombreEmpleado.setText(null);
                VistaEmpleados.txtCorreoEmpleado.setText(null);
                VistaEmpleados.txtPasswordEmpleado.setText(null);
                VistaEmpleados.txtSalario.setText(null);
            }
        }

        // Limpiar Campos
        if (e.getSource() == VistaEmpleados.btnClear) {
            VistaEmpleados.txtNombreEmpleado.setText(null);
            VistaEmpleados.txtCorreoEmpleado.setText(null);
            VistaEmpleados.txtPasswordEmpleado.setText(null);
            VistaEmpleados.txtSalario.setText(null);
            System.out.println("Campos vaciados exitosamente\n");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}
