package UI;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        customizeButtons();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Promo = new javax.swing.JButton();
        About = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        Menu = new javax.swing.JButton();
        Pesanan = new javax.swing.JButton();
        Pesanan1 = new javax.swing.JButton();
        Menu1 = new javax.swing.JButton();
        Promo1 = new javax.swing.JButton();
        About1 = new javax.swing.JButton();
        Admin1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1250, 710));

        Promo.setText("jButton1");
        Promo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PromoActionPerformed(evt);
            }
        });
        jPanel1.add(Promo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 110, 50));

        About.setText("jButton2");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        jPanel1.add(About, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 190, 60));

        Home.setText("jButton3");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        jPanel1.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 130, 80));

        Menu.setText("jButton4");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        jPanel1.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 100, 50));

        Pesanan.setText("jButton5");
        Pesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesananActionPerformed(evt);
            }
        });
        jPanel1.add(Pesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, 150, 50));

        Pesanan1.setText("jButton1");
        Pesanan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pesanan1ActionPerformed(evt);
            }
        });
        jPanel1.add(Pesanan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 310, 180));

        Menu1.setText("jButton2");
        Menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu1ActionPerformed(evt);
            }
        });
        jPanel1.add(Menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 310, 200));

        Promo1.setText("jButton3");
        Promo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Promo1ActionPerformed(evt);
            }
        });
        jPanel1.add(Promo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 320, 180));

        About1.setText("jButton4");
        About1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                About1ActionPerformed(evt);
            }
        });
        jPanel1.add(About1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 300, 180));

        Admin1.setText("jButton5");
        Admin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin1ActionPerformed(evt);
            }
        });
        jPanel1.add(Admin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 410, 290, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        Menu menuWindow = new Menu();
        menuWindow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuActionPerformed

    private void PromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PromoActionPerformed
        Promo promoWindow = new Promo();
        promoWindow.setVisible(true);   
        this.dispose();
    }//GEN-LAST:event_PromoActionPerformed

    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
        About aboutWindow = new About();
        aboutWindow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AboutActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        Home homeWindow = new Home();
        homeWindow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeActionPerformed

    private void PesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesananActionPerformed
        UserUI userWindow = new UserUI();
        userWindow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PesananActionPerformed

    private void Pesanan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pesanan1ActionPerformed
        UserUI userWindow = new UserUI();
        userWindow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Pesanan1ActionPerformed

    private void Menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu1ActionPerformed
        Menu menuWindow = new Menu();
        menuWindow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Menu1ActionPerformed

    private void Promo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Promo1ActionPerformed
        Promo promoWindow = new Promo();
        promoWindow.setVisible(true);   
        this.dispose();
    }//GEN-LAST:event_Promo1ActionPerformed

    private void About1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_About1ActionPerformed
        About aboutWindow = new About();
        aboutWindow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_About1ActionPerformed

    private void Admin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin1ActionPerformed
        Login loginWindow = new Login();
        loginWindow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Admin1ActionPerformed
    private void customizeButtons() {
        Promo1.setOpaque(false);
        Promo1.setContentAreaFilled(false);
        Promo1.setBorderPainted(false);

        About1.setOpaque(false);
        About1.setContentAreaFilled(false);
        About1.setBorderPainted(false);

        Menu1.setOpaque(false);
        Menu1.setContentAreaFilled(false);
        Menu1.setBorderPainted(false);

        Pesanan1.setOpaque(false);
        Pesanan1.setContentAreaFilled(false);
        Pesanan1.setBorderPainted(false);

        Promo.setOpaque(false);
        Promo.setContentAreaFilled(false);
        Promo.setBorderPainted(false);

        About.setOpaque(false);
        About.setContentAreaFilled(false);
        About.setBorderPainted(false);

        Menu.setOpaque(false);
        Menu.setContentAreaFilled(false);
        Menu.setBorderPainted(false);

        Pesanan.setOpaque(false);
        Pesanan.setContentAreaFilled(false);
        Pesanan.setBorderPainted(false);

        Admin1.setOpaque(false);
        Admin1.setContentAreaFilled(false);
        Admin1.setBorderPainted(false);
        
        Home.setOpaque(false);
        Home.setContentAreaFilled(false);
        Home.setBorderPainted(false);
    }
       
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton About;
    private javax.swing.JButton About1;
    private javax.swing.JButton Admin1;
    private javax.swing.JButton Home;
    private javax.swing.JButton Menu;
    private javax.swing.JButton Menu1;
    private javax.swing.JButton Pesanan;
    private javax.swing.JButton Pesanan1;
    private javax.swing.JButton Promo;
    private javax.swing.JButton Promo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
