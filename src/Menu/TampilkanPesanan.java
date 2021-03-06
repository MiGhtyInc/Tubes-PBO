/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import static Menu.MainAbstract.mDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author IKHBAL
 */
public class TampilkanPesanan extends MainAbstract {

    private DefaultTableModel table;
    /**
     * Creates new form TampilkanPesanan
     */
    public TampilkanPesanan() {
        initComponents();
        mShowTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mScrollTable = new javax.swing.JScrollPane();
        mTable = new javax.swing.JTable();
        mBack = new javax.swing.JButton();
        mPesanan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nama", "Menu", "Nomor Kantin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        mTable.setUpdateSelectionOnSort(false);
        mScrollTable.setViewportView(mTable);

        mBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/image/back.png"))); // NOI18N
        mBack.setBorderPainted(false);
        mBack.setContentAreaFilled(false);
        mBack.setOpaque(false);
        mBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBackActionPerformed(evt);
            }
        });

        mPesanan.setText("List Pesanan Kantin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(mPesanan)
                .addContainerGap(161, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mScrollTable, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mBack, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mPesanan)
                .addGap(17, 17, 17)
                .addComponent(mScrollTable, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mBack, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TampilkanPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilkanPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilkanPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilkanPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton mBack;
    private javax.swing.JLabel mPesanan;
    private javax.swing.JScrollPane mScrollTable;
    private javax.swing.JTable mTable;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mResetField() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mShowTable() {
        Object[] mTab = {"Nama", "Menu", "Nomor Kantin"};
        table = new DefaultTableModel(null, mTab);
        mTable.setModel(table);
        String sql = "Select nama,namaMenu,noKantin from `pesanan` order by nama asc";
        try {
            Class.forName(mDB);
            Connection mKoneksi = DriverManager.getConnection(mDBURL, mUser, mPass);
            Statement statement = mKoneksi.createStatement();
            ResultSet mResult = statement.executeQuery(sql);
            mResult.next();
            String mMenu;
            String mNama;
            String mNoKantin;
            do{
                mNama = mResult.getString("nama");
                mMenu = mResult.getString("namaMenu");
                mNoKantin = mResult.getString("noKantin");
                String[] data = {mNama, mMenu, mNoKantin};
                table.addRow(data);
            }while(mResult.next());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Gagal menampilkan pesanan");
        }
    }

}
