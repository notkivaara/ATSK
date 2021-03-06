/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atsk;

import atsk.laporanBulanan.Tampilan_Laporan;
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.TableUI;
import javax.swing.table.JTableHeader;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class Tampilan_RiwayatBeli extends javax.swing.JFrame {

    public Tampilan_RiwayatBeli() {
        initComponents();
        table();
        tampildata();
        table_RiwayatBeli.fixTable(jScrollPane3);

    }
    private String kodeAkun = "";

    public void passData(String kode) {
        try {
            String sql = "Select kd_akun, nama from akun where kd_akun = '" + kode + "'";
            Connection conn = (Connection) Config.configDB();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            Tampilan_Pengaturan tp = new Tampilan_Pengaturan();
            if (rs.next()) {
                String akun = rs.getString("kd_akun");
                if (akun.equals(kode)) {
                    kodeAkun = kode;
                }
            } else {
                JOptionPane.showMessageDialog(null, null);
            }
        } catch (Exception e) {
        }
    }

    private void table() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Kode Beli");
        tbl.addColumn("Kode Pemasok");
        tbl.addColumn("Tanggal");
        tbl.addColumn("Harga Total");
        tbl.addColumn("Tunai");
        tbl.addColumn("Kembali");

        try {
            Statement st = (Statement) Config.configDB().createStatement();
            ResultSet rs = st.executeQuery("SELECT * from transaksi_beli");

            while (rs.next()) {
                tbl.addRow(new Object[]{
                    rs.getString("kd_beli"),
                    rs.getString("kd_supplier"),
                    rs.getString("tgl"),
                    rs.getString("total_harga_beli"),
                    rs.getString("tunai_beli"),
                    rs.getString("kembali"),});
                table_RiwayatBeli.setModel(tbl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void tampildata() {

        try {
            Statement st = (Statement) Config.configDB().createStatement();
            ResultSet rs = st.executeQuery("Select kd_beli from transaksi_beli");
            rs.next();
            if (rs.last()) {
                int total = rs.getRow();
                rs.beforeFirst();
                txt_jumlahTransaksi.setText(Integer.toString(total));
            }
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        javax.swing.JTable tb_riwayatBeli = new javax.swing.JTable();
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
        panelShadow5 = new main.PanelShadow();
        jLabel4 = new javax.swing.JLabel();
        btn_riwayatJual = new javax.swing.JLabel();
        panelShadow2 = new main.PanelShadow();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_RiwayatBeli = new atsk.Table();
        panelShadow1 = new main.PanelShadow();
        tanggalDate1 = new com.toedter.calendar.JDateChooser();
        tanggalDate2 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        btn_cari = new javax.swing.JLabel();
        panelShadow3 = new main.PanelShadow();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_jumlahTransaksi = new javax.swing.JTextField();

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tb_riwayatBeli.setAutoCreateRowSorter(true);
        tb_riwayatBeli.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tb_riwayatBeli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Kode Beli", "Kode Pemasok", "Tanggal", "Harga Total", "Tunai", "Kembali"
            }
        ));
        tb_riwayatBeli.setGridColor(new java.awt.Color(204, 204, 204));
        tb_riwayatBeli.setRequestFocusEnabled(false);
        tb_riwayatBeli.setRowHeight(40);
        tb_riwayatBeli.setSelectionBackground(new java.awt.Color(216, 225, 238));
        jScrollPane2.setViewportView(tb_riwayatBeli);

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

        btn_transaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transaksi.png"))); // NOI18N
        btn_transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_transaksiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_transaksiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_transaksiMouseExited(evt);
            }
        });
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

        btn_riwayat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/riwayat_aktif.png"))); // NOI18N
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

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 0));

        panelShadow5.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow5.setPreferredSize(new java.awt.Dimension(800, 44));
        panelShadow5.setShadowColor(new java.awt.Color(209, 223, 245));
        panelShadow5.setShadowOpacity(0.5F);
        panelShadow5.setShadowSize(1);
        panelShadow5.setShadowType(main.ShadowType.BOT);
        panelShadow5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 0));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/txt Riwayat Beli aktif.png"))); // NOI18N
        panelShadow5.add(jLabel4);

        btn_riwayatJual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/txt Riwayat Jual.png"))); // NOI18N
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
        panelShadow5.add(btn_riwayatJual);

        jPanel6.add(panelShadow5);

        panelShadow2.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow2.setShadowColor(new java.awt.Color(209, 223, 245));
        panelShadow2.setShadowOpacity(1.0F);
        panelShadow2.setShadowSize(5);
        panelShadow2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));

        jScrollPane3.setBorder(null);
        jScrollPane3.setPreferredSize(new java.awt.Dimension(770, 530));

        table_RiwayatBeli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Beli", "Kode Pemasok", "Tanggal", "Harga Total", "Tunai", "Kembali"
            }
        ));
        table_RiwayatBeli.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jScrollPane3.setViewportView(table_RiwayatBeli);

        panelShadow2.add(jScrollPane3);

        panelShadow1.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow1.setMinimumSize(new java.awt.Dimension(356, 54));
        panelShadow1.setPreferredSize(new java.awt.Dimension(800, 54));
        panelShadow1.setShadowColor(new java.awt.Color(209, 223, 245));
        panelShadow1.setShadowOpacity(1.0F);
        panelShadow1.setShadowSize(5);

        tanggalDate1.setBackground(new java.awt.Color(255, 255, 255));
        tanggalDate1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tanggalDate1.setPreferredSize(new java.awt.Dimension(260, 42));

        tanggalDate2.setBackground(new java.awt.Color(255, 255, 255));
        tanggalDate2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tanggalDate2.setPreferredSize(new java.awt.Dimension(260, 42));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("-");

        btn_cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconCari(1080).png"))); // NOI18N
        btn_cari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cariMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tanggalDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tanggalDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btn_cari)
                .addGap(15, 15, 15))
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tanggalDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_cari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tanggalDate2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelShadow3.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow3.setMinimumSize(new java.awt.Dimension(356, 54));
        panelShadow3.setPreferredSize(new java.awt.Dimension(800, 54));
        panelShadow3.setShadowColor(new java.awt.Color(209, 223, 245));
        panelShadow3.setShadowOpacity(1.0F);
        panelShadow3.setShadowSize(5);
        panelShadow3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 6));

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 0));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel3.setText("Jumlah Transaksi :");
        jPanel4.add(jLabel3);

        txt_jumlahTransaksi.setEditable(false);
        txt_jumlahTransaksi.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txt_jumlahTransaksi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_jumlahTransaksi.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_jumlahTransaksi.setMinimumSize(new java.awt.Dimension(96, 42));
        txt_jumlahTransaksi.setPreferredSize(new java.awt.Dimension(90, 42));
        jPanel4.add(txt_jumlahTransaksi);

        panelShadow3.add(jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelShadow3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(panelShadow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 840, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_transaksiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_transaksiMouseEntered
        // TODO add your handling code here:
        Image iconTransaksiHover = new ImageIcon(this.getClass().getResource("/img/transaksi_hover.png")).getImage();
        btn_transaksi.setIcon(new ImageIcon(iconTransaksiHover));
    }//GEN-LAST:event_btn_transaksiMouseEntered

    private void btn_transaksiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_transaksiMouseExited
        // TODO add your handling code here:
        Image iconTransaksiDefault = new ImageIcon(this.getClass().getResource("/img/transaksi.png")).getImage();
        btn_transaksi.setIcon(new ImageIcon(iconTransaksiDefault));
    }//GEN-LAST:event_btn_transaksiMouseExited

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
        try {
            String sql = "SELECT * FROM `akun` WHERE kd_akun = '" + kodeAkun + "';";
            Connection conn = (Connection) Config.configDB();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            if (rs.next()) {

                String kd_akun = rs.getString("kd_akun");
                String role = rs.getString("role");
                if (role.equals("Owner")) {
                    pengeluaran.passData(kd_akun);
                    pengeluaran.show();
                    this.setVisible(false);

                } else if (role.equals("Kasir")) {
                    pengeluaran.passData(kd_akun);
                    pengeluaran.show();;
                    this.setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid1");

                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid2");

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        dispose();
    }//GEN-LAST:event_btn_pengeluaranMouseClicked

    private void btn_pemasokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pemasokMouseClicked
        // TODO add your handling code here:
        Tampilan_Pemasok pemasok = new Tampilan_Pemasok();
        try {
            String sql = "SELECT * FROM `akun` WHERE kd_akun = '" + kodeAkun + "';";
            Connection conn = (Connection) Config.configDB();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            if (rs.next()) {

                String kd_akun = rs.getString("kd_akun");
                String role = rs.getString("role");
                if (role.equals("Owner")) {
                    pemasok.passData(kd_akun);
                    pemasok.show();
                    this.setVisible(false);

                } else if (role.equals("Kasir")) {
                    pemasok.passData(kd_akun);
                    pemasok.show();;
                    this.setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid1");

                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid2");

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        dispose();
    }//GEN-LAST:event_btn_pemasokMouseClicked

    private void btn_karyawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_karyawanMouseClicked
        // TODO add your handling code here:
        Tampilan_Karyawan karyawan = new Tampilan_Karyawan();
        try {
            String sql = "SELECT * FROM `akun` WHERE kd_akun = '" + kodeAkun + "';";
            Connection conn = (Connection) Config.configDB();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            if (rs.next()) {

                String kd_akun = rs.getString("kd_akun");
                String role = rs.getString("role");
                if (role.equals("Owner")) {
                    karyawan.passData(kd_akun);
                    karyawan.show();
                    this.setVisible(false);

                } else if (role.equals("Kasir")) {
                    karyawan.passData(kd_akun);
                    karyawan.show();;
                    this.setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid1");

                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid2");

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        };

        dispose();
    }//GEN-LAST:event_btn_karyawanMouseClicked

    private void btn_pengaturanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pengaturanMouseClicked
        // TODO add your handling code here:
        try {
            String sql = "SELECT * FROM `akun` WHERE kd_akun = '" + kodeAkun + "';";
            Connection conn = (Connection) Config.configDB();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            if (rs.next()) {
                Tampilan_Pengaturan tp = new Tampilan_Pengaturan();
                String kd_akun = rs.getString("kd_akun");
                String nama = rs.getString("nama");
                String role = rs.getString("role");
                if (role.equals("Owner")) {
                    tp.kodeakunKar.setText(kd_akun);
                    tp.namaKar.setText(nama);
                    tp.passData(kd_akun);
                    tp.setVisible(true);
                    this.setVisible(false);
                    System.out.println(kodeAkun);

                } else if (role.equals("Kasir")) {
                    tp.kodeakunKar.setText(kd_akun);
                    tp.namaKar.setText(nama);
                    tp.passData(kd_akun);
                    tp.setVisible(true);
                    this.setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid1");

                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid2");

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

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
        try {
            String sql = "SELECT * FROM `akun` WHERE kd_akun = '" + kodeAkun + "';";
            Connection conn = (Connection) Config.configDB();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            if (rs.next()) {

                String kd_akun = rs.getString("kd_akun");
                String role = rs.getString("role");
                if (role.equals("Owner")) {
                    barang.passData(kd_akun);
                    barang.show();
                    this.setVisible(false);

                } else if (role.equals("Kasir")) {
                    barang.passData(kd_akun);
                    barang.show();;
                    this.setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid1");

                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid2");

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        dispose();
    }//GEN-LAST:event_btn_barangMouseClicked

    private void btn_riwayatJualMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatJualMouseEntered
        // TODO add your handling code here:
        Image iconJualHover = new ImageIcon(this.getClass().getResource("/img/txt Riwayat Jual hover.png")).getImage();
        btn_riwayatJual.setIcon(new ImageIcon(iconJualHover));
    }//GEN-LAST:event_btn_riwayatJualMouseEntered

    private void btn_riwayatJualMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatJualMouseExited
        // TODO add your handling code here:
        Image iconJualDefault = new ImageIcon(this.getClass().getResource("/img/txt Riwayat Jual.png")).getImage();
        btn_riwayatJual.setIcon(new ImageIcon(iconJualDefault));
    }//GEN-LAST:event_btn_riwayatJualMouseExited

    private void btn_riwayatJualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatJualMouseClicked
        // TODO add your handling code here:
        Tampilan_RiwayatJual riwayatJual = new Tampilan_RiwayatJual();
        try {
            String sql = "SELECT * FROM `akun` WHERE kd_akun = '" + kodeAkun + "';";
            Connection conn = (Connection) Config.configDB();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            if (rs.next()) {

                String kd_akun = rs.getString("kd_akun");
                String role = rs.getString("role");
                if (role.equals("Owner")) {
                    riwayatJual.passData(kd_akun);
                    riwayatJual.show();
                    this.setVisible(false);

                } else if (role.equals("Kasir")) {
                    riwayatJual.passData(kd_akun);
                    riwayatJual.show();;
                    this.setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid1");

                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid2");

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        dispose();
    }//GEN-LAST:event_btn_riwayatJualMouseClicked

    private void btn_laporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_laporanMouseClicked
        // TODO add your handling code here:
        Tampilan_Laporan laporan = new Tampilan_Laporan();
        try {
            String sql = "SELECT * FROM `akun` WHERE kd_akun = '" + kodeAkun + "';";
            Connection conn = (Connection) Config.configDB();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            if (rs.next()) {

                String kd_akun = rs.getString("kd_akun");
                String role = rs.getString("role");
                if (role.equals("Owner")) {
                    laporan.passData(kd_akun);
                    laporan.show();
                    this.setVisible(false);

                } else if (role.equals("Kasir")) {
                    laporan.passData(kd_akun);
                    laporan.show();;
                    this.setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid1");

                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid2");

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        dispose();
    }//GEN-LAST:event_btn_laporanMouseClicked

    private void btn_transaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_transaksiMouseClicked
        // TODO add your handling code here:
        Tampilan_TransaksiBeli transaksiBeli = new Tampilan_TransaksiBeli();
        try {
            String sql = "SELECT * FROM `akun` WHERE kd_akun = '" + kodeAkun + "';";
            Connection conn = (Connection) Config.configDB();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            if (rs.next()) {

                String kd_akun = rs.getString("kd_akun");
                String role = rs.getString("role");
                if (role.equals("Owner")) {
                    transaksiBeli.passData(kd_akun);
                    transaksiBeli.show();
                    this.setVisible(false);

                } else if (role.equals("Kasir")) {
                    transaksiBeli.passData(kd_akun);
                    transaksiBeli.show();;
                    this.setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid1");

                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid2");

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        dispose();
    }//GEN-LAST:event_btn_transaksiMouseClicked

    private void btn_cariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cariMouseClicked
        // TODO add your handling code here:
        Date dateFromDateChooser1 = tanggalDate1.getDate();
        String tanggal1 = String.format("%1$tY-%1$tm-%1$td", dateFromDateChooser1);
        Date dateFromDateChooser2 = tanggalDate2.getDate();
        String tanggal2 = String.format("%1$tY-%1$tm-%1$td", dateFromDateChooser2);


        if (tanggalDate2.getDate().getTime() > tanggalDate1.getDate().getTime()) {
            try {

                String sql;
                Connection c;
                PreparedStatement pst;
                ResultSet rs;
                sql = "Select kd_beli from transaksi_beli where tgl between DATE_FORMAT('" + tanggal1 + "', '%Y-%m-%d 00:00:00') and DATE_FORMAT('" + tanggal2 + "', '%Y-%m-%d 23:59:59')";
                c = (Connection) Config.configDB();
                pst = c.prepareStatement(sql);
                rs = pst.executeQuery();

                if (rs.next()) {
                    if (rs.last()) {
                        int total = rs.getRow();
                        rs.beforeFirst();
                        txt_jumlahTransaksi.setText(Integer.toString(total));
                    }
                }

                sql = "Select * from transaksi_beli where tgl between DATE_FORMAT('" + tanggal1 + "', '%Y-%m-%d 00:00:00') and DATE_FORMAT('" + tanggal2 + "', '%Y-%m-%d 23:59:59')";
                pst = c.prepareStatement(sql);
                rs = pst.executeQuery();

                DefaultTableModel tbl = new DefaultTableModel();
                tbl.addColumn("Kode Beli");
                tbl.addColumn("Kode Pemasok");
                tbl.addColumn("Tanggal");
                tbl.addColumn("Harga Total");
                tbl.addColumn("Tunai");
                tbl.addColumn("Kembali");

                while (rs.next()) {
                    tbl.addRow(new Object[]{
                    rs.getString("kd_beli"),
                    rs.getString("kd_supplier"),
                    rs.getString("tgl"),
                    rs.getString("total_harga_beli"),
                    rs.getString("tunai_beli"),
                    rs.getString("kembali"),});
                table_RiwayatBeli.setModel(tbl);

                }

            } catch (Exception e) {

                JOptionPane.showMessageDialog(this, e.getMessage());

            }
        }
    }//GEN-LAST:event_btn_cariMouseClicked

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
            java.util.logging.Logger.getLogger(Tampilan_RiwayatBeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tampilan_RiwayatBeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tampilan_RiwayatBeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tampilan_RiwayatBeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Tampilan_RiwayatBeli().setVisible(true);
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
    private javax.swing.JLabel btn_transaksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private main.PanelShadow panelShadow1;
    private main.PanelShadow panelShadow2;
    private main.PanelShadow panelShadow3;
    private main.PanelShadow panelShadow5;
    public atsk.Table table_RiwayatBeli;
    private com.toedter.calendar.JDateChooser tanggalDate1;
    private com.toedter.calendar.JDateChooser tanggalDate2;
    private javax.swing.JTextField txt_jumlahTransaksi;
    // End of variables declaration//GEN-END:variables
}
