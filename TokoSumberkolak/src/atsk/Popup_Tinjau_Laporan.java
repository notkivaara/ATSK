/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atsk;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author ACER
 */
public class Popup_Tinjau_Laporan extends javax.swing.JFrame {

    /**
     * Creates new form Popup_Tinjau_Laporan
     */
    int x,y;
    public Popup_Tinjau_Laporan() {
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

        panelRound2 = new atsk.panelRound();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        javax.swing.JTable jTable2 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        bulan = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_pendapatanKotor1 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_pendapatanKotor3 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_pendapatanKotor2 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_pendapatanKotor = new javax.swing.JTextField();
        btn_cetak = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setRoundBottomLeft(6);
        panelRound2.setRoundBottomRight(6);
        panelRound2.setRoundTopLeft(6);
        panelRound2.setRoundTopRight(6);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/txt Laporan Bulanan.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(800, 30));
        panelRound2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

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
                "Kode Pengeluaran", "Kode Detail Pengeluaran", "Nama Pengeluaran", "Tanggal Bayar", "Bulan", "Tahun", "Total"
            }
        ));
        jTable2.setGridColor(new java.awt.Color(204, 204, 204));
        jTable2.setRowHeight(40);
        jTable2.setSelectionBackground(new java.awt.Color(216, 225, 238));
        jScrollPane2.setViewportView(jTable2);

        panelRound2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 760, 260));

        jPanel6.setMinimumSize(new java.awt.Dimension(96, 100));
        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        bulan.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        bulan.setBorder(null);
        bulan.setMinimumSize(new java.awt.Dimension(96, 60));
        bulan.setPreferredSize(new java.awt.Dimension(200, 42));
        bulan.setRequestFocusEnabled(false);
        bulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bulanActionPerformed(evt);
            }
        });
        jPanel6.add(bulan);

        panelRound2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 800, 35));
        panelRound2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 755, 10));

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/txt Pendapatan Kotor.png"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(481, 42));
        jPanel7.add(jLabel3);

        txt_pendapatanKotor1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txt_pendapatanKotor1.setPreferredSize(new java.awt.Dimension(274, 42));
        jPanel7.add(txt_pendapatanKotor1);

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/txt Pendapatan Kotor.png"))); // NOI18N
        jLabel6.setPreferredSize(new java.awt.Dimension(481, 42));
        jPanel8.add(jLabel6);

        txt_pendapatanKotor3.setPreferredSize(new java.awt.Dimension(274, 42));
        jPanel8.add(txt_pendapatanKotor3);

        jPanel7.add(jPanel8);

        panelRound2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 800, 42));

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/txt Total Pengeluaran.png"))); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(481, 42));
        jPanel9.add(jLabel4);

        txt_pendapatanKotor2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txt_pendapatanKotor2.setPreferredSize(new java.awt.Dimension(274, 42));
        txt_pendapatanKotor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pendapatanKotor2ActionPerformed(evt);
            }
        });
        jPanel9.add(txt_pendapatanKotor2);

        panelRound2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 800, 42));

        jPanel10.setOpaque(false);
        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/txt Pendapatan Bersih.png"))); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(481, 42));
        jPanel10.add(jLabel5);

        txt_pendapatanKotor.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txt_pendapatanKotor.setPreferredSize(new java.awt.Dimension(274, 42));
        txt_pendapatanKotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pendapatanKotorActionPerformed(evt);
            }
        });
        jPanel10.add(txt_pendapatanKotor);

        panelRound2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 800, 42));

        btn_cetak.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_cetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Button Cetak.png"))); // NOI18N
        btn_cetak.setMinimumSize(new java.awt.Dimension(124, 22));
        btn_cetak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_cetakMouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cetakMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cetakMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_cetakMousePressed(evt);
            }
        });
        panelRound2.add(btn_cetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 610, -1, -1));

        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_cancel.png"))); // NOI18N
        btn_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cancelMouseExited(evt);
            }
        });
        panelRound2.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bulanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bulanActionPerformed

    private void txt_pendapatanKotor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pendapatanKotor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pendapatanKotor2ActionPerformed

    private void txt_pendapatanKotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pendapatanKotorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pendapatanKotorActionPerformed

    private void btn_cetakMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cetakMouseReleased
        // TODO add your handling code here:
        Image iconCetakHover = new ImageIcon(this.getClass().getResource("/img/Button Cetak hover.png")).getImage();
        btn_cetak.setIcon(new ImageIcon(iconCetakHover));
    }//GEN-LAST:event_btn_cetakMouseReleased

    private void btn_cetakMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cetakMouseEntered
        // TODO add your handling code here:
        Image iconCetakHover = new ImageIcon(this.getClass().getResource("/img/Button Cetak hover.png")).getImage();
        btn_cetak.setIcon(new ImageIcon(iconCetakHover));
    }//GEN-LAST:event_btn_cetakMouseEntered

    private void btn_cetakMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cetakMouseExited
        // TODO add your handling code here:
        Image iconCetakDefault = new ImageIcon(this.getClass().getResource("/img/Button Cetak.png")).getImage();
        btn_cetak.setIcon(new ImageIcon(iconCetakDefault));
    }//GEN-LAST:event_btn_cetakMouseExited

    private void btn_cetakMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cetakMousePressed
        // TODO add your handling code here:
        Image iconCetakPressed = new ImageIcon(this.getClass().getResource("/img/Button Cetak press.png")).getImage();
        btn_cetak.setIcon(new ImageIcon(iconCetakPressed));
    }//GEN-LAST:event_btn_cetakMousePressed

    private void btn_cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelMouseEntered
        // TODO add your handling code here:
        Image iconCancelHover = new ImageIcon(this.getClass().getResource("/img/btn_cancel hover.png")).getImage();
        btn_cancel.setIcon(new ImageIcon(iconCancelHover));
    }//GEN-LAST:event_btn_cancelMouseEntered

    private void btn_cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelMouseExited
        // TODO add your handling code here:
        Image iconCancelDefault = new ImageIcon(this.getClass().getResource("/img/btn_cancel.png")).getImage();
        btn_cancel.setIcon(new ImageIcon(iconCancelDefault));
    }//GEN-LAST:event_btn_cancelMouseExited

    private void btn_cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_cancelMouseClicked

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
            java.util.logging.Logger.getLogger(Popup_Tinjau_Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Popup_Tinjau_Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Popup_Tinjau_Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Popup_Tinjau_Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Popup_Tinjau_Laporan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_cancel;
    private javax.swing.JLabel btn_cetak;
    private javax.swing.JTextField bulan;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private atsk.panelRound panelRound2;
    private javax.swing.JTextField txt_pendapatanKotor;
    private javax.swing.JTextField txt_pendapatanKotor1;
    private javax.swing.JTextField txt_pendapatanKotor2;
    private javax.swing.JTextField txt_pendapatanKotor3;
    // End of variables declaration//GEN-END:variables
}
