/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinahmax;

import java.awt.Color;

/**
 *
 * @author chiva
 */
public class RegTram extends javax.swing.JFrame {

    /**
     * Creates new form RegTram
     */
    public RegTram() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTramMonHis = new javax.swing.JLabel();
        lblTramArq = new javax.swing.JLabel();
        lblTramCon = new javax.swing.JLabel();
        lblTramJunVec = new javax.swing.JLabel();
        lblTramCordAsu = new javax.swing.JLabel();
        lblTramRegArq = new javax.swing.JLabel();
        lblTramCenInah = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logos.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        lblTramMonHis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TramMonHis.png"))); // NOI18N
        lblTramMonHis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTramMonHisMouseClicked(evt);
            }
        });
        getContentPane().add(lblTramMonHis, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        lblTramArq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TramArq.png"))); // NOI18N
        getContentPane().add(lblTramArq, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        lblTramCon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TramCon.png"))); // NOI18N
        getContentPane().add(lblTramCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        lblTramJunVec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TramJunVec.png"))); // NOI18N
        getContentPane().add(lblTramJunVec, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, -1, -1));

        lblTramCordAsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TramCordAsu.png"))); // NOI18N
        getContentPane().add(lblTramCordAsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        lblTramRegArq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TramRegArq.png"))); // NOI18N
        getContentPane().add(lblTramRegArq, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        lblTramCenInah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TramCenInah.png"))); // NOI18N
        getContentPane().add(lblTramCenInah, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        setSize(new java.awt.Dimension(700, 450));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
        MenuInicial m = new MenuInicial();
        m.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void lblTramMonHisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTramMonHisMouseClicked
        dispose();
        RegTramMonHis r = new  RegTramMonHis();
        r.setVisible(true);
    }//GEN-LAST:event_lblTramMonHisMouseClicked

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
            java.util.logging.Logger.getLogger(RegTram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegTram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegTram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegTram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegTram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblTramArq;
    private javax.swing.JLabel lblTramCenInah;
    private javax.swing.JLabel lblTramCon;
    private javax.swing.JLabel lblTramCordAsu;
    private javax.swing.JLabel lblTramJunVec;
    private javax.swing.JLabel lblTramMonHis;
    private javax.swing.JLabel lblTramRegArq;
    // End of variables declaration//GEN-END:variables
}
