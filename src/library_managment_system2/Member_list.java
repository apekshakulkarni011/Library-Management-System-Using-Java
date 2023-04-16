
package library_managment_system2;

import Tools.DatabaseConnectivity;
import javax.swing.JTable;


public class Member_list extends javax.swing.JFrame {

    public static String member_id;

    /**
     * Creates new form Member_list
     */
    public Member_list() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        Ascending = new javax.swing.JButton();
        Descending = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Combo1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        MType = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 870, 380));

        jButton2.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 40, 100, 40));

        Ascending.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        Ascending.setText("Asc");
        Ascending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AscendingActionPerformed(evt);
            }
        });
        jPanel1.add(Ascending, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 560, 90, 60));

        Descending.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        Descending.setText("Desc");
        Descending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescendingActionPerformed(evt);
            }
        });
        jPanel1.add(Descending, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 560, 88, 60));

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("Member Type :-");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 130, 50));

        Combo1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Faculty", "Student" }));
        jPanel1.add(Combo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 170, 40));

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("Member List");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, -10, 250, 60));

        MType.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        MType.setText("Search By Type");
        MType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MTypeActionPerformed(evt);
            }
        });
        jPanel1.add(MType, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 630, 190, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 1070, 690));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/GoBack.JPG"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/IMGLIST1.JPG"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Tools.Helper.setCenter(this);
        DatabaseConnectivity db = new DatabaseConnectivity();

        String[][] data = db.Select("SELECT * FROM member");
        String[] title = {"Enrollment No", "Name", "Phone No", "Member Type", "Gender", "Department", "Course"};

        jTable1 = new JTable(data, title);
        jScrollPane1.setViewportView(jTable1);
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DatabaseConnectivity db = new DatabaseConnectivity();

        String id = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String qry = "DELETE FROM member WHERE rno = '" + id + "'";
        boolean r = db.execute(qry);
        if (r) {
            formWindowOpened(null);
            Tools.Helper.show(this, "Member is deleted");
        } else {
            Tools.Helper.show(this, "opps, please try again!");
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void AscendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AscendingActionPerformed
        // TODO add your handling code here:
        Tools.Helper.setCenter(this);
        DatabaseConnectivity db = new DatabaseConnectivity();

        String[][] data = db.Select("SELECT * FROM member ORDER BY rno ASC");
        String[] title = {"Enrollment No", "Name", "Phone No", "Member Type", "Gender", "Department", "Course"};

        jTable1 = new JTable(data, title);
        jScrollPane1.setViewportView(jTable1);
    }//GEN-LAST:event_AscendingActionPerformed

    private void DescendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescendingActionPerformed
        // TODO add your handling code here:
        Tools.Helper.setCenter(this);
        DatabaseConnectivity db = new DatabaseConnectivity();

        String[][] data = db.Select("SELECT * FROM member ORDER BY rno DESC");
        String[] title = {"Enrollment No", "Name", "Phone No", "Member Type", "Gender", "Department", "Course"};

        jTable1 = new JTable(data, title);
        jScrollPane1.setViewportView(jTable1);
    }//GEN-LAST:event_DescendingActionPerformed

    private void MTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MTypeActionPerformed
        // TODO add your handling code here:
        Tools.Helper.setCenter(this);
        DatabaseConnectivity db = new DatabaseConnectivity();
        
        

        //String[][] data = db.Select("SELECT * FROM book WHERE name LIKE " + name );
        //String[][] data = db.Select("SELECT * FROM book WHERE isbn LIKE " + book_isbn);
        
        String[][] data = db.Select("SELECT * FROM member WHERE member_type LIKE '" + Combo1.getSelectedItem() + "'");
        String[] title = {"Enrollment No", "Name", "Phone No", "Member Type", "Gender", "Department", "Course"};

        jTable1 = new JTable(data, title);
        jScrollPane1.setViewportView(jTable1);
    }//GEN-LAST:event_MTypeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false); 
        //new Home().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Member_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Member_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Member_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Member_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Member_list().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ascending;
    private javax.swing.JComboBox<String> Combo1;
    private javax.swing.JButton Descending;
    private javax.swing.JButton MType;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
