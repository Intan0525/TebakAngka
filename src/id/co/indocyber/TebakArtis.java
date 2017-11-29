/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber;

import java.util.Arrays;
import javax.print.DocFlavor;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class TebakArtis extends javax.swing.JFrame {

    /**
     * Creates new form TebakArtis
     */
    String[] namaNama = {"Angelina", "Demi Moore",
        "Dua Lipa", "Chelsea Islan",
        "Raisa", "Lily Collins",
        "Emma Stone", "Emma Watson",
        "Megan Fox", "Blake Lively"};

    String soal;
    String kataAcak;

//    ImageIcon ikon;

    boolean coba = true;
    int maxTry = 5;

    public TebakArtis() {
        initComponents();
//        ikon = new ImageIcon("tebakAngka.png");
//        setIconImage(ikon.getImage());
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        acakArtisLabel = new javax.swing.JLabel();
        inputNamaArtisTextField = new javax.swing.JTextField();
        cekNamaButton = new javax.swing.JButton();
        cekNamaArtisLabel = new javax.swing.JLabel();
        keteranganLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/co/indocyber/images.png"))); // NOI18N

        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        acakArtisLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        acakArtisLabel.setForeground(new java.awt.Color(255, 0, 51));
        acakArtisLabel.setText("Artists Name");
        acakArtisLabel.setToolTipText("");

        inputNamaArtisTextField.setEnabled(false);

        cekNamaButton.setText("Are you sure?");
        cekNamaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekNamaButtonActionPerformed(evt);
            }
        });

        cekNamaArtisLabel.setText("^_^");

        keteranganLabel.setText("Silakan klik Start ^_^");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(startButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(acakArtisLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(keteranganLabel)
                            .addComponent(inputNamaArtisTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cekNamaArtisLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(cekNamaButton)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(startButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(acakArtisLabel)
                .addGap(12, 12, 12)
                .addComponent(keteranganLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNamaArtisTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cekNamaButton)
                .addGap(18, 18, 18)
                .addComponent(cekNamaArtisLabel)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        //cekNamaArtisLabel.setText(genarateTebakArtis());
        inputNamaArtisTextField.setEnabled(true);
        cekNamaButton.setEnabled(true);
        acakArtisLabel.setText(generateTebakArtis());
        cekNamaArtisLabel.setText(soal);
        keteranganLabel.setText("Silakan masukkan nama artis");
        inputNamaArtisTextField.setText("");


    }//GEN-LAST:event_startButtonActionPerformed

    private void cekNamaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekNamaButtonActionPerformed

        try {

            String tebakanString = inputNamaArtisTextField.getText();

            //cekNamaArtisLabel.setText();
            if (tebakanString.equalsIgnoreCase(soal)) {
                coba = true;
                cekNamaArtisLabel.setText("jawaban benar");
                inputNamaArtisTextField.setEnabled(false);
                cekNamaButton.setEnabled(false);
            } else {
                cekNamaArtisLabel.setText("SALAH");
                maxTry--;
                if (maxTry == 0) {
                    coba = false;
                }
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, "Masukan HURUF!!");
        }
    }//GEN-LAST:event_cekNamaButtonActionPerformed

    private String generateTebakArtis() {
        double random = Math.random() * 10;
        double floor = Math.floor(random);
        int generateArtisSoal = (int) floor;
        soal = namaNama[generateArtisSoal];

        soal = soal.toUpperCase();
        char[] Artis = soal.toCharArray();
        Arrays.sort(Artis);
        kataAcak = new String(Artis);
        return kataAcak;
    }

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
            java.util.logging.Logger.getLogger(TebakArtis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TebakArtis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TebakArtis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TebakArtis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TebakArtis().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acakArtisLabel;
    private javax.swing.JLabel cekNamaArtisLabel;
    private javax.swing.JButton cekNamaButton;
    private javax.swing.JTextField inputNamaArtisTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel keteranganLabel;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
}
