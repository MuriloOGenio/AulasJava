/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import javax.swing.*;
/**
 *
 * @author LAB03M07
 */
public class fazendinha_GUI extends javax.swing.JFrame {

    /**
     * Creates new form fazendinha_GUI
     */
    public fazendinha_GUI() {
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

        jPanel1 = new javax.swing.JPanel();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        btnvac = new org.edisoncor.gui.button.ButtonIcon();
        btngado = new org.edisoncor.gui.button.ButtonIcon();
        btnfrig = new org.edisoncor.gui.button.ButtonIcon();
        btnboi = new org.edisoncor.gui.button.ButtonIcon();
        lblAni = new org.edisoncor.gui.label.LabelRound();
        lblvac = new org.edisoncor.gui.label.LabelRound();
        lblgado = new org.edisoncor.gui.label.LabelRound();
        lblfrig = new org.edisoncor.gui.label.LabelRound();
        btnsair = new org.edisoncor.gui.button.ButtonAction();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fazenda-2.jpg"))); // NOI18N

        btnvac.setBackground(new java.awt.Color(255, 204, 204));
        btnvac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/coronavac.png"))); // NOI18N
        btnvac.setText("animais");
        btnvac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvacActionPerformed(evt);
            }
        });

        btngado.setBackground(new java.awt.Color(255, 204, 204));
        btngado.setBorder(null);
        btngado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/rebanho-2.jpg"))); // NOI18N
        btngado.setText("animais");
        btngado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngadoActionPerformed(evt);
            }
        });

        btnfrig.setBackground(new java.awt.Color(255, 204, 204));
        btnfrig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/batata.png"))); // NOI18N
        btnfrig.setText("animais");
        btnfrig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfrigActionPerformed(evt);
            }
        });

        btnboi.setBackground(new java.awt.Color(255, 204, 204));
        btnboi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/boiiiii.png"))); // NOI18N
        btnboi.setText("animais");
        btnboi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnboiActionPerformed(evt);
            }
        });

        lblAni.setBackground(new java.awt.Color(255, 204, 204));
        lblAni.setText("Animais");

        lblvac.setBackground(new java.awt.Color(255, 204, 204));
        lblvac.setText("Vacinação");

        lblgado.setBackground(new java.awt.Color(255, 204, 204));
        lblgado.setText("Grupos");

        lblfrig.setBackground(new java.awt.Color(255, 204, 204));
        lblfrig.setText("Frigorífico");

        btnsair.setBackground(new java.awt.Color(255, 0, 0));
        btnsair.setText("Sair");
        btnsair.setColorDeSombra(new java.awt.Color(255, 102, 102));
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fazendinha");

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnsair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(273, 273, 273))
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnboi, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnvac, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblvac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btngado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblgado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnfrig, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfrig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnvac, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btngado, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnfrig, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnboi, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblvac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblgado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfrig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(btnsair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        jPanel1.add(panelImage1);
        panelImage1.setBounds(0, 0, 680, 480);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 677, 476);

        setSize(new java.awt.Dimension(677, 476));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnvacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnvacActionPerformed

    private void btngadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btngadoActionPerformed

    private void btnfrigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfrigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnfrigActionPerformed

    private void btnboiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnboiActionPerformed
        
    }//GEN-LAST:event_btnboiActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnsairActionPerformed

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
            java.util.logging.Logger.getLogger(fazendinha_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fazendinha_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fazendinha_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fazendinha_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fazendinha_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonIcon btnboi;
    private org.edisoncor.gui.button.ButtonIcon btnfrig;
    private org.edisoncor.gui.button.ButtonIcon btngado;
    private org.edisoncor.gui.button.ButtonAction btnsair;
    private org.edisoncor.gui.button.ButtonIcon btnvac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private org.edisoncor.gui.label.LabelRound lblAni;
    private org.edisoncor.gui.label.LabelRound lblfrig;
    private org.edisoncor.gui.label.LabelRound lblgado;
    private org.edisoncor.gui.label.LabelRound lblvac;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    // End of variables declaration//GEN-END:variables
}