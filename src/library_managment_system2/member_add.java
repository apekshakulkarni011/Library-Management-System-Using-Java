
package library_managment_system2;

import Tools.DatabaseConnectivity;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


 
public class member_add extends javax.swing.JFrame {

    /**
     * Creates new form member_add
     */
    public member_add() {
        initComponents();
       // Combo2.setSelectedItem(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_phone_no = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Combo1 = new javax.swing.JComboBox<>();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        Combo2 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        Combo3 = new javax.swing.JComboBox<>();
        AddNew = new javax.swing.JButton();
        Searchbtn = new javax.swing.JButton();
        EDIT = new javax.swing.JButton();
        mob = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(102, 51, 0));
        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 21)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phone No :-");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 51), 2, true));
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 170, 40));

        txt_name.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 280, 40));

        jLabel3.setBackground(new java.awt.Color(102, 51, 0));
        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 21)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gender :-");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 51), 2, true));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 150, 40));

        jLabel1.setBackground(new java.awt.Color(102, 51, 0));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Full Name : -");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 51), 2, true));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 180, 40));

        txt_phone_no.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txt_phone_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_phone_noActionPerformed(evt);
            }
        });
        txt_phone_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_phone_noKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_phone_noKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_phone_noKeyTyped(evt);
            }
        });
        jPanel1.add(txt_phone_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 220, 40));

        jButton1.setFont(new java.awt.Font("Bookman Old Style", 3, 27)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 220, 60));

        jLabel5.setBackground(new java.awt.Color(102, 51, 0));
        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 21)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Enrollment No : -");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 51), 2, true));
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 190, 40));

        txt_id.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel1.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 130, 40));

        jLabel7.setBackground(new java.awt.Color(102, 51, 0));
        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 21)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Member Type : -");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 51), 2, true));
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 180, 40));

        Combo1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Faculty", "Student" }));
        Combo1.setName(""); // NOI18N
        Combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo1ActionPerformed(evt);
            }
        });
        jPanel1.add(Combo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 50, 170, 40));

        Male.setBackground(new java.awt.Color(0, 0, 0));
        btngender.add(Male);
        Male.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        Male.setForeground(new java.awt.Color(255, 255, 255));
        Male.setText("Male");
        Male.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 2, true));
        Male.setBorderPainted(true);
        jPanel1.add(Male, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 160, 110, 40));

        Female.setBackground(new java.awt.Color(0, 0, 0));
        btngender.add(Female);
        Female.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        Female.setForeground(new java.awt.Color(255, 255, 255));
        Female.setText("Female");
        Female.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 2, true));
        Female.setBorderPainted(true);
        jPanel1.add(Female, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 160, 110, 40));

        jLabel8.setBackground(new java.awt.Color(102, 51, 0));
        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 21)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Course/Dept : -");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 51), 2, true));
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 170, 40));

        Combo2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Combo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Your Department", "Bachelor Of Commerce(BCOM)", "Bachelor Of Business Administration(BBA)", "Bachelor Of Computer Application(BBA(CA))", "Master In Commerce(MCOM)", "Master In Business Administration(MBA)", "Master In Computer Application(MCA)", "All Of The Above", " " }));
        Combo2.setName(""); // NOI18N
        Combo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo2ActionPerformed(evt);
            }
        });
        jPanel1.add(Combo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 270, 300, 40));

        jLabel9.setBackground(new java.awt.Color(102, 51, 0));
        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 21)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Year :-");
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 51), 2, true));
        jLabel9.setOpaque(true);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 140, 40));

        Combo3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Combo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Year", "All Years" }));
        Combo3.setName(""); // NOI18N
        Combo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo3ActionPerformed(evt);
            }
        });
        jPanel1.add(Combo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 370, 250, 40));

        AddNew.setFont(new java.awt.Font("Bookman Old Style", 3, 27)); // NOI18N
        AddNew.setText("Add New");
        AddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewActionPerformed(evt);
            }
        });
        jPanel1.add(AddNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 210, 60));

        Searchbtn.setBackground(new java.awt.Color(51, 255, 204));
        Searchbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/Serach Icon34.png"))); // NOI18N
        Searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 50, 50));

        EDIT.setFont(new java.awt.Font("Bookman Old Style", 3, 27)); // NOI18N
        EDIT.setText("Update");
        EDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITActionPerformed(evt);
            }
        });
        jPanel1.add(EDIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 470, 220, 60));

        mob.setBackground(new java.awt.Color(204, 255, 204));
        mob.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        mob.setForeground(new java.awt.Color(255, 0, 0));
        mob.setText("Mobile No Should atleast 10 digit !!");
        mob.setEnabled(false);
        mob.setOpaque(true);
        jPanel1.add(mob, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 220, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 1190, 560));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/GoBack.JPG"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 3, 36)); // NOI18N
        jLabel6.setText("Member Detail's");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 310, 50));

        Bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/Background.jpg"))); // NOI18N
        Bg.setName(""); // NOI18N
        getContentPane().add(Bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1910, 900));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Male.setActionCommand("Male");
        Female.setActionCommand("Female");
        
        
        DatabaseConnectivity db = new DatabaseConnectivity();
        String member_id = txt_id.getText();
             String[][] data = db.Select("SELECT * FROM member WHERE rno LIKE '" + member_id + "'");
        db.rs = db.executeQuery("Select * FROM member WHERE rno LIKE '" + member_id + "'");
        try {
                    if (db.rs.next()) {
                        Tools.Helper.show(this, "Member/Student is Already Exist !! Please Enter Unique Enrollment No");
                         txt_id.setText("");
               } else { 
        if (txt_id.getText().isEmpty() || txt_name.getText().isEmpty() || txt_phone_no.getText().isEmpty() )
        {
           JOptionPane.showMessageDialog(this, "All The Fields Are Mandatory");
        }
        else {
        String rno = txt_id.getText();
        String name = txt_name.getText();
       // String last_name = txt_last_name.getText();
        //String gender = cb_gender.getSelectedItem().toString();
        String phone_no = txt_phone_no.getText();
        String member_type=Combo1.getSelectedItem().toString();
       String gender = btngender.getSelection().getActionCommand();
       
//        if (btngender.equals("Male"))
//        {
//           String gender=Male.getText();        
//        }
//        else
//        {
//            String gender=Female.getText();
//        }
        String dept=Combo2.getSelectedItem().toString();

        String year=Combo3.getSelectedItem().toString();
        if(phone_no.matches("^[0-9]*$") && phone_no.length()!=10)
        {
           txt_phone_no.setForeground(Color.red);
            mob.enable(true);
            mob.setText("Please Enter Valid Mobile No");
        }
        else {
             txt_phone_no.setForeground(Color.black);
        String sql_qry = "INSERT INTO member VALUES ('" + rno + "', '" + name + "', " + phone_no + ", '" + member_type + "', '" + gender + "', '" + dept + "', '" + year + "')";
        boolean r = db.execute(sql_qry); 
        if (r) {
            Tools.Helper.show(this, "Member is Successfully inserted");
            
            //txt_id.setText("");
            txt_name.setText("");
            //txt_last_name.setText("");
            txt_phone_no.setText("");
            //btngender.getSelection();
            Combo1.addItem("");
            Combo2.addItem("");
            Combo3.addItem("");
            
        
            
            //btngender.getSelection("");
//            Combo1.getSelectedItem();
//            Combo2.getSelectedItem();
//            Combo3.getSelectedItem();
        
            
        } else {
            Tools.Helper.show(this, "opps, please try again!");
        }
        } } }      
                } catch (SQLException ex) {
                    Logger.getLogger(member_add.class.getName()).log(Level.SEVERE, null, ex);
                }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Tools.Helper.setCenter(this);
        txt_id.requestFocus(true);  
         Tools.Helper.setCenter(this);
        DatabaseConnectivity db = new DatabaseConnectivity();
        String[][] data = db.Select("SELECT * FROM member ORDER BY rno DESC");
            txt_id.setText(data[0][0]);

         
