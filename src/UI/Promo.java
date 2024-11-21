package UI;

public class Promo extends javax.swing.JFrame {
    public Promo() {
        initComponents();
        customizeButtons();
        setLocationRelativeTo(null);
    }
    
    private void customizeButtons() {
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

        Home.setOpaque(false);
        Home.setContentAreaFilled(false);
        Home.setBorderPainted(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        Promo = new javax.swing.JButton();
        About = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        Menu = new javax.swing.JButton();
        Pesanan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3.png"))); // NOI18N
        jLabel17.setText("jLabel17");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, 740));

        Promo.setText("jButton1");
        Promo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PromoActionPerformed(evt);
            }
        });
        jPanel2.add(Promo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 110, 50));

        About.setText("jButton2");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        jPanel2.add(About, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 190, 60));

        Home.setText("jButton3");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        jPanel2.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 130, 80));

        Menu.setText("jButton4");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        jPanel2.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 100, 50));

        Pesanan.setText("jButton5");
        Pesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesananActionPerformed(evt);
            }
        });
        jPanel2.add(Pesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, 150, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1215, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Promo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton About;
    private javax.swing.JButton Home;
    private javax.swing.JButton Menu;
    private javax.swing.JButton Pesanan;
    private javax.swing.JButton Promo;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
