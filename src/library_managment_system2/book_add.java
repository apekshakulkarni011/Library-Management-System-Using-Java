
package library_managment_system2;

import Tools.DatabaseConnectivity;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class book_add extends javax.swing.JFrame {

    
    public book_add() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_publisher = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_pages = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_price = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Combo1 = new javax.swing.JComboBox<>();
        Combo2 = new javax.swing.JComboBox<>();
        AddNew = new javax.swing.JButton();
        Serach = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Combo3 = new javax.swing.JComboBox<>();
        txt_isbn = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Serach1 = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(102, 51, 0));
        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 21)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Price : -");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 153, 0), 2, true));
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 180, 40));

        jLabel3.setBackground(new java.awt.Color(102, 51, 0));
        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 21)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Edition : -");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 153, 0), 2, true));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 180, 40));

        jLabel4.setBackground(new java.awt.Color(102, 51, 0));
        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 21)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Publisher : -");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 153, 0), 2, true));
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 180, 40));

        txt_publisher.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jPanel1.add(txt_publisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 220, 210, 40));

        jLabel6.setBackground(new java.awt.Color(102, 51, 0));
        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 21)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pages : -");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 153, 0), 2, true));
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 180, 40));

        txt_pages.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jPanel1.add(txt_pages, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 430, 140, 40));

        jLabel2.setBackground(new java.awt.Color(102, 51, 0));
        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 21)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Book Name : - ");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 153, 0), 2, true));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 160, 40));

        txt_price.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jPanel1.add(txt_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 320, 140, 40));

        saveButton.setBackground(new java.awt.Color(153, 153, 153));
        saveButton.setFont(new java.awt.Font("Bookman Old Style", 3, 27)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        jPanel1.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 560, 240, 60));

        jLabel7.setBackground(new java.awt.Color(102, 51, 0));
        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 21)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Book Status : -");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 153, 0), 2, true));
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 170, 40));

        txt_name.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 270, 40));

        jLabel8.setBackground(new java.awt.Color(102, 51, 0));
        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 21)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Book Genre : - ");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 153, 0), 2, true));
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 170, 40));

        Combo1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NON-FICTION", "FICTION", "CULTURAL & GODEST", "ADVENTURE AND FANTACY", "DETECTIVE AND HORROR STORY", "NOVEL", "REFERENCE MATERIAL AND BOOK ", "BIOGRAFIES", "EDUCATIONAL MATERIAL", " " }));
        Combo1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo1ActionPerformed(evt);
            }
        });
        jPanel1.add(Combo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 280, 40));

        Combo2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Combo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ON-SHELF (AVL BK > 3)", "OFF-SHELF (AVL BK< 3)" }));
        jPanel1.add(Combo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 210, 40));

        AddNew.setBackground(new java.awt.Color(153, 153, 153));
        AddNew.setFont(new java.awt.Font("Bookman Old Style", 3, 27)); // NOI18N
        AddNew.setText("Add New");
        AddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewActionPerformed(evt);
            }
        });
        jPanel1.add(AddNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 220, 60));

        Serach.setBackground(new java.awt.Color(102, 51, 0));
        Serach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/SearchPur.png"))); // NOI18N
        Serach.setOpaque(false);
        Serach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SerachActionPerformed(evt);
            }
        });
        jPanel1.add(Serach, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 50, 50));

        Update.setBackground(new java.awt.Color(153, 153, 153));
        Update.setFont(new java.awt.Font("Bookman Old Style", 3, 27)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 560, 240, 60));

        Combo3.setEditable(true);
        Combo3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Combo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "10th", "11th", "12th", "13th", "14th", "15th" }));
        jPanel1.add(Combo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 110, 180, 40));

        txt_isbn.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel1.add(txt_isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 162, 40));

        jLabel1.setBackground(new java.awt.Color(102, 51, 0));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("ISBN Code : -");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 153, 0), 2, true));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 150, 40));

        Serach1.setBackground(new java.awt.Color(102, 51, 0));
        Serach1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/Serach Icon34.png"))); // NOI18N
        Serach1.setOpaque(false);
        Serach1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Serach1ActionPerformed(evt);
            }
        });
        jPanel1.add(Serach1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 50, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 1120, 680));

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/GoBack.JPG"))); // NOI18N
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jLabel10.setBackground(new java.awt.Color(153, 0, 0));
        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 3, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Book Detail's");
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 153, 0)));
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 350, 70));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/IMG14.jpeg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1560, 960));

        getAccessibleContext().setAccessibleParent(this);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        DatabaseConnectivity db = new DatabaseConnectivity();
         String book_isbn = txt_isbn.getText();
             String[][] data = db.Select("SELECT * FROM book WHERE isbn LIKE '" + book_isbn + "'");
        db.rs = db.executeQuery("Select * FROM book WHERE isbn LIKE '" + book_isbn + "'");
        try {
                    if (db.rs.next()) {
                        Tools.Helper.show(this, "Book is Already Exist!! Please Enter Another ISBN Code");
                         txt_isbn.setText("");
//                         txt_name.setText("");
//                         Combo1.setSelectedIndex(-1);
//            Combo2.setSelectedIndex(-1);
//            Combo3.setSelectedIndex(-1);
//            txt_publisher.setText("");
//            txt_price.setText("");
//            txt_pages.setText("");
         } else {   
            if (txt_isbn.getText().isEmpty() || txt_name.getText().isEmpty() || txt_publisher.getText().isEmpty()|| txt_price.getText().isEmpty()||txt_pages.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(this, "All The Fields Are Mandatory");
        }
        else {
        String isbn = txt_isbn.getText();
        String name = txt_name.getText();
        String type=Combo1.getSelectedItem().toString();
        String status=Combo2.getSelectedItem().toString();
        String edition=Combo3.getSelectedItem().toString();
        //String edition = txt_edition.getText();
        String publisher = txt_publisher.getText();
        String price = txt_price.getText();
        String pages = txt_pages.getText();

        String sql_qry = "INSERT INTO book VALUES ('" + isbn + "', '" + name + "', '" + type + "','" + status + "','" + edition + "', '" + publisher + "', '" + price + "', " + pages + ")";
        boolean result = db.execute(sql_qry);
        if (result) {
            Tools.Helper.show(this, "Book is Successfully Inserted");
            txt_isbn.setText("");
            txt_name.setText("");
            //txt_edition.setText("");
            Combo1.setSelectedIndex(-1);
            Combo2.setSelectedIndex(-1);
            Combo3.setSelectedIndex(-1);
            txt_publisher.setText("");
            txt_price.setText("");
            txt_pages.setText("");
            txt_isbn.requestFocus(true);
        } else {
            Tools.Helper.show(this, "oops, please try again");
        }
            } }      
                } catch (SQLException ex) {
                    Logger.getLogger(book_add.class.getName()).log(Level.SEVERE, null, ex);
                }
