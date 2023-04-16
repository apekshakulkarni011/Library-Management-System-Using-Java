
package library_managment_system2;

import Tools.DatabaseConnectivity;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class issue_book extends javax.swing.JFrame {

    /**
     * Creates new form issue_book
     */
    public issue_book() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_isbn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        SearchB = new javax.swing.JButton();
        txt_pages = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_type = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_publisher = new javax.swing.JTextField();
        txt_book_name = new javax.swing.JTextField();
        txt_price = new javax.swing.JTextField();
        txt_edition = new javax.swing.JTextField();
        txt_status = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabelMEM = new javax.swing.JLabel();
        BKLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txt_dept = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_gender = new javax.swing.JTextField();
        txt_phone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_member_name = new javax.swing.JTextField();
        SearchM = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txt_member_id = new javax.swing.JTextField();
        txt_mtype = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_year = new javax.swing.JTextField();
        Date1 = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
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

        jLabel17.setBackground(new java.awt.Color(153, 102, 0));
        jLabel17.setFont(new java.awt.Font("Bookman Old Style", 3, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Issed Detail's");
        jLabel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 1, true));
        jLabel17.setOpaque(true);
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 340, 50));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/GoBack.JPG"))); // NOI18N
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jLabel4.setBackground(new java.awt.Color(153, 102, 0));
        jLabel4.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Publisher : -");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 153, 0), 2, true));
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, 170, 40));

        txt_isbn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jPanel1.add(txt_isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 157, 40));

        jLabel3.setBackground(new java.awt.Color(153, 102, 0));
        jLabel3.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Edition : -");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 153, 0), 2, true));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 170, 40));

        SearchB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/Serach Icon34.png"))); // NOI18N
        SearchB.setOpaque(false);
        SearchB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBActionPerformed(evt);
            }
        });
        jPanel1.add(SearchB, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 50, 50));

        txt_pages.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_pages.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txt_pages.setEnabled(false);
        jPanel1.add(txt_pages, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 620, 130, 40));

        jLabel5.setBackground(new java.awt.Color(153, 102, 0));
        jLabel5.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Price : -");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 153, 0), 2, true));
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, 170, 40));

        jLabel2.setBackground(new java.awt.Color(153, 102, 0));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name : -");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 153, 0), 2, true));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 170, 40));

        jLabel1.setBackground(new java.awt.Color(153, 102, 0));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ISBN Code : -");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 2, true));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 170, 40));

        txt_type.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_type.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_type.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txt_type.setEnabled(false);
        jPanel1.add(txt_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 280, 40));

        jLabel6.setBackground(new java.awt.Color(153, 102, 0));
        jLabel6.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pages : -");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 153, 0), 2, true));
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 620, 170, 40));

        txt_publisher.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_publisher.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_publisher.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txt_publisher.setEnabled(false);
        jPanel1.add(txt_publisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 270, 40));

        txt_book_name.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        txt_book_name.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_book_name.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txt_book_name.setEnabled(false);
        jPanel1.add(txt_book_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 280, 40));

        txt_price.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_price.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txt_price.setEnabled(false);
        jPanel1.add(txt_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 560, 130, 40));

        txt_edition.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_edition.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txt_edition.setEnabled(false);
        txt_edition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_editionActionPerformed(evt);
            }
        });
        jPanel1.add(txt_edition, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 130, 40));

        txt_status.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_status.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_status.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txt_status.setEnabled(false);
        jPanel1.add(txt_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 200, 40));

        jLabel13.setBackground(new java.awt.Color(153, 102, 0));
        jLabel13.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Book Genre : -");
        jLabel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 153, 0), 2, true));
        jLabel13.setOpaque(true);
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 170, 40));

        jLabel14.setBackground(new java.awt.Color(153, 102, 0));
        jLabel14.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Book Status : -");
        jLabel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 153, 0), 2, true));
        jLabel14.setOpaque(true);
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 170, 40));

        jLabelMEM.setBackground(new java.awt.Color(153, 153, 0));
        jLabelMEM.setFont(new java.awt.Font("Bookman Old Style", 3, 30)); // NOI18N
        jLabelMEM.setForeground(new java.awt.Color(204, 255, 255));
        jLabelMEM.setText("Memebr Detail's");
        jLabelMEM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelMEM.setOpaque(true);
        jPanel1.add(jLabelMEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 110, 270, 40));

        BKLabel.setBackground(new java.awt.Color(153, 153, 0));
        BKLabel.setFont(new java.awt.Font("Bookman Old Style", 3, 30)); // NOI18N
        BKLabel.setForeground(new java.awt.Color(204, 255, 255));
        BKLabel.setText("Book Detail's");
        BKLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BKLabel.setOpaque(true);
        jPanel1.add(BKLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 230, 40));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_dept.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_dept.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_dept.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txt_dept.setEnabled(false);
        jPanel2.add(txt_dept, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 310, 40));

        jLabel7.setBackground(new java.awt.Color(153, 102, 0));
        jLabel7.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Name : -");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 153, 0), 2, true));
        jLabel7.setOpaque(true);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 190, 40));

        jLabel8.setBackground(new java.awt.Color(153, 102, 0));
        jLabel8.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Phone No : -");
        jLabel8.setToolTipText("");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 153, 0), 2, true));
        jLabel8.setOpaque(true);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 190, 40));

        jLabel10.setBackground(new java.awt.Color(153, 102, 0));
        jLabel10.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Corse/Dept : -");
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 153, 0), 2, true));
        jLabel10.setOpaque(true);
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 180, 40));

        txt_gender.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_gender.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txt_gender.setEnabled(false);
        txt_gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_genderActionPerformed(evt);
            }
        });
        jPanel2.add(txt_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 160, 40));

        txt_phone.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_phone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_phone.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txt_phone.setEnabled(false);
        jPanel2.add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 170, 40));

        jLabel9.setBackground(new java.awt.Color(153, 102, 0));
        jLabel9.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Gender :-");
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 153, 0), 2, true));
        jLabel9.setOpaque(true);
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 190, 40));

        txt_member_name.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_member_name.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_member_name.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txt_member_name.setEnabled(false);
        jPanel2.add(txt_member_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 310, 40));

        SearchM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/Serach Icon34.png"))); // NOI18N
        SearchM.setOpaque(false);
        SearchM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchMActionPerformed(evt);
            }
        });
        jPanel2.add(SearchM, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 50, 50));

        jLabel12.setBackground(new java.awt.Color(153, 102, 0));
        jLabel12.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Enrollment No : -");
        jLabel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 2, true));
        jLabel12.setOpaque(true);
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 40));

        txt_member_id.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_member_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_member_idActionPerformed(evt);
            }
        });
        jPanel2.add(txt_member_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 130, 40));

        txt_mtype.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_mtype.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_mtype.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_mtype.setEnabled(false);
        txt_mtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mtypeActionPerformed(evt);
            }
        });
        jPanel2.add(txt_mtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 170, 40));

        jLabel15.setBackground(new java.awt.Color(153, 102, 0));
        jLabel15.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Member Type :-");
        jLabel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 153, 0), 2, true));
        jLabel15.setOpaque(true);
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 190, 40));

        jLabel16.setBackground(new java.awt.Color(153, 102, 0));
        jLabel16.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Year : -");
        jLabel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 2, true));
        jLabel16.setOpaque(true);
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 180, 40));

        txt_year.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_year.setEnabled(false);
        jPanel2.add(txt_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 160, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 580, 520));

        Date1.setBackground(new java.awt.Color(255, 204, 255));
        Date1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 153, 0), 2, true));
        Date1.setDateFormatString("dd-MM-yyyy");
        Date1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Date1.setMaxSelectableDate(new java.util.Date(1735673465000L));
        Date1.setMinSelectableDate(new java.util.Date(1609443065000L));
        jPanel1.add(Date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 720, 220, 50));

        jButton3.setFont(new java.awt.Font("Bookman Old Style", 3, 30)); // NOI18N
        jButton3.setText("Issue");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 790, 190, 60));

        jLabel11.setBackground(new java.awt.Color(153, 102, 0));
        jLabel11.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Issue Date : -");
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 204, 0)));
        jLabel11.setOpaque(true);
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 720, 180, 50));

        Bg.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/ONE 11 BOOKLL.jpeg"))); // NOI18N
        Bg.setText("jLabel18");
        jPanel1.add(Bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 1650, 1300));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 1040));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Tools.Helper.setCenter(this);
        txt_isbn.requestFocus(true);  
    }//GEN-LAST:event_formWindowOpened

    private void SearchBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBActionPerformed
        DatabaseConnectivity db = new DatabaseConnectivity();
        String book_id = txt_isbn.getText();
        String[][] data = db.Select("SELECT * FROM book WHERE isbn = '" + book_id + "'");
        db.rs = db.executeQuery("Select * FROM book WHERE isbn LIKE '" + book_id + "'");
         try {
            if (db.rs.next()) {
        txt_book_name.setText(data[0][1]);
        txt_type.setText(data[0][2]);
        txt_status.setText(data[0][3]);
        txt_edition.setText(data[0][4]);
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
            
    }//GEN-LAST:event_SearchBActionPerformed

    private void SearchMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchMActionPerformed
        DatabaseConnectivity db = new DatabaseConnectivity();
        String member_id = txt_member_id.getText();
        String[][] data = db.Select("SELECT * FROM member WHERE rno = '" + member_id + "'");
        db.rs = db.executeQuery("Select * FROM member WHERE rno LIKE '" + member_id + "'");
         try {
            if (db.rs.next()) {
        txt_member_name.setText(data[0][1]);
        txt_phone.setText(data[0][2]);
        txt_mtype.setText(data[0][3]);
        txt_gender.setText(data[0][4]);
        txt_dept.setText(data[0][5]);
        txt_year.setText(data[0][6]);
        Tools.Helper.show(this, "Yeh!!...Member Was Found  ");
                } else {
                Tools.Helper.show(this, "Record Not Found");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SearchMActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DatabaseConnectivity db = new DatabaseConnectivity();
          if (txt_isbn.getText().isEmpty() || txt_member_id.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(this, "All The Fields Are Mandatory");
        } else {
        String isbn = txt_isbn.getText();
        String rno = txt_member_id.getText();
        //String issue_date = txt_issue_date.getText();
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        String issue_date = dateformat.format(Date1.getDate());
        
        //String return_date = dateformat.format(Date2.getDate());//String issue_date = Date1.getDateFormatString(). //String sql_qry = "INSERT INTO issue VALUES(NULL, " + isbn + "," + rno + " , '" + issue_date + "', null)";
        String sql_qry = "INSERT INTO issue VALUES('" + isbn + "','" + rno + "' , '" + issue_date + "')";
       
        boolean r = db.execute(sql_qry);
        if (r) {
            Tools.Helper.show(this, "Yeh!! Your Book is issued");
            txt_isbn.setText("");
            txt_book_name.setText("");
            txt_type.setText("");
            txt_status.setText("");
            txt_edition.setText("");
            txt_publisher.setText("");
            txt_price.setText("");
            txt_pages.setText("");

            txt_member_id.setText("");
            txt_member_name.setText("");
            txt_phone.setText("");
            txt_mtype.setText("");
            txt_gender.setText("");
            txt_dept.setText("");
            txt_year.setText("");
            
        } else {
            Tools.Helper.show(this, "opps, please try agina!");
        } }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_editionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_editionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_editionActionPerformed

    private void txt_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_genderActionPerformed

    private void txt_mtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mtypeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        //new Home().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_member_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_member_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_member_idActionPerformed

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
            java.util.logging.Logger.getLogger(issue_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(issue_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(issue_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(issue_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new issue_book().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BKLabel;
    private javax.swing.JLabel Bg;
    private com.toedter.calendar.JDateChooser Date1;
    private javax.swing.JButton SearchB;
    private javax.swing.JButton SearchM;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelMEM;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_book_name;
    private javax.swing.JTextField txt_dept;
    private javax.swing.JTextField txt_edition;
    private javax.swing.JTextField txt_gender;
    private javax.swing.JTextField txt_isbn;
    private javax.swing.JTextField txt_member_id;
    private javax.swing.JTextField txt_member_name;
    private javax.swing.JTextField txt_mtype;
    private javax.swing.JTextField txt_pages;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_publisher;
    private javax.swing.JTextField txt_status;
    private javax.swing.JTextField txt_type;
    private javax.swing.JTextField txt_year;
    // End of variables declaration//GEN-END:variables
}
