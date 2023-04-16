
package library_managment_system2;

/**
 *
 * @author Apeksha Kulkarni
 */
public class GetHelp extends javax.swing.JFrame {

    /**
     * Creates new form GetHelp
     */
    public GetHelp() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Go = new javax.swing.JButton();
        Combo1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_ans1 = new javax.swing.JEditorPane();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Go.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 24)); // NOI18N
        btn_Go.setText("GO!!!");
        btn_Go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Go, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 270, 130, 60));

        Combo1.setBackground(new java.awt.Color(255, 204, 255));
        Combo1.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        Combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1] How do I add a new record of a Student/Faculty or Books..?", "2] How will I know that I have sucessfuly saved, updated or deleted the record..?", "3] How should I make changes to the Record that I already saved..?", "4] How should I delete Records from the database..?", "5] What should I do when there is some serious issue with this system..?" }));
        Combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo1ActionPerformed(evt);
            }
        });
        getContentPane().add(Combo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 650, 50));

        txt_ans1.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jScrollPane2.setViewportView(txt_ans1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 600, 170));

        jLabel2.setBackground(new java.awt.Color(153, 0, 0));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Get Help !!!");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 210, 60));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/GoBack.JPG"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/IMG10.jpeg"))); // NOI18N
        jLabel1.setText("0000");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1820, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_GoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GoActionPerformed
        // TODO add your handling code here:
       // String help=(String)Combo1.getSelectedItem();
        try {
        if (Combo1.getSelectedItem().equals("1] How do I add a new record of a Student/Faculty or Books..?"))
       
        {
            //Combo3.removeAllItems();
//            //Combo3.setSelectedItem(null);
//            String a="Hello";
//            a=a+Combo1.getSelectedItem().toString();
            txt_ans1.setText("\n As you have successfully completed the Login part and reached till the Main Menu there you might find numerous other actions/operations that you can perform. Click on the respective menu buttons such as New Student/faculty, New Books Entry,etc. When opened CLICK ON ADD NEW then fill all the text fields with correct information and then CLICK ON SAVE BUTTON.Remember:-The Add New button must be followed with Save button,to successfully save the data into the database.");
            //txt_ans.append(a);
        }
         else
        if (Combo1.getSelectedItem()=="2] How will I know that I have sucessfuly saved, updated or deleted the record..?")
        {
            txt_ans1.setText("Once you have saved,updated or deleted the record successfully you will get a system generated message stating that you have successfully recorded it.\"\n");
        }
         else
        if (Combo1.getSelectedItem().equals("3] How should I make changes to the Record that I already saved..?"))
            {
                    txt_ans1.setText("Its easy to update or make changes to any record as you just have to find the record by its No.,make changes to any field you want and CLICK ON UPDATE BUTTON. Once successfully updated you will get an system generated message.");
            }
         else
        if (Combo1.getSelectedItem().equals("4] How should I delete Records from the database..?"))
            {
                    txt_ans1.setText("Its easy to delete any record as you just have to find the record by its No.,and CLICK ON DELETE BUTTON. Once successfully deleted it you will get an system generated message. Note: Only Delete when its necessary.");
            }
         else
        if (Combo1.getSelectedItem().equals("5] What should I do when there is some serious issue with this system..?"))
            {
                    txt_ans1.setText("You can contact us via. through our E-Mail-ID:-PIBMLMS@gmail.com or Phone No. 020-4762341. We will definately try to solve your issue. ThankYou to use our system :");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_GoActionPerformed

    private void Combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo1ActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_Combo1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       // this.setVisible(false); 
        this.hide();
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
            java.util.logging.Logger.getLogger(GetHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GetHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GetHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GetHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GetHelp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combo1;
    private javax.swing.JButton btn_Go;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JEditorPane txt_ans1;
    // End of variables declaration//GEN-END:variables
}
