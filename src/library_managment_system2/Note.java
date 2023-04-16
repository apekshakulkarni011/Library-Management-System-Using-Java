
package library_managment_system2;

/**
 *
 * @author Apeksha Kulkarni
 */
public class Note extends javax.swing.JFrame {

    /**
     * Creates new form Note
     */
    public Note() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TB1 = new javax.swing.JTextField();
        TB2 = new javax.swing.JTextField();
        TB3 = new javax.swing.JTextField();
        Btn_Add = new javax.swing.JButton();
        BTN1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        BTN2 = new javax.swing.JButton();
        BTN3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_add = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TB1.setFont(new java.awt.Font("Comic Sans MS", 3, 16)); // NOI18N
        TB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TB1ActionPerformed(evt);
            }
        });
        getContentPane().add(TB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 560, 50));

        TB2.setFont(new java.awt.Font("Comic Sans MS", 3, 16)); // NOI18N
        getContentPane().add(TB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 560, 50));

        TB3.setFont(new java.awt.Font("Comic Sans MS", 3, 16)); // NOI18N
        getContentPane().add(TB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 560, 50));

        Btn_Add.setFont(new java.awt.Font("Bookman Old Style", 3, 24)); // NOI18N
        Btn_Add.setText("Add");
        Btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AddActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 480, 100, 80));

        BTN1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/Cancel.png"))); // NOI18N
        BTN1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 3, true));
        BTN1.setHideActionText(true);
        BTN1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN1ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 180, 60, 60));

        jLabel2.setBackground(new java.awt.Color(102, 0, 51));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Note !!!");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 180, 60));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/GoBack.JPG"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        BTN2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/Cancel.png"))); // NOI18N
        BTN2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 3, true));
        BTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN2ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 260, 60, 60));

        BTN3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/Cancel.png"))); // NOI18N
        BTN3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 3, true));
        BTN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN3ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 340, 60, 60));

        txt_add.setColumns(20);
        txt_add.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txt_add.setRows(5);
        jScrollPane1.setViewportView(txt_add);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 650, 140));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/gb5.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 880, 480));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/Menu_Back.jpeg"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TB1ActionPerformed
        // TODO add your handling code here:
//        String  setText=TB1.getText();
//        txt_add.setText(setText);
    }//GEN-LAST:event_TB1ActionPerformed

    private void Btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AddActionPerformed
      
//          String  a = TB1.getText();
//          String b=TB2.getText();
//          String c=TB3.getText();
//          txt_add.setText(a);
//          //txt_add.setText("+setText","+setText1","c");
//txt_add.append("\t\t\t" + TB1.getText()+ "\n\n" +  \t\t\t" + TB2.getText() + "\n\n" + \t\t\t" + TB3.getText() + "\n\n"); 
    //   
    txt_add.setText(TB1.getText()+ "\n\n"
            + TB2.getText()+ "\n\n" 
            + TB3.getText()
            ); 
    }//GEN-LAST:event_Btn_AddActionPerformed

    private void BTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN1ActionPerformed
        TB1.setText(" ");
    }//GEN-LAST:event_BTN1ActionPerformed

    private void BTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN2ActionPerformed
        // TODO add your handling code here:
         TB2.setText(" ");
    }//GEN-LAST:event_BTN2ActionPerformed

    private void BTN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN3ActionPerformed
        // TODO add your handling code here:
         TB3.setText(" ");
           
    }//GEN-LAST:event_BTN3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        //new Home().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
         TB1.requestFocus(true);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Note.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Note.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Note.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Note.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Note().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN1;
    private javax.swing.JButton BTN2;
    private javax.swing.JButton BTN3;
    private javax.swing.JButton Btn_Add;
    private javax.swing.JTextField TB1;
    private javax.swing.JTextField TB2;
    private javax.swing.JTextField TB3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txt_add;
    // End of variables declaration//GEN-END:variables
}
