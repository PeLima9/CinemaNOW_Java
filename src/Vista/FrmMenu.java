
package Vista;

import Controlador.ctrlLogin;
import Controlador.ctrlMenu;
import Modelo.UserSession;
import Modelo.Usuario;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.ImageIcon;

public class FrmMenu extends javax.swing.JFrame {

    public FrmMenu() {
        FlatLightLaf.setup();
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/resources/logo.png")).getImage());
    }
    
    
public static void initFrmMenu(){
         Usuario Modelo = new Usuario();
         FrmMenu Vista = new FrmMenu();
         Vista.setUsername(UserSession.getUsername());
         ctrlMenu Controlador = new ctrlMenu(Modelo, Vista);
        
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
        jPanel3 = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lblBienvenida = new javax.swing.JLabel();
        jpTickets3 = new javax.swing.JPanel();
        btnTickets = new javax.swing.JButton();
        lblReservaTickets = new javax.swing.JLabel();
        jpEmpleados1 = new javax.swing.JPanel();
        btnEmpleados = new javax.swing.JButton();
        lblVerEmpleados = new javax.swing.JLabel();
        jpCartelera1 = new javax.swing.JPanel();
        btnCartelera = new javax.swing.JButton();
        lblPelículas = new javax.swing.JLabel();
        jpNavBar = new javax.swing.JPanel();
        btnLogOut = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CinemaNow - Menu");
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1144, Short.MAX_VALUE)
                .addComponent(jpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jpHeaderLayout.setVerticalGroup(
            jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHeaderLayout.createSequentialGroup()
                .addComponent(imgCinemaNOW)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpHeaderLayout.createSequentialGroup()
                .addGroup(jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpHeaderLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblCinemaNOW))
                    .addGroup(jpHeaderLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jpHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 140));

        jPanel3.setBackground(new java.awt.Color(54, 47, 92));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsername.setFont(new java.awt.Font("Montserrat Black", 0, 24)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("USERNAME PLACEHOLDER");
        jPanel3.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lblBienvenida.setFont(new java.awt.Font("Montserrat Black", 0, 36)); // NOI18N
        lblBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenida.setText("Bienvenido a CinemaNOW.");
        jPanel3.add(lblBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, -1, -1));

        jpTickets3.setBackground(new java.awt.Color(32, 29, 76));

        btnTickets.setBackground(new java.awt.Color(248, 93, 116));
        btnTickets.setFont(new java.awt.Font("Montserrat Black", 0, 24)); // NOI18N
        btnTickets.setForeground(new java.awt.Color(255, 255, 255));
        btnTickets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Reservas (2).png"))); // NOI18N
        btnTickets.setText("Tickets");
        btnTickets.setBorder(null);

        lblReservaTickets.setFont(new java.awt.Font("Montserrat Black", 0, 46)); // NOI18N
        lblReservaTickets.setForeground(new java.awt.Color(255, 255, 255));
        lblReservaTickets.setText("Reserva de Tickets");

