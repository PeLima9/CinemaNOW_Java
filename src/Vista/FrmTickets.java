
package Vista;

import Controlador.ctrlTickets;
import Modelo.UserSession;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.ImageIcon;

public class FrmTickets extends javax.swing.JFrame {

    public FrmTickets() {
        FlatLightLaf.setup();
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/resources/logo.png")).getImage());
    }
    
    public static void initFrmTickets(){
        FrmTickets Vista = new FrmTickets();
        Vista.setUsername(UserSession.getUsername());
        ctrlTickets Controlador = new ctrlTickets(Vista);
        
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
        lblTickets = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbTickets = new javax.swing.JTable();
        lblUsername = new javax.swing.JLabel();
        btnDeleteTicket = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jpNavBar = new javax.swing.JPanel();
        imgTickets = new javax.swing.JButton();
        imgCartelera = new javax.swing.JButton();
        imgEmpleados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CinemaNow - Tickets");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
                        .addGap(16, 16, 16)
                        .addComponent(jpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpHeaderLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblCinemaNOW)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jpHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 140));

        lblTickets.setFont(new java.awt.Font("Montserrat Black", 0, 36)); // NOI18N
        lblTickets.setForeground(new java.awt.Color(255, 255, 255));
        lblTickets.setText("Tickets");
        jPanel1.add(lblTickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 150, -1, -1));

        jtbTickets.setBackground(new java.awt.Color(32, 29, 76));
        jtbTickets.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        jtbTickets.setForeground(new java.awt.Color(255, 255, 255));
        jtbTickets.setModel(new javax.swing.table.DefaultTableModel(
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
        jtbTickets.setRowHeight(40);
        jtbTickets.setSelectionBackground(new java.awt.Color(146, 134, 208));
        jScrollPane1.setViewportView(jtbTickets);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 1840, 660));

        lblUsername.setFont(new java.awt.Font("Montserrat Black", 0, 24)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("USERNAME PLACEHOLDER");
        jPanel1.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        btnDeleteTicket.setBackground(new java.awt.Color(248, 93, 116));
        btnDeleteTicket.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        btnDeleteTicket.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/borrar.png"))); // NOI18N
        btnDeleteTicket.setText("Borrar Ticket");
        btnDeleteTicket.setBorder(null);
        jPanel1.add(btnDeleteTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(1670, 900, 210, 50));

        btnMenu.setBackground(new java.awt.Color(248, 93, 116));
        btnMenu.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/casa (1).png"))); // NOI18N
        btnMenu.setText("Volver a inicio");
        btnMenu.setBorder(null);
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 900, 210, 50));

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
                new FrmTickets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnDeleteTicket;
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
    public javax.swing.JTable jtbTickets;
    private javax.swing.JLabel lblCinemaNOW;
    public javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTickets;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables
}
