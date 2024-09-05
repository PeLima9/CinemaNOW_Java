
package Vista;



public class FrmCartelera extends javax.swing.JFrame {

    public FrmCartelera() {
        initComponents();
    }

    public static void initFrmCartelera(){
        new FrmCartelera().setVisible(true);
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
        lblCartelera = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbCartelera = new javax.swing.JTable();
        lblUsername = new javax.swing.JLabel();
        btnEditMovie = new javax.swing.JButton();
        btnAddMovie = new javax.swing.JButton();
        btnDeleteMovie = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtMovieTrailer = new javax.swing.JTextField();
        txtSinopsis = new javax.swing.JTextField();
        jcbGenre = new javax.swing.JComboBox<>();
        jcbRating = new javax.swing.JComboBox<>();
        txtMovieTitle = new javax.swing.JTextField();
        txtDuration = new javax.swing.JTextField();
        txtMoviePoster1 = new javax.swing.JTextField();

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgTickets)
                    .addComponent(imgEmpleados)
                    .addComponent(imgCartelera))
                .addGap(17, 17, 17))
        );

        jPanel1.add(jpNavBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, 1440, 110));

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

        lblCartelera.setFont(new java.awt.Font("Montserrat Black", 0, 36)); // NOI18N
        lblCartelera.setForeground(new java.awt.Color(255, 255, 255));
        lblCartelera.setText("Cartelera");
        jPanel1.add(lblCartelera, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 150, -1, -1));

        jtbCartelera.setBackground(new java.awt.Color(32, 29, 76));
        jtbCartelera.setFont(new java.awt.Font("Montserrat Black", 0, 12)); // NOI18N
        jtbCartelera.setForeground(new java.awt.Color(255, 255, 255));
        jtbCartelera.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtbCartelera);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 900, 410));

        lblUsername.setFont(new java.awt.Font("Montserrat Black", 0, 24)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("USERNAME PLACEHOLDER");
        jPanel1.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        btnEditMovie.setBackground(new java.awt.Color(248, 93, 116));
        btnEditMovie.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        btnEditMovie.setForeground(new java.awt.Color(255, 255, 255));
        btnEditMovie.setText("Modificar Película");
        jPanel1.add(btnEditMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 560, 210, 50));

        btnAddMovie.setBackground(new java.awt.Color(248, 93, 116));
        btnAddMovie.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        btnAddMovie.setForeground(new java.awt.Color(255, 255, 255));
        btnAddMovie.setText("Agregar Película");
        jPanel1.add(btnAddMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 560, 210, 50));

        btnDeleteMovie.setBackground(new java.awt.Color(248, 93, 116));
        btnDeleteMovie.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        btnDeleteMovie.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteMovie.setText("Borrar Película");
        jPanel1.add(btnDeleteMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 620, 210, 50));

        btnClear.setBackground(new java.awt.Color(248, 93, 116));
        btnClear.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Borrar Película");
        btnClear.setActionCommand("Limpiar Campos");
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 620, 210, 50));

        txtMovieTrailer.setBackground(new java.awt.Color(54, 47, 92));
        txtMovieTrailer.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        txtMovieTrailer.setForeground(new java.awt.Color(255, 255, 255));
        txtMovieTrailer.setText("Trailer");
        txtMovieTrailer.setToolTipText("");
        txtMovieTrailer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 93, 116)));
        jPanel1.add(txtMovieTrailer, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 510, 440, 30));

        txtSinopsis.setBackground(new java.awt.Color(54, 47, 92));
        txtSinopsis.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        txtSinopsis.setForeground(new java.awt.Color(255, 255, 255));
        txtSinopsis.setText("Descripción");
        txtSinopsis.setToolTipText("");
        txtSinopsis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 93, 116)));
        jPanel1.add(txtSinopsis, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 260, 440, 30));

        jcbGenre.setBackground(new java.awt.Color(54, 47, 92));
        jcbGenre.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        jcbGenre.setForeground(new java.awt.Color(255, 255, 255));
        jcbGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Género", "Item 2", "Item 3", "Item 4" }));
        jcbGenre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 93, 116)));
        jPanel1.add(jcbGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 410, 440, 30));

        jcbRating.setBackground(new java.awt.Color(54, 47, 92));
        jcbRating.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        jcbRating.setForeground(new java.awt.Color(255, 255, 255));
        jcbRating.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clasificación", "Item 2", "Item 3", "Item 4" }));
        jcbRating.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 93, 116)));
        jPanel1.add(jcbRating, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 360, 440, 30));

        txtMovieTitle.setBackground(new java.awt.Color(54, 47, 92));
        txtMovieTitle.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        txtMovieTitle.setForeground(new java.awt.Color(255, 255, 255));
        txtMovieTitle.setText("Título");
        txtMovieTitle.setToolTipText("");
        txtMovieTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 93, 116)));
        jPanel1.add(txtMovieTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 210, 440, 30));

        txtDuration.setBackground(new java.awt.Color(54, 47, 92));
        txtDuration.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        txtDuration.setForeground(new java.awt.Color(255, 255, 255));
        txtDuration.setText("Duración");
        txtDuration.setToolTipText("");
        txtDuration.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 93, 116)));
        jPanel1.add(txtDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 310, 440, 30));

        txtMoviePoster1.setBackground(new java.awt.Color(54, 47, 92));
        txtMoviePoster1.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        txtMoviePoster1.setForeground(new java.awt.Color(255, 255, 255));
        txtMoviePoster1.setText("Póster de la Película");
        txtMoviePoster1.setToolTipText("");
        txtMoviePoster1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 93, 116)));
        jPanel1.add(txtMoviePoster1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 460, 440, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmCartelera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCartelera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCartelera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCartelera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCartelera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAddMovie;
    public javax.swing.JButton btnClear;
    public javax.swing.JButton btnDeleteMovie;
    public javax.swing.JButton btnEditMovie;
    public javax.swing.JLabel imgCartelera;
    private javax.swing.JLabel imgCinemaNOW;
    public javax.swing.JLabel imgEmpleados;
    public javax.swing.JLabel imgTickets;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JComboBox<String> jcbGenre;
    public javax.swing.JComboBox<String> jcbRating;
    private javax.swing.JPanel jpDate;
    private javax.swing.JPanel jpHeader;
    private javax.swing.JPanel jpNavBar;
    public javax.swing.JTable jtbCartelera;
    private javax.swing.JLabel lblCartelera;
    private javax.swing.JLabel lblCinemaNOW;
    public javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblUsername;
    public javax.swing.JTextField txtDuration;
    public javax.swing.JTextField txtMoviePoster1;
    public javax.swing.JTextField txtMovieTitle;
    public javax.swing.JTextField txtMovieTrailer;
    public javax.swing.JTextField txtSinopsis;
    // End of variables declaration//GEN-END:variables
}
