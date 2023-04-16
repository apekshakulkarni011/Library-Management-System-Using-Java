
package library_managment_system2;

import Tools.DatabaseConnectivity;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


public class ReturnBook extends javax.swing.JFrame {

    /**
     * Creates new form ReturnBook
     */
    public ReturnBook() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        RETURN = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txt_member_id = new javax.swing.JTextField();
        txt_member_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_phone_no = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_mtype = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_gender = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        Year = new javax.swing.JLabel();
        txt_dept = new javax.swing.JTextField();
        txt_year = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txt_book_name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_isbn = new javax.swing.JTextField();
        txt_btype = new javax.swing.JTextField();
        txt_status = new javax.swing.JTextField();
        txt_edition = new javax.swing.JTextField();
        txt_publisher = new javax.swing.JTextField();
        txt_price = new javax.swing.JTextField();
        txt_pages = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        SearchBook = new javax.swing.JButton();
        Date2 = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txt_issue_date = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setBackground(new java.awt.Color(204, 153, 0));
        jLabel18.setFont(new java.awt.Font("Bookman Old Style", 3, 48)); // NOI18N
        jLabel18.setText("Return Detail's");
        jLabel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel18.setOpaque(true);
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 390, 60));

        RETURN.setFont(new java.awt.Font("Bookman Old Style", 3, 22)); // NOI18N
        RETURN.setText("Return");
        RETURN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RETURNActionPerformed(evt);
            }
        });
        jPanel3.add(RETURN, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 760, 240, 50));

        jLabel12.setBackground(new java.awt.Color(102, 0, 0));
        jLabel12.setFont(new java.awt.Font("Bookman Old Style", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Return Date :-");
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 153, 0)));
        jLabel12.setOpaque(true);
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 680, 200, 50));

        txt_member_id.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jPanel3.add(txt_member_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 120, 40));

        txt_member_name.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_member_name.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_member_name.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_member_name.setEnabled(false);
        jPanel3.add(txt_member_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 250, 40));

        jLabel1.setBackground(new java.awt.Color(102, 51, 0));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enrollment No : -");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 51), 2, true));
        jLabel1.setOpaque(true);
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 200, 40));
        jLabel1.getAccessibleContext().setAccessibleName("");

        jLabel2.setBackground(new java.awt.Color(102, 51, 0));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name : -");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jLabel2.setOpaque(true);
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 200, 40));

        jLabel5.setBackground(new java.awt.Color(102, 51, 0));
        jLabel5.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone No : -");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jLabel5.setOpaque(true);
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 200, 40));

        txt_phone_no.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_phone_no.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_phone_no.setEnabled(false);
        jPanel3.add(txt_phone_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 180, 40));

        jLabel3.setBackground(new java.awt.Color(102, 51, 0));
        jLabel3.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Member Type : -");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jLabel3.setOpaque(true);
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 200, 40));

        txt_mtype.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_mtype.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_mtype.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_mtype.setEnabled(false);
        jPanel3.add(txt_mtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 150, 40));

        jLabel4.setBackground(new java.awt.Color(102, 51, 0));
        jLabel4.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gender : -");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jLabel4.setOpaque(true);
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 200, 40));

        txt_gender.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_gender.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_gender.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_gender.setEnabled(false);
        jPanel3.add(txt_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 140, 40));

        jButton1.setBackground(new java.awt.Color(0, 255, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/Serach Icon34.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 50, 50));

        jLabel13.setBackground(new java.awt.Color(102, 51, 0));
        jLabel13.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Course/Dept : -");
        jLabel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jLabel13.setOpaque(true);
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 200, 40));
        jLabel13.getAccessibleContext().setAccessibleName("");

        Year.setBackground(new java.awt.Color(102, 51, 0));
        Year.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        Year.setForeground(new java.awt.Color(255, 255, 255));
        Year.setText("Year : -");
        Year.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        Year.setOpaque(true);
        jPanel3.add(Year, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 540, 200, 40));

        txt_dept.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_dept.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_dept.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_dept.setEnabled(false);
        jPanel3.add(txt_dept, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 280, 40));

        txt_year.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_year.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_year.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_year.setEnabled(false);
        jPanel3.add(txt_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, 200, 40));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_book_name.setColumns(9);
        txt_book_name.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_book_name.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_book_name.setEnabled(false);
        jPanel1.add(txt_book_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 290, 40));

        jLabel7.setBackground(new java.awt.Color(102, 51, 0));
        jLabel7.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Name : -");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, 40));

        jLabel6.setBackground(new java.awt.Color(102, 51, 0));
        jLabel6.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ISBN Code : -");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, 40));

        txt_isbn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_isbn.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_isbn.setEnabled(false);
        jPanel1.add(txt_isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 130, 40));

        txt_btype.setColumns(10);
        txt_btype.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_btype.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_btype.setEnabled(false);
        jPanel1.add(txt_btype, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 300, 40));

        txt_status.setColumns(11);
        txt_status.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_status.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_status.setEnabled(false);
        jPanel1.add(txt_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 230, 40));

        txt_edition.setColumns(12);
        txt_edition.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_edition.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_edition.setEnabled(false);
        jPanel1.add(txt_edition, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 140, 40));

        txt_publisher.setColumns(13);
        txt_publisher.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_publisher.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_publisher.setEnabled(false);
        txt_publisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_publisherActionPerformed(evt);
            }
        });
        jPanel1.add(txt_publisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 280, 40));

        txt_price.setColumns(14);
        txt_price.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_price.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_price.setEnabled(false);
        txt_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_priceActionPerformed(evt);
            }
        });
        jPanel1.add(txt_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 140, 40));

        txt_pages.setColumns(15);
        txt_pages.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_pages.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_pages.setEnabled(false);
        txt_pages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pagesActionPerformed(evt);
            }
        });
        jPanel1.add(txt_pages, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 140, 40));

        jLabel14.setBackground(new java.awt.Color(102, 51, 0));
        jLabel14.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Book Genre : -");
        jLabel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jLabel14.setOpaque(true);
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 170, 40));

        jLabel15.setBackground(new java.awt.Color(102, 51, 0));
        jLabel15.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Book Status :-");
        jLabel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jLabel15.setOpaque(true);
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 170, 40));

        jLabel8.setBackground(new java.awt.Color(102, 51, 0));
        jLabel8.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Edition : -");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 170, 40));

        jLabel9.setBackground(new java.awt.Color(102, 51, 0));
        jLabel9.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Publisher : -");
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jLabel9.setOpaque(true);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 170, 40));

        jLabel10.setBackground(new java.awt.Color(102, 51, 0));
        jLabel10.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Price :-");
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jLabel10.setOpaque(true);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 170, 40));

        jLabel11.setBackground(new java.awt.Color(102, 51, 0));
        jLabel11.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Pages : -");
        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jLabel11.setOpaque(true);
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 170, 40));

        SearchBook.setText("Serach");
        SearchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBookActionPerformed(evt);
            }
        });
        jPanel1.add(SearchBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, -1, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 560, 500));

        Date2.setBackground(new java.awt.Color(255, 204, 255));
        Date2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 153, 0), 2, true));
        Date2.setDateFormatString("dd-MM-yyyy");
        Date2.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jPanel3.add(Date2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 680, 200, 40));

        jLabel16.setBackground(new java.awt.Color(102, 0, 0));
        jLabel16.setFont(new java.awt.Font("Bookman Old Style", 3, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Issue Date Was :-");
        jLabel16.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 153, 0)));
        jLabel16.setOpaque(true);
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 680, 220, 50));

        jButton3.setFont(new java.awt.Font("Bookman Old Style", 3, 20)); // NOI18N
        jButton3.setText("Calculate Fine");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 760, 190, 50));

        txt_issue_date.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        txt_issue_date.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_issue_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_issue_dateActionPerformed(evt);
            }
        });
        jPanel3.add(txt_issue_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 680, 170, 50));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/GoBack.JPG"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/icons/bglibrary2233.jpg"))); // NOI18N
        jLabel17.setText("BgLbl");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1470, 1080));

        jScrollPane2.setViewportView(jPanel3);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 910));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DatabaseConnectivity db = new DatabaseConnectivity();

        try {
            //String member_id = txt_member_id.getText();
            //String rno = txt_member_id.getText();
           //String member_id = txt_member_id.getText();
            
            //String qry = "SELECT * FROM member INNER JOIN loan ON member.id = loan.member_id INNER JOIN book On loan.isbn = book.isbn WHERE loan.member_id = '" + member_id + "' AND loan.return_date is null";
            //String qry = "SELECT * FROM member INNER JOIN issue ON member.rno = issue.rno INNER JOIN book On issue.isbn = book.isbn WHERE issue.rno = '" + member_id + "'";
//AND issue.return_date is null"
            String member_id = txt_member_id.getText();

//            String[][] data = db.Select(qry);
           // String[][] data = db.Select("SELECT * FROM member INNER JOIN issue On member.rno = issue.rno INNER JOIN book On issue.isbn = book.isbn WHERE issue.rno LIKE " + member_id + "'");
        String[][] data = db.Select("SELECT * FROM member WHERE rno = '" + member_id + "'");
            txt_member_name.setText(data[0][1]);
            txt_phone_no.setText(data[0][2]);
            txt_mtype.setText(data[0][3]);
            txt_gender.setText(data[0][4]);
            txt_dept.setText(data[0][5]);
            txt_year.setText(data[0][6]);
            
        String[][] dat=db.Select("SELECT issue_date FROM issue WHERE rno='" + member_id + "'");
                //issue_dt.setDateFormatString(data[0][0]);
                txt_issue_date.setText(dat[0][0]);
                
        String[][] dataa=db.Select("SELECT isbn FROM issue WHERE rno='" + member_id + "'");
        txt_isbn.setText(dataa[0][0]);
 
//                
       String book_id = txt_isbn.getText();
        String[][] info = db.Select("SELECT * FROM book WHERE isbn = '" + book_id + "'");

//            //txt_isbn.setText(data[0][8]);
            txt_book_name.setText(info[0][1]);
            txt_btype.setText(info[0][2]);
            txt_status.setText(info[0][3]);
            txt_edition.setText(info[0][4]);
            txt_publisher.setText(info[0][5]);
            txt_price.setText(info[0][6]);
            txt_pages.setText(info[0][7]);  
            
            
//            txt_isbn.setText(data[0][8]);
//            txt_book_name.setText(data[0][9]);
//            txt_btype.setText(data[0][10]);
//            txt_status.setText(data[0][11]);
//            txt_edition.setText(data[0][12]);
//            txt_publisher.setText(data[0][13]);
//            txt_price.setText(data[0][14]);
//            txt_pages.setText(data[0][15]);  
//            
            
            
            
            
//            //txt_isbn.setText(data[0][6]);
//            txt_isbn.setText(data[0][8]);
//            txt_book_name.setText(data[0][12]);
//            txt_edition.setText(data[0][13]);
//            txt_publisher.setText(data[0][14]);
//            txt_price.setText(data[0][15]);
//            txt_pages.setText(data[0][16]);
//            //txt_pages.setText(data[0][15]);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Tools.Helper.setCenter(this);
         txt_member_id.requestFocus(true);
    }//GEN-LAST:event_formWindowOpened

    private void RETURNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RETURNActionPerformed
        DatabaseConnectivity db = new DatabaseConnectivity();
        //String return_date = txt_return_date.getText();
          if (txt_isbn.getText().isEmpty() || txt_member_id.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(this, "All The Fields Are Mandatory");
        } else {
        String rno = txt_member_id.getText();
        String member_name=txt_member_name.getText();
        
        String isbn = txt_isbn.getText();
        String book_name=txt_book_name.getText();
        
        String issue_date=txt_issue_date.getText();
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        String return_date = dateformat.format(Date2.getDate());
        
       
        String qry = "INSERT INTO loan VALUES ('" + rno + "', '" + member_name + "', '" + isbn + "', '" + book_name + "', '" + issue_date + "', '" + return_date + "')";
        

        //String qry = "UPDATE issue SET return_date = '" + return_date + "' WHERE isbn = '" + isbn + "' AND member_id = '" + member_id + "'";
        boolean r = db.execute(qry);
        if (r) {
            Tools.Helper.show(this, "Book is successfully returned!");
            txt_member_name.setText("");
            txt_phone_no.setText("");
            txt_mtype.setText("");
            txt_gender.setText("");
            txt_dept.setText("");
            txt_year.setText("");
            
            txt_isbn.setText("");
            txt_book_name.setText("");
            txt_edition.setText("");
            txt_publisher.setText("");
            txt_price.setText("");
            txt_pages.setText("");
           
            txt_issue_date.setText("");
            //Date2.setDateFormatString("");
        } else {
            Tools.Helper.show(this, "opps, please try again!");
        }}
    }//GEN-LAST:event_RETURNActionPerformed

    private void txt_pagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pagesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pagesActionPerformed

    private void txt_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_priceActionPerformed

    private void SearchBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBookActionPerformed
        DatabaseConnectivity db = new DatabaseConnectivity();

