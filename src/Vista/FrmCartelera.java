
package Vista;

import Controlador.ctrlCartelera;
import Modelo.Cartelera;
import Modelo.Clasificacion;
import Modelo.Genero;
import javax.swing.ImageIcon;

public class FrmCartelera extends javax.swing.JFrame {

    public FrmCartelera() {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/resources/logo.png")).getImage());
    }

    public static void initFrmCartelera(){
         Cartelera ModeloCartelera = new Cartelera();
         Clasificacion ModeloClasificacion = new Clasificacion();
         Genero ModeloGenero = new Genero();
         FrmCartelera Vista = new FrmCartelera();
         ctrlCartelera Controlador = new ctrlCartelera(ModeloCartelera, ModeloGenero, ModeloClasificacion, Vista);
        
                Vista.setVisible(true);
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
        jtbCartelera = new javax.swing.JTable();
        lblUsername = new javax.swing.JLabel();
        btnEditMovie = new javax.swing.JButton();
        btnAddMovie = new javax.swing.JButton();
        btnDeleteMovie = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        txtMovieTrailer = new javax.swing.JTextField();
        txtSinopsis = new javax.swing.JTextField();
        jcbGenre = new javax.swing.JComboBox<>();
        jcbRating = new javax.swing.JComboBox<>();
        txtMovieTitle = new javax.swing.JTextField();
        txtDuration = new javax.swing.JTextField();
        txtMoviePoster = new javax.swing.JTextField();
        lblCartelera1 = new javax.swing.JLabel();
        lblCartelera2 = new javax.swing.JLabel();
        lblCartelera3 = new javax.swing.JLabel();
        lblCartelera4 = new javax.swing.JLabel();
        lblCartelera5 = new javax.swing.JLabel();
        lblCartelera6 = new javax.swing.JLabel();
        lblCartelera7 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jpNavBar = new javax.swing.JPanel();
        imgTickets = new javax.swing.JButton();
        imgCartelera = new javax.swing.JButton();
        imgEmpleados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CinemaNow - Cartelelra");
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

        lblCartelera.setFont(new java.awt.Font("Montserrat Black", 0, 36)); // NOI18N
        lblCartelera.setForeground(new java.awt.Color(255, 255, 255));
        lblCartelera.setText("Cartelera");
        jPanel1.add(lblCartelera, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 210, -1, -1));

