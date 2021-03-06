/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Menu.MenuUtama;
import java.sql.Driver;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author IKHBAL
 */
public class PesanMakanan extends MainAbstract {
    /**
     * Creates new form PesanMakanan
     */
    
    public PesanMakanan() {
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

        mPesan = new javax.swing.JLabel();
        mNama = new javax.swing.JLabel();
        mNoKantin = new javax.swing.JLabel();
        mMenu = new javax.swing.JLabel();
        mNamaPemesan = new javax.swing.JTextField();
        mNomorKantin = new javax.swing.JTextField();
        mNamaMenu = new javax.swing.JTextField();
        mPesanOk = new javax.swing.JButton();
        mBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(100, 100, 240));

        mPesan.setText("Pesan Makanan");

        mNama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/image/garis_nama.png"))); // NOI18N

        mNoKantin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/image/garis_no.png"))); // NOI18N

        mMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/image/garis_menu.png"))); // NOI18N

        mPesanOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/image/pesan.png"))); // NOI18N
        mPesanOk.setBorder(null);
        mPesanOk.setBorderPainted(false);
        mPesanOk.setContentAreaFilled(false);
        mPesanOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPesanOkActionPerformed(evt);
            }
        });

        mBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/image/back.png"))); // NOI18N
        mBack.setBorderPainted(false);
        mBack.setContentAreaFilled(false);
        mBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(mPesan))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mBack, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mNama)
                            .addComponent(mMenu)
                            .addComponent(mNoKantin))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mPesanOk)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(mNamaPemesan, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                .addComponent(mNomorKantin, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mNamaMenu)))))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mPesan)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mNama)
                    .addComponent(mNamaPemesan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mNamaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mMenu))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mNoKantin)
                    .addComponent(mNomorKantin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(mPesanOk, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(mBack, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mPesanOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPesanOkActionPerformed
        // TODO add your handling code here:
        String mNama = mNamaPemesan.getText();
        String mNoKantin = mNomorKantin.getText();
        String mMenu = mNamaMenu.getText();
        Pesan mPesan = new Pesan(mNama,mMenu);
        mPesan.tambahPesanan();
        String input = "INSERT INTO pesanan VALUES('" +mNama+ "' , '" +mNoKantin+ "' , '"+mMenu+"');";
        boolean ketemu = false;
        try {
            Class.forName(mDB);
            Connection mKoneksi = DriverManager.getConnection(mDBURL, mUser, mPass);
            Statement statement = mKoneksi.createStatement();
            ResultSet mResult = statement.executeQuery("SELECT namaMenu,noKantin FROM `Daftar_Menu`");
            mResult.next();
            String mMenuDB;
            String mNoKantinDB;
            do{
                mMenuDB = mResult.getString("namaMenu");
                mNoKantinDB = mResult.getString("noKantin");
                if(mMenuDB.equals(mMenu) && mNoKantinDB.equals(mNoKantin))
                    ketemu = true;
            }while(mResult.next());
            if (ketemu) {
                statement.executeUpdate(input);
                JOptionPane.showMessageDialog(null,"Berhasil Memesan Makanan");
                statement.close();
                mKoneksi.close();
                mResetField();
                this.dispose();
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new MenuUtama().setVisible(true);
                    }
                });
            } else {
                JOptionPane.showMessageDialog(null,"Pastikan nama menu dan nomor kantin sesuai!.");
                mResetField();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Gagal Memesan Makanan");
        }
    }//GEN-LAST:event_mPesanOkActionPerformed

    private void mBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }//GEN-LAST:event_mBackActionPerformed

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
            java.util.logging.Logger.getLogger(PesanMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesanMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesanMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesanMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesanMakanan().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton mBack;
    private javax.swing.JLabel mMenu;
    private javax.swing.JLabel mNama;
    private javax.swing.JTextField mNamaMenu;
    private javax.swing.JTextField mNamaPemesan;
    private javax.swing.JLabel mNoKantin;
    private javax.swing.JTextField mNomorKantin;
    private javax.swing.JLabel mPesan;
    private javax.swing.JButton mPesanOk;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mResetField() {
        mNamaMenu.setText("");
        mNamaPemesan.setText("");
        mNomorKantin.setText("");
    }
}
