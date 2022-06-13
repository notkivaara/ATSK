/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atsk;

import atsk.laporanBulanan.Tampilan_Laporan;
import atsk.Tampilan_TransaksiJual;
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class Tampilan_TransaksiBeli extends javax.swing.JFrame {

    /**
     * Creates new form TampilanBarang
     */
    public Tampilan_TransaksiBeli() {
        initComponents();
        kdPemasok();
        table();
        autonumber();
        tanggal();
        kodebeli.setBackground(Color.gray);
        TextPrompt cari = new TextPrompt("Cari Berdasarkan Nama Barang", txt_cari);
        tb_transaksibeli.fixTable(jScrollPane2);
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
    

    public void kdPemasok(){
	
	kodepemasokcomboBox.removeAllItems();
	    try{
		    String sql = "select kd_supplier from supplier order by kd_supplier asc";
                   Connection conn = (Connection) Config.configDB();
		    PreparedStatement pst=conn.prepareStatement(sql);
		    ResultSet rs=pst.executeQuery();
		    while(rs.next()){
			
			kodepemasokcomboBox.addItem(rs.getString(1));
		    }
	    }catch(Exception e){
	    }
    }
    public void reset(){
        kodepemasokcomboBox.setSelectedItem("SP0001");
        namabrg.setText("");
        kodebrg.setText("");
        kuantitas.setText("");
        total_harga.setText("");
        Tunai.setText("");
        kembali.setText("");
    }
    public void tanggal() {
        long millis = System.currentTimeMillis();
        Timestamp timestamp = new Timestamp(millis);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String formatedStrDate = sdf.format(timestamp);
        tanggal.setText(formatedStrDate);
    }
    private void autonumber(){
        try {
            Connection c = (Connection) Config.configDB();
            Statement s = c.createStatement();
            String sql = "SELECT MAX(kd_beli) as kd_beli FROM transaksi_beli";
            ResultSet r = s.executeQuery(sql);
            if (r.next()) {
                String NoFaktur = r.getString("kd_beli").substring(2);
                String TR = "" +(Integer.parseInt(NoFaktur)+1);
                String Nol = "";
                
                if(TR.length()==1)
                {Nol = "000";}
                else if(TR.length()==2)
                {Nol = "00";}
                else if(TR.length()==3)
                {Nol = "0";}
                else if(TR.length()==4)
                {Nol = "";}
                kodebeli.setText("TB" + Nol + TR);
                } else {
                kodebeli.setText("TB0001");
                }
                r.close();
                s.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    public void jumlahBiaya(){
        int total = Integer.parseInt(total_harga.getText());
        int bayar = Integer.parseInt(Tunai.getText());

        int Kembali = bayar - total;
        if (Kembali >= 0){
            kembali.setText(String.valueOf(Kembali));
        } else {
            kembali.setText(String.valueOf("0"));
        }

    }
    
    public void table() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Kode Barang");
        tbl.addColumn("Nama Barang");
        tbl.addColumn("Kategori");
        tbl.addColumn("Tanggal Pembelian");
        tbl.addColumn("Harga Beli");
        tbl.addColumn("Harga Jual");
        tbl.addColumn("Stok");
        tbl.addColumn("Return");
                
        String cari = txt_cari.getText();
        
        try {
            Statement st = (Statement) Config.configDB().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM barang WHERE nama_brg "
                    + "LIKE '%" + cari + "%'");
    
            while (rs.next()) {
                tbl.addRow(new Object[]{
                    rs.getString("kd_brg"),
                    rs.getString("nama_brg"),
                    rs.getString("kategori"),
                    rs.getString("waktu_penambahan"),
                    rs.getString("hrg_beli_brg"),
                    rs.getString("hrg_jual_brg"),
                    rs.getString("stock"),
                    rs.getString("retur"),});    
                 tb_transaksibeli.setModel(tbl);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
            
    }
    
    public void search() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Kode Barang");
        tbl.addColumn("Nama Barang");
        tbl.addColumn("Kategori");
        tbl.addColumn("Tanggal Pembelian");
        tbl.addColumn("Harga Beli");
        tbl.addColumn("Harga Jual");
        tbl.addColumn("Stok");
        tbl.addColumn("Return");
        
            String cari = txt_cari.getText();
        
        try {
                String sql = "SELECT * FROM `barang` WHERE nama_brg LIKE '%" + cari + "%'";
                Connection c = (Connection) Config.configDB();
                Statement st = c.createStatement();
                ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                tbl.addRow(new Object[]{
                    rs.getString("kd_brg"),
                    rs.getString("nama_brg"),
                    rs.getString("kategori"),
                    rs.getString("waktu_penambahan"),
                    rs.getString("hrg_beli_brg"),
                    rs.getString("hrg_jual_brg"),
                    rs.getString("stock"),
                    rs.getString("retur"),});    
                    tb_transaksibeli.setModel(tbl);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
    
     public void tambah(){
            
            
            String Kode_Pemasok = kodepemasokcomboBox.getSelectedItem().toString();
            String Kode_brg = kodebrg.getText();
            String nama_brg = namabrg.getText();
            String total_hrg = total_harga.getText();
            String tunai = Tunai.getText();
            
            
            
            try {
              String sql = "INSERT into transaksi_beli values('"+kodebeli.getText()+"','"+Kode_Pemasok+"','"+tanggal.getText()+"','"+total_hrg+"','"+tunai+"','"+kembali.getText()+"')";
              
            Connection c = (Connection)Config.configDB();
            PreparedStatement pst = c.prepareStatement(sql);  
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Menambahkan Data Pembelian");
            
            }catch (Exception e){
           JOptionPane.showMessageDialog(this, e.getMessage());
            }
        

           try {
          String sqll = "INSERT into detail_transaksi_beli values('"+kodebeli.getText()+"','"+Kode_brg+"','"+kuantitas.getText()+"')";
          Connection cc = (Connection)Config.configDB();
            PreparedStatement pst = cc.prepareStatement(sqll);  
            pst.execute();
                   
       
            }catch (Exception ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
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
        jPanel6 = new javax.swing.JPanel();
        panelShadow5 = new main.PanelShadow();
        jLabel4 = new javax.swing.JLabel();
        btn_riwayatJual = new javax.swing.JLabel();
        panelShadow4 = new main.PanelShadow();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        kodebeli = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        kembali = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Tunai = new javax.swing.JTextField();
        total_harga = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        namabrg = new javax.swing.JTextField();
        kode = new javax.swing.JLabel();
        kodebrg = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        kuantitas = new javax.swing.JTextField();
        tanggal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        kodepemasokcomboBox = new combo_suggestion.ComboBoxSuggestion();
        btn_tambah = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        panelShadow1 = new main.PanelShadow();
        jLabel3 = new javax.swing.JLabel();
        txt_cari = new javax.swing.JTextField();
        cancel_search = new javax.swing.JLabel();
        panelShadow3 = new main.PanelShadow();
        kategoriComboSearch = new combo_suggestion.ComboBoxSuggestion();
        btn_cari = new javax.swing.JLabel();
        panelShadow2 = new main.PanelShadow();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_transaksibeli = new atsk.Table();
        btn_bersihkan = new javax.swing.JLabel();
        btn_bersihkann = new javax.swing.JLabel();

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

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 0));

        panelShadow5.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow5.setPreferredSize(new java.awt.Dimension(800, 44));
        panelShadow5.setShadowColor(new java.awt.Color(209, 223, 245));
        panelShadow5.setShadowOpacity(0.5F);
        panelShadow5.setShadowSize(1);
        panelShadow5.setShadowType(main.ShadowType.BOT);
        panelShadow5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 0));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/txt Transaksi Beli aktif.png"))); // NOI18N
        panelShadow5.add(jLabel4);

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
        panelShadow5.add(btn_riwayatJual);

        jPanel6.add(panelShadow5);

        panelShadow4.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow4.setShadowColor(new java.awt.Color(209, 223, 245));
        panelShadow4.setShadowOpacity(1.0F);
        panelShadow4.setShadowSize(5);

        jPanel4.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Kode Beli");
        jLabel6.setPreferredSize(new java.awt.Dimension(397, 34));

        kodebeli.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        kodebeli.setPreferredSize(new java.awt.Dimension(200, 34));
        kodebeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodebeliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kodebeli, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(kodebeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.setOpaque(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jPanel10.setOpaque(false);
        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jPanel11.setOpaque(false);
        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setText("Kembali");
        jLabel14.setPreferredSize(new java.awt.Dimension(397, 34));

        kembali.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        kembali.setPreferredSize(new java.awt.Dimension(200, 34));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setText("Tunai");
        jLabel15.setPreferredSize(new java.awt.Dimension(397, 34));

        Tunai.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Tunai.setPreferredSize(new java.awt.Dimension(200, 34));
        Tunai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TunaiKeyReleased(evt);
            }
        });

        total_harga.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        total_harga.setPreferredSize(new java.awt.Dimension(200, 34));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setText("Total Harga");
        jLabel13.setPreferredSize(new java.awt.Dimension(397, 34));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setText("Tanggal");
        jLabel12.setPreferredSize(new java.awt.Dimension(397, 34));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel16.setText("Nama Barang");
        jLabel16.setPreferredSize(new java.awt.Dimension(397, 34));

        namabrg.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        namabrg.setPreferredSize(new java.awt.Dimension(200, 34));
        namabrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namabrgActionPerformed(evt);
            }
        });

        kode.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        kode.setText("  Kode Barang");
        kode.setPreferredSize(new java.awt.Dimension(397, 34));

        kodebrg.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        kodebrg.setPreferredSize(new java.awt.Dimension(200, 34));
        kodebrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodebrgActionPerformed(evt);
            }
        });
        kodebrg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                kodebrgKeyReleased(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel19.setText("Kuantitas");
        jLabel19.setPreferredSize(new java.awt.Dimension(397, 34));

        kuantitas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        kuantitas.setPreferredSize(new java.awt.Dimension(200, 34));
        kuantitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kuantitasActionPerformed(evt);
            }
        });

        tanggal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tanggal.setPreferredSize(new java.awt.Dimension(200, 34));
        tanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Kode Pemasok");
        jLabel7.setPreferredSize(new java.awt.Dimension(397, 34));

        kodepemasokcomboBox.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        kodepemasokcomboBox.setPreferredSize(new java.awt.Dimension(200, 34));

        javax.swing.GroupLayout panelShadow4Layout = new javax.swing.GroupLayout(panelShadow4);
        panelShadow4.setLayout(panelShadow4Layout);
        panelShadow4Layout.setHorizontalGroup(
            panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow4Layout.createSequentialGroup()
                .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelShadow4Layout.createSequentialGroup()
                        .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelShadow4Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelShadow4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(kode, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kodebrg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelShadow4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelShadow4Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kodepemasokcomboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelShadow4Layout.createSequentialGroup()
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(kuantitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelShadow4Layout.createSequentialGroup()
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addGap(73, 73, 73)
                                    .addComponent(kembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelShadow4Layout.createSequentialGroup()
                                    .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Tunai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panelShadow4Layout.createSequentialGroup()
                                            .addComponent(total_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addGap(1, 1, 1))))
                                .addComponent(namabrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelShadow4Layout.createSequentialGroup()
                                    .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelShadow4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelShadow4Layout.setVerticalGroup(
            panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kodepemasokcomboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelShadow4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(namabrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelShadow4Layout.createSequentialGroup()
                        .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kodebrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panelShadow4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(kuantitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tunai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelShadow4Layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(311, Short.MAX_VALUE)))
        );

        btn_tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Button tambah Beli.png"))); // NOI18N
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

        jPanel13.setOpaque(false);
        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 0));

        panelShadow1.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow1.setPreferredSize(new java.awt.Dimension(560, 52));
        panelShadow1.setShadowColor(new java.awt.Color(209, 223, 245));
        panelShadow1.setShadowOpacity(0.5F);
        panelShadow1.setShadowSize(1);
        panelShadow1.setShadowType(main.ShadowType.BOT);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconCari(1080).png"))); // NOI18N

        txt_cari.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_cari.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_cari.setBorder(null);
        txt_cari.setPreferredSize(new java.awt.Dimension(387, 49));
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
                .addComponent(txt_cari, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(cancel_search, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_cari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancel_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jPanel13.add(panelShadow1);

        panelShadow3.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow3.setPreferredSize(new java.awt.Dimension(150, 52));
        panelShadow3.setShadowColor(new java.awt.Color(209, 223, 245));
        panelShadow3.setShadowOpacity(0.5F);
        panelShadow3.setShadowSize(1);
        panelShadow3.setShadowType(main.ShadowType.BOT);
        panelShadow3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        kategoriComboSearch.setBorder(null);
        kategoriComboSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kategori", "Alat Mandi", "Makanan Ringan", "Alat Cuci", "Alat Makan", "Sembako" }));
        kategoriComboSearch.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        kategoriComboSearch.setPreferredSize(new java.awt.Dimension(145, 49));
        kategoriComboSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kategoriComboSearchActionPerformed(evt);
            }
        });
        panelShadow3.add(kategoriComboSearch);

        jPanel13.add(panelShadow3);

        btn_cari.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Button refresh.png"))); // NOI18N
        btn_cari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cariMouseClicked(evt);
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
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_cariMouseReleased(evt);
            }
        });
        jPanel13.add(btn_cari);

        panelShadow2.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow2.setShadowColor(new java.awt.Color(209, 223, 245));
        panelShadow2.setShadowOpacity(1.0F);
        panelShadow2.setShadowSize(5);
        panelShadow2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));

        jScrollPane2.setBorder(null);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(770, 240));

        tb_transaksibeli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Barang", "Nama Barang", "Kategori", "Tanggal Penambahan", "Harga Beli", "Harga Jual", "Stok", "Return"
            }
        ));
        tb_transaksibeli.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tb_transaksibeli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_transaksibeliMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_transaksibeli);

        panelShadow2.add(jScrollPane2);

        btn_bersihkan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button bersihkan popup.png"))); // NOI18N
        btn_bersihkan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_bersihkanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_bersihkanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_bersihkanMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_bersihkanMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_bersihkanMouseReleased(evt);
            }
        });

        btn_bersihkann.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button bersihkan popup.png"))); // NOI18N
        btn_bersihkann.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_bersihkannMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_bersihkannMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_bersihkannMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_bersihkannMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_bersihkannMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(panelShadow4, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_bersihkann)
                            .addComponent(btn_tambah)))))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btn_bersihkan)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btn_tambah)
                        .addGap(15, 15, 15)
                        .addComponent(btn_bersihkann))
                    .addComponent(panelShadow4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(panelShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btn_bersihkan)
                    .addGap(0, 0, Short.MAX_VALUE)))
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
        };

        dispose();
    }//GEN-LAST:event_btn_pengeluaranMouseClicked

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

    private void btn_karyawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_karyawanMouseClicked
        // TODO add your handling code here:
        Tampilan_Karyawan karyawan = new Tampilan_Karyawan();
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
                    karyawan.passData(kd_akun);
                    karyawan.show();
                    this.setVisible(false);


                }
                else if(role.equals("Kasir")){
                    karyawan.passData(kd_akun);
                    karyawan.show();;
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
    }//GEN-LAST:event_btn_karyawanMouseClicked

    private void btn_pengaturanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pengaturanMouseClicked
        // TODO add your handling code here:
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
                    transaksiJual.passData(kd_akun);
                    transaksiJual.show();
                    this.setVisible(false);


                }
                else if(role.equals("Kasir")){
                    transaksiJual.passData(kd_akun);
                    transaksiJual.show();;
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
    }//GEN-LAST:event_btn_riwayatJualMouseClicked

    private void btn_tambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMouseEntered
        // TODO add your handling code here:
        Image iconTambahHover = new ImageIcon(this.getClass().getResource("/img/Button tambah Beli hover.png")).getImage();
        btn_tambah.setIcon(new ImageIcon(iconTambahHover));
    }//GEN-LAST:event_btn_tambahMouseEntered

    private void btn_tambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMouseExited
        // TODO add your handling code here:
        Image iconTambahDefault = new ImageIcon(this.getClass().getResource("/img/Button tambah Beli.png")).getImage();
        btn_tambah.setIcon(new ImageIcon(iconTambahDefault));
    }//GEN-LAST:event_btn_tambahMouseExited

    private void btn_tambahMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMousePressed
        // TODO add your handling code here:
        Image iconTambahPressed = new ImageIcon(this.getClass().getResource("/img/Button tambah Beli press.png")).getImage();
        btn_tambah.setIcon(new ImageIcon(iconTambahPressed));
    }//GEN-LAST:event_btn_tambahMousePressed

    private void btn_tambahMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMouseReleased
        // TODO add your handling code here:
        Image iconTambahHover = new ImageIcon(this.getClass().getResource("/img/Button tambah Beli hover.png")).getImage();
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
        try {
            String sql = "SELECT * FROM `akun` WHERE kd_akun = '"+ kodeAkun +"';";
            Connection conn = (Connection) Config.configDB();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            if (rs.next()) {
                
                String kd_akun = rs.getString("kd_akun");
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

    private void namabrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namabrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namabrgActionPerformed

    private void kodebrgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kodebrgKeyReleased

    }//GEN-LAST:event_kodebrgKeyReleased

    private void kuantitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kuantitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kuantitasActionPerformed

    private void kodebeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodebeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodebeliActionPerformed

    private void btn_bersihkanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bersihkanMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_bersihkanMouseClicked

    private void btn_bersihkanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bersihkanMouseEntered
        // TODO add your handling code here:
        Image iconBersihkanHover = new ImageIcon(this.getClass().getResource("/img/button bersihkan popup hover.png")).getImage();
        btn_bersihkan.setIcon(new ImageIcon(iconBersihkanHover));
    }//GEN-LAST:event_btn_bersihkanMouseEntered

    private void btn_bersihkanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bersihkanMouseExited
        // TODO add your handling code here:
        Image iconBersihkanDefault = new ImageIcon(this.getClass().getResource("/img/button bersihkan popup.png")).getImage();
        btn_bersihkan.setIcon(new ImageIcon(iconBersihkanDefault));
    }//GEN-LAST:event_btn_bersihkanMouseExited

    private void btn_bersihkanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bersihkanMousePressed
        // TODO add your handling code here:
        Image iconBersihkanPressed = new ImageIcon(this.getClass().getResource("/img/button bersihkan popup press.png")).getImage();
        btn_bersihkan.setIcon(new ImageIcon(iconBersihkanPressed));
    }//GEN-LAST:event_btn_bersihkanMousePressed

    private void btn_bersihkanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bersihkanMouseReleased
        // TODO add your handling code here:
        Image iconBersihkanHover = new ImageIcon(this.getClass().getResource("/img/button bersihkan popup hover.png")).getImage();
        btn_bersihkan.setIcon(new ImageIcon(iconBersihkanHover));
    }//GEN-LAST:event_btn_bersihkanMouseReleased

    private void btn_bersihkannMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bersihkannMouseClicked
        namabrg.setText("");
        kodebrg.setText("");
        kuantitas.setText("");
        total_harga.setText("");
        Tunai.setText("");
        kembali.setText("");
        
    }//GEN-LAST:event_btn_bersihkannMouseClicked

    private void btn_bersihkannMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bersihkannMouseEntered
        // TODO add your handling code here:
        Image iconBersihkanHover = new ImageIcon(this.getClass().getResource("/img/button bersihkan popup hover.png")).getImage();
        btn_bersihkan.setIcon(new ImageIcon(iconBersihkanHover));
    }//GEN-LAST:event_btn_bersihkannMouseEntered

    private void btn_bersihkannMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bersihkannMouseExited
        // TODO add your handling code here:
        Image iconBersihkanDefault = new ImageIcon(this.getClass().getResource("/img/button bersihkan popup.png")).getImage();
        btn_bersihkan.setIcon(new ImageIcon(iconBersihkanDefault));
    }//GEN-LAST:event_btn_bersihkannMouseExited

    private void btn_bersihkannMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bersihkannMousePressed
        // TODO add your handling code here:
        Image iconBersihkanPressed = new ImageIcon(this.getClass().getResource("/img/button bersihkan popup press.png")).getImage();
        btn_bersihkan.setIcon(new ImageIcon(iconBersihkanPressed));
    }//GEN-LAST:event_btn_bersihkannMousePressed

    private void btn_bersihkannMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bersihkannMouseReleased
        // TODO add your handling code here:
        Image iconBersihkanHover = new ImageIcon(this.getClass().getResource("/img/button bersihkan popup hover.png")).getImage();
        btn_bersihkan.setIcon(new ImageIcon(iconBersihkanHover));
    }//GEN-LAST:event_btn_bersihkannMouseReleased

    private void kategoriComboSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kategoriComboSearchActionPerformed
      DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Kode Barang");
        tbl.addColumn("Nama Barang");
        tbl.addColumn("Kategori");
        tbl.addColumn("Tanggal Pembelian");
        tbl.addColumn("Harga Beli");
        tbl.addColumn("Harga Jual");
        tbl.addColumn("Stok");
        tbl.addColumn("Return");
        
        String cari = txt_cari.getText();
        String kategori = kategoriComboSearch.getSelectedItem().toString();
        String sql = "";
         try {
              if (kategori.equals("Kategori")) {
                  sql = "select * from barang where nama_brg like '%"+cari+"%'";
              }else{
                  sql = "select * from barang where kategori like '%"+kategori+"%'";
              }
            Connection c = (Connection) Config.configDB();
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                tbl.addRow(new Object[]{
                    rs.getString("kd_brg"),
                    rs.getString("nama_brg"),
                    rs.getString("kategori"),
                    rs.getString("waktu_penambahan"),
                    rs.getString("hrg_beli_brg"),
                    rs.getString("hrg_jual_brg"),
                    rs.getString("stock"),
                    rs.getString("retur"),
                });    
                    tb_transaksibeli.setModel(tbl);

            }
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_kategoriComboSearchActionPerformed

    private void btn_tambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMouseClicked
        
        tambah();
        reset();
        autonumber();
        
    }//GEN-LAST:event_btn_tambahMouseClicked

    private void TunaiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TunaiKeyReleased
       jumlahBiaya();
    }//GEN-LAST:event_TunaiKeyReleased

    private void btn_cariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cariMouseClicked
        table();
    }//GEN-LAST:event_btn_cariMouseClicked

    private void tanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalActionPerformed
        
    }//GEN-LAST:event_tanggalActionPerformed

    private void tb_transaksibeliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_transaksibeliMouseClicked
       kodebrg.setText(tb_transaksibeli.getValueAt(tb_transaksibeli.getSelectedRow(),0).toString());
       namabrg.setText(tb_transaksibeli.getValueAt(tb_transaksibeli.getSelectedRow(),1).toString());
    }//GEN-LAST:event_tb_transaksibeliMouseClicked

    private void kodebrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodebrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodebrgActionPerformed

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
    private javax.swing.JTextField Tunai;
    private javax.swing.JLabel btn_barang;
    private javax.swing.JLabel btn_bersihkan;
    private javax.swing.JLabel btn_bersihkann;
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
    private javax.swing.JLabel cancel_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private combo_suggestion.ComboBoxSuggestion kategoriComboSearch;
    private javax.swing.JTextField kembali;
    private javax.swing.JLabel kode;
    private javax.swing.JTextField kodebeli;
    private javax.swing.JTextField kodebrg;
    private combo_suggestion.ComboBoxSuggestion kodepemasokcomboBox;
    private javax.swing.JTextField kuantitas;
    private javax.swing.JTextField namabrg;
    private main.PanelShadow panelShadow1;
    private main.PanelShadow panelShadow2;
    private main.PanelShadow panelShadow3;
    private main.PanelShadow panelShadow4;
    private main.PanelShadow panelShadow5;
    private javax.swing.JTextField tanggal;
    private atsk.Table tb_transaksibeli;
    private javax.swing.JTextField total_harga;
    private javax.swing.JTextField txt_cari;
    // End of variables declaration//GEN-END:variables
}
