
package library_managment_system2;

import Tools.DatabaseConnectivity;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.swing.JTextField;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Apeksha Kulkarni
 */
public class FineCal extends javax.swing.JFrame {

    /**
     * Creates new form FineCal
     */
    public FineCal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Date1 = new com.toedter.calendar.JDateChooser();
        Date2 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        txt_days = new javax.swing.JTextField();
        txt_fine = new javax.swing.JTextField();
        txt_rno = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_reciept = new javax.swing.JTextArea();
        txt_refer = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Print = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_sign = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        SEARCH = new javax.swing.JButton();
        txt_ret = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/GoBack.JPG"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jLabel10.setBackground(new java.awt.Color(102, 0, 102));
        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 255, 255));
        jLabel10.setText("Fine Calculation !!");
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 204), 2, true));
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 350, 50));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Date1.setDateFormatString("dd-MM-yyyy");
        Date1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(Date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 240, 40));

        Date2.setDateFormatString("dd-MM-yyyy");
        Date2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(Date2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 240, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/Calculate.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 60, 60));

        txt_days.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_days.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_daysActionPerformed(evt);
            }
        });
        jPanel1.add(txt_days, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 129, 40));

        txt_fine.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(txt_fine, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 129, 40));

        txt_rno.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(txt_rno, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 130, 40));

        txt_name.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 270, 40));

        jLabel1.setBackground(new java.awt.Color(102, 51, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enrollment No :-");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 120, 40));

        jLabel2.setBackground(new java.awt.Color(102, 51, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Full Name:-");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 120, 40));

        txt_reciept.setColumns(20);
        txt_reciept.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        txt_reciept.setRows(5);
        jScrollPane1.setViewportView(txt_reciept);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 450, 540));

        txt_refer.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(txt_refer, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 210, 40));

        jLabel3.setBackground(new java.awt.Color(102, 51, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Reference No:- ");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, 40));

        jLabel4.setBackground(new java.awt.Color(102, 51, 0));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Librarian Sign :-");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 140, 40));

        jLabel5.setBackground(new java.awt.Color(102, 51, 0));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("No Of Days Delay :- ");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 140, 40));

        jLabel6.setBackground(new java.awt.Color(102, 51, 0));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Return On:- ");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 130, 40));

        jLabel7.setBackground(new java.awt.Color(102, 51, 0));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Return Date Was :-");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 130, 40));

        Print.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        Print.setText("Print ");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });
        jPanel1.add(Print, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 560, 120, 60));

        Clear.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel1.add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 560, 120, 60));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/Append2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 70, 60));

        txt_sign.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_sign.setText("______________________");
        jPanel1.add(txt_sign, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, 130, 40));

        jLabel8.setBackground(new java.awt.Color(102, 51, 0));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fine In Rs :-");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 140, 40));

        SEARCH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/SearchPur.png"))); // NOI18N
        SEARCH.setOpaque(false);
        SEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCHActionPerformed(evt);
            }
        });
        jPanel1.add(SEARCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 50, 50));

        txt_ret.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(txt_ret, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 130, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 1130, 770));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/Menu_Back.jpeg"))); // NOI18N
        jLabel9.setText("0");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1590, 820));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
            SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy",Locale.ENGLISH);
            Date firstDate=Date1.getDate();
            Date secondDate = Date2.getDate();

                        long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
                        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

                       txt_days.setText(String.valueOf(diff));

  } catch (Exception e) {
   e.printStackTrace();
        }
    int a=Integer.parseInt(txt_days.getText());
        int result=a*5;
//        txt_fine.setText("Fine Of "+a+" Days is Rs "+result);

    txt_fine.setText( "Rs. "+result);
     //Tools.Helper.show(this, "Fine Of "+a+" Days is Collected...");

    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_daysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_daysActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_daysActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        txt_refer.setText(" ");
        txt_rno.setText(" ");
        txt_name.setText(" ");
        Date1.setDateFormatString(" ");
        Date2.setDateFormatString(" ");
        txt_days.setText(" ");
        txt_fine.setText(" ");
        txt_reciept.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        try {
            // TODO add your handling code here:
        
txt_reciept.print();
        } catch (PrinterException ex) {
            Logger.getLogger(FineCal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PrintActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        txt_reciept.append("\t\t\t Library Penalty Reciept \n\n" + 
                "Reference No:       \t\t\t" + txt_refer.getText()+
                "\n==================================================================\n" +
                    "Enrollment No:  \t\t\t" + txt_rno.getText() + "\n\n" +
                    "Member Name:    \t\t\t" + txt_name.getText() + "\n\n" +
                    "Return Date Was:\t\t\t" + Date1.getDate() + "\n\n" +
                    "Return On:      \t\t\t" + Date2.getDate()+ "\n\n" +
                   "No Of Days Delay:\t\t\t" + txt_days.getText() + "\n\n" +
                    "Fine In Rs:     \t\t\t" + txt_fine.getText()+ "\n\n\n\n\n\n\n\n\n\n" + 
                    
                   "\t\t\t\t Librarian Sign: "+ txt_sign.getText()+ "\n\n" +
                "======================================================================"
                                
                                       
                );
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        new ReturnBook().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void SEARCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCHActionPerformed
               DatabaseConnectivity db = new DatabaseConnectivity();
               try {
            
            String member_id = txt_rno.getText();

       String[][] data = db.Select("SELECT * FROM loan WHERE rno = '" + member_id + "'");
            txt_name.setText(data[0][1]);
           // Date1.setDate(data[0][5]);
            txt_ret.setText(data[0][5]);
//            txt_phone_no.setText(data[0][2]);
//            txt_mtype.setText(data[0][3]);
//            txt_gender.setText(data[0][4]);
//            txt_dept.setText(data[0][5]);
//            txt_year.setText(data[0][6]);
             } catch (Exception e) {
        }

    }//GEN-LAST:event_SEARCHActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Tools.Helper.setCenter(this);
        DatabaseConnectivity db = new DatabaseConnectivity();
        String[][] data = db.Select("SELECT * FROM fine ORDER BY ref_no DESC");
        //String sql = db.Select("SELECT 'ref_no' FROM 'fine' ORDER BY ref_no DESC LIMIT 1");
            txt_refer.setText(data[0][0]);
                 txt_refer.requestFocus(true);
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
    public static void main(String arr[]) {
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
            java.util.logging.Logger.getLogger(FineCal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FineCal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FineCal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FineCal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FineCal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private com.toedter.calendar.JDateChooser Date1;
    private com.toedter.calendar.JDateChooser Date2;
    private javax.swing.JButton Print;
    private javax.swing.JButton SEARCH;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_days;
    private javax.swing.JTextField txt_fine;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextArea txt_reciept;
    private javax.swing.JTextField txt_refer;
    private javax.swing.JTextField txt_ret;
    private javax.swing.JTextField txt_rno;
    private javax.swing.JTextField txt_sign;
    // End of variables declaration//GEN-END:variables
}
