package UI;

import entities.Pesanan;
import services.PesananController;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;


public class UserUI extends javax.swing.JFrame {
    private DefaultTableModel model;
    private PesananController pesananController;
    private ButtonGroup ukuranGroup;
    private ButtonGroup jenisGroup;
    private ButtonGroup paymentGroup;
    private String selectedPaymentMethod = null; 

    public UserUI() {
        initComponents();
        customizeButtons();
        setLocationRelativeTo(null);
        pesananController = new PesananController();

        model = new DefaultTableModel();
        model.addColumn("Pemesan");
        model.addColumn("Nama");
        model.addColumn("Jumlah");
        model.addColumn("Ukuran");
        model.addColumn("Jenis");
        model.addColumn("Metode Pembayaran");


        tabel.setModel(model);
        loadTableData();

        ukuranGroup = new ButtonGroup();
        ukuranGroup.add(radioReguler);
        ukuranGroup.add(radioLarge);
        ukuranGroup.clearSelection();

        jenisGroup = new ButtonGroup();
        jenisGroup.add(radioDineIn);
        jenisGroup.add(radioTakeAway);
        jenisGroup.clearSelection();

        paymentGroup = new ButtonGroup();
        paymentGroup.add(radioQRIS);
        paymentGroup.add(radioTunai);
        paymentGroup.clearSelection();
        
        setupPaymentListeners();
        loadMenuItems();
        
    }
    
    private void setupPaymentListeners() {
        radioQRIS.addActionListener(evt -> {
            if (selectedPaymentMethod == null) {
                selectedPaymentMethod = "QRIS";
                lockPaymentChoice();
            } else {
                JOptionPane.showMessageDialog(null, "Metode pembayaran sudah dipilih: " + selectedPaymentMethod);
                radioQRIS.setSelected(selectedPaymentMethod.equals("QRIS"));
            }
        });

        radioTunai.addActionListener(evt -> {
            if (selectedPaymentMethod == null) {
                selectedPaymentMethod = "Tunai";
                lockPaymentChoice();
            } else {
                JOptionPane.showMessageDialog(null, "Metode pembayaran sudah dipilih: " + selectedPaymentMethod);
                radioTunai.setSelected(selectedPaymentMethod.equals("Tunai"));
            }
        });
    }

    private void lockPaymentChoice() {
        radioQRIS.setEnabled(false);
        radioTunai.setEnabled(false);
    }


    private void loadTableData() {
        model.setRowCount(0); 

        List<Pesanan> userPesanans = pesananController.getPesananList(); 

        for (Pesanan pesanan : userPesanans) {
            model.addRow(new Object[]{
                pesanan.getPemesan(),
                pesanan.getName(),
                pesanan.getQuantity(),
                pesanan.getSize(),
                pesanan.getOrderType(),
                pesanan.getPaymentMethod()
            });
        }
    }
    
    private void loadMenuItems() {
        List<String> menuNames = pesananController.getMenuNames();
        ComboBoxMenu.removeAllItems();

        for (String name : menuNames) {
            ComboBoxMenu.addItem(name);
        }
    }

    private void clearInputs() {
        inputpemesan.setText("");
        ComboBoxMenu.setSelectedIndex(0);
        inputjumlah.setText("");
        ukuranGroup.clearSelection();
        jenisGroup.clearSelection();
    }
    
