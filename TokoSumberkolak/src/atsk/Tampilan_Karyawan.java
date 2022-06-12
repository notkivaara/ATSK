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
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.TableUI;
import javax.swing.table.JTableHeader;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import textfield.TextPrompt;

/**
 *
 * @author ACER
 */
public class Tampilan_Karyawan extends javax.swing.JFrame {

   static DefaultTableModel model;
    static String selectedakunid;
    static String namakaryawan;
    
     public Tampilan_Karyawan() {
        initComponents();
        table();
        TextPrompt cari = new TextPrompt("Cari Berdasarkan Nama Karyawan", txt_cari);
        tb_karyawan.fixTable(jScrollPane2);
        cancel_search.setVisible(false);
    }
    
    private String kodeAkun="";
    public void passData(String kode){
        try {
            String sql = "Select kd_akun, nama from akun where kd_akun = '"+kode+"'";
            Connection conn = (Connection) Config.configDB();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            Tampilan_Pengaturan tp = new Tampilan_Pengaturan();
                if (rs.next()) {
                String akun = rs.getString("kd_akun");
                if (akun.equals(kode)){
                   kodeAkun= kode;    
                }
            } else {
                JOptionPane.showMessageDialog(null, null);
            }
        } catch (Exception e) {
        }
    }
     
    public void table() {
    DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Kode Akun");
        tbl.addColumn("Nama Karyawan");
        tbl.addColumn("Username");
        tbl.addColumn("Jabatan");
        try {
            Statement st = (Statement) Config.configDB().createStatement();
            ResultSet rs = st.executeQuery("Select kd_akun,nama,username,role from akun");
            
            while(rs.next()){
                tbl.addRow(new Object[]{
                    rs.getString("kd_akun"),
                    rs.getString("nama"),
                    rs.getString("username"),
                    rs.getString("role")
                });
                tb_karyawan.setModel(tbl);
                
                
            }
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
        }
        }
    
    public void search() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Kode Akun");
        tbl.addColumn("Nama Karyawan");
        tbl.addColumn("Username");
        tbl.addColumn("Jabatan");
        
         String cari = txt_cari.getText();
         