        javax.swing.GroupLayout jpTickets3Layout = new javax.swing.GroupLayout(jpTickets3);
        jpTickets3.setLayout(jpTickets3Layout);
        jpTickets3Layout.setHorizontalGroup(
            jpTickets3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTickets3Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jpTickets3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblReservaTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpTickets3Layout.setVerticalGroup(
            jpTickets3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTickets3Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(lblReservaTickets)
                .addGap(28, 28, 28)
                .addComponent(btnTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        jPanel3.add(jpTickets3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 520, 670));

        jpEmpleados1.setBackground(new java.awt.Color(32, 29, 76));
        jpEmpleados1.setPreferredSize(new java.awt.Dimension(520, 670));

        btnEmpleados.setBackground(new java.awt.Color(248, 93, 116));
        btnEmpleados.setFont(new java.awt.Font("Montserrat Black", 0, 24)); // NOI18N
        btnEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Empleados (1).png"))); // NOI18N
        btnEmpleados.setText("Empleados");
        btnEmpleados.setBorder(null);
        btnEmpleados.setPreferredSize(new java.awt.Dimension(105, 39));

        lblVerEmpleados.setFont(new java.awt.Font("Montserrat Black", 0, 46)); // NOI18N
        lblVerEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        lblVerEmpleados.setText("Ver Empleados");

        javax.swing.GroupLayout jpEmpleados1Layout = new javax.swing.GroupLayout(jpEmpleados1);
        jpEmpleados1.setLayout(jpEmpleados1Layout);
        jpEmpleados1Layout.setHorizontalGroup(
            jpEmpleados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEmpleados1Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(jpEmpleados1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(lblVerEmpleados)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpEmpleados1Layout.setVerticalGroup(
            jpEmpleados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEmpleados1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(lblVerEmpleados)
                .addGap(28, 28, 28)
                .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        jPanel3.add(jpEmpleados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, -1, -1));

        jpCartelera1.setBackground(new java.awt.Color(32, 29, 76));
        jpCartelera1.setPreferredSize(new java.awt.Dimension(520, 670));

        btnCartelera.setBackground(new java.awt.Color(248, 93, 116));
        btnCartelera.setFont(new java.awt.Font("Montserrat Black", 0, 24)); // NOI18N
        btnCartelera.setForeground(new java.awt.Color(255, 255, 255));
        btnCartelera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Cartelera.png"))); // NOI18N
        btnCartelera.setText("Cartelera");
        btnCartelera.setBorder(null);
        btnCartelera.setMaximumSize(new java.awt.Dimension(151, 39));
        btnCartelera.setMinimumSize(new java.awt.Dimension(151, 39));
        btnCartelera.setPreferredSize(new java.awt.Dimension(151, 39));

        lblPelículas.setFont(new java.awt.Font("Montserrat Black", 0, 46)); // NOI18N
        lblPelículas.setForeground(new java.awt.Color(255, 255, 255));
        lblPelículas.setText("Películas disponibles");

        javax.swing.GroupLayout jpCartelera1Layout = new javax.swing.GroupLayout(jpCartelera1);
        jpCartelera1.setLayout(jpCartelera1Layout);
        jpCartelera1Layout.setHorizontalGroup(
            jpCartelera1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCartelera1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jpCartelera1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPelículas)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCartelera1Layout.createSequentialGroup()
                        .addComponent(btnCartelera, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jpCartelera1Layout.setVerticalGroup(
            jpCartelera1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCartelera1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblPelículas)
                .addGap(28, 28, 28)
                .addComponent(btnCartelera, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel3.add(jpCartelera1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 90, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1920, 830));

        jpNavBar.setBackground(new java.awt.Color(32, 29, 76));

        btnLogOut.setBackground(new java.awt.Color(248, 93, 116));
        btnLogOut.setFont(new java.awt.Font("Montserrat Black", 0, 24)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(255, 255, 255));
        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/salida (1).png"))); // NOI18N
        btnLogOut.setText("Cerrar Sesión");
        btnLogOut.setBorder(null);

        btnSalir.setBackground(new java.awt.Color(248, 93, 116));
        btnSalir.setFont(new java.awt.Font("Montserrat Black", 0, 24)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/x.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);

        javax.swing.GroupLayout jpNavBarLayout = new javax.swing.GroupLayout(jpNavBar);
        jpNavBar.setLayout(jpNavBarLayout);
        jpNavBarLayout.setHorizontalGroup(
            jpNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNavBarLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1356, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jpNavBarLayout.setVerticalGroup(
            jpNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNavBarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
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
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCartelera;
    public javax.swing.JButton btnEmpleados;
    public javax.swing.JButton btnLogOut;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnTickets;
    private javax.swing.JLabel imgCinemaNOW;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jpCartelera1;
    private javax.swing.JPanel jpDate;
    private javax.swing.JPanel jpEmpleados1;
    private javax.swing.JPanel jpHeader;
    private javax.swing.JPanel jpNavBar;
    private javax.swing.JPanel jpTickets3;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblCinemaNOW;
    public javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblPelículas;
    private javax.swing.JLabel lblReservaTickets;
    public javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblVerEmpleados;
    // End of variables declaration//GEN-END:variables
}
