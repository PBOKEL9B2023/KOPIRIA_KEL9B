package UI;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import entities.Database;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
        customizeButtons();
        setLocationRelativeTo(null);
    }

    static class User {
        String username;
        String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

    private ArrayList<User> admin = new ArrayList<>();
    private void loadUsersFromDatabase() {
        String query = "SELECT username, password FROM admin"; 
        try (Connection connection = Database.connect();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            admin.clear();

            while (resultSet.next()) {
                String dbUsername = resultSet.getString("username");
                String dbPassword = resultSet.getString("password");
                admin.add(new User(dbUsername, dbPassword));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database connection error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        username = new javax.swing.JLabel();
        jTextFieldPassword = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        jButtonLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Promo = new javax.swing.JButton();
        About = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        Menu = new javax.swing.JButton();
        Pesanan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 102, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        title.setBackground(new java.awt.Color(100, 200, 242));
        title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(30, 215, 96));
        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Kopiria.png"))); // NOI18N

        jTextFieldUsername.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameActionPerformed(evt);
            }
        });

        username.setForeground(new java.awt.Color(242, 242, 242));
        username.setText("Username");

        jTextFieldPassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        password.setForeground(new java.awt.Color(242, 242, 242));
        password.setText("Password");

        jButtonLogin.setBackground(new java.awt.Color(255, 153, 51));
        jButtonLogin.setText("Login");
        jButtonLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(title)
                .addGap(93, 93, 93))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(123, 123, 123)
                            .addComponent(username))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(125, 125, 125)
                            .addComponent(password))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(63, 63, 63)
                            .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(37, 37, 37)
                .addComponent(username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jLayeredPane1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 310, 350));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/promo.png"))); // NOI18N
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1200, 720));

        Promo.setText("jButton1");
        Promo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PromoActionPerformed(evt);
            }
        });
        jLayeredPane1.add(Promo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 110, 50));

        About.setText("jButton2");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        jLayeredPane1.add(About, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 190, 60));

        Home.setText("jButton3");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        jLayeredPane1.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 130, 80));

        Menu.setText("jButton4");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        jLayeredPane1.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 100, 50));

        Pesanan.setText("jButton5");
        Pesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesananActionPerformed(evt);
            }
        });
        jLayeredPane1.add(Pesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, 150, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        String inputUsername = jTextFieldUsername.getText();
        String inputPassword = jTextFieldPassword.getText();

        loadUsersFromDatabase();

        boolean loginSuccessful = false;

        for (User user : admin) {
            if (user.getUsername().equals(inputUsername) && user.getPassword().equals(inputPassword)) {
                loginSuccessful = true;
                break;
            }
        }

        if (loginSuccessful) {
            JOptionPane.showMessageDialog(this, "Login Berhasil");

            AdminUI adminui = new AdminUI();
            adminui.setVisible(true);

            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Login Gagal");
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameActionPerformed
       
    }//GEN-LAST:event_jTextFieldUsernameActionPerformed

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
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton About;
    private javax.swing.JButton Home;
    private javax.swing.JButton Menu;
    private javax.swing.JButton Pesanan;
    private javax.swing.JButton Promo;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldUsername;
    private javax.swing.JLabel password;
    private javax.swing.JLabel title;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}

