
package atsk;

import atsk.laporanBulanan.Tampilan_Laporan;


import atsk.Tampilan_Barang;
import atsk.Tampilan_Karyawan;
import atsk.laporanBulanan.Tampilan_Laporan;
import atsk.Tampilan_Pemasok;
import atsk.Tampilan_Pengaturan_kasir;
import atsk.Tampilan_Pengeluaran;
import atsk.Tampilan_RiwayatBeli;
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
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
public class Tampilan_TransaksiJual_kasir extends javax.swing.JFrame {

    /**
     * Creates new form TampilanBarang
     */
    public Tampilan_TransaksiJual_kasir() {
        initComponents();
        TextPrompt cari = new TextPrompt("Cari Berdasarkan Nama Barang", txt_cari);
        Tablebarang.fixTable(jScrollPane3);
        Tabletransaksi.fixTable(jScrollPane5);
        cancel_search.setVisible(false);
        btn_barang.setVisible(false);
        btn_pemasok.setVisible(false);
        btn_karyawan.setVisible(false);
        btn_pengeluaran.setVisible(false);
        btn_riwayat.setVisible(false);
        btn_laporan.setVisible(false);
    }
//        
//        public void tanggal() {
//        long millis = System.currentTimeMillis();
//        Timestamp timestamp = new Timestamp(millis);
//
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
//        String formatedStrDate = sdf.format(timestamp);
//        txt_tanggal.setText(formatedStrDate);
//    }
//
//    public void tablebarang() {
//        DefaultTableModel tbl = new DefaultTableModel();
//        tbl.addColumn("Kode Barang");
//        tbl.addColumn("Kode Barcode");
//        tbl.addColumn("Nama Barang");
//        tbl.addColumn("Stock");
//        tbl.addColumn("Satuan");
//        tbl.addColumn("Harga Jual");
//
//        try {
//            Statement st = (Statement) Config.configDB().createStatement();
//            ResultSet rs = st.executeQuery("Select * from barang");
//
//            while (rs.next()) {
//                tbl.addRow(new Object[] {
//                        rs.getString("kd_brg"),
//                        rs.getString("kd_barcode"),
//                        rs.getString("nama_brg"),
//                        rs.getString("stock"),
//                        rs.getString("Satuan"),
//                        rs.getString("hrg_jual_brg")
//                });
//                Tablebarang.setModel(tbl);
//
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
//    }
//
//    public void search() {
//        DefaultTableModel tbl = new DefaultTableModel();
//        tbl.addColumn("Kode Barang");
//        tbl.addColumn("Kode Barcode");
//        tbl.addColumn("Nama Barang");
//        tbl.addColumn("Stock");
//        tbl.addColumn("Satuan");
//        tbl.addColumn("Harga Jual");
//
//        String cari = txt_cari.getText();
//
//        try {
//
//            String sql = "SELECT * FROM `barang` WHERE nama_brg LIKE '%" + cari + "%'";
//            Connection c = (Connection) Config.configDB();
//            Statement st = c.createStatement();
//            ResultSet rs = st.executeQuery(sql);
//            while (rs.next()) {
//                tbl.addRow(new Object[] {
//                        rs.getString("kd_brg"),
//                        rs.getString("kd_barcode"),
//                        rs.getString("nama_brg"),
//                        rs.getString("stock"),
//                        rs.getString("Satuan"),
//                        rs.getString("hrg_jual_brg"), });
//                Tablebarang.setModel(tbl);
//
//            }
//
//        } catch (Exception e) {
//        }
//    }
//
//    private void autonumber() {
//        try {
//            Connection c = (Connection) Config.configDB();
//            Statement s = c.createStatement();
//            String sql = "SELECT * FROM transaksi ORDER BY kd_transaksi DESC";
//            ResultSet r = s.executeQuery(sql);
//            if (r.next()) {
//                String kd_transaksi = r.getString("kd_transaksi").substring(2);
//                String KD = "" + (Integer.parseInt(kd_transaksi) + 1);
//                String Nol = "";
//
//                if (KD.length() == 1) {
//                    Nol = "000";
//                } else if (KD.length() == 2) {
//                    Nol = "00";
//                } else if (KD.length() == 3) {
//                    Nol = "0";
//                } else if (KD.length() == 4) {
//                    Nol = "";
//                }
//                txt_kodetransaksi.setText("TR" + Nol + KD);
//            } else {
//                txt_kodetransaksi.setText("TR0001");
//            }
//            r.close();
//            s.close();
//        } catch (Exception e) {
//            System.out.println("autonumber error");
//        }
//    }
//
//    public void loadData() {
//        DefaultTableModel model = (DefaultTableModel) Tablebarang.getModel();
//        model.addRow(new Object[] {
//                txt_kodetransaksi.getText(),
//                txt_kodebarang.getText(),
//                txt_namabarang.getText(),
//                txt_kuantitas.getText(),
//                txt_subtotal.getText()
//
//        });
//    }
//
//    public void tabletransaksi() {
//        DefaultTableModel tbl = new DefaultTableModel();
//        tbl.addColumn("Kode Transaksi");
//        tbl.addColumn("Kode Barang");
//        tbl.addColumn("Nama Barang");
//        tbl.addColumn("Harga");
//        tbl.addColumn("Kuantitas");
//        tbl.addColumn("subtotal");
//    }
//
//    public void clear() {
//        txt_total.setText("0");
//        txt_tunai.setText("0");
//        txt_kembalian.setText("0");
//    }
//
//    public void clear2() {
//        txt_kodebarang.setText("");
//        txt_kodebarcode.setText("");
//        txt_namabarang.setText("");
//        txt_harga.setText("");
//        txt_kuantitas.setText("");
//    }
//
//    public void table_clear() {
//        DefaultTableModel model = (DefaultTableModel) Tablebarang.getModel();
//        model.setRowCount(0);
//    }
//
//    public void total() {
//        int total = 0;
//        for (int i = 0; i < Tablebarang.getRowCount(); i++) {
//            int subtotal = Integer.parseInt(Tablebarang.getValueAt(i, 4).toString());
//            total = total + subtotal;
//        }
//        txt_total.setText(String.valueOf(total));
//    }
//
//    public void subtotal() {
//         int kuantitas, harga, subtotal;
//
//        kuantitas = Integer.valueOf(txt_kuantitas.getText());
//        harga = Integer.valueOf(txt_harga.getText());
//
//        subtotal = kuantitas * harga;
//
//        txt_subtotal.setText(String.valueOf(subtotal));
//
//        loadData();
//        total();
//    }
//
//    public Tampilan_TransaksiJual() {
//        initComponents();
//        txt_subtotal.setVisible(false);
//        loadData();
//        tablebarang();
//        autonumber();
//        tanggal();
//        TextPrompt cari = new TextPrompt("Cari Berdasarkan Nama Barang", txt_cari);
//        Tablebarang.fixTable(jScrollPane3);
//        Tablebarang.fixTable(jScrollPane1);
//
//        DefaultTableModel model = new DefaultTableModel();
//
//        Tablebarang.setModel(model);
//
//        model.addColumn("Kode Transaksi");
//        model.addColumn("Kode Barang");
//        model.addColumn("Nama Barang");
//        model.addColumn("Kuantitas");
//        model.addColumn("Subtotal");
//    }
//    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        javax.swing.JTable jTable2 = new javax.swing.JTable();
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
        panelShadow8 = new main.PanelShadow();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_kodetransaksi = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_kodebarang = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txt_kodebarcode = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_namabarang = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_harga = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_kuantitas = new javax.swing.JTextField();
        btn_tambahkan = new javax.swing.JLabel();
        panelShadow9 = new main.PanelShadow();
        jPanel11 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txt_tanggal = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txt_kembalian = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txt_tunai = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        btn_hapus = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        btn_konfirmasi = new javax.swing.JLabel();
        panelShadow2 = new main.PanelShadow();
        jScrollPane5 = new javax.swing.JScrollPane();
        Tabletransaksi = new atsk.Table();
        panelShadow1 = new main.PanelShadow();
        jLabel13 = new javax.swing.JLabel();
        panelShadow3 = new main.PanelShadow();
        jLabel14 = new javax.swing.JLabel();
        panelShadow4 = new main.PanelShadow();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tablebarang = new atsk.Table();
        jPanel19 = new javax.swing.JPanel();
        panelShadow6 = new main.PanelShadow();
        jLabel15 = new javax.swing.JLabel();
        txt_cari = new javax.swing.JTextField();
        cancel_search = new javax.swing.JLabel();
        panelShadow7 = new main.PanelShadow();
        comboBoxSuggestion1 = new combo_suggestion.ComboBoxSuggestion();
        btn_cari = new javax.swing.JLabel();

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Transaksi", "Kode Barang", "Nama Barang", "Kuantitas", "Subtotal"
            }
        ));
        jTable2.setGridColor(new java.awt.Color(204, 204, 204));
        jTable2.setPreferredSize(new java.awt.Dimension(840, 840));
        jTable2.setRequestFocusEnabled(false);
        jTable2.setRowHeight(40);
        jTable2.setSelectionBackground(new java.awt.Color(216, 225, 238));
        jScrollPane2.setViewportView(jTable2);

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

        panelShadow8.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow8.setPreferredSize(new java.awt.Dimension(340, 270));
        panelShadow8.setShadowColor(new java.awt.Color(209, 223, 245));
        panelShadow8.setShadowOpacity(1.0F);
        panelShadow8.setShadowSize(5);

        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(336, 34));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Kode Transaksi");
        jLabel2.setPreferredSize(new java.awt.Dimension(145, 34));
        jPanel4.add(jLabel2);

        txt_kodetransaksi.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_kodetransaksi.setPreferredSize(new java.awt.Dimension(150, 34));
        jPanel4.add(txt_kodetransaksi);

        jPanel7.setOpaque(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(340, 34));
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Kode Barang");
        jLabel4.setPreferredSize(new java.awt.Dimension(145, 34));
        jPanel7.add(jLabel4);

        txt_kodebarang.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_kodebarang.setPreferredSize(new java.awt.Dimension(150, 34));
        jPanel7.add(txt_kodebarang);

        jPanel12.setOpaque(false);
        jPanel12.setPreferredSize(new java.awt.Dimension(340, 34));
        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Kode  Barcode");
        jLabel9.setPreferredSize(new java.awt.Dimension(145, 34));
        jPanel12.add(jLabel9);

        txt_kodebarcode.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_kodebarcode.setPreferredSize(new java.awt.Dimension(150, 34));
        jPanel12.add(txt_kodebarcode);

        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(340, 34));
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Nama Barang");
        jLabel5.setPreferredSize(new java.awt.Dimension(145, 34));
        jPanel8.add(jLabel5);

        txt_namabarang.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_namabarang.setPreferredSize(new java.awt.Dimension(150, 34));
        jPanel8.add(txt_namabarang);

        jPanel9.setOpaque(false);
        jPanel9.setPreferredSize(new java.awt.Dimension(340, 34));
        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Harga");
        jLabel6.setPreferredSize(new java.awt.Dimension(145, 34));
        jPanel9.add(jLabel6);

        txt_harga.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_harga.setPreferredSize(new java.awt.Dimension(150, 34));
        jPanel9.add(txt_harga);

        jPanel10.setOpaque(false);
        jPanel10.setPreferredSize(new java.awt.Dimension(336, 34));
        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Kuantitas");
        jLabel7.setPreferredSize(new java.awt.Dimension(145, 34));
        jPanel10.add(jLabel7);

        txt_kuantitas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_kuantitas.setPreferredSize(new java.awt.Dimension(150, 34));
        jPanel10.add(txt_kuantitas);

        btn_tambahkan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Button Tambahkan.png"))); // NOI18N
        btn_tambahkan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_tambahkanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_tambahkanMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_tambahkanMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_tambahkanMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout panelShadow8Layout = new javax.swing.GroupLayout(panelShadow8);
        panelShadow8.setLayout(panelShadow8Layout);
        panelShadow8Layout.setHorizontalGroup(
            panelShadow8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelShadow8Layout.createSequentialGroup()
                .addGroup(panelShadow8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow8Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btn_tambahkan))
                    .addGroup(panelShadow8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow8Layout.setVerticalGroup(
            panelShadow8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_tambahkan)
                .addContainerGap())
        );

        panelShadow9.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow9.setPreferredSize(new java.awt.Dimension(255, 185));
        panelShadow9.setShadowColor(new java.awt.Color(209, 223, 245));
        panelShadow9.setShadowOpacity(1.0F);
        panelShadow9.setShadowSize(5);

        jPanel11.setOpaque(false);
        jPanel11.setPreferredSize(new java.awt.Dimension(270, 34));
        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Total");
        jLabel8.setPreferredSize(new java.awt.Dimension(100, 34));
        jPanel11.add(jLabel8);

        txt_total.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_total.setPreferredSize(new java.awt.Dimension(130, 34));
        txt_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalActionPerformed(evt);
            }
        });
        jPanel11.add(txt_total);

        jPanel13.setOpaque(false);
        jPanel13.setPreferredSize(new java.awt.Dimension(270, 34));
        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Tanggal");
        jLabel10.setPreferredSize(new java.awt.Dimension(100, 34));
        jPanel13.add(jLabel10);

        txt_tanggal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_tanggal.setPreferredSize(new java.awt.Dimension(130, 34));
        txt_tanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tanggalActionPerformed(evt);
            }
        });
        jPanel13.add(txt_tanggal);

        jPanel15.setOpaque(false);
        jPanel15.setPreferredSize(new java.awt.Dimension(270, 34));
        jPanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setText("Kembalian");
        jLabel12.setPreferredSize(new java.awt.Dimension(100, 34));
        jPanel15.add(jLabel12);

        txt_kembalian.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_kembalian.setPreferredSize(new java.awt.Dimension(130, 34));
        jPanel15.add(txt_kembalian);

        jPanel14.setOpaque(false);
        jPanel14.setPreferredSize(new java.awt.Dimension(270, 34));
        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setText("Tunai");
        jLabel11.setPreferredSize(new java.awt.Dimension(100, 34));
        jPanel14.add(jLabel11);

        txt_tunai.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_tunai.setPreferredSize(new java.awt.Dimension(130, 34));
        jPanel14.add(txt_tunai);

        javax.swing.GroupLayout panelShadow9Layout = new javax.swing.GroupLayout(panelShadow9);
        panelShadow9.setLayout(panelShadow9Layout);
        panelShadow9Layout.setHorizontalGroup(
            panelShadow9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelShadow9Layout.setVerticalGroup(
            panelShadow9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow9Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setOpaque(false);
        jPanel16.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        btn_hapus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Button hapus jual.png"))); // NOI18N
        btn_hapus.addMouseListener(new java.awt.event.MouseAdapter() {
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
        jPanel16.add(btn_hapus);

        jPanel17.setOpaque(false);
        jPanel17.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        btn_konfirmasi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_konfirmasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Button Konfirmasi.png"))); // NOI18N
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
        jPanel17.add(btn_konfirmasi);

        panelShadow2.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow2.setShadowColor(new java.awt.Color(209, 223, 245));
        panelShadow2.setShadowOpacity(1.0F);
        panelShadow2.setShadowSize(5);
        panelShadow2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));

        jScrollPane5.setPreferredSize(new java.awt.Dimension(502, 225));

        Tabletransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Transaksi", "Kode Barang", "Nama Barang", "Kuantitas", "Subtotal"
            }
        ));
        Tabletransaksi.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jScrollPane5.setViewportView(Tabletransaksi);

        panelShadow2.add(jScrollPane5);

        panelShadow1.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow1.setPreferredSize(new java.awt.Dimension(522, 36));
        panelShadow1.setShadowColor(new java.awt.Color(209, 223, 245));
        panelShadow1.setShadowOpacity(0.5F);
        panelShadow1.setShadowSize(1);
        panelShadow1.setShadowType(main.ShadowType.BOT);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/txt Daftar.png"))); // NOI18N

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        panelShadow3.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow3.setPreferredSize(new java.awt.Dimension(260, 36));
        panelShadow3.setShadowColor(new java.awt.Color(209, 223, 245));
        panelShadow3.setShadowOpacity(0.5F);
        panelShadow3.setShadowSize(1);
        panelShadow3.setShadowType(main.ShadowType.BOT);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/txt Pembayaran.png"))); // NOI18N

        javax.swing.GroupLayout panelShadow3Layout = new javax.swing.GroupLayout(panelShadow3);
        panelShadow3.setLayout(panelShadow3Layout);
        panelShadow3Layout.setHorizontalGroup(
            panelShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
        );
        panelShadow3Layout.setVerticalGroup(
            panelShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        panelShadow4.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow4.setPreferredSize(new java.awt.Dimension(452, 270));
        panelShadow4.setShadowColor(new java.awt.Color(209, 223, 245));
        panelShadow4.setShadowOpacity(1.0F);
        panelShadow4.setShadowSize(5);
        panelShadow4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));

        jScrollPane3.setBorder(null);
        jScrollPane3.setPreferredSize(new java.awt.Dimension(422, 254));

        Tablebarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Barang", "Nama Barang", "Stok", "Satuan", "Harga"
            }
        ));
        Tablebarang.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jScrollPane3.setViewportView(Tablebarang);

        panelShadow4.add(jScrollPane3);

        jPanel19.setOpaque(false);
        jPanel19.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 0));

        panelShadow6.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow6.setPreferredSize(new java.awt.Dimension(570, 52));
        panelShadow6.setShadowColor(new java.awt.Color(209, 223, 245));
        panelShadow6.setShadowOpacity(0.5F);
        panelShadow6.setShadowSize(1);
        panelShadow6.setShadowType(main.ShadowType.BOT);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconCari(1080).png"))); // NOI18N

        txt_cari.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_cari.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_cari.setBorder(null);
        txt_cari.setPreferredSize(new java.awt.Dimension(385, 49));
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

        javax.swing.GroupLayout panelShadow6Layout = new javax.swing.GroupLayout(panelShadow6);
        panelShadow6.setLayout(panelShadow6Layout);
        panelShadow6Layout.setHorizontalGroup(
            panelShadow6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel15)
                .addGap(10, 10, 10)
                .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(cancel_search, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelShadow6Layout.setVerticalGroup(
            panelShadow6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelShadow6Layout.createSequentialGroup()
                .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
            .addComponent(cancel_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel19.add(panelShadow6);

        panelShadow7.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow7.setPreferredSize(new java.awt.Dimension(150, 52));
        panelShadow7.setShadowColor(new java.awt.Color(209, 223, 245));
        panelShadow7.setShadowOpacity(0.5F);
        panelShadow7.setShadowSize(1);
        panelShadow7.setShadowType(main.ShadowType.BOT);
        panelShadow7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        comboBoxSuggestion1.setBorder(null);
        comboBoxSuggestion1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        comboBoxSuggestion1.setPreferredSize(new java.awt.Dimension(145, 49));
        panelShadow7.add(comboBoxSuggestion1);

        jPanel19.add(panelShadow7);

        btn_cari.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Button refresh.png"))); // NOI18N
        btn_cari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cariMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cariMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_cariMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_cariMouseReleased(evt);
            }
        });
        jPanel19.add(btn_cari);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(panelShadow4, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(panelShadow8, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(panelShadow2, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                                            .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(panelShadow9, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                            .addComponent(panelShadow3, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)))))))
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelShadow4, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelShadow8, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelShadow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelShadow9, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

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
        Tampilan_Pengaturan_kasir pengaturan = new Tampilan_Pengaturan_kasir();
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

    private void btn_hapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapusMouseEntered
        // TODO add your handling code here:
        Image iconHapusHover = new ImageIcon(this.getClass().getResource("/img/Button hapus jual hover.png")).getImage();
        btn_hapus.setIcon(new ImageIcon(iconHapusHover));
    }//GEN-LAST:event_btn_hapusMouseEntered

    private void btn_hapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapusMouseExited
        // TODO add your handling code here:
        Image iconHapusDefault = new ImageIcon(this.getClass().getResource("/img/Button hapus jual.png")).getImage();
        btn_hapus.setIcon(new ImageIcon(iconHapusDefault));
    }//GEN-LAST:event_btn_hapusMouseExited

    private void btn_hapusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapusMousePressed
        // TODO add your handling code here:
        Image iconHapusPressed = new ImageIcon(this.getClass().getResource("/img/Button hapus jual press.png")).getImage();
        btn_hapus.setIcon(new ImageIcon(iconHapusPressed));
    }//GEN-LAST:event_btn_hapusMousePressed

    private void btn_hapusMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapusMouseReleased
        // TODO add your handling code here:
        Image iconHapusHover = new ImageIcon(this.getClass().getResource("/img/Button hapus jual hover.png")).getImage();
        btn_hapus.setIcon(new ImageIcon(iconHapusHover));
    }//GEN-LAST:event_btn_hapusMouseReleased

    private void btn_konfirmasiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_konfirmasiMouseEntered
        // TODO add your handling code here:
        Image iconKonfirmasiHover = new ImageIcon(this.getClass().getResource("/img/Button konfirmasi hover.png")).getImage();
        btn_konfirmasi.setIcon(new ImageIcon(iconKonfirmasiHover));
    }//GEN-LAST:event_btn_konfirmasiMouseEntered

    private void btn_konfirmasiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_konfirmasiMouseExited
        // TODO add your handling code here:
        Image iconKonfirmasiDefault = new ImageIcon(this.getClass().getResource("/img/Button konfirmasi.png")).getImage();
        btn_konfirmasi.setIcon(new ImageIcon(iconKonfirmasiDefault));
    }//GEN-LAST:event_btn_konfirmasiMouseExited

    private void btn_konfirmasiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_konfirmasiMousePressed
        // TODO add your handling code here:
        Image iconKonfirmasiPressed = new ImageIcon(this.getClass().getResource("/img/Button konfirmasi press.png")).getImage();
        btn_konfirmasi.setIcon(new ImageIcon(iconKonfirmasiPressed));
    }//GEN-LAST:event_btn_konfirmasiMousePressed

    private void btn_konfirmasiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_konfirmasiMouseReleased
        // TODO add your handling code here:
        Image iconKonfirmasiHover = new ImageIcon(this.getClass().getResource("/img/Button konfirmasi hover.png")).getImage();
        btn_konfirmasi.setIcon(new ImageIcon(iconKonfirmasiHover));
    }//GEN-LAST:event_btn_konfirmasiMouseReleased

    private void btn_laporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_laporanMouseClicked
        // TODO add your handling code here:
        Tampilan_Laporan laporan = new Tampilan_Laporan();
        laporan.show();

        dispose();
    }//GEN-LAST:event_btn_laporanMouseClicked

    private void btn_cariMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cariMouseEntered
        // TODO add your handling code here:
        Image iconRefreshHover = new ImageIcon(this.getClass().getResource("/img/Button refresh hover.png")).getImage();
        btn_cari.setIcon(new ImageIcon(iconRefreshHover));
    }//GEN-LAST:event_btn_cariMouseEntered

    private void btn_cariMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cariMouseExited
        // TODO add your handling code here:
        Image iconRefreshDefault = new ImageIcon(this.getClass().getResource("/img/Button refresh.png")).getImage();
        btn_cari.setIcon(new ImageIcon(iconRefreshDefault));
    }//GEN-LAST:event_btn_cariMouseExited

    private void btn_cariMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cariMousePressed
        // TODO add your handling code here:
        Image iconRefreshPress = new ImageIcon(this.getClass().getResource("/img/Button refresh press.png")).getImage();
        btn_cari.setIcon(new ImageIcon(iconRefreshPress));
    }//GEN-LAST:event_btn_cariMousePressed

    private void btn_cariMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cariMouseReleased
        // TODO add your handling code here:
        Image iconRefreshHover = new ImageIcon(this.getClass().getResource("/img/Button refresh hover.png")).getImage();
        btn_cari.setIcon(new ImageIcon(iconRefreshHover));
    }//GEN-LAST:event_btn_cariMouseReleased

    private void btn_tambahkanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahkanMouseReleased
        // TODO add your handling code here:
        Image iconTambahkanHover = new ImageIcon(this.getClass().getResource("/img/Button tambahkan hover.png")).getImage();
        btn_tambahkan.setIcon(new ImageIcon(iconTambahkanHover));
    }//GEN-LAST:event_btn_tambahkanMouseReleased

    private void btn_tambahkanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahkanMousePressed
        // TODO add your handling code here:
        Image iconTambahkanPressed = new ImageIcon(this.getClass().getResource("/img/Button tambahkan press.png")).getImage();
        btn_tambahkan.setIcon(new ImageIcon(iconTambahkanPressed));
    }//GEN-LAST:event_btn_tambahkanMousePressed

    private void btn_tambahkanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahkanMouseExited
        // TODO add your handling code here:
        Image iconTambahkanDefault = new ImageIcon(this.getClass().getResource("/img/Button tambahkan.png")).getImage();
        btn_tambahkan.setIcon(new ImageIcon(iconTambahkanDefault));
    }//GEN-LAST:event_btn_tambahkanMouseExited

    private void btn_tambahkanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahkanMouseEntered
        // TODO add your handling code here:
        Image iconTambahkanHover = new ImageIcon(this.getClass().getResource("/img/Button tambahkan hover.png")).getImage();
        btn_tambahkan.setIcon(new ImageIcon(iconTambahkanHover));
    }//GEN-LAST:event_btn_tambahkanMouseEntered

    private void txt_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_totalActionPerformed

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
            cancel_search.setVisible(false);
        } else {
            cancel_search.setVisible(true);
        }
    }//GEN-LAST:event_txt_cariKeyReleased

    private void txt_tanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tanggalActionPerformed

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
            java.util.logging.Logger.getLogger(Tampilan_TransaksiJual_kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tampilan_TransaksiJual_kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tampilan_TransaksiJual_kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tampilan_TransaksiJual_kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Tampilan_TransaksiJual_kasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private atsk.Table Tablebarang;
    private atsk.Table Tabletransaksi;
    private javax.swing.JLabel btn_barang;
    private javax.swing.JLabel btn_cari;
    private javax.swing.JLabel btn_hapus;
    private javax.swing.JLabel btn_karyawan;
    private javax.swing.JLabel btn_konfirmasi;
    private javax.swing.JLabel btn_laporan;
    private javax.swing.JLabel btn_pemasok;
    private javax.swing.JLabel btn_pengaturan;
    private javax.swing.JLabel btn_pengeluaran;
    private javax.swing.JLabel btn_riwayat;
    private javax.swing.JLabel btn_tambahkan;
    private javax.swing.JLabel btn_transaksi;
    private javax.swing.JLabel cancel_search;
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private main.PanelShadow panelShadow1;
    private main.PanelShadow panelShadow2;
    private main.PanelShadow panelShadow3;
    private main.PanelShadow panelShadow4;
    private main.PanelShadow panelShadow6;
    private main.PanelShadow panelShadow7;
    private main.PanelShadow panelShadow8;
    private main.PanelShadow panelShadow9;
    private javax.swing.JTextField txt_cari;
    public javax.swing.JTextField txt_harga;
    public javax.swing.JTextField txt_kembalian;
    public javax.swing.JTextField txt_kodebarang;
    public javax.swing.JTextField txt_kodebarcode;
    public javax.swing.JTextField txt_kodetransaksi;
    public javax.swing.JTextField txt_kuantitas;
    public javax.swing.JTextField txt_namabarang;
    public javax.swing.JTextField txt_tanggal;
    public javax.swing.JTextField txt_total;
    public javax.swing.JTextField txt_tunai;
    // End of variables declaration//GEN-END:variables
}