        jtbCartelera.setBackground(new java.awt.Color(32, 29, 76));
        jtbCartelera.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
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
        jtbCartelera.setRowHeight(40);
        jtbCartelera.setSelectionBackground(new java.awt.Color(146, 134, 208));
        jScrollPane1.setViewportView(jtbCartelera);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 1300, 660));

        lblUsername.setFont(new java.awt.Font("Montserrat Black", 0, 24)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("USERNAME PLACEHOLDER");
        jPanel1.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        btnEditMovie.setBackground(new java.awt.Color(248, 93, 116));
        btnEditMovie.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        btnEditMovie.setForeground(new java.awt.Color(255, 255, 255));
        btnEditMovie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/editar.png"))); // NOI18N
        btnEditMovie.setText("Modificar Película");
        btnEditMovie.setBorder(null);
        jPanel1.add(btnEditMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(1650, 620, 210, 50));

        btnAddMovie.setBackground(new java.awt.Color(248, 93, 116));
        btnAddMovie.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        btnAddMovie.setForeground(new java.awt.Color(255, 255, 255));
        btnAddMovie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/plus-pequeno.png"))); // NOI18N
        btnAddMovie.setText("Agregar Película");
        btnAddMovie.setBorder(null);
        jPanel1.add(btnAddMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 620, 210, 50));

        btnDeleteMovie.setBackground(new java.awt.Color(248, 93, 116));
        btnDeleteMovie.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        btnDeleteMovie.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteMovie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/borrar.png"))); // NOI18N
        btnDeleteMovie.setText("Borrar Película");
        btnDeleteMovie.setBorder(null);
        jPanel1.add(btnDeleteMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(1650, 680, 210, 50));

        btnMenu.setBackground(new java.awt.Color(248, 93, 116));
        btnMenu.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/casa (1).png"))); // NOI18N
        btnMenu.setText("Volver a inicio");
        btnMenu.setBorder(null);
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 890, 210, 50));

        txtMovieTrailer.setBackground(new java.awt.Color(54, 47, 92));
        txtMovieTrailer.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        txtMovieTrailer.setForeground(new java.awt.Color(255, 255, 255));
        txtMovieTrailer.setToolTipText("");
        txtMovieTrailer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 93, 116)));
        txtMovieTrailer.setCaretColor(new java.awt.Color(255, 102, 102));
        jPanel1.add(txtMovieTrailer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 560, 320, 40));

        txtSinopsis.setBackground(new java.awt.Color(54, 47, 92));
        txtSinopsis.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        txtSinopsis.setForeground(new java.awt.Color(255, 255, 255));
        txtSinopsis.setToolTipText("");
        txtSinopsis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 93, 116)));
        txtSinopsis.setCaretColor(new java.awt.Color(255, 102, 102));
        jPanel1.add(txtSinopsis, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 310, 320, 40));

        jcbGenre.setBackground(new java.awt.Color(54, 47, 92));
        jcbGenre.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        jcbGenre.setForeground(new java.awt.Color(255, 255, 255));
        jcbGenre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 93, 116)));
        jPanel1.add(jcbGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 460, 320, 40));

        jcbRating.setBackground(new java.awt.Color(54, 47, 92));
        jcbRating.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        jcbRating.setForeground(new java.awt.Color(255, 255, 255));
        jcbRating.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 93, 116)));
        jPanel1.add(jcbRating, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 410, 320, 40));

        txtMovieTitle.setBackground(new java.awt.Color(54, 47, 92));
        txtMovieTitle.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        txtMovieTitle.setForeground(new java.awt.Color(255, 255, 255));
        txtMovieTitle.setToolTipText("");
        txtMovieTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 93, 116)));
        txtMovieTitle.setCaretColor(new java.awt.Color(255, 102, 102));
        jPanel1.add(txtMovieTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 260, 320, 40));

        txtDuration.setBackground(new java.awt.Color(54, 47, 92));
        txtDuration.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        txtDuration.setForeground(new java.awt.Color(255, 255, 255));
        txtDuration.setToolTipText("");
        txtDuration.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 93, 116)));
        txtDuration.setCaretColor(new java.awt.Color(255, 102, 102));
        jPanel1.add(txtDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 360, 320, 40));

        txtMoviePoster.setBackground(new java.awt.Color(54, 47, 92));
        txtMoviePoster.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        txtMoviePoster.setForeground(new java.awt.Color(255, 255, 255));
        txtMoviePoster.setToolTipText("");
        txtMoviePoster.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 93, 116)));
        txtMoviePoster.setCaretColor(new java.awt.Color(255, 102, 102));
        jPanel1.add(txtMoviePoster, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 510, 320, 40));

        lblCartelera1.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        lblCartelera1.setForeground(new java.awt.Color(255, 255, 255));
        lblCartelera1.setText("Descripción: ");
        jPanel1.add(lblCartelera1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 320, -1, -1));

        lblCartelera2.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        lblCartelera2.setForeground(new java.awt.Color(255, 255, 255));
        lblCartelera2.setText("Título: ");
        jPanel1.add(lblCartelera2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 270, -1, -1));

        lblCartelera3.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        lblCartelera3.setForeground(new java.awt.Color(255, 255, 255));
        lblCartelera3.setText("Duración:");
        jPanel1.add(lblCartelera3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 370, -1, -1));

        lblCartelera4.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        lblCartelera4.setForeground(new java.awt.Color(255, 255, 255));
        lblCartelera4.setText("Clasificación:");
        jPanel1.add(lblCartelera4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 420, -1, -1));

        lblCartelera5.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        lblCartelera5.setForeground(new java.awt.Color(255, 255, 255));
        lblCartelera5.setText("Trailer:");
        jPanel1.add(lblCartelera5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 570, -1, -1));

        lblCartelera6.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        lblCartelera6.setForeground(new java.awt.Color(255, 255, 255));
        lblCartelera6.setText("Póster:");
        jPanel1.add(lblCartelera6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 520, -1, -1));

        lblCartelera7.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        lblCartelera7.setForeground(new java.awt.Color(255, 255, 255));
        lblCartelera7.setText("Género:");
        jPanel1.add(lblCartelera7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 470, -1, -1));

        btnClear.setBackground(new java.awt.Color(248, 93, 116));
        btnClear.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/escoba.png"))); // NOI18N
        btnClear.setText("Limpiar Campos");
        btnClear.setBorder(null);
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 680, 210, 50));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 629, Short.MAX_VALUE)
                .addComponent(imgEmpleados)
                .addGap(567, 567, 567)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                initFrmCartelera();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAddMovie;
    public javax.swing.JButton btnClear;
    public javax.swing.JButton btnDeleteMovie;
    public javax.swing.JButton btnEditMovie;
    public javax.swing.JButton btnMenu;
    public javax.swing.JButton imgCartelera;
    private javax.swing.JLabel imgCinemaNOW;
    public javax.swing.JButton imgEmpleados;
    public javax.swing.JButton imgTickets;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JComboBox<String> jcbGenre;
    public javax.swing.JComboBox<String> jcbRating;
    private javax.swing.JPanel jpDate;
    private javax.swing.JPanel jpHeader;
    private javax.swing.JPanel jpNavBar;
    public javax.swing.JTable jtbCartelera;
    private javax.swing.JLabel lblCartelera;
    public javax.swing.JLabel lblCartelera1;
    public javax.swing.JLabel lblCartelera2;
    public javax.swing.JLabel lblCartelera3;
    public javax.swing.JLabel lblCartelera4;
    public javax.swing.JLabel lblCartelera5;
    public javax.swing.JLabel lblCartelera6;
    public javax.swing.JLabel lblCartelera7;
    private javax.swing.JLabel lblCinemaNOW;
    public javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblUsername;
    public javax.swing.JTextField txtDuration;
    public javax.swing.JTextField txtMoviePoster;
    public javax.swing.JTextField txtMovieTitle;
    public javax.swing.JTextField txtMovieTrailer;
    public javax.swing.JTextField txtSinopsis;
    // End of variables declaration//GEN-END:variables
}
