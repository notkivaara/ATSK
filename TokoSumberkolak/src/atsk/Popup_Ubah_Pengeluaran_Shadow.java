/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atsk;

import static atsk.Popup_Ubah_Barang_Shadow.kodeLama;
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Popup_Ubah_Pengeluaran_Shadow extends javax.swing.JFrame {

    /**
     * Creates new form Popup_Tambah_Barang
     */
    int x,y;
    public Popup_Ubah_Pengeluaran_Shadow() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        txt_kdPengeluaran.setBackground(Color.gray);
        txt_kdPengeluaran.setEditable(false);
        
    }
    public void ubah(){
       
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String kode_pengeluaran = txt_kdPengeluaran.getText();
        String nama = txt_namaPengeluaran.getText();
        String tanggal_bayar = sdf.format(date_tanggalBayar.getDate());
        String bulan = bulanCombo.getSelectedItem().toString();
        String tahun = txt_tahun.getText();
        String total = txt_total.getText();
        System.out.println(tanggal_bayar);

        try {
            String sql = "Update pengeluaran SET nama= '"+nama+ "'"
                    +",tgl_bayar ='"+tanggal_bayar+"'"
                    +",bulan ='"+bulan+"'"
                    +",tahun = '"+tahun+"'"
                    +",total = '"+total+"'"
                    +"where kd_pengeluaran = '"+kode_pengeluaran+"'";
                
                   
                   
            Connection c = (Connection) Config.configDB();
            PreparedStatement pst = c.prepareStatement(sql);
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Berhasil ubah pengeluaran");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
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

        panelShadow1 = new main.PanelShadow();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_kdPengeluaran = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txt_namaPengeluaran = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        date_tanggalBayar = new com.toedter.calendar.JDateChooser();
        jPanel12 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        bulanCombo = new combo_suggestion.ComboBoxSuggestion();
        jPanel13 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txt_tahun = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btn_batal = new javax.swing.JLabel();
        btn_bersihkan = new javax.swing.JLabel();
        btn_simpan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(470, 420));
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        panelShadow1.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow1.setPreferredSize(new java.awt.Dimension(480, 400));
        panelShadow1.setShadowOpacity(0.3F);
        panelShadow1.setShadowSize(5);
        panelShadow1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(470, 420));
        jPanel1.setPreferredSize(new java.awt.Dimension(470, 373));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/txt Ubah Pengeluaran.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Kode Pengeluaran");
        jLabel6.setPreferredSize(new java.awt.Dimension(230, 25));
        jPanel9.add(jLabel6);

        txt_kdPengeluaran.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_kdPengeluaran.setPreferredSize(new java.awt.Dimension(198, 34));
        txt_kdPengeluaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kdPengeluaranActionPerformed(evt);
            }
        });
        jPanel9.add(txt_kdPengeluaran);

        jPanel8.add(jPanel9);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setText("Nama Pengeluaran");
        jLabel13.setPreferredSize(new java.awt.Dimension(230, 25));
        jPanel16.add(jLabel13);

        txt_namaPengeluaran.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_namaPengeluaran.setPreferredSize(new java.awt.Dimension(198, 34));
        txt_namaPengeluaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaPengeluaranActionPerformed(evt);
            }
        });
        jPanel16.add(txt_namaPengeluaran);

        jPanel8.add(jPanel16);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Tanggal Bayar");
        jLabel8.setPreferredSize(new java.awt.Dimension(230, 25));
        jPanel11.add(jLabel8);

        date_tanggalBayar.setBackground(new java.awt.Color(255, 255, 255));
        date_tanggalBayar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        date_tanggalBayar.setPreferredSize(new java.awt.Dimension(198, 34));
        jPanel11.add(date_tanggalBayar);

        jPanel8.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Bulan");
        jLabel9.setPreferredSize(new java.awt.Dimension(230, 25));
        jPanel12.add(jLabel9);

        bulanCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Januari", "Pebruari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        bulanCombo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        bulanCombo.setPreferredSize(new java.awt.Dimension(198, 34));
        bulanCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bulanComboActionPerformed(evt);
            }
        });
        jPanel12.add(bulanCombo);

        jPanel8.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Tahun");
        jLabel10.setPreferredSize(new java.awt.Dimension(230, 25));
        jPanel13.add(jLabel10);

        txt_tahun.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_tahun.setPreferredSize(new java.awt.Dimension(198, 34));
        jPanel13.add(txt_tahun);

        jPanel8.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setText("Total");
        jLabel11.setPreferredSize(new java.awt.Dimension(230, 25));
        jPanel14.add(jLabel11);

        txt_total.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_total.setPreferredSize(new java.awt.Dimension(198, 34));
        jPanel14.add(txt_total);

        jPanel8.add(jPanel14);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 22, 0));

        btn_batal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button batal popup.png"))); // NOI18N
        btn_batal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_batalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_batalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_batalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_batalMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_batalMouseReleased(evt);
            }
        });
        jPanel3.add(btn_batal);

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
        jPanel3.add(btn_bersihkan);

        btn_simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Button simpan popup.png"))); // NOI18N
        btn_simpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_simpanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_simpanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_simpanMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_simpanMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_simpanMouseReleased(evt);
            }
        });
        jPanel3.add(btn_simpan);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        panelShadow1.add(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx-x, yy-y);
    }//GEN-LAST:event_formMouseDragged

    private void txt_kdPengeluaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kdPengeluaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kdPengeluaranActionPerformed

    private void txt_namaPengeluaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaPengeluaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaPengeluaranActionPerformed

    private void btn_batalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_batalMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_batalMouseClicked

    private void btn_batalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_batalMouseEntered
        // TODO add your handling code here:
        Image iconBatalHover = new ImageIcon(this.getClass().getResource("/img/button batal popup hover.png")).getImage();
        btn_batal.setIcon(new ImageIcon(iconBatalHover));
    }//GEN-LAST:event_btn_batalMouseEntered

    private void btn_batalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_batalMouseExited
        // TODO add your handling code here:
        Image iconBatalDefault = new ImageIcon(this.getClass().getResource("/img/button batal popup.png")).getImage();
        btn_batal.setIcon(new ImageIcon(iconBatalDefault));
    }//GEN-LAST:event_btn_batalMouseExited

    private void btn_batalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_batalMousePressed
        // TODO add your handling code here:
        Image iconBatalPressed = new ImageIcon(this.getClass().getResource("/img/button batal popup press.png")).getImage();
        btn_batal.setIcon(new ImageIcon(iconBatalPressed));
    }//GEN-LAST:event_btn_batalMousePressed

    private void btn_batalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_batalMouseReleased
        // TODO add your handling code here:
        Image iconBatalHover = new ImageIcon(this.getClass().getResource("/img/button batal popup hover.png")).getImage();
        btn_batal.setIcon(new ImageIcon(iconBatalHover));
    }//GEN-LAST:event_btn_batalMouseReleased

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

    private void btn_simpanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpanMouseEntered
        // TODO add your handling code here:
        Image iconSimpanHover = new ImageIcon(this.getClass().getResource("/img/button simpan popup hover.png")).getImage();
        btn_simpan.setIcon(new ImageIcon(iconSimpanHover));
    }//GEN-LAST:event_btn_simpanMouseEntered

    private void btn_simpanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpanMouseExited
        // TODO add your handling code here:
        Image iconSimpanDefault = new ImageIcon(this.getClass().getResource("/img/button simpan popup.png")).getImage();
        btn_simpan.setIcon(new ImageIcon(iconSimpanDefault));
    }//GEN-LAST:event_btn_simpanMouseExited

    private void btn_simpanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpanMousePressed
        // TODO add your handling code here:
        Image iconSimpanPressed = new ImageIcon(this.getClass().getResource("/img/button simpan popup press.png")).getImage();
        btn_simpan.setIcon(new ImageIcon(iconSimpanPressed));
    }//GEN-LAST:event_btn_simpanMousePressed

    private void btn_simpanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpanMouseReleased
        // TODO add your handling code here:
        Image iconSimpanHover = new ImageIcon(this.getClass().getResource("/img/button simpan popup hover.png")).getImage();
        btn_simpan.setIcon(new ImageIcon(iconSimpanHover));
    }//GEN-LAST:event_btn_simpanMouseReleased

    private void bulanComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bulanComboActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_bulanComboActionPerformed

    private void btn_simpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpanMouseClicked
        // TODO add your handling code here:
        ubah();
        this.dispose();
    }//GEN-LAST:event_btn_simpanMouseClicked

    private void btn_bersihkanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bersihkanMouseClicked
        // TODO add your handling code here:
        txt_kdPengeluaran.setText("");
        txt_namaPengeluaran.setText("");
        Date date = new Date();
        date_tanggalBayar.setDate(date);
        bulanCombo.setSelectedItem("Januari");
        txt_tahun.setText("");
        txt_total.setText("");
    }//GEN-LAST:event_btn_bersihkanMouseClicked

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
            java.util.logging.Logger.getLogger(Popup_Ubah_Pengeluaran_Shadow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Popup_Ubah_Pengeluaran_Shadow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Popup_Ubah_Pengeluaran_Shadow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Popup_Ubah_Pengeluaran_Shadow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Popup_Ubah_Pengeluaran_Shadow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_batal;
    private javax.swing.JLabel btn_bersihkan;
    private javax.swing.JLabel btn_simpan;
    public combo_suggestion.ComboBoxSuggestion bulanCombo;
    public com.toedter.calendar.JDateChooser date_tanggalBayar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private main.PanelShadow panelShadow1;
    public javax.swing.JTextField txt_kdPengeluaran;
    public javax.swing.JTextField txt_namaPengeluaran;
    public javax.swing.JTextField txt_tahun;
    public javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
