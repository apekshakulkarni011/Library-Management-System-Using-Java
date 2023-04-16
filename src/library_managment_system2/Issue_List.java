
package library_managment_system2;

import Tools.DatabaseConnectivity;
import Tools.Helper;
import javax.swing.JTable;

public class Issue_List extends javax.swing.JFrame {

    public static String user_id1;

    
    public Issue_List() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        Descending = new javax.swing.JButton();
        Ascending = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 970, 430));

        jButton2.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 70, 140, 50));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/GoBack.JPG"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 52));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 880, 380));

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("Issued Book List");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 310, 60));

        Descending.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        Descending.setText("Desc");
        Descending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescendingActionPerformed(evt);
            }
        });
        getContentPane().add(Descending, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 530, 88, 60));

        Ascending.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        Ascending.setText("Asc");
        Ascending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AscendingActionPerformed(evt);
            }
        });
        getContentPane().add(Ascending, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 530, 90, 60));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/IMGW3.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 0, 2100, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Helper.setCenter(this);

        DatabaseConnectivity db = new DatabaseConnectivity();
        String[][] data = db.Select("SELECT isbn, rno, issue_date FROM issue");
        String[] columnName = { "ISBN Code", "Enrollment No", "Book Issue Date"};
        jTable1 = new JTable(data, columnName);
        jScrollPane1.setViewportView(jTable1);

    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String isbn1 = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        DatabaseConnectivity db = new DatabaseConnectivity();
        boolean r = db.execute("DELETE FROM issue WHERE isbn = " + isbn1 + "'");
        if (r) {
            Helper.show(this, "Issued Book is deleted!");
            formWindowOpened(null);
        } else {
            Helper.show(this, "opps, please try again!");
        }
//user_id = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
//        this.setVisible(false);
//        new UserEdit().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         //new Home().setVisible(true);
         this.setVisible(false); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void AscendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AscendingActionPerformed
        // TODO add your handling code here:
        Tools.Helper.setCenter(this);
        DatabaseConnectivity db = new DatabaseConnectivity();

        String[][] data = db.Select("SELECT * FROM issue ORDER BY isbn ASC");
        String[] title = { "ISBN Code", "Enrollment No", "Book Issue Date"};

        jTable1 = new JTable(data, title);
        jScrollPane1.setViewportView(jTable1);
    }//GEN-LAST:event_AscendingActionPerformed

    private void DescendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescendingActionPerformed
        // TODO add your handling code here:
        Tools.Helper.setCenter(this);
        DatabaseConnectivity db = new DatabaseConnectivity();

        String[][] data = db.Select("SELECT * FROM issue ORDER BY isbn DESC");
        String[] title = { "ISBN Code", "Enrollment No", "Book Issue Date"};

        jTable1 = new JTable(data, title);
        jScrollPane1.setViewportView(jTable1);
    }//GEN-LAST:event_DescendingActionPerformed

  
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
            java.util.logging.Logger.getLogger(Issue_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Issue_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Issue_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Issue_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Issue_List().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ascending;
    private javax.swing.JButton Descending;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
