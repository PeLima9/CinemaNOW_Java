
package Vista;

import Controlador.ctrlRegister;
import Modelo.Usuario;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
/**
 *
 * @author eduar
 */
public class FrmRegister extends javax.swing.JFrame {

    /**
     * Creates new form FrmRegister
     */
    public FrmRegister() {
        FlatLightLaf.setup();
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/resources/logo.png")).getImage());
       
    }
    
    public static void initFrmRegister() {
    Usuario modelo = new Usuario();
    FrmRegister vista = new FrmRegister();
    ctrlRegister controlador = new ctrlRegister(modelo, vista);

    System.out.println("Controlador y vista inicializados.");
    vista.setVisible(true);
    
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblRegister = new javax.swing.JLabel();
        txtRegisterName = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        imgBanner = new javax.swing.JLabel();
        jpHeader = new javax.swing.JPanel();
        imgCinemaNOW = new javax.swing.JLabel();
        lblCinemaNOW = new javax.swing.JLabel();
        jpDate = new javax.swing.JPanel();
        lblDate = new javax.swing.JLabel();
        jpNavBar = new javax.swing.JPanel();
        txtRegisterEmail = new javax.swing.JTextField();
        txtRegisterPassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        lblRegister1 = new javax.swing.JLabel();
        lblRegister2 = new javax.swing.JLabel();
        lblRegister3 = new javax.swing.JLabel();
        lblRegister4 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CinemaNow - Registro");
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1080));

        jPanel1.setBackground(new java.awt.Color(54, 47, 92));
        jPanel1.setName("CinemaNOW - Login"); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegister.setBackground(new java.awt.Color(255, 255, 255));
        lblRegister.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        lblRegister.setForeground(new java.awt.Color(255, 255, 255));
        lblRegister.setText("Confirmar Contraseña");
        jPanel1.add(lblRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 600, 190, 20));

        txtRegisterName.setBackground(new java.awt.Color(54, 47, 92));
        txtRegisterName.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        txtRegisterName.setForeground(new java.awt.Color(255, 255, 255));
        txtRegisterName.setToolTipText("");
        txtRegisterName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 93, 116), 3));
        txtRegisterName.setCaretColor(new java.awt.Color(255, 102, 102));
        jPanel1.add(txtRegisterName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 520, 50));

        btnRegister.setBackground(new java.awt.Color(248, 93, 116));
        btnRegister.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar-usuario.png"))); // NOI18N
        btnRegister.setText("Registrarse");
        btnRegister.setBorder(null);
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 700, 180, 50));

        imgBanner.setFont(new java.awt.Font("Montserrat Black", 0, 24)); // NOI18N
        imgBanner.setForeground(new java.awt.Color(255, 255, 255));
        imgBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/login (2).png"))); // NOI18N
        jPanel1.add(imgBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 140, 900, 800));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1146, Short.MAX_VALUE)
                .addComponent(jpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
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
                        .addGap(27, 27, 27)
                        .addComponent(jpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jpHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1920, 150));

        jpNavBar.setBackground(new java.awt.Color(32, 29, 76));

        javax.swing.GroupLayout jpNavBarLayout = new javax.swing.GroupLayout(jpNavBar);
        jpNavBar.setLayout(jpNavBarLayout);
        jpNavBarLayout.setHorizontalGroup(
            jpNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
        );
        jpNavBarLayout.setVerticalGroup(
            jpNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        jPanel1.add(jpNavBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 940, 1920, 140));

        txtRegisterEmail.setBackground(new java.awt.Color(54, 47, 92));
        txtRegisterEmail.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        txtRegisterEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtRegisterEmail.setToolTipText("");
        txtRegisterEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 93, 116), 3));
        txtRegisterEmail.setCaretColor(new java.awt.Color(255, 102, 102));
        jPanel1.add(txtRegisterEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 520, 50));

        txtRegisterPassword.setBackground(new java.awt.Color(54, 47, 92));
        txtRegisterPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtRegisterPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 93, 116), 3));
        txtRegisterPassword.setCaretColor(new java.awt.Color(255, 102, 102));
        jPanel1.add(txtRegisterPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, 520, 50));

        txtConfirmPassword.setBackground(new java.awt.Color(54, 47, 92));
        txtConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtConfirmPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 93, 116), 3));
        txtConfirmPassword.setCaretColor(new java.awt.Color(255, 102, 102));
        jPanel1.add(txtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 630, 520, 50));

        lblRegister1.setBackground(new java.awt.Color(255, 255, 255));
        lblRegister1.setFont(new java.awt.Font("Montserrat Black", 0, 36)); // NOI18N
        lblRegister1.setForeground(new java.awt.Color(255, 255, 255));
        lblRegister1.setText("Bienvenido! El primer paso es registrarse");
        jPanel1.add(lblRegister1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 660, 60));

        lblRegister2.setBackground(new java.awt.Color(255, 255, 255));
        lblRegister2.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        lblRegister2.setForeground(new java.awt.Color(255, 255, 255));
        lblRegister2.setText("Nombre");
        jPanel1.add(lblRegister2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 70, 20));

        lblRegister3.setBackground(new java.awt.Color(255, 255, 255));
        lblRegister3.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        lblRegister3.setForeground(new java.awt.Color(255, 255, 255));
        lblRegister3.setText("Correo");
        jPanel1.add(lblRegister3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 70, 20));

        lblRegister4.setBackground(new java.awt.Color(255, 255, 255));
        lblRegister4.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        lblRegister4.setForeground(new java.awt.Color(255, 255, 255));
        lblRegister4.setText("Contraseña");
        jPanel1.add(lblRegister4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 100, 20));

        btnSalir.setBackground(new java.awt.Color(248, 93, 116));
        btnSalir.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/x (1).png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 780, 180, 50));

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRegister;
    public javax.swing.JButton btnSalir;
    private javax.swing.JLabel imgBanner;
    private javax.swing.JLabel imgCinemaNOW;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpDate;
    private javax.swing.JPanel jpHeader;
    private javax.swing.JPanel jpNavBar;
    private javax.swing.JLabel lblCinemaNOW;
    public javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JLabel lblRegister1;
    private javax.swing.JLabel lblRegister2;
    private javax.swing.JLabel lblRegister3;
    private javax.swing.JLabel lblRegister4;
    public javax.swing.JPasswordField txtConfirmPassword;
    public javax.swing.JTextField txtRegisterEmail;
    public javax.swing.JTextField txtRegisterName;
    public javax.swing.JPasswordField txtRegisterPassword;
    // End of variables declaration//GEN-END:variables
}