//        DatabaseConnectivity db = new DatabaseConnectivity();
//        String member_id = Member_list.member_id;
//        String[][] data = db.Select("SELECT * FROM member WHERE rno = " + member_id);
//        
//        txt_name.setText(data[0][2]);
//        //txt_last_name.setText(data[0][3]);
//        txt_phone_no.setText(data[0][3]);
//        Combo1.addItem(data[0][4]);
//        //btngender.equals(data[0][5]);
//        Combo2.addItem(data[0][6]);
//        Combo3.addItem(data[0][7]);
//        //btngender.getSelection().equals(data[0][5]);
//        //gender.setSelectedItem(data[0][3]);
    }//GEN-LAST:event_formWindowOpened

    private void Combo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo2ActionPerformed
      try
      {
        if (Combo2.getSelectedItem().equals("Bachelor Of Commerce(BCOM)"))
        {
            Combo3.removeAllItems();
            Combo3.setSelectedItem("");
            Combo3.addItem("Choose Your Year");
            Combo3.addItem("All Years");
            Combo3.addItem("F.Y BCOM");
            Combo3.addItem("S.Y BCOM");
            Combo3.addItem("T.Y BCOM"); 
            
        }
         else
            if (Combo2.getSelectedItem().equals("Bachelor Of Business Administration(BBA)"))
        {
            Combo3.removeAllItems();
            Combo3.setSelectedItem("");
            Combo3.addItem("Choose Your Year");
            Combo3.addItem("All Years");
            Combo3.addItem("F.Y BBA");
            Combo3.addItem("S.Y BBA");
            Combo3.addItem("T.Y BBA");
        }
         else
        if (Combo2.getSelectedItem().equals("Bachelor Of Computer Application(BBA(CA))"))
        {
            Combo3.removeAllItems();
           Combo3.setSelectedItem("");
            Combo3.addItem("Choose Your Year");
            Combo3.addItem("All Years");
            Combo3.addItem("F.Y BCA");
            Combo3.addItem("S.Y BCA");
            Combo3.addItem("T.Y BCA");
        }
         else
        if (Combo2.getSelectedItem().equals("Master In Commerce(MCOM)"))
        {
            Combo3.removeAllItems();
            Combo3.setSelectedItem("");
            Combo3.addItem("Choose Your Year");
            Combo3.addItem("All Years");
            Combo3.addItem("F.Y MCOM");
            Combo3.addItem("S.Y MCOM");
        }
         else
        if (Combo2.getSelectedItem().equals("Master In Business Administration(MBA)"))
        {
            Combo3.removeAllItems();
           Combo3.setSelectedItem("");
            Combo3.addItem("Choose Your Year");
            Combo3.addItem("All Years");
            Combo3.addItem("F.Y MBA");
            Combo3.addItem("S.Y MBA");
            
        }
         else
        if (Combo2.getSelectedItem().equals("Master In Computer Application(MCA)"))
        {
            Combo3.removeAllItems();
            Combo3.setSelectedItem("");
            Combo3.addItem("Choose Your Year");
            Combo3.addItem("All Years");
            Combo3.addItem("F.Y MCA");
            Combo3.addItem("S.Y MCA");
             
        }
      }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_Combo2ActionPerformed
    
    
    
    
    
    
    private void Combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo1ActionPerformed
        // TODO add your handling code here:
        if (Combo1.getSelectedItem().equals("Faculty")) 
        {
            Combo2.setSelectedIndex(7);
            Combo2.disable();
            Combo3.setSelectedIndex(1);
            //Combo3.setSelectedItem("All Years");
            Combo3.disable();    
        }
        else{
            Combo2.setSelectedIndex(0);
            Combo2.enable();
            Combo3.setSelectedIndex(0);
            Combo3.enable();
        }
    }//GEN-LAST:event_Combo1ActionPerformed

    private void SearchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbtnActionPerformed
        DatabaseConnectivity db = new DatabaseConnectivity();
       
        String member_id = txt_id.getText();
        String[][] data = db.Select("SELECT * FROM member WHERE rno = '" + member_id + "'");
        db.rs = db.executeQuery("Select * FROM member WHERE rno LIKE '" + member_id + "'");
         try {
            if (db.rs.next()) {
       // String type = Combo1.getName();
        //String[][] aa = db.Select("SELECT * FROM member WHERE membre_type = " + type);  
        txt_name.setText(data[0][1]);
        txt_phone_no.setText(data[0][2]);
        //Combo1.addItem(data[0][4]);
        Combo1.setSelectedItem(data[0][3]);
        btngender.equals(data[0][4]);
        //Male.setText(data[0][4]);

        if (btngender.equals("Male"))
        {
            Male.setSelected(true);
            Female.setSelected(false);
            Male.setText(data[0][4]);
        }
        else
        //if (btngender.equals("Female"))
        {
            Female.setSelected(true);
            Male.setSelected(false);
            Female.setText(data[0][4]);
        }
        //btngender.clearSelection();
        //btngender.getButtonCount();
        Combo2.setSelectedItem(data[0][5]);
        Combo3.setSelectedItem(data[0][6]);
        //btngender.getSelection(data[0][5]);
        Tools.Helper.show(this, "Yeh!!...Member Was Found  ");
                } else {
                Tools.Helper.show(this, "Record Not Found");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SearchbtnActionPerformed

    private void AddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewActionPerformed
        txt_id.requestFocus(true);         
            txt_id.setText("");
            txt_name.setText("");
            //txt_last_name.setText("");
            txt_phone_no.setText("");
            //btngender.getSelection("");
            //Combo1.setSelectedItem(" ");
           //Combo1.removeItem("");
            Combo1.setSelectedIndex(0);
            Combo2.setSelectedIndex(0);
            Combo3.setSelectedIndex(0);
            
            DatabaseConnectivity db = new DatabaseConnectivity();
            String[][] data = db.Select("SELECT * FROM member ORDER BY rno DESC");
            txt_id.setText(data[0][0]);
    }//GEN-LAST:event_AddNewActionPerformed

    private void EDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITActionPerformed
         DatabaseConnectivity db = new DatabaseConnectivity();
        
//        String member_id = txt_id.getText();.
        //String member_id = txt_id.getText();
        String rno = txt_id.getText();

        String name = txt_name.getText();
        String phone_no = txt_phone_no.getText();
        String member_type=Combo1.getSelectedItem().toString();
        //String gender = btngender.getSelection().getActionCommand();
        String dept=Combo2.getSelectedItem().toString();
        String year=Combo3.getSelectedItem().toString();
        
        String member_id = Member_list.member_id;
        
//        String qry = "UPDATE member SET rno = '" + rno + "', name = '" + name + "', phone_no = '" + phone_no + "', member_type = '" + member_type + "', dept = '" + dept + "', year = '" + year + "' WHERE rno LIKE '" + rno + "'";
        String qry = "UPDATE member SET rno = '" + rno + "', name = '" + name + "', phone_no = '" + phone_no + "', member_type = '" + member_type + "', dept = '" + dept + "', year = '" + year + "' WHERE rno LIKE '" + rno + "'";
        
        boolean r = db.execute(qry);
        if (r) {
            
            this.setVisible(true);
            //new Member_list().setVisible(true);
            Tools.Helper.show(this, "Member is successfully updated");
            
        } else {
            Tools.Helper.show(this, "opps, please try again!");
        }
        
    }//GEN-LAST:event_EDITActionPerformed

    private void Combo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Combo3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
