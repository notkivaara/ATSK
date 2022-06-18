/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atsk;

import atsk.laporanBulanan.Tampilan_Laporan;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Tampilan_Barang_Terjual extends javax.swing.JFrame {

    /**
     * Creates new form TampilanBarang
     */
    public Tampilan_Barang_Terjual() {
        initComponents();
        getContentPane().setBackground(new Color(250, 250, 250));
        TextPrompt cari = new TextPrompt("Cari Berdasarkan Nama Barang", txt_cari);
        terjualTable.fixTable(jScrollPane2);
        cancel_search.setVisible(false);
        table();

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

    public void table() {
        String sortir = "terjual DESC";
        if (sort.getSelectedItem().equals("Terlaku")) {
            sortir = "terjual DESC";
        } else if (sort.getSelectedItem().equals("Kurang laku")) {
            sortir = "terjual ASC";
        } else if (sort.getSelectedItem().equals("Stok terendah")) {
            sortir = "m.stock ASC";
        }  else if (sort.getSelectedItem().equals("Nama Barang")) {
            sortir = "m.nama_brg ASC";
        }
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Nama Barang");
        tbl.addColumn("Terjual");
        tbl.addColumn("Satuan");
        tbl.addColumn("Sisa Stock");
        tbl.addColumn("Saran");

        // Disini Terakhir nulis
        try {
            Statement st = (Statement) Config.configDB().createStatement();
            ResultSet rs = st.executeQuery("SELECT nama_brg,(SELECT SUM(kuantitas) FROM detail_transaksi WHERE kd_brg=m.kd_brg )as terjual,m.satuan as satuan,m.stock as sisa_stock,IF(dt.kuantitas >=3 AND m.stock <=10 ,\"Tambah stock\" ,\"Tidak usah tambah stock\") as saran\n"
                    + "FROM barang as m JOIN detail_transaksi as dt ON dt.kd_brg = m.kd_brg JOIN transaksi as t on dt.kd_transaksi = t.kd_transaksi GROUP BY m.kd_brg order by " + sortir + ""
            );
            while (rs.next()) {
                tbl.addRow(new Object[]{
                    rs.getString("nama_brg"),
                    rs.getString("terjual"),
                    rs.getString("satuan"),
                    rs.getString("sisa_stock"),
                    rs.getString("saran"),
                });

                terjualTable.setModel(tbl);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void search() {

        String sortir = "terjual DESC";
        if (sort.getSelectedItem().equals("Terlaku")) {
            sortir = "terjual DESC";
        } else if (sort.getSelectedItem().equals("Kurang laku")) {
            sortir = "terjual ASC";
        } else if (sort.getSelectedItem().equals("Stok terendah")) {
            sortir = "m.stock ASC";
        } else if (sort.getSelectedItem().equals("Nama Barang")) {
            sortir = "m.nama_brg ASC";
        }

        String cari = txt_cari.getText();
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Nama Barang");
        tbl.addColumn("Terjual");
        tbl.addColumn("Satuan");
        tbl.addColumn("Sisa Stock");
        tbl.addColumn("Saran");

        // Disini Terakhir nulis
        try {
            Statement st = (Statement) Config.configDB().createStatement();
            ResultSet rs = st.executeQuery("SELECT nama_brg,(SELECT SUM(kuantitas) FROM detail_transaksi WHERE kd_brg=m.kd_brg )as terjual,m.satuan as satuan,m.stock as sisa_stock,IF(dt.kuantitas >=3 AND m.stock <=10 ,\"Tambah stock\" ,\"Tidak usah tambah stock\") as saran\n" +
"FROM barang as m JOIN detail_transaksi as dt ON dt.kd_brg = m.kd_brg JOIN transaksi as t on dt.kd_transaksi = t.kd_transaksi where nama_brg like '%"+cari+"%' GROUP BY m.kd_brg order by '%"+sortir+"%'"
            );
            while (rs.next()) {
                tbl.addRow(new Object[]{
                    rs.getString("nama_brg"),
                    rs.getString("terjual"),
                    rs.getString("satuan"),
                    rs.getString("sisa_stock"),
                    rs.getString("saran"),
                });

                terjualTable.setModel(tbl);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

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
        panelShadow2 = new main.PanelShadow();
        jScrollPane2 = new javax.swing.JScrollPane();
        terjualTable = new atsk.Table();
        sort = new combo_suggestion.ComboBoxSuggestion();
        jPanel6 = new javax.swing.JPanel();
        panelShadow1 = new main.PanelShadow();
        jLabel3 = new javax.swing.JLabel();
        txt_cari = new javax.swing.JTextField();
        cancel_search = new javax.swing.JLabel();
        panelShadow3 = new main.PanelShadow();
        kembali = new javax.swing.JButton();

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

        btn_barang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/barang_aktif.png"))); // NOI18N
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

        panelShadow2.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow2.setShadowColor(new java.awt.Color(209, 223, 245));
        panelShadow2.setShadowOpacity(1.0F);
        panelShadow2.setShadowSize(5);

        jScrollPane2.setPreferredSize(new java.awt.Dimension(770, 600));

        terjualTable = new atsk.Table(){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        terjualTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Barang", "Terjual"
            }
        ));
        terjualTable.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        terjualTable.setRequestFocusEnabled(false);
        jScrollPane2.setViewportView(terjualTable);
        if (terjualTable.getColumnModel().getColumnCount() > 0) {
            terjualTable.getColumnModel().getColumn(1).setPreferredWidth(1);
        }

        sort.setBorder(null);
        sort.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Terlaku", "Kurang laku", "Stok terendah ", "Nama Barang" }));
        sort.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        sort.setPreferredSize(new java.awt.Dimension(145, 49));
        sort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sortMouseClicked(evt);
            }
        });
        sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow2Layout = new javax.swing.GroupLayout(panelShadow2);
        panelShadow2.setLayout(panelShadow2Layout);
        panelShadow2Layout.setHorizontalGroup(
            panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelShadow2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(sort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelShadow2Layout.setVerticalGroup(
            panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(sort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 0));

        panelShadow1.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow1.setPreferredSize(new java.awt.Dimension(400, 52));
        panelShadow1.setShadowColor(new java.awt.Color(209, 223, 245));
        panelShadow1.setShadowOpacity(0.5F);
        panelShadow1.setShadowSize(1);
        panelShadow1.setShadowType(main.ShadowType.BOT);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconCari(1080).png"))); // NOI18N

        txt_cari.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_cari.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_cari.setBorder(null);
        txt_cari.setPreferredSize(new java.awt.Dimension(375, 49));
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
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancel_search, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
            .addComponent(cancel_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.add(panelShadow1);

        panelShadow3.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow3.setPreferredSize(new java.awt.Dimension(150, 52));
        panelShadow3.setShadowColor(new java.awt.Color(209, 223, 245));
        panelShadow3.setShadowOpacity(0.5F);
        panelShadow3.setShadowSize(1);
        panelShadow3.setShadowType(main.ShadowType.BOT);
        panelShadow3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        kembali.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        kembali.setText("Kembali");
        kembali.setPreferredSize(new java.awt.Dimension(145, 49));
        kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kembaliMouseClicked(evt);
            }
        });
        panelShadow3.add(kembali);

        jPanel6.add(panelShadow3);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panelShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelShadow2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                String nama = rs.getString("nama");
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
                String nama = rs.getString("nama");
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

        Tampilan_Karyawan karyawan = new Tampilan_Karyawan();
        try {
            String sql = "SELECT * FROM `akun` WHERE kd_akun = '" + kodeAkun + "';";
            Connection conn = (Connection) Config.configDB();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            if (rs.next()) {

                String kd_akun = rs.getString("kd_akun");
                String nama = rs.getString("nama");
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
        }

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

    private void btn_riwayatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayatMouseClicked

        Tampilan_RiwayatBeli riwayatBeli = new Tampilan_RiwayatBeli();

        try {
            String sql = "SELECT * FROM `akun` WHERE kd_akun = '" + kodeAkun + "';";
            Connection conn = (Connection) Config.configDB();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            if (rs.next()) {

                String kd_akun = rs.getString("kd_akun");
                String nama = rs.getString("nama");
                String role = rs.getString("role");
                if (role.equals("Owner")) {
                    riwayatBeli.passData(kd_akun);
                    riwayatBeli.show();
                    this.setVisible(false);

                } else if (role.equals("Kasir")) {
                    riwayatBeli.passData(kd_akun);
                    riwayatBeli.show();;
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
    }//GEN-LAST:event_btn_riwayatMouseClicked

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
                String nama = rs.getString("nama");
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

    private void btn_laporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_laporanMouseClicked

        Tampilan_Laporan laporan = new Tampilan_Laporan();
        try {
            String sql = "SELECT * FROM `akun` WHERE kd_akun = '" + kodeAkun + "';";
            Connection conn = (Connection) Config.configDB();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            if (rs.next()) {

                String kd_akun = rs.getString("kd_akun");
                String nama = rs.getString("nama");
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

    private void txt_cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cariKeyReleased
        // TODO add your handling code here:
        if (txt_cari.getText().equals("")) {
            table();
            cancel_search.setVisible(false);
        } else {
            search();
            cancel_search.setVisible(true);
        }
    }//GEN-LAST:event_txt_cariKeyReleased

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

    private void sortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sortMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_sortMouseClicked

    private void sortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortActionPerformed
        // TODO add your handling code here:
        table();

    }//GEN-LAST:event_sortActionPerformed

    private void kembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembaliMouseClicked
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
    }//GEN-LAST:event_kembaliMouseClicked

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
            java.util.logging.Logger.getLogger(Tampilan_Barang_Terjual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tampilan_Barang_Terjual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tampilan_Barang_Terjual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tampilan_Barang_Terjual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Tampilan_Barang_Terjual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_barang;
    private javax.swing.JLabel btn_karyawan;
    private javax.swing.JLabel btn_laporan;
    private javax.swing.JLabel btn_pemasok;
    private javax.swing.JLabel btn_pengaturan;
    private javax.swing.JLabel btn_pengeluaran;
    private javax.swing.JLabel btn_riwayat;
    private javax.swing.JLabel btn_transaksi;
    private javax.swing.JLabel cancel_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton kembali;
    private main.PanelShadow panelShadow1;
    private main.PanelShadow panelShadow2;
    private main.PanelShadow panelShadow3;
    private combo_suggestion.ComboBoxSuggestion sort;
    public atsk.Table terjualTable;
    private javax.swing.JTextField txt_cari;
    // End of variables declaration//GEN-END:variables
}
