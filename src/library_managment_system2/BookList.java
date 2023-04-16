
package library_managment_system2;

import Tools.DatabaseConnectivity;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class BookList extends javax.swing.JFrame {
    
    public static String book_isbn;

    /**
     * Creates new form BookList
     */
    public BookList() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        book_table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        Ascending = new javax.swing.JButton();
        Descending = new javax.swing.JButton();
        Combo1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Searchtype = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ON = new javax.swing.JButton();
        OFF = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setMaximumSize(new java.awt.Dimension(21474836, 21474836));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        book_table.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        book_table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(book_table);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 1010, 350));

        jButton1.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 40, 110, 50));

        Ascending.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        Ascending.setText("ASC");
        Ascending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AscendingActionPerformed(evt);
            }
        });
        jPanel2.add(Ascending, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 560, 100, 44));

        Descending.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        Descending.setText("DESC");
        Descending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescendingActionPerformed(evt);
            }
        });
        jPanel2.add(Descending, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 560, 100, 44));

        Combo1.setBackground(new java.awt.Color(255, 204, 204));
        Combo1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NON-FICTION", "FICTION", "CULTURAL & GODEST", "ADVENTURE AND FANTACY", "DETECTIVE AND HORROR STORY", "NOVEL", "REFERENCE MATERIAL AND BOOK ", "BIOGRAFIES", "EDUCATIONAL MATERIAL" }));
        Combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo1ActionPerformed(evt);
            }
        });
        jPanel2.add(Combo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 270, 50));

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("Book Type :-");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 130, 50));

        Searchtype.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        Searchtype.setText("Search");
        Searchtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchtypeActionPerformed(evt);
            }
        });
        jPanel2.add(Searchtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 560, 120, 40));

        jLabel2.setBackground(new java.awt.Color(255, 153, 153));
        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("Book Status :-");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, 120, 50));

        ON.setBackground(new java.awt.Color(255, 204, 204));
        ON.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        ON.setText("ON-Shelf");
        ON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ONActionPerformed(evt);
            }
        });
        jPanel2.add(ON, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 480, 110, 50));

        OFF.setBackground(new java.awt.Color(255, 204, 204));
        OFF.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        OFF.setText("OFF-Shelf");
        OFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OFFActionPerformed(evt);
            }
        });
        jPanel2.add(OFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 480, 110, 50));

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("Book List");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 200, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 2427, 680));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/GoBack.JPG"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/IMGLIST1.JPG"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1470, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Tools.Helper.setCenter(this);
        DatabaseConnectivity db = new DatabaseConnectivity();
        
        String[][] data = db.Select("SELECT * FROM book");
        String[] titles = {"ISBN", "Name", "Book Genre", "Book Status", "Edition", "Publiser", "Price", "Pages"};
        
         
        book_table = new JTable(data, titles);
        jScrollPane1.setViewportView(book_table);
        
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       DatabaseConnectivity db = new DatabaseConnectivity();

        String id = book_table.getValueAt(book_table.getSelectedRow(), 0).toString();
        //String qry = "DELETE FROM book WHERE isbn = " + id;
        String qry ="DELETE FROM book WHERE isbn LIKE '" + id + "'";
        boolean r = db.execute(qry);
        if (r) {
            formWindowOpened(null);
            Tools.Helper.show(this, "Book is deleted");
        } else {
            Tools.Helper.show(this, "opps, please try again!");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void AscendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AscendingActionPerformed
        Tools.Helper.setCenter(this);
        DatabaseConnectivity db = new DatabaseConnectivity();
        
        String[][] data = db.Select("SELECT * FROM book ORDER BY isbn ASC");
        String[] titles = {"ISBN", "Name", "Book Genre", "Book Status", "Edition", "Publiser", "Price", "Pages"};
        
        
        book_table = new JTable(data, titles);
        jScrollPane1.setViewportView(book_table);

    }//GEN-LAST:event_AscendingActionPerformed

    private void DescendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescendingActionPerformed
        // TODO add your handling code here:
        Tools.Helper.setCenter(this);
        DatabaseConnectivity db = new DatabaseConnectivity();
        
        String[][] data = db.Select("SELECT * FROM book ORDER BY isbn DESC");
        String[] titles = {"ISBN", "Name", "Book Genre", "Book Status", "Edition", "Publiser", "Price", "Pages"};
        
        
        book_table = new JTable(data, titles);
        jScrollPane1.setViewportView(book_table);
    }//GEN-LAST:event_DescendingActionPerformed

    private void SearchtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchtypeActionPerformed
        // TODO add your handling code here:
        Tools.Helper.setCenter(this);
        DatabaseConnectivity db = new DatabaseConnectivity();
        
        

        //String[][] data = db.Select("SELECT * FROM book WHERE name LIKE " + name );
        //String[][] data = db.Select("SELECT * FROM book WHERE isbn LIKE " + book_isbn);
        
        String[][] data = db.Select("SELECT * FROM book WHERE type LIKE '" + Combo1.getSelectedItem() + "'");
        String[] titles = {"ISBN", "Name", "Book Genre", "Book Status", "Edition", "Publiser", "Price", "Pages"};
        
        
        book_table = new JTable(data, titles);
        jScrollPane1.setViewportView(book_table);
    }//GEN-LAST:event_SearchtypeActionPerformed

    private void ONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ONActionPerformed
        // TODO add your handling code here:
        Tools.Helper.setCenter(this);
        DatabaseConnectivity db = new DatabaseConnectivity();
        String[][] data = db.Select("SELECT * FROM book WHERE status LIKE 'ON-SHELF'");
        String[] titles = {"ISBN", "Name", "Book Genre", "Book Status", "Edition", "Publiser", "Price", "Pages"};
        book_table = new JTable(data, titles);
        jScrollPane1.setViewportView(book_table);
    }//GEN-LAST:event_ONActionPerformed

    private void OFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OFFActionPerformed
        // TODO add your handling code here:
        Tools.Helper.setCenter(this);
        DatabaseConnectivity db = new DatabaseConnectivity();
        String[][] data = db.Select("SELECT * FROM book WHERE status LIKE 'OFF-SHELF'");
        String[] titles = {"ISBN", "Name", "Book Genre", "Book Status", "Edition", "Publiser", "Price", "Pages"};
        book_table = new JTable(data, titles);
        jScrollPane1.setViewportView(book_table);
    }//GEN-LAST:event_OFFActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false); 
        //new Home().setVisible(true);
         
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Combo1ActionPerformed

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
            java.util.logging.Logger.getLogger(BookList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ascending;
    private javax.swing.JComboBox<String> Combo1;
    private javax.swing.JButton Descending;
    private javax.swing.JButton OFF;
    private javax.swing.JButton ON;
    private javax.swing.JButton Searchtype;
    private javax.swing.JTable book_table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