         try {
             String sql = "SELECT kd_akun,nama,username,role FROM `akun` WHERE nama LIKE '%" + cari + "%'";
                Connection c = (Connection) Config.configDB();
                Statement st = c.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    tbl.addRow(new Object[]{
                        rs.getString("kd_akun"),
                        rs.getString("nama"),
                        rs.getString("username"),
                        rs.getString("role"),});
                        tb_karyawan.setModel(tbl);
                    
                    }
                
         } catch (Exception e){
             
         }
             
    }
    

    
    
    
    
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
        jPanel7 = new javax.swing.JPanel();
        btn_tambah = new javax.swing.JLabel();
        btn_ubah = new javax.swing.JLabel();
        btn_hapus = new javax.swing.JLabel();
        panelShadow2 = new main.PanelShadow();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_karyawan = new atsk.Table();
        jPanel8 = new javax.swing.JPanel();
        panelShadow1 = new main.PanelShadow();
        jLabel4 = new javax.swing.JLabel();
        txt_cari = new javax.swing.JTextField();
        cancel_search = new javax.swing.JLabel();
        btn_refresh = new javax.swing.JLabel();

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

        btn_karyawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/karyawan_aktif.png"))); // NOI18N
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

        jPanel7.setOpaque(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(800, 42));
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 33, 0));

        btn_tambah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Button Tambah.png"))); // NOI18N
        btn_tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tambahMouseClicked(evt);
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
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_tambahMouseReleased(evt);
            }
        });
        jPanel7.add(btn_tambah);

        btn_ubah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_ubah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Button Ubah.png"))); // NOI18N
        btn_ubah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ubahMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ubahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ubahMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_ubahMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_ubahMouseReleased(evt);
            }
        });
        jPanel7.add(btn_ubah);

        btn_hapus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Button hapus.png"))); // NOI18N
        btn_hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_hapusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_hapusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_hapusMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_hapusMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_hapusMouseReleased(evt);
            }
        });
        jPanel7.add(btn_hapus);

        panelShadow2.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow2.setShadowColor(new java.awt.Color(209, 223, 245));
        panelShadow2.setShadowOpacity(1.0F);
        panelShadow2.setShadowSize(5);
        panelShadow2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));

        jScrollPane2.setBorder(null);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(770, 530));

        tb_karyawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Akun", "Nama Karyawan", "Username", "Jabatan"
            }
        ));
        tb_karyawan.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jScrollPane2.setViewportView(tb_karyawan);

        panelShadow2.add(jScrollPane2);

        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(831, 60));
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 0));

        panelShadow1.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow1.setPreferredSize(new java.awt.Dimension(725, 52));
        panelShadow1.setShadowColor(new java.awt.Color(209, 223, 245));
        panelShadow1.setShadowOpacity(0.5F);
        panelShadow1.setShadowSize(1);
        panelShadow1.setShadowType(main.ShadowType.BOT);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconCari(1080).png"))); // NOI18N

        txt_cari.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_cari.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_cari.setBorder(null);
        txt_cari.setPreferredSize(new java.awt.Dimension(370, 49));
        txt_cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cariKeyReleased(evt);
            }
        });

        cancel_search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancel_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel_search.png"))); // NOI18N
        cancel_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancel_searchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel_searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel_searchMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addComponent(txt_cari, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(cancel_search, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
            .addComponent(cancel_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel8.add(panelShadow1);

        btn_refresh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Button refresh.png"))); // NOI18N
        btn_refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_refreshMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_refreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_refreshMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_refreshMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_refreshMouseReleased(evt);
            }
        });
        jPanel8.add(btn_refresh);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panelShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(panelShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 840, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void btn_tambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMouseEntered
        // TODO add your handling code here:
        Image iconTambahHover = new ImageIcon(this.getClass().getResource("/img/Button Tambah hover.png")).getImage();
        btn_tambah.setIcon(new ImageIcon(iconTambahHover));
    }//GEN-LAST:event_btn_tambahMouseEntered

    private void btn_tambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMouseExited
        // TODO add your handling code here:
        Image iconTambahDefault = new ImageIcon(this.getClass().getResource("/img/Button Tambah.png")).getImage();
        btn_tambah.setIcon(new ImageIcon(iconTambahDefault));
    }//GEN-LAST:event_btn_tambahMouseExited

    private void btn_tambahMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMousePressed
        // TODO add your handling code here:
        Image iconTambahPress = new ImageIcon(this.getClass().getResource("/img/Button Tambah press.png")).getImage();
        btn_tambah.setIcon(new ImageIcon(iconTambahPress));
    }//GEN-LAST:event_btn_tambahMousePressed

    private void btn_tambahMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMouseReleased
        // TODO add your handling code here:
        Image iconTambahHover = new ImageIcon(this.getClass().getResource("/img/Button Tambah hover.png")).getImage();
        btn_tambah.setIcon(new ImageIcon(iconTambahHover));
    }//GEN-LAST:event_btn_tambahMouseReleased

    private void btn_hapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapusMouseEntered
        // TODO add your handling code here:
        Image iconHapusHover = new ImageIcon(this.getClass().getResource("/img/Button hapus Hover.png")).getImage();
        btn_hapus.setIcon(new ImageIcon(iconHapusHover));
    }//GEN-LAST:event_btn_hapusMouseEntered

    private void btn_hapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapusMouseExited
        // TODO add your handling code here:
        Image iconHapusDefault = new ImageIcon(this.getClass().getResource("/img/Button hapus.png")).getImage();
        btn_hapus.setIcon(new ImageIcon(iconHapusDefault));
    }//GEN-LAST:event_btn_hapusMouseExited

    private void btn_hapusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapusMousePressed
        // TODO add your handling code here:
        Image iconHapusPress = new ImageIcon(this.getClass().getResource("/img/Button hapus Press.png")).getImage();
        btn_hapus.setIcon(new ImageIcon(iconHapusPress));
    }//GEN-LAST:event_btn_hapusMousePressed

    private void btn_hapusMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapusMouseReleased
        // TODO add your handling code here:
        Image iconHapusHover = new ImageIcon(this.getClass().getResource("/img/Button hapus Hover.png")).getImage();
        btn_hapus.setIcon(new ImageIcon(iconHapusHover));
    }//GEN-LAST:event_btn_hapusMouseReleased

    private void btn_ubahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ubahMouseEntered
        // TODO add your handling code here:
        Image iconUbahHover = new ImageIcon(this.getClass().getResource("/img/Button Ubah Hover.png")).getImage();
        btn_ubah.setIcon(new ImageIcon(iconUbahHover));
    }//GEN-LAST:event_btn_ubahMouseEntered

    private void btn_ubahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ubahMouseExited
        // TODO add your handling code here:
        Image iconUbahDefault = new ImageIcon(this.getClass().getResource("/img/Button Ubah.png")).getImage();
        btn_ubah.setIcon(new ImageIcon(iconUbahDefault));
    }//GEN-LAST:event_btn_ubahMouseExited

    private void btn_ubahMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ubahMousePressed
        // TODO add your handling code here:
        Image iconUbahPress = new ImageIcon(this.getClass().getResource("/img/Button Ubah Press.png")).getImage();
        btn_ubah.setIcon(new ImageIcon(iconUbahPress));
    }//GEN-LAST:event_btn_ubahMousePressed

    private void btn_ubahMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ubahMouseReleased
        // TODO add your handling code here:
        Image iconUbahHover = new ImageIcon(this.getClass().getResource("/img/Button Ubah Hover.png")).getImage();
        btn_ubah.setIcon(new ImageIcon(iconUbahHover));
    }//GEN-LAST:event_btn_ubahMouseReleased

    private void btn_transaksiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_transaksiMouseExited
        // TODO add your handling code here:
        Image iconTransaksiDefault = new ImageIcon(this.getClass().getResource("/img/transaksi.png")).getImage();
        btn_transaksi.setIcon(new ImageIcon(iconTransaksiDefault));
    }//GEN-LAST:event_btn_transaksiMouseExited

    private void btn_transaksiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_transaksiMouseEntered
        // TODO add your handling code here:
        Image iconTransaksiHover = new ImageIcon(this.getClass().getResource("/img/transaksi_hover.png")).getImage();
        btn_transaksi.setIcon(new ImageIcon(iconTransaksiHover));
    }//GEN-LAST:event_btn_transaksiMouseEntered

    private void btn_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_barangMouseClicked
        // TODO add your handling code here:
        Tampilan_Barang barang = new Tampilan_Barang();

         try {
            String sql = "SELECT * FROM `akun` WHERE kd_akun = '"+ kodeAkun +"';";
            Connection conn = (Connection) Config.configDB();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            if (rs.next()) {
                
                String kd_akun = rs.getString("kd_akun");
                String nama = rs.getString("nama");
                String role = rs.getString("role");
                if (role.equals("Owner")){
                    barang.passData(kd_akun);
                    barang.show();
                    this.setVisible(false);


                }
                else if(role.equals("Kasir")){
                    barang.passData(kd_akun);
                    barang.show();;
                    this.setVisible(false);
            
                }
                else {
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

    private void btn_pemasokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pemasokMouseClicked
        // TODO add your handling code here:
        Tampilan_Pemasok pemasok = new Tampilan_Pemasok();

         try {
            String sql = "SELECT * FROM `akun` WHERE kd_akun = '"+ kodeAkun +"';";
            Connection conn = (Connection) Config.configDB();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            if (rs.next()) {
                
                String kd_akun = rs.getString("kd_akun");
                String nama = rs.getString("nama");
                String role = rs.getString("role");
                if (role.equals("Owner")){
                    pemasok.passData(kd_akun);
                    pemasok.show();
                    this.setVisible(false);


                }
                else if(role.equals("Kasir")){
                    pemasok.passData(kd_akun);
                    pemasok.show();;
                    this.setVisible(false);
            
                }
                else {
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

    private void btn_tambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMouseClicked
        // TODO add your handling code here:
        Popup_Tambah_Karyawan_Shadow tambahKaryawan = new Popup_Tambah_Karyawan_Shadow();
        tambahKaryawan.setVisible(true);
        tambahKaryawan.pack();
        tambahKaryawan.setLocationRelativeTo(null);
        tambahKaryawan.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btn_tambahMouseClicked

    private void btn_ubahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ubahMouseClicked
        int row = tb_karyawan.getSelectedRow();
        
        String Kodeakun = tb_karyawan.getModel().getValueAt(row, 0).toString() ;
        String namaKaryawan = tb_karyawan.getModel().getValueAt(row, 1).toString() ;
        String username = tb_karyawan.getModel().getValueAt(row, 2).toString() ;
        String Jabatan = tb_karyawan.getModel().getValueAt(row, 3).toString() ;
        
        Popup_Ubah_Karyawan_Shadow ubahKaryawan = new Popup_Ubah_Karyawan_Shadow();
        ubahKaryawan.setKodeLama(Kodeakun);
        ubahKaryawan.kodeakun.setText(Kodeakun);
        ubahKaryawan.namakaryawan.setText(namaKaryawan);
        ubahKaryawan.username.setText(username);
        ubahKaryawan.jabatan.setText(Jabatan);
        
        
        ubahKaryawan.setVisible(true);
        ubahKaryawan.pack();
        ubahKaryawan.setLocationRelativeTo(null);
        ubahKaryawan.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btn_ubahMouseClicked

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

    private void btn_pengeluaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pengeluaranMouseClicked
        // TODO add your handling code here:
        Tampilan_Pengeluaran pengeluaran = new Tampilan_Pengeluaran();

         try {
            String sql = "SELECT * FROM `akun` WHERE kd_akun = '"+ kodeAkun +"';";
            Connection conn = (Connection) Config.configDB();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            if (rs.next()) {
                
                String kd_akun = rs.getString("kd_akun");
                String nama = rs.getString("nama");
                String role = rs.getString("role");
                if (role.equals("Owner")){
                    pengeluaran.passData(kd_akun);
                    pengeluaran.show();
                    this.setVisible(false);


                }
                else if(role.equals("Kasir")){
                    pengeluaran.passData(kd_akun);
                    pengeluaran.show();;
                    this.setVisible(false);
            
                }
                else {
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

    private void btn_pengaturanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pengaturanMouseClicked

     try {
            String sql = "SELECT * FROM `akun` WHERE kd_akun = '"+ kodeAkun +"';";
            Connection conn = (Connection) Config.configDB();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            if (rs.next()) {
                Tampilan_Pengaturan tp = new Tampilan_Pengaturan();
                String kd_akun = rs.getString("kd_akun");
                String nama = rs.getString("nama");
                String role = rs.getString("role");
                if (role.equals("Owner")){
                    tp.kodeakunKar.setText(kd_akun);
                    tp.namaKar.setText(nama);
                    tp.passData(kd_akun);
                    tp.setVisible(true);
                    this.setVisible(false);
                    System.out.println(kodeAkun);

                }
                else if(role.equals("Kasir")){
                    tp.kodeakunKar.setText(kd_akun);
                    tp.namaKar.setText(nama);
                    tp.passData(kd_akun);
                    tp.setVisible(true);
                    this.setVisible(false);
            
                }
                else {
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

    private void btn_riwayatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatMouseClicked
        // TODO add your handling code here:
        Tampilan_RiwayatBeli riwayatBeli = new Tampilan_RiwayatBeli();

         try {
            String sql = "SELECT * FROM `akun` WHERE kd_akun = '"+ kodeAkun +"';";
            Connection conn = (Connection) Config.configDB();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            if (rs.next()) {
                
                String kd_akun = rs.getString("kd_akun");
                String nama = rs.getString("nama");
                String role = rs.getString("role");
                if (role.equals("Owner")){
                    riwayatBeli.passData(kd_akun);
                    riwayatBeli.show();
                    this.setVisible(false);


                }
                else if(role.equals("Kasir")){
                    riwayatBeli.passData(kd_akun);
                    riwayatBeli.show();;
                    this.setVisible(false);
            
                }
                else {
                    JOptionPane.showMessageDialog(null, "Invalid1");
               
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid2");
              
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
        dispose();
    }//GEN-LAST:event_btn_riwayatMouseClicked

    private void btn_transaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_transaksiMouseClicked
        // TODO add your handling code here:
        Tampilan_TransaksiBeli transaksiBeli = new Tampilan_TransaksiBeli();

         try {
            String sql = "SELECT * FROM `akun` WHERE kd_akun = '"+ kodeAkun +"';";
            Connection conn = (Connection) Config.configDB();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            if (rs.next()) {
                
                String kd_akun = rs.getString("kd_akun");
                String nama = rs.getString("nama");
                String role = rs.getString("role");
                if (role.equals("Owner")){
                    transaksiBeli.passData(kd_akun);
                    transaksiBeli.show();
                    this.setVisible(false);


                }
                else if(role.equals("Kasir")){
                    transaksiBeli.passData(kd_akun);
                    transaksiBeli.show();;
                    this.setVisible(false);
            
                }
                else {
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

    private void btn_laporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_laporanMouseClicked
        // TODO add your handling code here:
        Tampilan_Laporan laporan = new Tampilan_Laporan();

         try {
            String sql = "SELECT * FROM `akun` WHERE kd_akun = '"+ kodeAkun +"';";
            Connection conn = (Connection) Config.configDB();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            if (rs.next()) {
                
                String kd_akun = rs.getString("kd_akun");
                String nama = rs.getString("nama");
                String role = rs.getString("role");
                if (role.equals("Owner")){
                    laporan.passData(kd_akun);
                    laporan.show();
                    this.setVisible(false);


                }
                else if(role.equals("Kasir")){
                    laporan.passData(kd_akun);
                    laporan.show();;
                    this.setVisible(false);
            
                }
                else {
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

    private void btn_refreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_refreshMouseEntered
        // TODO add your handling code here:
        Image iconRefreshHover = new ImageIcon(this.getClass().getResource("/img/Button refresh hover.png")).getImage();
        btn_refresh.setIcon(new ImageIcon(iconRefreshHover));
    }//GEN-LAST:event_btn_refreshMouseEntered

    private void btn_refreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_refreshMouseExited
        // TODO add your handling code here:
        Image iconRefreshDefault = new ImageIcon(this.getClass().getResource("/img/Button refresh.png")).getImage();
        btn_refresh.setIcon(new ImageIcon(iconRefreshDefault));
    }//GEN-LAST:event_btn_refreshMouseExited

    private void btn_refreshMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_refreshMousePressed
        // TODO add your handling code here:
        Image iconRefreshPress = new ImageIcon(this.getClass().getResource("/img/Button refresh press.png")).getImage();
        btn_refresh.setIcon(new ImageIcon(iconRefreshPress));
    }//GEN-LAST:event_btn_refreshMousePressed

    private void btn_refreshMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_refreshMouseReleased
        // TODO add your handling code here:
        Image iconRefreshHover = new ImageIcon(this.getClass().getResource("/img/Button refresh hover.png")).getImage();
        btn_refresh.setIcon(new ImageIcon(iconRefreshHover));
    }//GEN-LAST:event_btn_refreshMouseReleased

    private void cancel_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel_searchMouseClicked
        // TODO add your handling code here:
        txt_cari.setText("");
        cancel_search.setVisible(false);
    }//GEN-LAST:event_cancel_searchMouseClicked

    private void cancel_searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel_searchMouseEntered
        // TODO add your handling code here:
        Image iconCancelSearchHover = new ImageIcon(this.getClass().getResource("/img/cancel_search_hover.png")).getImage();
        cancel_search.setIcon(new ImageIcon(iconCancelSearchHover));
    }//GEN-LAST:event_cancel_searchMouseEntered

    private void cancel_searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel_searchMouseExited
        // TODO add your handling code here:
        Image iconCancelSearch = new ImageIcon(this.getClass().getResource("/img/cancel_search.png")).getImage();
        cancel_search.setIcon(new ImageIcon(iconCancelSearch));
    }//GEN-LAST:event_cancel_searchMouseExited

    private void txt_cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cariKeyReleased
        // TODO add your handling code here:
        if(txt_cari.getText().equals("")) {
            table();
            cancel_search.setVisible(false);
        } else {
            search();
            cancel_search.setVisible(true);
        }
    }//GEN-LAST:event_txt_cariKeyReleased

    private void btn_hapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapusMouseClicked
        try {
            int row = tb_karyawan.getSelectedRow();
            String kodeakun = tb_karyawan.getModel().getValueAt(row,0).toString();
            int confirm = JOptionPane.showConfirmDialog(this, "Kamu yakin akan menghapus karyawan ini?", "Peringatan", JOptionPane.OK_CANCEL_OPTION);
            
            if(confirm == 0) {
                
            
            Connection c = (Connection) Config.configDB();
            String sql = "Delete From akun where kd_akun ='"+kodeakun+"'";
            PreparedStatement pst = c.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Menghapus Karyawan");
            table();
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_hapusMouseClicked
    
    private void btn_refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_refreshMouseClicked
       table();
    }//GEN-LAST:event_btn_refreshMouseClicked

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
            java.util.logging.Logger.getLogger(Tampilan_Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tampilan_Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tampilan_Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tampilan_Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Tampilan_Karyawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_barang;
    private javax.swing.JLabel btn_hapus;
    private javax.swing.JLabel btn_karyawan;
    private javax.swing.JLabel btn_laporan;
    private javax.swing.JLabel btn_pemasok;
    private javax.swing.JLabel btn_pengaturan;
    private javax.swing.JLabel btn_pengeluaran;
    private javax.swing.JLabel btn_refresh;
    private javax.swing.JLabel btn_riwayat;
    private javax.swing.JLabel btn_tambah;
    private javax.swing.JLabel btn_transaksi;
    private javax.swing.JLabel btn_ubah;
    private javax.swing.JLabel cancel_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private main.PanelShadow panelShadow1;
    private main.PanelShadow panelShadow2;
    public atsk.Table tb_karyawan;
    private javax.swing.JTextField txt_cari;
    // End of variables declaration//GEN-END:variables
}