//         String[][] find = db.Select("SELECT * FROM book ORDER BY isbn DESC");
//            txt_isbn.setText(find[0][0]);
    }//GEN-LAST:event_saveButtonActionPerformed

    private void Combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Combo1ActionPerformed

    private void AddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewActionPerformed
        // TODO add your handling code here:
        //Tools.Helper.show(this, "Book is Successfully Inserted");
         DatabaseConnectivity db = new DatabaseConnectivity();
        
        txt_isbn.requestFocus(true);
            //txt_isbn.setText("");
            txt_name.setText("");
            //txt_edition.setText("");
            Combo1.setSelectedIndex(-1);
            Combo2.setSelectedIndex(-1);
            Combo3.setSelectedIndex(-1);
            txt_publisher.setText("");
            txt_price.setText("");
            txt_pages.setText("");
            String[][] data = db.Select("SELECT * FROM book ORDER BY isbn DESC");
            txt_isbn.setText(data[0][0]);
    }//GEN-LAST:event_AddNewActionPerformed

    private void SerachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SerachActionPerformed
        DatabaseConnectivity db = new DatabaseConnectivity();
        
        //String book_isbn = txt_isbn.getText();
         String book_name = txt_name.getText();

        String[][] data = db.Select("SELECT * FROM book WHERE name LIKE '" + book_name + "'" );
        db.rs=db.executeQuery("SELECT * FROM book WHERE name LIKE '" + book_name + "'" );
        
       //String[][] data1 = db.Select("SELECT * FROM book WHERE isbn LIKE '" + book_isbn + "'");
        //db.rs = db.executeQuery("Select * FROM book WHERE isbn LIKE '" + book_isbn + "'");
         try {
            if (db.rs.next()) {
                
        //Tools.Helper.show(this, "Yeh!!...Book Was Found  ");
        txt_isbn.setText(data[0][0]);
//        txt_name.setText(data[0][1]);
        Combo1.setSelectedItem(data[0][2]);
        Combo2.setSelectedItem(data[0][3]);
        Combo3.setSelectedItem(data[0][4]);
//txt_edition.setText(data[0][4]);
        txt_publisher.setText(data[0][5]);
        txt_price.setText(data[0][6]);
        txt_pages.setText(data[0][7]);
        Tools.Helper.show(this, "Yeh!!...Book Was Found  ");
                } else {
                Tools.Helper.show(this, "Record Not Found");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
             
////        if(txt_isbn.getText().equals(" + book_isbn +"))
////        {
////           Tools.Helper.show(this, "Yeh!!...Book Was Found  ");
////        }else {
////                Tools.Helper.show(this, "Record Not Found  ");
////                   }  
              
    }//GEN-LAST:event_SerachActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        DatabaseConnectivity db = new DatabaseConnectivity();

        String isbn = txt_isbn.getText();
        String name = txt_name.getText();
        String type=Combo1.getSelectedItem().toString();
        String status=Combo2.getSelectedItem().toString();
        String edition=Combo3.getSelectedItem().toString();
        //String edition = txt_edition.getText();
        String publisher = txt_publisher.getText();
        String price = txt_price.getText();
        String pages = txt_pages.getText();
        
        String book_isbn = BookList.book_isbn;
        
        //String sql_qry = "UPDATE book SET isbn = '" + isbn + "', name = '" + name + "', type = '" + type + "', status = '" + status + "', edition = '" + edition + "' , publisher = '" + publisher + "', price = '" + price + "', pages = '" + pages + "' WHERE isbn = " + book_isbn;
        String sql_qry = "UPDATE book SET name = '" + name + "', type = '" + type + "', status = '" + status + "', edition = '" + edition + "' , publisher = '" + publisher + "', price = '" + price + "', pages = " + pages + " WHERE isbn LIKE '" + isbn + "'";
        
        boolean r = db.execute(sql_qry);

        if (r) {
            this.setVisible(true);
            //new BookList().setVisible(true);
            Tools.Helper.show(this, "Book is Successfully Updated");
        } else {
            Tools.Helper.show(this, "opps, please try again!");
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
       // this.setVisible(false);  
        this.hide();
        
//        new Home().setVisible(true);
       
    }//GEN-LAST:event_BackActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Tools.Helper.setCenter(this);
        DatabaseConnectivity db = new DatabaseConnectivity();
        String[][] data = db.Select("SELECT * FROM book ORDER BY isbn DESC");
            txt_isbn.setText(data[0][0]);
             txt_isbn.requestFocus(true);

    }//GEN-LAST:event_formWindowOpened

    private void Serach1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Serach1ActionPerformed
        // TODO add your handling code here:
         DatabaseConnectivity db = new DatabaseConnectivity();
        
        String book_isbn = txt_isbn.getText();
        String[][] data = db.Select("SELECT * FROM book WHERE isbn LIKE '" + book_isbn + "'");
        db.rs = db.executeQuery("Select * FROM book WHERE isbn LIKE '" + book_isbn + "'");
         try {
            if (db.rs.next()) {
                
        //Tools.Helper.show(this, "Yeh!!...Book Was Found  ");
        
         txt_name.setText(data[0][1]);
        Combo1.setSelectedItem(data[0][2]);
        Combo2.setSelectedItem(data[0][3]);
        Combo3.setSelectedItem(data[0][4]);
//txt_edition.setText(data[0][4]);
        txt_publisher.setText(data[0][5]);
        txt_price.setText(data[0][6]);
        txt_pages.setText(data[0][7]);
        Tools.Helper.show(this, "Yeh!!...Book Was Found  ");
                } else {
                Tools.Helper.show(this, "Record Not Found");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
             
////        if(txt_isbn.getText().equals(" + book_isbn +"))
////        {
    }//GEN-LAST:event_Serach1ActionPerformed

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
            java.util.logging.Logger.getLogger(book_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(book_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(book_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(book_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new book_add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNew;
    private javax.swing.JButton Back;
    private javax.swing.JComboBox<String> Combo1;
    private javax.swing.JComboBox<String> Combo2;
    private javax.swing.JComboBox<String> Combo3;
    private javax.swing.JButton Serach;
    private javax.swing.JButton Serach1;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField txt_isbn;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_pages;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_publisher;
    // End of variables declaration//GEN-END:variables
}
