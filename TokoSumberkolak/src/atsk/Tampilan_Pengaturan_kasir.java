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
import textfield.TextPrompt;

/**
 *
 * @author ACER
 */
public class Tampilan_Pengaturan_kasir extends javax.swing.JFrame {

    /**
     * Creates new form TampilanBarang
     */
    public Tampilan_Pengaturan_kasir() {
        initComponents();
//        TextPrompt passwordOld = new TextPrompt("Masukkan Password Lama", txt_passwordOld);
        TextPrompt passwordNew = new TextPrompt("Masukkan Password Baru", txt_passwordNew);
        TextPrompt passwordNew2 = new TextPrompt("Masukkan Kembali Password Baru", txt_passwordNew2);
        btn_barang.setVisible(false);
        btn_pemasok.setVisible(false);
        btn_karyawan.setVisible(false);
        btn_pengeluaran.setVisible(false);
        btn_riwayat.setVisible(false);
        btn_laporan.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
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
        jPanel8 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btn_logout = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        txt_passwordNew2 = new textfield.PasswordField();
        jPanel10 = new javax.swing.JPanel();
        txt_passwordNew = new textfield.PasswordField();
        btn_konfirmasi = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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

        btn_pengaturan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pengaturan_aktif.png"))); // NOI18N
        jPanel3.add(btn_pengaturan);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 88, 240, 630));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        jPanel5.setBackground(new java.awt.Color(245, 246, 250));

        jPanel8.setOpaque(false);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(840, 42));
        jPanel6.setRequestFocusEnabled(false);
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 22, 0));

        btn_logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Button Logout.png"))); // NOI18N
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_logoutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_logoutMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_logoutMouseReleased(evt);
            }
        });
        jPanel6.add(btn_logout);

        jPanel7.setOpaque(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(840, 270));
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 9));

        jLabel2.setBackground(new java.awt.Color(245, 246, 250));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Icon User.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(840, 207));
        jPanel7.add(jLabel2);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(245, 246, 250));
        jTextField1.setFont(new java.awt.Font("Arial", 1, 27)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Jeki");
        jTextField1.setBorder(null);
        jTextField1.setPreferredSize(new java.awt.Dimension(840, 50));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField1);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 22, 0));

        txt_passwordNew2.setBackground(new java.awt.Color(245, 246, 250));
        txt_passwordNew2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_passwordNew2.setOpaque(false);
        txt_passwordNew2.setPreferredSize(new java.awt.Dimension(495, 52));
        txt_passwordNew2.setShowAndHide(true);
        jPanel9.add(txt_passwordNew2);

        jPanel10.setOpaque(false);
        jPanel10.setPreferredSize(new java.awt.Dimension(840, 55));
        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 22, 0));

        txt_passwordNew.setBackground(new java.awt.Color(245, 246, 250));
        txt_passwordNew.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_passwordNew.setOpaque(false);
        txt_passwordNew.setPreferredSize(new java.awt.Dimension(495, 52));
        txt_passwordNew.setShowAndHide(true);
        txt_passwordNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordNewActionPerformed(evt);
            }
        });
        jPanel10.add(txt_passwordNew);

        btn_konfirmasi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_konfirmasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Button Konfirmasi Setting.png"))); // NOI18N
        btn_konfirmasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_konfirmasiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_konfirmasiMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_konfirmasiMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_konfirmasiMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(btn_konfirmasi))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btn_konfirmasi))
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
        barang.show();

        dispose();
    }//GEN-LAST:event_btn_barangMouseClicked

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

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btn_konfirmasiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_konfirmasiMouseEntered
        // TODO add your handling code here:
        Image iconKonfirmasiHover = new ImageIcon(this.getClass().getResource("/img/button konfirmasi setting hover.png")).getImage();
        btn_konfirmasi.setIcon(new ImageIcon(iconKonfirmasiHover));
    }//GEN-LAST:event_btn_konfirmasiMouseEntered

    private void btn_konfirmasiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_konfirmasiMouseExited
        // TODO add your handling code here:
        Image iconKonfirmasiDefault = new ImageIcon(this.getClass().getResource("/img/button konfirmasi setting.png")).getImage();
        btn_konfirmasi.setIcon(new ImageIcon(iconKonfirmasiDefault));
    }//GEN-LAST:event_btn_konfirmasiMouseExited

    private void btn_konfirmasiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_konfirmasiMousePressed
        // TODO add your handling code here:
        Image iconKonfirmasiPressed = new ImageIcon(this.getClass().getResource("/img/button konfirmasi setting press.png")).getImage();
        btn_konfirmasi.setIcon(new ImageIcon(iconKonfirmasiPressed));
    }//GEN-LAST:event_btn_konfirmasiMousePressed

    private void btn_konfirmasiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_konfirmasiMouseReleased
        // TODO add your handling code here:
        Image iconKonfirmasiHover = new ImageIcon(this.getClass().getResource("/img/button konfirmasi setting hover.png")).getImage();
        btn_konfirmasi.setIcon(new ImageIcon(iconKonfirmasiHover));
    }//GEN-LAST:event_btn_konfirmasiMouseReleased

    private void btn_logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseEntered
        // TODO add your handling code here:
        Image iconLogoutHover = new ImageIcon(this.getClass().getResource("/img/button logout hover.png")).getImage();
        btn_logout.setIcon(new ImageIcon(iconLogoutHover));
    }//GEN-LAST:event_btn_logoutMouseEntered

    private void btn_logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseExited
        // TODO add your handling code here:
        Image iconLogoutDefault = new ImageIcon(this.getClass().getResource("/img/button logout.png")).getImage();
        btn_logout.setIcon(new ImageIcon(iconLogoutDefault));
    }//GEN-LAST:event_btn_logoutMouseExited

    private void btn_logoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMousePressed
        // TODO add your handling code here:
        Image iconLogoutPressed = new ImageIcon(this.getClass().getResource("/img/button logout press.png")).getImage();
        btn_logout.setIcon(new ImageIcon(iconLogoutPressed));
    }//GEN-LAST:event_btn_logoutMousePressed

    private void btn_logoutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseReleased
        // TODO add your handling code here:
        Image iconLogoutHover = new ImageIcon(this.getClass().getResource("/img/button logout hover.png")).getImage();
        btn_logout.setIcon(new ImageIcon(iconLogoutHover));
    }//GEN-LAST:event_btn_logoutMouseReleased

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        // TODO add your handling code here:
        Tampilan_Login login = new Tampilan_Login();
        login.show();
        
        dispose();
    }//GEN-LAST:event_btn_logoutMouseClicked

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
        pengeluaran.show();
        
        dispose();
    }//GEN-LAST:event_btn_pengeluaranMouseClicked

    private void btn_riwayatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatMouseClicked
        // TODO add your handling code here:
        Tampilan_RiwayatBeli riwayatBeli = new Tampilan_RiwayatBeli();
        riwayatBeli.show();
        
        dispose();
    }//GEN-LAST:event_btn_riwayatMouseClicked

    private void btn_transaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_transaksiMouseClicked
        // TODO add your handling code here:
        Tampilan_TransaksiJual_kasir transaksiBeli = new Tampilan_TransaksiJual_kasir();
        transaksiBeli.show();
        
        dispose();
    }//GEN-LAST:event_btn_transaksiMouseClicked

    private void btn_laporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_laporanMouseClicked
        // TODO add your handling code here:
        Tampilan_Laporan laporan = new Tampilan_Laporan();
        laporan.show();
        
        dispose();
    }//GEN-LAST:event_btn_laporanMouseClicked

    private void txt_passwordNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordNewActionPerformed

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
            java.util.logging.Logger.getLogger(Tampilan_Pengaturan_kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tampilan_Pengaturan_kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tampilan_Pengaturan_kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tampilan_Pengaturan_kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Tampilan_Pengaturan_kasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_barang;
    private javax.swing.JLabel btn_karyawan;
    private javax.swing.JLabel btn_konfirmasi;
    private javax.swing.JLabel btn_laporan;
    private javax.swing.JLabel btn_logout;
    private javax.swing.JLabel btn_pemasok;
    private javax.swing.JLabel btn_pengaturan;
    private javax.swing.JLabel btn_pengeluaran;
    private javax.swing.JLabel btn_riwayat;
    private javax.swing.JLabel btn_transaksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField1;
    private textfield.PasswordField txt_passwordNew;
    private textfield.PasswordField txt_passwordNew2;
    // End of variables declaration//GEN-END:variables
}