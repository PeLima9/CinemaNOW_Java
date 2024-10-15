
package Vista;

import Controlador.ctrlEmpleados;
import Modelo.Empleado;
import Modelo.UserSession;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.ImageIcon;

/**
 *
 * @author eduar
 */
public class FrmEmpleados extends javax.swing.JFrame {

    public FrmEmpleados() {
        FlatLightLaf.setup();
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/resources/logo.png")).getImage());
    }
    
    public static void initFrmEmpleados(){
        Empleado Modelo = new Empleado();
        FrmEmpleados Vista = new FrmEmpleados();
        Vista.setUsername(UserSession.getUsername());
        ctrlEmpleados Controlador = new ctrlEmpleados(Vista, Modelo);
        
        Vista.setVisible(true);
    }
    
    public void setUsername(String username) {
    lblUsername.setText(username);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpHeader = new javax.swing.JPanel();
        imgCinemaNOW = new javax.swing.JLabel();
        lblCinemaNOW = new javax.swing.JLabel();
        jpDate = new javax.swing.JPanel();
        lblDate = new javax.swing.JLabel();
        lblCartelera = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbEmpleados = new javax.swing.JTable();
        lblUsername = new javax.swing.JLabel();
        btnEditEmployee = new javax.swing.JButton();
        btnAddEmployee = new javax.swing.JButton();
        btnDeleteEmployee = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        txtSalario = new javax.swing.JTextField();
        txtCorreoEmpleado = new javax.swing.JTextField();
        txtNombreEmpleado = new javax.swing.JTextField();
        txtPasswordEmpleado = new javax.swing.JTextField();
        lblCartelera1 = new javax.swing.JLabel();
        lblCartelera2 = new javax.swing.JLabel();
        lblCartelera3 = new javax.swing.JLabel();
        lblCartelera4 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jpNavBar = new javax.swing.JPanel();
        imgTickets = new javax.swing.JButton();
        imgCartelera = new javax.swing.JButton();
        imgEmpleados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CinemaNow - Empleados");
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1080));

        jPanel1.setBackground(new java.awt.Color(54, 47, 92));
        jPanel1.setName("CinemaNOW - Login"); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpHeader.setBackground(new java.awt.Color(146, 134, 208));

        imgCinemaNOW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/CinemaNOW_Logo.png"))); // NOI18N

        lblCinemaNOW.setFont(new java.awt.Font("Montserrat Black", 0, 40)); // NOI18N
        lblCinemaNOW.setForeground(new java.awt.Color(255, 255, 255));
        lblCinemaNOW.setText("CinemaNOW");

        jpDate.setBackground(new java.awt.Color(32, 29, 76));

        lblDate.setFont(new java.awt.Font("Montserrat Black", 0, 20)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDate.setText("DATE PLACEHOLDER");

        javax.swing.GroupLayout jpDateLayout = new javax.swing.GroupLayout(jpDate);
        jpDate.setLayout(jpDateLayout);
        jpDateLayout.setHorizontalGroup(
            jpDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDateLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(lblDate)
                .addGap(73, 73, 73))
        );
        jpDateLayout.setVerticalGroup(
            jpDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDateLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblDate)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpHeaderLayout = new javax.swing.GroupLayout(jpHeader);
        jpHeader.setLayout(jpHeaderLayout);
        jpHeaderLayout.setHorizontalGroup(
            jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHeaderLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(imgCinemaNOW)
                .addGap(18, 18, 18)
                .addComponent(lblCinemaNOW)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1148, Short.MAX_VALUE)
                .addComponent(jpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jpHeaderLayout.setVerticalGroup(
            jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHeaderLayout.createSequentialGroup()
                .addComponent(imgCinemaNOW)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpHeaderLayout.createSequentialGroup()
                .addGroup(jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpHeaderLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpHeaderLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblCinemaNOW)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jpHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 140));

        lblCartelera.setFont(new java.awt.Font("Montserrat Black", 0, 36)); // NOI18N
        lblCartelera.setForeground(new java.awt.Color(255, 255, 255));
        lblCartelera.setText("Empleados");
        jPanel1.add(lblCartelera, new org.netbeans.lib.awtextra.AbsoluteConstraints(1510, 250, -1, -1));

        jtbEmpleados.setBackground(new java.awt.Color(32, 29, 76));
        jtbEmpleados.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        jtbEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        jtbEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtbEmpleados.setRowHeight(40);
        jtbEmpleados.setSelectionBackground(new java.awt.Color(146, 134, 208));
        jScrollPane1.setViewportView(jtbEmpleados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 1290, 650));

        lblUsername.setFont(new java.awt.Font("Montserrat Black", 0, 24)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("USERNAME PLACEHOLDER");
        jPanel1.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        btnEditEmployee.setBackground(new java.awt.Color(248, 93, 116));
        btnEditEmployee.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        btnEditEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnEditEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/editar.png"))); // NOI18N
        btnEditEmployee.setText("Modificar Empleado");
        btnEditEmployee.setBorder(null);
        jPanel1.add(btnEditEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(1630, 570, 230, 50));

        btnAddEmployee.setBackground(new java.awt.Color(248, 93, 116));
        btnAddEmployee.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        btnAddEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnAddEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/plus-pequeno.png"))); // NOI18N
        btnAddEmployee.setText("Agregar Empleado");
        btnAddEmployee.setBorder(null);
        jPanel1.add(btnAddEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 570, 230, 50));

        btnDeleteEmployee.setBackground(new java.awt.Color(248, 93, 116));
        btnDeleteEmployee.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        btnDeleteEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/borrar.png"))); // NOI18N
        btnDeleteEmployee.setText("Borrar Empleado");
        btnDeleteEmployee.setBorder(null);
        jPanel1.add(btnDeleteEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(1630, 630, 230, 50));

        btnMenu.setBackground(new java.awt.Color(248, 93, 116));
        btnMenu.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/casa (1).png"))); // NOI18N
        btnMenu.setText("Volver a inicio");
        btnMenu.setBorder(null);
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 890, 210, 50));

        txtSalario.setBackground(new java.awt.Color(54, 47, 92));
        txtSalario.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        txtSalario.setForeground(new java.awt.Color(255, 255, 255));
        txtSalario.setToolTipText("");
        txtSalario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 93, 116)));
        txtSalario.setCaretColor(new java.awt.Color(255, 102, 102));
        jPanel1.add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 460, 320, 40));

        txtCorreoEmpleado.setBackground(new java.awt.Color(54, 47, 92));
        txtCorreoEmpleado.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        txtCorreoEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreoEmpleado.setToolTipText("");
        txtCorreoEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 93, 116)));
        txtCorreoEmpleado.setCaretColor(new java.awt.Color(255, 102, 102));
        jPanel1.add(txtCorreoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 360, 320, 40));

        txtNombreEmpleado.setBackground(new java.awt.Color(54, 47, 92));
        txtNombreEmpleado.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        txtNombreEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreEmpleado.setToolTipText("");
        txtNombreEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 93, 116)));
        txtNombreEmpleado.setCaretColor(new java.awt.Color(255, 102, 102));
        jPanel1.add(txtNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 310, 320, 40));

        txtPasswordEmpleado.setBackground(new java.awt.Color(54, 47, 92));
        txtPasswordEmpleado.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        txtPasswordEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        txtPasswordEmpleado.setToolTipText("");
        txtPasswordEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 93, 116)));
        txtPasswordEmpleado.setCaretColor(new java.awt.Color(255, 102, 102));
        jPanel1.add(txtPasswordEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 410, 320, 40));

        lblCartelera1.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        lblCartelera1.setForeground(new java.awt.Color(255, 255, 255));
        lblCartelera1.setText("Correo");
        jPanel1.add(lblCartelera1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 370, -1, -1));

        lblCartelera2.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        lblCartelera2.setForeground(new java.awt.Color(255, 255, 255));
        lblCartelera2.setText("Nombre:");
        jPanel1.add(lblCartelera2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 320, -1, -1));

        lblCartelera3.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        lblCartelera3.setForeground(new java.awt.Color(255, 255, 255));
        lblCartelera3.setText("Contraseña:");
        jPanel1.add(lblCartelera3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 420, -1, -1));

        lblCartelera4.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        lblCartelera4.setForeground(new java.awt.Color(255, 255, 255));
        lblCartelera4.setText("Salario:");
        jPanel1.add(lblCartelera4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 470, -1, -1));

        btnClear.setBackground(new java.awt.Color(248, 93, 116));
        btnClear.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/escoba.png"))); // NOI18N
        btnClear.setText("Limpiar Campos");
        btnClear.setBorder(null);
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 630, 230, 50));

        jpNavBar.setBackground(new java.awt.Color(32, 29, 76));

        imgTickets.setBackground(new java.awt.Color(32, 29, 76));
        imgTickets.setForeground(new java.awt.Color(32, 29, 76));
        imgTickets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Movie_Ticket.png"))); // NOI18N
        imgTickets.setBorder(null);

        imgCartelera.setBackground(new java.awt.Color(32, 29, 76));
        imgCartelera.setForeground(new java.awt.Color(32, 29, 76));
        imgCartelera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Movie.png"))); // NOI18N
        imgCartelera.setBorder(null);

        imgEmpleados.setBackground(new java.awt.Color(32, 29, 76));
        imgEmpleados.setForeground(new java.awt.Color(32, 29, 76));
        imgEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Management.png"))); // NOI18N
        imgEmpleados.setBorder(null);

        javax.swing.GroupLayout jpNavBarLayout = new javax.swing.GroupLayout(jpNavBar);
        jpNavBar.setLayout(jpNavBarLayout);
        jpNavBarLayout.setHorizontalGroup(
            jpNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNavBarLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(imgTickets)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 656, Short.MAX_VALUE)
                .addComponent(imgEmpleados)
                .addGap(540, 540, 540)
                .addComponent(imgCartelera)
                .addGap(223, 223, 223))
        );
        jpNavBarLayout.setVerticalGroup(
            jpNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNavBarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jpNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgCartelera, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(jpNavBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 970, 1920, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                initFrmEmpleados();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAddEmployee;
    public javax.swing.JButton btnClear;
    public javax.swing.JButton btnDeleteEmployee;
    public javax.swing.JButton btnEditEmployee;
    public javax.swing.JButton btnMenu;
    public javax.swing.JButton imgCartelera;
    private javax.swing.JLabel imgCinemaNOW;
    public javax.swing.JButton imgEmpleados;
    public javax.swing.JButton imgTickets;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpDate;
    private javax.swing.JPanel jpHeader;
    private javax.swing.JPanel jpNavBar;
    public javax.swing.JTable jtbEmpleados;
    private javax.swing.JLabel lblCartelera;
    public javax.swing.JLabel lblCartelera1;
    public javax.swing.JLabel lblCartelera2;
    public javax.swing.JLabel lblCartelera3;
    public javax.swing.JLabel lblCartelera4;
    private javax.swing.JLabel lblCinemaNOW;
    public javax.swing.JLabel lblDate;
    public javax.swing.JLabel lblUsername;
    public javax.swing.JTextField txtCorreoEmpleado;
    public javax.swing.JTextField txtNombreEmpleado;
    public javax.swing.JTextField txtPasswordEmpleado;
    public javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