    private void displayPesanan(List<Pesanan> pesananList) {
        model.setRowCount(0); 
        for (Pesanan pesanan : pesananList) {
            model.addRow(new Object[]{
                pesanan.getPemesan(),
                pesanan.getName(),
                pesanan.getQuantity(),
                pesanan.getSize(),
                pesanan.getOrderType(),
                pesanan.getPaymentMethod()
            });
        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        inputjumlah = new javax.swing.JTextField();
        radioReguler = new javax.swing.JRadioButton();
        radioLarge = new javax.swing.JRadioButton();
        radioTakeAway = new javax.swing.JRadioButton();
        radioDineIn = new javax.swing.JRadioButton();
        buttontambah = new javax.swing.JButton();
        radioQRIS = new javax.swing.JRadioButton();
        radioTunai = new javax.swing.JRadioButton();
        searchPesananButton = new javax.swing.JButton();
        searchPesanan = new javax.swing.JTextField();
        ComboBoxMenu = new javax.swing.JComboBox<>();
        inputpemesan = new javax.swing.JTextField();
        sortPesanan = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Promo = new javax.swing.JButton();
        About = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        Menu = new javax.swing.JButton();
        Pesanan = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton2.setText("jButton2");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel19.setText("jLabel19");

        jLabel21.setText("jLabel21");

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel.setBackground(new java.awt.Color(240, 255, 176));
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nama", "Jumlah", "Ukuran", "Jenis", "Metode Pembayaran"
            }
        ));
        tabel.setGridColor(new java.awt.Color(2, 40, 40));
        tabel.setRequestFocusEnabled(false);
        tabel.setSelectionBackground(new java.awt.Color(2, 40, 40));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 604, 230));

        inputjumlah.setForeground(new java.awt.Color(102, 51, 0));
        inputjumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputjumlahActionPerformed(evt);
            }
        });
        jPanel1.add(inputjumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 250, -1));

        radioReguler.setText("Reguler");
        radioReguler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioRegulerActionPerformed(evt);
            }
        });
        jPanel1.add(radioReguler, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, -1, -1));

        radioLarge.setText("Large");
        radioLarge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioLargeActionPerformed(evt);
            }
        });
        jPanel1.add(radioLarge, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, -1, -1));

        radioTakeAway.setText("Take Away");
        radioTakeAway.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTakeAwayActionPerformed(evt);
            }
        });
        jPanel1.add(radioTakeAway, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, -1, -1));

        radioDineIn.setSelected(true);
        radioDineIn.setText("Dine In");
        radioDineIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDineInActionPerformed(evt);
            }
        });
        jPanel1.add(radioDineIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, -1, -1));

        buttontambah.setText("Tambah Pesanan");
        buttontambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttontambahActionPerformed(evt);
            }
        });
        jPanel1.add(buttontambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, -1, -1));

        radioQRIS.setText("QRIS");
        radioQRIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioQRISActionPerformed(evt);
            }
        });
        jPanel1.add(radioQRIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, -1, -1));

        radioTunai.setText("Tunai");
        jPanel1.add(radioTunai, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, -1, -1));

        searchPesananButton.setText("Cari");
        searchPesananButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPesananButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchPesananButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 60, -1));

        searchPesanan.setForeground(new java.awt.Color(102, 51, 0));
        searchPesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPesananActionPerformed(evt);
            }
        });
        jPanel1.add(searchPesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 220, 20));

        ComboBoxMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "matcharia coffee", "matcharia choco", "matcharia sweet", "matcharia original", "matcharia hot", "eskopiren", "eskorimi", "eskoria", "eskoritem", "susuria regal", "susuria oreo", "eskul merona", "eskul apel ijo", "milo cheese", "milo kopi", "milo dinosaur", "roti bakar", "kentang goreng", "singkong goreng", "roti telur", " " }));
        ComboBoxMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxMenuActionPerformed(evt);
            }
        });
        jPanel1.add(ComboBoxMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 250, -1));
        jPanel1.add(inputpemesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 250, -1));

        sortPesanan.setText("Urutkan Jumlah Pesanan");
        sortPesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortPesananActionPerformed(evt);
            }
        });
        jPanel1.add(sortPesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 370, 160, -1));

        jLabel2.setText(" metode selama transaksi )");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 320, -1, -1));

        jLabel1.setText("( Hanya bisa memilih 1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 300, 130, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/promo (3).png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Promo.setText("jButton1");
        Promo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PromoActionPerformed(evt);
            }
        });
        jPanel1.add(Promo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 110, 50));

        About.setText("jButton2");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        jPanel1.add(About, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 190, 60));

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
        jPanel1.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 100, 50));

        Pesanan.setText("jButton5");
        Pesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesananActionPerformed(evt);
            }
        });
        jPanel1.add(Pesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 150, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1218, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttontambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttontambahActionPerformed
        String pemesan = inputpemesan.getText().trim();
        String nama = ComboBoxMenu.getSelectedItem().toString().trim();
        String jumlahText = inputjumlah.getText().trim();

        if (pemesan.isEmpty() || !pesananController.isValidString(pemesan)) {
            JOptionPane.showMessageDialog(null, "Nama pemesan harus berupa huruf dan tidak boleh kosong!");
            return;
        }
        if (jumlahText.isEmpty() || !jumlahText.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Jumlah harus berupa angka positif dan tidak boleh kosong!");
            return;
        }

        int jumlah = Integer.parseInt(jumlahText);
        if (jumlah <= 0) {
            JOptionPane.showMessageDialog(null, "Jumlah harus lebih dari 0!");
            return;
        }

        if (!pesananController.isQuantityAvailable(nama, jumlah)) {
            JOptionPane.showMessageDialog(null, "Pesanan gagal! Jumlah yang diminta melebihi stok yang tersedia.");
            return;
        }

        String ukuran = radioReguler.isSelected() ? "Reguler" : (radioLarge.isSelected() ? "Large" : null);
        if (ukuran == null) {
            JOptionPane.showMessageDialog(null, "Silakan pilih ukuran (Reguler atau Large)!");
            return;
        }

        String takeaway = radioDineIn.isSelected() ? "DineIn" : (radioTakeAway.isSelected() ? "TakeAway" : null);
        if (takeaway == null) {
            JOptionPane.showMessageDialog(null, "Silakan pilih tipe pesanan (DineIn atau TakeAway)!");
            return;
        }

        if (selectedPaymentMethod == null) {
            JOptionPane.showMessageDialog(null, "Pilih metode pembayaran terlebih dahulu!");
            return;
        }

        if (pesananController.updateProductQuantitySafely(nama, jumlah)) {
            Pesanan newPesanan = new Pesanan(pemesan, nama, jumlah, ukuran, takeaway, selectedPaymentMethod);
            pesananController.addPesanan(newPesanan); 
            loadTableData(); 
            JOptionPane.showMessageDialog(null, "Pesanan berhasil ditambahkan.");
            clearInputs();
        } else {
            JOptionPane.showMessageDialog(null, "Pesanan gagal! Stok tidak cukup atau terjadi kesalahan.");
        }
    }//GEN-LAST:event_buttontambahActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        
    }//GEN-LAST:event_tabelMouseClicked

    private void radioDineInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDineInActionPerformed
       
    }//GEN-LAST:event_radioDineInActionPerformed

    private void radioTakeAwayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTakeAwayActionPerformed
       
    }//GEN-LAST:event_radioTakeAwayActionPerformed

    private void radioRegulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioRegulerActionPerformed
       
    }//GEN-LAST:event_radioRegulerActionPerformed

    private void radioLargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioLargeActionPerformed
       
    }//GEN-LAST:event_radioLargeActionPerformed

    private void inputjumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputjumlahActionPerformed
           
    }//GEN-LAST:event_inputjumlahActionPerformed

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

    private void radioQRISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioQRISActionPerformed
       
    }//GEN-LAST:event_radioQRISActionPerformed

    private void searchPesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPesananActionPerformed
        String keyword = searchPesanan.getText(); // Ambil kata kunci dari input pengguna
        List<Pesanan> result = pesananController.searchPesanan(keyword); // Panggil metode pencarian
        displayPesanan(result); // Tampilkan hasil pencarian di tabel
    }//GEN-LAST:event_searchPesananActionPerformed

    private void sortPesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortPesananActionPerformed
        List<Pesanan> sortedPesanan = pesananController.sortPesananByPemesan();
        displayPesanan(sortedPesanan);
    }//GEN-LAST:event_sortPesananActionPerformed

    private void searchPesananButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPesananButtonActionPerformed
        searchPesananActionPerformed(evt);  
    }//GEN-LAST:event_searchPesananButtonActionPerformed

    private void ComboBoxMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxMenuActionPerformed

    }//GEN-LAST:event_ComboBoxMenuActionPerformed
    
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
                new UserUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton About;
    private javax.swing.JComboBox<String> ComboBoxMenu;
    private javax.swing.JButton Home;
    private javax.swing.JButton Menu;
    private javax.swing.JButton Pesanan;
    private javax.swing.JButton Promo;
    private javax.swing.JButton buttontambah;
    private javax.swing.JTextField inputjumlah;
    private javax.swing.JTextField inputpemesan;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton radioDineIn;
    private javax.swing.JRadioButton radioLarge;
    private javax.swing.JRadioButton radioQRIS;
    private javax.swing.JRadioButton radioReguler;
    private javax.swing.JRadioButton radioTakeAway;
    private javax.swing.JRadioButton radioTunai;
    private javax.swing.JTextField searchPesanan;
    private javax.swing.JButton searchPesananButton;
    private javax.swing.JToggleButton sortPesanan;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
