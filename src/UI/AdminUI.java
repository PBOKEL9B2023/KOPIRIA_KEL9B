package UI;

import entities.MenuKopiria;
import services.MenuKopiriaController;

import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AdminUI extends javax.swing.JFrame {
    private DefaultTableModel model;
    private MenuKopiriaController menuKopiriaController;
    private MenuKopiriaController menuController;

    public AdminUI() {
        initComponents();
        customizeButtons();
        setLocationRelativeTo(null);
        menuKopiriaController = new MenuKopiriaController();

        model = new DefaultTableModel();
        model.addColumn("Nama");
        model.addColumn("Jumlah");
        model.addColumn("Harga");
        model.addColumn("Jenis");

        tabel.setModel(model);
        loadTableData();
    }

    private void loadTableData() {
        model.setRowCount(0);
        List<MenuKopiria> menuKopirias = menuKopiriaController.getAllMenuKopirias();
        for (MenuKopiria item : menuKopirias) {
            model.addRow(new Object[]{
                item.getName(), 
                item.getQuantity(), 
                item.getPrice(), 
                item.getCategory() 
            });
        }
    }

    
    private void clearInputs() {
        inputnama.setText("");
        inputjumlah.setText("");
        inputharga.setText("");
        combojenis.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
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
        inputnama = new javax.swing.JTextField();
        inputjumlah = new javax.swing.JTextField();
        inputharga = new javax.swing.JTextField();
        combojenis = new javax.swing.JComboBox<>();
        buttonedit = new javax.swing.JButton();
        buttontambah = new javax.swing.JButton();
        buttonhapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        PromoButton = new javax.swing.JButton();
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

        inputnama.setForeground(new java.awt.Color(102, 51, 0));
        inputnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputnamaActionPerformed(evt);
            }
        });
        jPanel1.add(inputnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 230, 30));

        inputjumlah.setForeground(new java.awt.Color(102, 51, 0));
        inputjumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputjumlahActionPerformed(evt);
            }
        });
        jPanel1.add(inputjumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 230, 30));

        inputharga.setForeground(new java.awt.Color(102, 51, 0));
        inputharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputhargaActionPerformed(evt);
            }
        });
        jPanel1.add(inputharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 230, 30));

        combojenis.setForeground(new java.awt.Color(102, 51, 0));
        combojenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Food", "Coffee", "NonCoffee" }));
        combojenis.setToolTipText("");
        combojenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combojenisActionPerformed(evt);
            }
        });
        jPanel1.add(combojenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 230, 30));

        buttonedit.setForeground(new java.awt.Color(51, 51, 51));
        buttonedit.setText("Edit Menu");
        buttonedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoneditActionPerformed(evt);
            }
        });
        jPanel1.add(buttonedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, -1, -1));

        buttontambah.setText("Tambah Menu");
        buttontambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttontambahActionPerformed(evt);
            }
        });
        jPanel1.add(buttontambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, -1, -1));

        buttonhapus.setText("Hapus Menu");
        buttonhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonhapusActionPerformed(evt);
            }
        });
        jPanel1.add(buttonhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 410, -1, -1));

        tabel.setBackground(new java.awt.Color(242, 255, 147));
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama", "Jumlah", "Harga", "Jenis"
            }
        ));
        tabel.setGridColor(new java.awt.Color(242, 255, 244));
        tabel.setRequestFocusEnabled(false);
        tabel.setSelectionBackground(new java.awt.Color(242, 255, 247));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 604, 178));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/6.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 690));

        PromoButton.setText("jButton1");
        PromoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PromoButtonActionPerformed(evt);
            }
        });
        jPanel1.add(PromoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 110, 50));

        About.setText("jButton2");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        jPanel1.add(About, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 190, 60));

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttoneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoneditActionPerformed
       try {
            int selectedRow = tabel.getSelectedRow();

            if (selectedRow != -1) {
                String namaLama = model.getValueAt(selectedRow, 0).toString();

                String nama = inputnama.getText().trim();
                String jumlahText = inputjumlah.getText().trim();
                String hargaText = inputharga.getText().trim();
                String jenis = combojenis.getSelectedItem().toString();

                if (!nama.matches("^[a-zA-Z\\s]+$")) {
                    JOptionPane.showMessageDialog(null, 
                        "Nama harus berupa huruf dan tidak boleh kosong atau mengandung angka/simbol!",
                        "Validasi Input", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (!jumlahText.matches("\\d+")) {
                    JOptionPane.showMessageDialog(null, 
                        "Jumlah harus berupa angka positif dan tidak boleh kosong!",
                        "Validasi Input", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (!hargaText.matches("\\d+")) { // Tidak ada desimal karena harga adalah int
                    JOptionPane.showMessageDialog(null, 
                        "Harga harus berupa angka positif dan tidak boleh kosong!",
                        "Validasi Input", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int jumlah = Integer.parseInt(jumlahText);
                int harga = Integer.parseInt(hargaText); 

                MenuKopiria updatedItem = new MenuKopiria(nama, jumlah, harga, jenis);

                if (menuKopiriaController.updateMenuKopiria(namaLama, updatedItem)) {
                    model.setValueAt(nama, selectedRow, 0);
                    model.setValueAt(jumlah, selectedRow, 1);
                    model.setValueAt(harga, selectedRow, 2);
                    model.setValueAt(jenis, selectedRow, 3);

                    JOptionPane.showMessageDialog(null, 
                        "Menu berhasil diperbarui.",
                        "Update Berhasil", JOptionPane.INFORMATION_MESSAGE);
                    clearInputs();
                } else {
                    JOptionPane.showMessageDialog(null, 
                        "Update gagal. Pastikan item ada di database.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, 
                    "Pilih menu yang akan diedit.",
                    "Error", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                "Terjadi kesalahan saat memperbarui menu: " + e.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_buttoneditActionPerformed

    private void buttontambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttontambahActionPerformed
        String nama = inputnama.getText().trim();
        String jumlahText = inputjumlah.getText().trim();
        String hargaText = inputharga.getText().trim();
        String jenis = combojenis.getSelectedItem().toString();

        if (!nama.matches("^[a-zA-Z\\s]+$")) {
            JOptionPane.showMessageDialog(null, "Nama harus berupa huruf dan tidak boleh kosong atau mengandung angka/simbol!");
            return;
        }

        if (!jumlahText.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Jumlah harus berupa angka positif dan tidak boleh kosong!");
            return;
        }

        if (!hargaText.matches("\\d+")) { 
            JOptionPane.showMessageDialog(null, "Harga harus berupa angka positif dan tidak boleh kosong!");
            return;
        }

        int jumlah = Integer.parseInt(jumlahText);
        int harga = Integer.parseInt(hargaText);

        MenuKopiria menuItem = new MenuKopiria(nama, jumlah, harga, jenis);
        menuKopiriaController.addMenuKopiria(menuItem);

        model.addRow(new Object[]{nama, jumlah, harga, jenis});
        JOptionPane.showMessageDialog(null, "Menu berhasil ditambahkan.");
        clearInputs();
    }//GEN-LAST:event_buttontambahActionPerformed

    private void buttonhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonhapusActionPerformed
        try {
            int selectedRow = tabel.getSelectedRow();
            if (selectedRow != -1) {
                String nama = model.getValueAt(selectedRow, 0).toString();
                menuKopiriaController.deleteMenuKopiria(nama);
                model.removeRow(selectedRow);
                JOptionPane.showMessageDialog(null, "MenuKopiria berhasil dihapus.");
            } else {
                JOptionPane.showMessageDialog(null, "Pilih menu yang akan dihapus.");
            } 
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Kesalahan format input angka.", "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan saat menghapus item: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_buttonhapusActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        int selectedRow = tabel.getSelectedRow();

        if (selectedRow != -1) {
            String nilainama = model.getValueAt(selectedRow, 0).toString();
            String nilaijumlah = model.getValueAt(selectedRow, 1).toString();
            String nilaiharga = model.getValueAt(selectedRow, 2).toString();
            String nilaijenis = model.getValueAt(selectedRow, 3).toString();

            inputnama.setText(nilainama);
            inputjumlah.setText(nilaijumlah);
            inputharga.setText(nilaiharga);
            combojenis.setSelectedItem(nilaijenis);
        }
    }//GEN-LAST:event_tabelMouseClicked

    private void combojenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combojenisActionPerformed
       
    }//GEN-LAST:event_combojenisActionPerformed

    private void inputnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputnamaActionPerformed
       
    }//GEN-LAST:event_inputnamaActionPerformed

    private void inputjumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputjumlahActionPerformed
           
    }//GEN-LAST:event_inputjumlahActionPerformed

    private void inputhargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputhargaActionPerformed
       
    }//GEN-LAST:event_inputhargaActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        Menu menuWindow = new Menu();
        menuWindow.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_MenuActionPerformed

    private void PromoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PromoButtonActionPerformed
        Promo promoWindow = new Promo();
        promoWindow.setVisible(true);   
        this.dispose();
    }//GEN-LAST:event_PromoButtonActionPerformed

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
        PromoButton.setOpaque(false);
        PromoButton.setContentAreaFilled(false);
        PromoButton.setBorderPainted(false);

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
                new AdminUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton About;
    private javax.swing.JButton Home;
    private javax.swing.JButton Menu;
    private javax.swing.JButton Pesanan;
    private javax.swing.JButton PromoButton;
    private javax.swing.JButton buttonedit;
    private javax.swing.JButton buttonhapus;
    private javax.swing.JButton buttontambah;
    private javax.swing.JComboBox<String> combojenis;
    private javax.swing.JTextField inputharga;
    private javax.swing.JTextField inputjumlah;
    private javax.swing.JTextField inputnama;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