//        String book_id = txt_isbn.getText();
//        String[][] data = db.Select("SELECT * FROM book WHERE isbn = '" + book_id + "'");
//
//            //txt_isbn.setText(data[0][8]);
//            txt_book_name.setText(data[0][1]);
//            txt_btype.setText(data[0][2]);
//            txt_status.setText(data[0][3]);
//            txt_edition.setText(data[0][4]);
//            txt_publisher.setText(data[0][5]);
//            txt_price.setText(data[0][6]);
//            txt_pages.setText(data[0][7]);  
//            

    }//GEN-LAST:event_SearchBookActionPerformed

    private void txt_issue_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_issue_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_issue_dateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false); 
        //new Home().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_publisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_publisherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_publisherActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new FineCal().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Date2;
    private javax.swing.JButton RETURN;
    private javax.swing.JButton SearchBook;
    private javax.swing.JLabel Year;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_book_name;
    private javax.swing.JTextField txt_btype;
    private javax.swing.JTextField txt_dept;
    private javax.swing.JTextField txt_edition;
    private javax.swing.JTextField txt_gender;
    private javax.swing.JTextField txt_isbn;
    private javax.swing.JTextField txt_issue_date;
    private javax.swing.JTextField txt_member_id;
    private javax.swing.JTextField txt_member_name;
    private javax.swing.JTextField txt_mtype;
    private javax.swing.JTextField txt_pages;
    private javax.swing.JTextField txt_phone_no;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_publisher;
    private javax.swing.JTextField txt_status;
    private javax.swing.JTextField txt_year;
    // End of variables declaration//GEN-END:variables
}
