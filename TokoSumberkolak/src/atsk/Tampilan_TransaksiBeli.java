/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atsk;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.plaf.TableUI;
import javax.swing.table.JTableHeader;
import javax.swing.JTable;

/**
 *
 * @author ACER
 */
public class Tampilan_TransaksiBeli extends javax.swing.JFrame {

    /**
     * Creates new form TampilanBarang
     */
    public Tampilan_TransaksiBeli() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn_barang = new javax.swing.JLabel();
        btn_transaksi = new javax.swing.JLabel();
        btn_pengeluaran = new javax.swing.JLabel();
        btn_pemasok = new javax.swing.JLabel();
        btn_riwayat = new javax.swing.JLabel();
        btn_laporan = new javax.swing.JLabel();
        btn_karyawan = new javax.swing.JLabel();
        btn_pengaturan = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        panelRound2 = new atsk.panelRound();
        jLabel4 = new javax.swing.JLabel();
        btn_riwayatJual = new javax.swing.JLabel();
        panelRound1 = new atsk.panelRound();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        comboBoxSuggestion2 = new combo_suggestion.ComboBoxSuggestion();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        btn_tambah = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        javax.swing.JTable jTable2 = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        panelRound3 = new atsk.panelRound();
        jLabel3 = new javax.swing.JLabel();
        txt_cari = new javax.swing.JTextField();
        comboBoxSuggestion1 = new combo_suggestion.ComboBoxSuggestion();
        btn_cari = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 128, 105));
        jPanel1.setPreferredSize(new java.awt.Dimension(240, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 128, 105));
        jPanel2.setLayout(new java.awt.GridLayout(0, 1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo Ts V (White) 1(1080).png"))); // NOI18N
        jPanel2.add(jLabel1);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 72));

        jPanel3.setBackground(new java.awt.Color(0, 128, 105));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.PAGE_AXIS));

        btn_barang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/barang.png"))); // NOI18N
        btn_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_barangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_barangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_barangMouseExited(evt);
            }
        });
        jPanel3.add(btn_barang);

        btn_transaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transakasi_aktif.png"))); // NOI18N
        jPanel3.add(btn_transaksi);

        btn_pengeluaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pengeluaran.png"))); // NOI18N
        btn_pengeluaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pengeluaranMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_pengeluaranMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_pengeluaranMouseExited(evt);
            }
        });
        jPanel3.add(btn_pengeluaran);

        btn_pemasok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pemasok.png"))); // NOI18N
        btn_pemasok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pemasokMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_pemasokMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_pemasokMouseExited(evt);
            }
        });
        jPanel3.add(btn_pemasok);

        btn_riwayat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/riwayat.png"))); // NOI18N
        btn_riwayat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_riwayatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_riwayatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_riwayatMouseExited(evt);
            }
        });
        jPanel3.add(btn_riwayat);

        btn_laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/laporan.png"))); // NOI18N
        btn_laporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_laporanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_laporanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_laporanMouseExited(evt);
            }
        });
        jPanel3.add(btn_laporan);

        btn_karyawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/karyawan.png"))); // NOI18N
        btn_karyawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_karyawanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_karyawanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_karyawanMouseExited(evt);
            }
        });
        jPanel3.add(btn_karyawan);

        btn_pengaturan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pengaturan.png"))); // NOI18N
        btn_pengaturan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pengaturanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_pengaturanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_pengaturanMouseExited(evt);
            }
        });
        jPanel3.add(btn_pengaturan);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 88, 240, 630));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        jPanel5.setBackground(new java.awt.Color(245, 246, 250));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 0));

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setPreferredSize(new java.awt.Dimension(800, 42));
        panelRound2.setRoundBottomLeft(6);
        panelRound2.setRoundBottomRight(6);
        panelRound2.setRoundTopLeft(6);
        panelRound2.setRoundTopRight(6);
        panelRound2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 0));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/txt Transaksi Beli aktif.png"))); // NOI18N
        panelRound2.add(jLabel4);

        btn_riwayatJual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/txt Transaksi Jual.png"))); // NOI18N
        btn_riwayatJual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_riwayatJualMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_riwayatJualMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_riwayatJualMouseExited(evt);
            }
        });
        panelRound2.add(btn_riwayatJual);

        jPanel6.add(panelRound2);

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 840, 42));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(6);
        panelRound1.setRoundBottomRight(6);
        panelRound1.setRoundTopLeft(6);
        panelRound1.setRoundTopRight(6);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("No. Telpon");
        jLabel10.setPreferredSize(new java.awt.Dimension(200, 42));
        panelRound1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 318, -1, -1));

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Kode Beli");
        jLabel6.setPreferredSize(new java.awt.Dimension(397, 34));
        jPanel4.add(jLabel6);

        jTextField1.setPreferredSize(new java.awt.Dimension(200, 34));
        jPanel4.add(jTextField1);

        panelRound1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 642, 34));

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Kode Pemasok");
        jLabel7.setPreferredSize(new java.awt.Dimension(397, 34));
        jPanel7.add(jLabel7);

        comboBoxSuggestion2.setPreferredSize(new java.awt.Dimension(200, 34));
        jPanel7.add(comboBoxSuggestion2);

        panelRound1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 642, 34));

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setText("Tanggal");
        jLabel12.setPreferredSize(new java.awt.Dimension(397, 34));
        jPanel8.add(jLabel12);

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser1.setPreferredSize(new java.awt.Dimension(200, 34));
        jPanel8.add(jDateChooser1);

        panelRound1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 642, -1));

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setText("Total Harga");
        jLabel13.setPreferredSize(new java.awt.Dimension(397, 34));
        jPanel9.add(jLabel13);

        jTextField4.setPreferredSize(new java.awt.Dimension(200, 34));
        jPanel9.add(jTextField4);

        panelRound1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 642, -1));

        jPanel10.setOpaque(false);
        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setText("Kembali");
        jLabel14.setPreferredSize(new java.awt.Dimension(397, 34));
        jPanel10.add(jLabel14);

        jTextField5.setPreferredSize(new java.awt.Dimension(200, 34));
        jPanel10.add(jTextField5);

        panelRound1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 642, -1));

        jPanel11.setOpaque(false);
        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setText("Tunai");
        jLabel15.setPreferredSize(new java.awt.Dimension(397, 34));
        jPanel11.add(jLabel15);

        jTextField6.setPreferredSize(new java.awt.Dimension(200, 34));
        jPanel11.add(jTextField6);

        panelRound1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 642, -1));

        jPanel5.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 642, 280));

        btn_tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Button tambah Beli.png"))); // NOI18N
        btn_tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_tambahMouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_tambahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_tambahMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_tambahMousePressed(evt);
            }
        });
        jPanel5.add(btn_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, -1, -1));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Harga Beli", "Harga Jual", "Satuan", "Stok", "Return"
            }
        ));
        jTable2.setGridColor(new java.awt.Color(204, 204, 204));
        jTable2.setRequestFocusEnabled(false);
        jTable2.setRowHeight(40);
        jTable2.setSelectionBackground(new java.awt.Color(216, 225, 238));
        jScrollPane2.setViewportView(jTable2);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 800, 260));

        jPanel12.setOpaque(false);
        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 0));

        panelRound3.setBackground(new java.awt.Color(255, 255, 255));
        panelRound3.setPreferredSize(new java.awt.Dimension(485, 49));
        panelRound3.setRoundBottomLeft(10);
        panelRound3.setRoundBottomRight(10);
        panelRound3.setRoundTopLeft(10);
        panelRound3.setRoundTopRight(10);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconCari(1080).png"))); // NOI18N

        txt_cari.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_cari.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_cari.setBorder(null);
        txt_cari.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_cariFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_cariFocusLost(evt);
            }
        });

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel12.add(panelRound3);

        comboBoxSuggestion1.setPreferredSize(new java.awt.Dimension(150, 49));
        jPanel12.add(comboBoxSuggestion1);

        btn_cari.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Button cari.png"))); // NOI18N
        btn_cari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_cariMouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cariMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cariMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_cariMousePressed(evt);
            }
        });
        jPanel12.add(btn_cari);

        jPanel5.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 840, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 840, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_pengeluaranMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pengeluaranMouseEntered
        // TODO add your handling code here:
        Image iconPengeluaranHover = new ImageIcon(this.getClass().getResource("/img/pengeluaran_hover.png")).getImage();
        btn_pengeluaran.setIcon(new ImageIcon(iconPengeluaranHover));
    }//GEN-LAST:event_btn_pengeluaranMouseEntered

    private void btn_pengeluaranMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pengeluaranMouseExited
        // TODO add your handling code here:
        Image iconPengeluaranDefault = new ImageIcon(this.getClass().getResource("/img/pengeluaran.png")).getImage();
        btn_pengeluaran.setIcon(new ImageIcon(iconPengeluaranDefault));
    }//GEN-LAST:event_btn_pengeluaranMouseExited

    private void btn_pemasokMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pemasokMouseEntered
        // TODO add your handling code here:
        Image iconPemasokHover = new ImageIcon(this.getClass().getResource("/img/pemasok_hover.png")).getImage();
        btn_pemasok.setIcon(new ImageIcon(iconPemasokHover));
    }//GEN-LAST:event_btn_pemasokMouseEntered

    private void btn_pemasokMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pemasokMouseExited
        // TODO add your handling code here:
        Image iconPemasokDefault = new ImageIcon(this.getClass().getResource("/img/pemasok.png")).getImage();
        btn_pemasok.setIcon(new ImageIcon(iconPemasokDefault));
    }//GEN-LAST:event_btn_pemasokMouseExited

    private void btn_laporanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_laporanMouseEntered
        // TODO add your handling code here:
        Image iconLaporanHover = new ImageIcon(this.getClass().getResource("/img/laporan_hover.png")).getImage();
        btn_laporan.setIcon(new ImageIcon(iconLaporanHover));
    }//GEN-LAST:event_btn_laporanMouseEntered

    private void btn_laporanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_laporanMouseExited
        // TODO add your handling code here:
        Image iconLaporanDefault = new ImageIcon(this.getClass().getResource("/img/laporan.png")).getImage();
        btn_laporan.setIcon(new ImageIcon(iconLaporanDefault));
    }//GEN-LAST:event_btn_laporanMouseExited

    private void btn_karyawanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_karyawanMouseEntered
        // TODO add your handling code here:
        Image iconKaryawanHover = new ImageIcon(this.getClass().getResource("/img/karyawan_hover.png")).getImage();
        btn_karyawan.setIcon(new ImageIcon(iconKaryawanHover));
    }//GEN-LAST:event_btn_karyawanMouseEntered

    private void btn_karyawanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_karyawanMouseExited
        // TODO add your handling code here:
        Image iconKaryawanDefault = new ImageIcon(this.getClass().getResource("/img/karyawan.png")).getImage();
        btn_karyawan.setIcon(new ImageIcon(iconKaryawanDefault));
    }//GEN-LAST:event_btn_karyawanMouseExited

    private void btn_pengaturanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pengaturanMouseEntered
        // TODO add your handling code here:
        Image iconPengaturanHover = new ImageIcon(this.getClass().getResource("/img/pengaturan_hover.png")).getImage();
        btn_pengaturan.setIcon(new ImageIcon(iconPengaturanHover));
    }//GEN-LAST:event_btn_pengaturanMouseEntered

    private void btn_pengaturanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pengaturanMouseExited
        // TODO add your handling code here:
        Image iconPengaturanDefault = new ImageIcon(this.getClass().getResource("/img/pengaturan.png")).getImage();
        btn_pengaturan.setIcon(new ImageIcon(iconPengaturanDefault));
    }//GEN-LAST:event_btn_pengaturanMouseExited

    private void btn_pengeluaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pengeluaranMouseClicked
        // TODO add your handling code here:
        Tampilan_Pengeluaran pengeluaran = new Tampilan_Pengeluaran();
        pengeluaran.show();

        dispose();
    }//GEN-LAST:event_btn_pengeluaranMouseClicked

    private void btn_pemasokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pemasokMouseClicked
        // TODO add your handling code here:
        Tampilan_Pemasok pemasok = new Tampilan_Pemasok();
        pemasok.show();

        dispose();
    }//GEN-LAST:event_btn_pemasokMouseClicked

    private void btn_karyawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_karyawanMouseClicked
        // TODO add your handling code here:
        Tampilan_Karyawan karyawan = new Tampilan_Karyawan();
        karyawan.show();
        
        dispose();
    }//GEN-LAST:event_btn_karyawanMouseClicked

    private void btn_pengaturanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pengaturanMouseClicked
        // TODO add your handling code here:
        Tampilan_Pengaturan pengaturan = new Tampilan_Pengaturan();
        pengaturan.show();
        
        dispose();
    }//GEN-LAST:event_btn_pengaturanMouseClicked

    private void btn_barangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_barangMouseEntered
        // TODO add your handling code here:
        Image iconBarangHover = new ImageIcon(this.getClass().getResource("/img/barang_hover.png")).getImage();
        btn_barang.setIcon(new ImageIcon(iconBarangHover));
    }//GEN-LAST:event_btn_barangMouseEntered

    private void btn_barangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_barangMouseExited
        // TODO add your handling code here:
        Image iconBarangDefault = new ImageIcon(this.getClass().getResource("/img/barang.png")).getImage();
        btn_barang.setIcon(new ImageIcon(iconBarangDefault));
    }//GEN-LAST:event_btn_barangMouseExited

    private void btn_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_barangMouseClicked
        // TODO add your handling code here:
        Tampilan_Barang barang = new Tampilan_Barang();
        barang.show();
        
        dispose();
    }//GEN-LAST:event_btn_barangMouseClicked

    private void btn_riwayatJualMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatJualMouseEntered
        // TODO add your handling code here:
        Image iconJualHover = new ImageIcon(this.getClass().getResource("/img/txt Transaksi Jual hover.png")).getImage();
        btn_riwayatJual.setIcon(new ImageIcon(iconJualHover));
    }//GEN-LAST:event_btn_riwayatJualMouseEntered

    private void btn_riwayatJualMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatJualMouseExited
        // TODO add your handling code here:
        Image iconJualDefault = new ImageIcon(this.getClass().getResource("/img/txt Transaksi Jual.png")).getImage();
        btn_riwayatJual.setIcon(new ImageIcon(iconJualDefault));
    }//GEN-LAST:event_btn_riwayatJualMouseExited

    private void btn_riwayatJualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatJualMouseClicked
        // TODO add your handling code here:
        Tampilan_TransaksiJual transaksiJual = new Tampilan_TransaksiJual();
        transaksiJual.show();
        
        dispose();
    }//GEN-LAST:event_btn_riwayatJualMouseClicked

    private void txt_cariFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cariFocusGained
        // TODO add your handling code here:
        if (txt_cari.getText().equals("Cari Berdasarkan Nama Barang")) {
            txt_cari.setText("");
            txt_cari.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txt_cariFocusGained

    private void txt_cariFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cariFocusLost
        // TODO add your handling code here:
        if (txt_cari.getText().equals("")) {
            txt_cari.setText("Cari Berdasarkan Nama Barang");
            txt_cari.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txt_cariFocusLost

    private void btn_cariMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cariMouseReleased
        // TODO add your handling code here:
        Image iconCarihHover = new ImageIcon(this.getClass().getResource("/img/Button cari hover.png")).getImage();
        btn_cari.setIcon(new ImageIcon(iconCarihHover));
    }//GEN-LAST:event_btn_cariMouseReleased

    private void btn_cariMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cariMouseEntered
        // TODO add your handling code here:
        Image iconCarihHover = new ImageIcon(this.getClass().getResource("/img/Button cari hover.png")).getImage();
        btn_cari.setIcon(new ImageIcon(iconCarihHover));
    }//GEN-LAST:event_btn_cariMouseEntered

    private void btn_cariMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cariMouseExited
        // TODO add your handling code here:
        Image iconCarihDefault = new ImageIcon(this.getClass().getResource("/img/Button cari.png")).getImage();
        btn_cari.setIcon(new ImageIcon(iconCarihDefault));
    }//GEN-LAST:event_btn_cariMouseExited

    private void btn_cariMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cariMousePressed
        // TODO add your handling code here:
        Image iconCarihPress = new ImageIcon(this.getClass().getResource("/img/Button cari press.png")).getImage();
        btn_cari.setIcon(new ImageIcon(iconCarihPress));
    }//GEN-LAST:event_btn_cariMousePressed

    private void btn_tambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMouseEntered
        // TODO add your handling code here:
        Image iconTambahHover = new ImageIcon(this.getClass().getResource("/img/Button tambah beli hover.png")).getImage();
        btn_tambah.setIcon(new ImageIcon(iconTambahHover));
    }//GEN-LAST:event_btn_tambahMouseEntered

    private void btn_tambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMouseExited
        // TODO add your handling code here:
        Image iconTambahDefault = new ImageIcon(this.getClass().getResource("/img/Button tambah beli.png")).getImage();
        btn_tambah.setIcon(new ImageIcon(iconTambahDefault));
    }//GEN-LAST:event_btn_tambahMouseExited

    private void btn_tambahMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMousePressed
        // TODO add your handling code here:
        Image iconTambahPressed = new ImageIcon(this.getClass().getResource("/img/Button tambah beli press.png")).getImage();
        btn_tambah.setIcon(new ImageIcon(iconTambahPressed));
    }//GEN-LAST:event_btn_tambahMousePressed

    private void btn_tambahMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMouseReleased
        // TODO add your handling code here:
        Image iconTambahHover = new ImageIcon(this.getClass().getResource("/img/Button tambah beli hover.png")).getImage();
        btn_tambah.setIcon(new ImageIcon(iconTambahHover));
    }//GEN-LAST:event_btn_tambahMouseReleased

    private void btn_riwayatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatMouseEntered
        // TODO add your handling code here:
        Image iconRiwayatHover = new ImageIcon(this.getClass().getResource("/img/riwayat_hover.png")).getImage();
        btn_riwayat.setIcon(new ImageIcon(iconRiwayatHover));
    }//GEN-LAST:event_btn_riwayatMouseEntered

    private void btn_riwayatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatMouseExited
        // TODO add your handling code here:
        Image iconRiwayatDefault = new ImageIcon(this.getClass().getResource("/img/riwayat.png")).getImage();
        btn_riwayat.setIcon(new ImageIcon(iconRiwayatDefault));
    }//GEN-LAST:event_btn_riwayatMouseExited

    private void btn_riwayatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatMouseClicked
        // TODO add your handling code here:
        Tampilan_RiwayatBeli riwayatBeli = new Tampilan_RiwayatBeli();
        riwayatBeli.show();
        
        dispose();
    }//GEN-LAST:event_btn_riwayatMouseClicked

    private void btn_laporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_laporanMouseClicked
        // TODO add your handling code here:
        Tampilan_Laporan laporan = new Tampilan_Laporan();
        laporan.show();
        
        dispose();
    }//GEN-LAST:event_btn_laporanMouseClicked

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
            java.util.logging.Logger.getLogger(Tampilan_TransaksiBeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tampilan_TransaksiBeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tampilan_TransaksiBeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tampilan_TransaksiBeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tampilan_TransaksiBeli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_barang;
    private javax.swing.JLabel btn_cari;
    private javax.swing.JLabel btn_karyawan;
    private javax.swing.JLabel btn_laporan;
    private javax.swing.JLabel btn_pemasok;
    private javax.swing.JLabel btn_pengaturan;
    private javax.swing.JLabel btn_pengeluaran;
    private javax.swing.JLabel btn_riwayat;
    private javax.swing.JLabel btn_riwayatJual;
    private javax.swing.JLabel btn_tambah;
    private javax.swing.JLabel btn_transaksi;
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion1;
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private atsk.panelRound panelRound1;
    private atsk.panelRound panelRound2;
    private atsk.panelRound panelRound3;
    private javax.swing.JTextField txt_cari;
    // End of variables declaration//GEN-END:variables
}