////        this.setVisible(false);
////        new Home().setVisible(true);
    this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void txt_phone_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_phone_noActionPerformed
        // TODO add your handling code here:
        // if(txtphone_no.matches("^[0-9]*$") && phone_no.length()!=10)
       
    }//GEN-LAST:event_txt_phone_noActionPerformed

    private void txt_phone_noKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phone_noKeyPressed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_txt_phone_noKeyPressed

    private void txt_phone_noKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phone_noKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_phone_noKeyReleased

    private void txt_phone_noKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phone_noKeyTyped
        // TODO add your handling code here:
        if (txt_phone_no.getText().length()<9)
        
        {
           txt_phone_no.setForeground(Color.red);
            mob.enable(true);
            mob.setText("Please Enter Valid Mobile No");
        }
        else {
            if (txt_phone_no.getText().length()>9)
             {
           txt_phone_no.setForeground(Color.red);
            mob.enable(true);
            mob.setText("Please Enter Valid Mobile No");
            }
            else {
                            txt_phone_no.setForeground(Color.black);
                        mob.enable(false);
            }
        }
    }//GEN-LAST:event_txt_phone_noKeyTyped

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
            java.util.logging.Logger.getLogger(member_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(member_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(member_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(member_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
        {
                new member_add().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNew;
    private javax.swing.JLabel Bg;
    private javax.swing.JComboBox<String> Combo1;
    private javax.swing.JComboBox<String> Combo2;
    private javax.swing.JComboBox<String> Combo3;
    private javax.swing.JButton EDIT;
    private javax.swing.JRadioButton Female;
    private javax.swing.JRadioButton Male;
    private javax.swing.JButton Searchbtn;
    private javax.swing.ButtonGroup btngender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mob;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_phone_no;
    // End of variables declaration//GEN-END:variables
}
//         If (Male.Checked) = True 
//            cmd.Parameters.Add(New OleDbParameter("GENDER", CType(OPT1.Text, String)))
//        Else
//            cmd.Parameters.Add(New OleDbParameter("GENDER", CType(OPT2.Text, String)))
//        End If