/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atsk;

import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Popup_Ubah_Karyawan_Shadow extends javax.swing.JFrame {

    /**
     * Creates new form Popup_Tambah_Barang
     */
    int x,y;
    public Popup_Ubah_Karyawan_Shadow() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        kodeakun.setBackground(Color.gray);
        kodeakun.setEditable(false);
        password.setBackground(Color.gray);
    }

    public void simpan() {
        
        String kodeAkun = kodeakun.getText();
        String namaKaryawan = namakaryawan.getText();
        String Username = username.getText();
        
        String Jabatan = jabatan.getSelectedItem().toString();
        
    try {
        String sql = "UPDATE akun SET nama='"+namaKaryawan+"',username ='"+Username+"',role ='"+Jabatan+"' WHERE kd_akun ='"+kodeAkun+"'";
            Connection c = (Connection) Config.configDB();
            PreparedStatement pst = c.prepareStatement(sql);
            pst.execute();
    
            JOptionPane.showMessageDialog(null,"Berhasil ubah data karyawan");
    } catch (Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
   
    }
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
        kodeakun = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        namakaryawan = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jabatan = new combo_suggestion.ComboBoxSuggestion();
        jPanel3 = new javax.swing.JPanel();
        btn_batal = new javax.swing.JLabel();
        btn_bersihkan = new javax.swing.JLabel();
        btn_simpan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(470, 340));
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
        panelShadow1.setPreferredSize(new java.awt.Dimension(480, 350));
        panelShadow1.setShadowOpacity(0.3F);
        panelShadow1.setShadowSize(5);
        panelShadow1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(470, 460));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/txt Ubah Karyawan.png"))); // NOI18N

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

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 70));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Kode Akun");
        jLabel6.setPreferredSize(new java.awt.Dimension(230, 25));
        jPanel9.add(jLabel6);

        kodeakun.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        kodeakun.setPreferredSize(new java.awt.Dimension(198, 34));
        kodeakun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeakunActionPerformed(evt);
            }
        });
        jPanel9.add(kodeakun);

        jPanel8.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Nama Karyawan");
        jLabel7.setPreferredSize(new java.awt.Dimension(230, 25));
        jPanel10.add(jLabel7);

        namakaryawan.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        namakaryawan.setPreferredSize(new java.awt.Dimension(198, 34));
        jPanel10.add(namakaryawan);

        jPanel8.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Username");
        jLabel8.setPreferredSize(new java.awt.Dimension(230, 25));
        jPanel11.add(jLabel8);

        username.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        username.setPreferredSize(new java.awt.Dimension(198, 34));
        jPanel11.add(username);

        jPanel8.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Password");
        jLabel9.setPreferredSize(new java.awt.Dimension(230, 25));
        jPanel12.add(jLabel9);

        password.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        password.setPreferredSize(new java.awt.Dimension(198, 34));
        jPanel12.add(password);

        jPanel8.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Jabatan");
        jLabel10.setPreferredSize(new java.awt.Dimension(230, 25));
        jPanel13.add(jLabel10);

        jabatan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alat Mandi", "Makanan Ringan", "Alat Cuci", "Alat Makan", "Sembako" }));
        jabatan.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jabatan.setPreferredSize(new java.awt.Dimension(198, 34));
        jabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jabatanActionPerformed(evt);
            }
        });
        jPanel13.add(jabatan);

        jPanel8.add(jPanel13);

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 470, 200));

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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 470, -1));

        panelShadow1.add(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void kodeakunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeakunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodeakunActionPerformed

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
        Image iconTambahHover = new ImageIcon(this.getClass().getResource("/img/Button simpan popup hover.png")).getImage();
        btn_simpan.setIcon(new ImageIcon(iconTambahHover));
    }//GEN-LAST:event_btn_simpanMouseEntered

    private void btn_simpanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpanMouseExited
        // TODO add your handling code here:
        Image iconSimpanDefault = new ImageIcon(this.getClass().getResource("/img/Button simpan popup.png")).getImage();
        btn_simpan.setIcon(new ImageIcon(iconSimpanDefault));
    }//GEN-LAST:event_btn_simpanMouseExited

    private void btn_simpanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpanMousePressed
        // TODO add your handling code here:
        Image iconSimpanPressed = new ImageIcon(this.getClass().getResource("/img/Button simpan popup press.png")).getImage();
        btn_simpan.setIcon(new ImageIcon(iconSimpanPressed));
    }//GEN-LAST:event_btn_simpanMousePressed

    private void btn_simpanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpanMouseReleased
        // TODO add your handling code here:
        Image iconSimpanHover = new ImageIcon(this.getClass().getResource("/img/Button simpan popup hover.png")).getImage();
        btn_simpan.setIcon(new ImageIcon(iconSimpanHover));
    }//GEN-LAST:event_btn_simpanMouseReleased

    private void btn_bersihkanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bersihkanMouseClicked
        
        namakaryawan.setText("");
        username.setText("");
       
        jabatan.setSelectedItem("");
    }//GEN-LAST:event_btn_bersihkanMouseClicked

    private void btn_simpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpanMouseClicked
       simpan();
       this.dispose();
    }//GEN-LAST:event_btn_simpanMouseClicked

    private void jabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jabatanActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jabatanActionPerformed

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
            java.util.logging.Logger.getLogger(Popup_Ubah_Karyawan_Shadow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Popup_Ubah_Karyawan_Shadow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Popup_Ubah_Karyawan_Shadow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Popup_Ubah_Karyawan_Shadow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Popup_Ubah_Karyawan_Shadow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_batal;
    private javax.swing.JLabel btn_bersihkan;
    private javax.swing.JLabel btn_simpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public combo_suggestion.ComboBoxSuggestion jabatan;
    public javax.swing.JTextField kodeakun;
    public javax.swing.JTextField namakaryawan;
    private main.PanelShadow panelShadow1;
    public javax.swing.JTextField password;
    public javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
