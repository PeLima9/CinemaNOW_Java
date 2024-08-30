
package Vista;

import Controlador.ctrlLogin;
import Modelo.Usuario;

public class FrmMenu extends javax.swing.JFrame {

    public FrmMenu() {
        initComponents();
    }
    
public static void initFrmMenu(){
        Usuario modelo = new Usuario();
        FrmLogin vista = new FrmLogin();
        ctrlLogin controlador = new ctrlLogin(modelo, vista);
        
        vista.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpNavBar = new javax.swing.JPanel();
        imgCartelera = new javax.swing.JLabel();
        imgTickets = new javax.swing.JLabel();
        imgEmpleados = new javax.swing.JLabel();
        jpHeader = new javax.swing.JPanel();
        imgCinemaNOW = new javax.swing.JLabel();
        lblCinemaNOW = new javax.swing.JLabel();
        jpDate = new javax.swing.JPanel();
        lblDate = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblBienvenida = new javax.swing.JLabel();
        jpTickets = new javax.swing.JPanel();
        btnTickets = new javax.swing.JButton();
        lblReservaTickets = new javax.swing.JLabel();
        jpEmpleados = new javax.swing.JPanel();
        btnEmpleados = new javax.swing.JButton();
        lblVerEmpleados = new javax.swing.JLabel();
        jpCartelera = new javax.swing.JPanel();
        btnCartelera = new javax.swing.JButton();
        lblPelículas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(54, 47, 92));
        jPanel1.setName("CinemaNOW - Login"); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpNavBar.setBackground(new java.awt.Color(32, 29, 76));

        imgCartelera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Movie.png"))); // NOI18N

        imgTickets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Movie_Ticket.png"))); // NOI18N

        imgEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Management.png"))); // NOI18N

        javax.swing.GroupLayout jpNavBarLayout = new javax.swing.GroupLayout(jpNavBar);
        jpNavBar.setLayout(jpNavBarLayout);
        jpNavBarLayout.setHorizontalGroup(
            jpNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNavBarLayout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(imgTickets)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 350, Short.MAX_VALUE)
                .addComponent(imgEmpleados)
                .addGap(340, 340, 340)
                .addComponent(imgCartelera)
                .addGap(236, 236, 236))
        );
        jpNavBarLayout.setVerticalGroup(
            jpNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNavBarLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jpNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgTickets)
                    .addComponent(imgEmpleados)
                    .addComponent(imgCartelera))
                .addGap(17, 17, 17))
        );

        jPanel1.add(jpNavBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 1440, 140));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 332, Short.MAX_VALUE)
                .addComponent(jpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(288, 288, 288))
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

        jPanel1.add(jpHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 140));

        lblUsername.setFont(new java.awt.Font("Montserrat Black", 0, 24)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("USERNAME PLACEHOLDER");
        jPanel1.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        lblBienvenida.setFont(new java.awt.Font("Montserrat Black", 0, 36)); // NOI18N
        lblBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenida.setText("Bienvenido a CinemaNOW.");
        jPanel1.add(lblBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 160, -1, -1));

        jpTickets.setBackground(new java.awt.Color(32, 29, 76));

        btnTickets.setBackground(new java.awt.Color(248, 93, 116));
        btnTickets.setFont(new java.awt.Font("Montserrat Black", 0, 24)); // NOI18N
        btnTickets.setForeground(new java.awt.Color(255, 255, 255));
        btnTickets.setText("Tickets");

        lblReservaTickets.setFont(new java.awt.Font("Montserrat Black", 0, 24)); // NOI18N
        lblReservaTickets.setForeground(new java.awt.Color(255, 255, 255));
        lblReservaTickets.setText("Reserva de Tickets");

        javax.swing.GroupLayout jpTicketsLayout = new javax.swing.GroupLayout(jpTickets);
        jpTickets.setLayout(jpTicketsLayout);
        jpTicketsLayout.setHorizontalGroup(
            jpTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTicketsLayout.createSequentialGroup()
                .addGroup(jpTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTicketsLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpTicketsLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblReservaTickets)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jpTicketsLayout.setVerticalGroup(
            jpTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTicketsLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblReservaTickets)
                .addGap(79, 79, 79)
                .addComponent(btnTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanel1.add(jpTickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 330, 410));

        jpEmpleados.setBackground(new java.awt.Color(32, 29, 76));

        btnEmpleados.setBackground(new java.awt.Color(248, 93, 116));
        btnEmpleados.setFont(new java.awt.Font("Montserrat Black", 0, 24)); // NOI18N
        btnEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleados.setText("Empleados");

        lblVerEmpleados.setFont(new java.awt.Font("Montserrat Black", 0, 24)); // NOI18N
        lblVerEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        lblVerEmpleados.setText("Ver Empleados");

        javax.swing.GroupLayout jpEmpleadosLayout = new javax.swing.GroupLayout(jpEmpleados);
        jpEmpleados.setLayout(jpEmpleadosLayout);
        jpEmpleadosLayout.setHorizontalGroup(
            jpEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEmpleadosLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jpEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVerEmpleados))
                .addGap(64, 64, 64))
        );
        jpEmpleadosLayout.setVerticalGroup(
            jpEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEmpleadosLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblVerEmpleados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        jPanel1.add(jpEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, -1, -1));

        jpCartelera.setBackground(new java.awt.Color(32, 29, 76));

        btnCartelera.setBackground(new java.awt.Color(248, 93, 116));
        btnCartelera.setFont(new java.awt.Font("Montserrat Black", 0, 24)); // NOI18N
        btnCartelera.setForeground(new java.awt.Color(255, 255, 255));
        btnCartelera.setText("Cartelera");

        lblPelículas.setFont(new java.awt.Font("Montserrat Black", 0, 24)); // NOI18N
        lblPelículas.setForeground(new java.awt.Color(255, 255, 255));
        lblPelículas.setText("Películas disponibles");

        javax.swing.GroupLayout jpCarteleraLayout = new javax.swing.GroupLayout(jpCartelera);
        jpCartelera.setLayout(jpCarteleraLayout);
        jpCarteleraLayout.setHorizontalGroup(
            jpCarteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCarteleraLayout.createSequentialGroup()
                .addGroup(jpCarteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCarteleraLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnCartelera, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpCarteleraLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblPelículas)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jpCarteleraLayout.setVerticalGroup(
            jpCarteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCarteleraLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblPelículas)
                .addGap(74, 74, 74)
                .addComponent(btnCartelera, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanel1.add(jpCartelera, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    public javax.swing.JButton btnTickets;
    public javax.swing.JLabel imgCartelera;
    private javax.swing.JLabel imgCinemaNOW;
    public javax.swing.JLabel imgEmpleados;
    public javax.swing.JLabel imgTickets;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpCartelera;
    private javax.swing.JPanel jpDate;
    private javax.swing.JPanel jpEmpleados;
    private javax.swing.JPanel jpHeader;
    private javax.swing.JPanel jpNavBar;
    private javax.swing.JPanel jpTickets;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblCinemaNOW;
    public javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblPelículas;
    private javax.swing.JLabel lblReservaTickets;
    public javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblVerEmpleados;
    // End of variables declaration//GEN-END:variables
}
