/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.Dufins.Developer.STManagement.Forms;

import Util.Util;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Nitish Srivastava
 */
public class StudentInformationServices extends javax.swing.JPanel {

    /**
     * Creates new form StudentInformationServices
     */
    Connection con = null;
    PreparedStatement psmnt = null;
    Statement stmt = null;
    ResultSet rs = null;
    ArrayList list = new ArrayList();
    ArrayList list2 = new ArrayList();
    double tutiondue = 0, hosteldue = 0, messdue = 0, examdue = 0, uniformdue = 0, busdue = 0, otherdue = 0, wholedue = 0;

    public StudentInformationServices() {
        initComponents();
        retrieveCourse();
        retrieveBranch();
        rbMale1.setSelected(true);
        rbUnmarried1.setSelected(true);
        rb_institute.setSelected(true);
    }

    public void validateStudentDetails() {
        list.removeAll(list);
        if (txt_fname.getText().equals("")) {
            lblfn.setForeground(Color.red);
            list.add("1");

        } else {
            lblfn.setForeground(Color.BLACK);
            list.remove("1");
        }
        if (txtFatherName1.getText().equals("")) {

            lblfather.setForeground(Color.red);
            list.add("2");

        } else {
            lblfather.setForeground(Color.black);
            list.remove("2");
        }
        if (dcDOB1.getDate() == null) {
            lbldob.setForeground(Color.red);
            list.add("3");
        } else {
            lbldob.setForeground(Color.black);
            list.remove("3");
        }
        if (txtNationality1.getText().equals("")) {

            lblNation.setForeground(Color.red);
            list.add("4");

        } else {
            lblNation.setForeground(Color.black);
            list.remove("4");
        }
        if (txtMotherName1.getText().equals("")) {

            lblMother.setForeground(Color.red);
            list.add("5");

        } else {
            lblMother.setForeground(Color.black);
            list.remove("5");
        }
        if (txtReligion1.getText().equals("")) {

            lblReligion.setForeground(Color.red);
            list.add("6");

        } else {
            lblReligion.setForeground(Color.black);
            list.remove("6");
        }
        if (yc1.getYear() >= yc2.getYear()) {

            lblsession.setForeground(Color.red);
            list.add("7");

        } else {
            lblsession.setForeground(Color.black);
            list.remove("7");
        }
        System.out.println("list " + list);
    }

    public void validationAddress() {

        String addr = txtAdd1.getText();
        String city = txtCity1.getText();
        String state = txtState1.getText();
        String country = txtCountry1.getText();
        String pin = txtPin1.getText();
        String mobile = txtMobile.getText();
        String mail = txtMail1.getText();
        list2.removeAll(list2);
        if (addr.isEmpty()) {
            lblpa.setForeground(Color.red);
            list2.add("1");
        } else {
            lblpa.setForeground(Color.black);
            list2.remove("1");
        }
        if (city.isEmpty()) {
            lblpc.setForeground(Color.red);
            list2.add("2");

        } else {
            lblpc.setForeground(Color.black);
            list2.remove("2");
        }
        if (state.isEmpty()) {
            lblstate.setForeground(Color.red);
            list2.add("3");
        } else {
            lblstate.setForeground(Color.black);
            list2.remove("3");
        }
        if (country.isEmpty()) {
            lblcountry.setForeground(Color.red);
            list2.add("4");
        } else {
            lblcountry.setForeground(Color.black);
            list2.remove("4");
        }
        if (pin.isEmpty()) {
            lblpin.setForeground(Color.red);
            list2.add("5");
        } else {
            lblpin.setForeground(Color.black);
            list2.remove("5");
        }
        if (mobile.isEmpty()) {
            lblmobile.setForeground(Color.red);
            list2.add("6");
        } else {
            lblmobile.setForeground(Color.black);
            list2.remove("6");
        }
        if (mail.isEmpty()) {
            lblEmail.setForeground(Color.red);
            list2.add("7");
        } else {
            lblEmail.setForeground(Color.black);
            list2.remove("7");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panProfile1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtEnroll = new javax.swing.JTextField();
        txtRoll = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cmbCourse = new javax.swing.JComboBox();
        txtFatherName1 = new javax.swing.JTextField();
        txtReligion1 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        dcDOB1 = new com.toedter.calendar.JDateChooser();
        lblsession = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rbFemale1 = new javax.swing.JRadioButton();
        cmbBranch = new javax.swing.JComboBox();
        jLabel45 = new javax.swing.JLabel();
        cmbSemester = new javax.swing.JComboBox();
        lblfn = new javax.swing.JLabel();
        cmbCategory1 = new javax.swing.JComboBox();
        rbMale1 = new javax.swing.JRadioButton();
        jLabel43 = new javax.swing.JLabel();
        cmbBloodGroup1 = new javax.swing.JComboBox();
        jLabel37 = new javax.swing.JLabel();
        rbMarried1 = new javax.swing.JRadioButton();
        lbldob = new javax.swing.JLabel();
        lblfather = new javax.swing.JLabel();
        rbUnmarried1 = new javax.swing.JRadioButton();
        jLabel46 = new javax.swing.JLabel();
        yc2 = new com.toedter.calendar.JYearChooser();
        jLabel47 = new javax.swing.JLabel();
        txtMotherName1 = new javax.swing.JTextField();
        txt_fname = new javax.swing.JTextField();
        txt_mname = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        lblReligion = new javax.swing.JLabel();
        txtNationality1 = new javax.swing.JTextField();
        lblMother = new javax.swing.JLabel();
        yc1 = new com.toedter.calendar.JYearChooser();
        lblNation = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txt_lname = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        btnSD = new javax.swing.JButton();
        btn_ClearProfile = new javax.swing.JButton();
        panProfile2 = new javax.swing.JPanel();
        btnFD = new javax.swing.JButton();
        btn_ClearFee = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        cbTF = new javax.swing.JCheckBox();
        cbHF = new javax.swing.JCheckBox();
        cbEF = new javax.swing.JCheckBox();
        cbMF = new javax.swing.JCheckBox();
        cbBF = new javax.swing.JCheckBox();
        cbUC = new javax.swing.JCheckBox();
        cbOF = new javax.swing.JCheckBox();
        txt_AFHF = new javax.swing.JTextField();
        txt_AFTF = new javax.swing.JTextField();
        txt_AFMF = new javax.swing.JTextField();
        txt_AFEF = new javax.swing.JTextField();
        txt_AFUF = new javax.swing.JTextField();
        txt_AFBF = new javax.swing.JTextField();
        txt_AFOF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_HFC = new javax.swing.JTextField();
        txt_TFC = new javax.swing.JTextField();
        txt_MFC = new javax.swing.JTextField();
        txt_EFC = new javax.swing.JTextField();
        txt_UFC = new javax.swing.JTextField();
        txt_BFC = new javax.swing.JTextField();
        txt_OFC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_TAHF = new javax.swing.JTextField();
        txt_TATF = new javax.swing.JTextField();
        txt_TAMF = new javax.swing.JTextField();
        txt_TAEF = new javax.swing.JTextField();
        txt_TAUF = new javax.swing.JTextField();
        txt_TABF = new javax.swing.JTextField();
        txt_TAOF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        rb_jcecb = new javax.swing.JRadioButton();
        rb_institute = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        lblTotalResult = new javax.swing.JLabel();
        panAddress = new javax.swing.JPanel();
        panCorrespondance = new javax.swing.JPanel();
        lblpa = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAdd1 = new javax.swing.JTextArea();
        lblpc = new javax.swing.JLabel();
        lblstate = new javax.swing.JLabel();
        lblcountry = new javax.swing.JLabel();
        lblpin = new javax.swing.JLabel();
        txtCity1 = new javax.swing.JTextField();
        txtState1 = new javax.swing.JTextField();
        txtCountry1 = new javax.swing.JTextField();
        txtPin1 = new javax.swing.JTextField();
        panPermanent = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        scrollerAdd = new javax.swing.JScrollPane();
        txtAdd2 = new javax.swing.JTextArea();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        txtCity2 = new javax.swing.JTextField();
        txtState2 = new javax.swing.JTextField();
        txtCountry2 = new javax.swing.JTextField();
        txtPin2 = new javax.swing.JTextField();
        cbSameContact = new javax.swing.JCheckBox();
        lblmobile = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        txtMail1 = new javax.swing.JTextField();
        txtHomePhone = new javax.swing.JTextField();
        txtMail2 = new javax.swing.JTextField();
        btnCD = new javax.swing.JButton();
        btn_ClearAddress = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        panEducation = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        txtHBoard = new javax.swing.JTextField();
        txtHSubject = new javax.swing.JTextField();
        txtHGrade = new javax.swing.JTextField();
        txtHYear = new javax.swing.JTextField();
        txtHName = new javax.swing.JTextField();
        cbHS = new javax.swing.JCheckBox();
        txtIBoard = new javax.swing.JTextField();
        txtISubject = new javax.swing.JTextField();
        txtIGrade = new javax.swing.JTextField();
        txtIYear = new javax.swing.JTextField();
        cbI = new javax.swing.JCheckBox();
        txtIName = new javax.swing.JTextField();
        txtUGBoard = new javax.swing.JTextField();
        txtUGSubject = new javax.swing.JTextField();
        txtUGGrade = new javax.swing.JTextField();
        txtUGYear = new javax.swing.JTextField();
        cbUG = new javax.swing.JCheckBox();
        txtUGName = new javax.swing.JTextField();
        txtPGBoard = new javax.swing.JTextField();
        txtPGSubject = new javax.swing.JTextField();
        txtPGGrade = new javax.swing.JTextField();
        txtPGYear = new javax.swing.JTextField();
        cbPG = new javax.swing.JCheckBox();
        txtPGName = new javax.swing.JTextField();
        txtOBoard = new javax.swing.JTextField();
        txtOSubject = new javax.swing.JTextField();
        txtOGrade = new javax.swing.JTextField();
        txtOYear = new javax.swing.JTextField();
        cbOther = new javax.swing.JCheckBox();
        txtOName = new javax.swing.JTextField();
        btnED = new javax.swing.JButton();
        btn_ClearED = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        panAdmissionMode = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        btn_ClearDoc = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        cb10c = new javax.swing.JCheckBox();
        cb12c = new javax.swing.JCheckBox();
        cb12m = new javax.swing.JCheckBox();
        cbgc = new javax.swing.JCheckBox();
        cboc = new javax.swing.JCheckBox();
        txtOtherDoc = new javax.swing.JTextField();
        cb10m = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        lbl_image = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        pimage = new javax.swing.JTextField();
        btn_browseImage = new javax.swing.JButton();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setToolTipText("");

        panProfile1.setBackground(new java.awt.Color(255, 255, 255));
        panProfile1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Details", 1, 2, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        panProfile1.setPreferredSize(new java.awt.Dimension(1003, 362));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter Roll Number/Enrollment Number to search Student Details", 0, 0, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        txtEnroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnrollActionPerformed(evt);
            }
        });
        txtEnroll.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEnrollFocusLost(evt);
            }
        });

        txtRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRollActionPerformed(evt);
            }
        });
        txtRoll.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRollFocusLost(evt);
            }
        });

        jLabel5.setText("Roll Number");

        jLabel6.setText("Enrollment Number");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search-icon.png"))); // NOI18N
        jLabel9.setToolTipText("Search for Student");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtEnroll, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtRoll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEnroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/nilaicon.png"))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Profile", 0, 0, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        cmbCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCourseActionPerformed(evt);
            }
        });

        jLabel36.setText("Last Name");

        dcDOB1.setBackground(new java.awt.Color(255, 255, 255));
        dcDOB1.setDateFormatString("MM-dd-yyyy");

        lblsession.setText("Session");

        jLabel1.setText("To");

        rbFemale1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbFemale1);
        rbFemale1.setText("Female");

        jLabel45.setText(" Caste");

        cmbSemester.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th" }));

        lblfn.setText("First Name");

        cmbCategory1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "General", "OBC", "SC", "ST" }));

        rbMale1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbMale1);
        rbMale1.setText("Male");

        jLabel43.setText("Marital Status");

        cmbBloodGroup1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O+", "A+", "B+", "AB+", "O-", "A-", "B-", "AB-" }));

        jLabel37.setText("Gender");

        rbMarried1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rbMarried1);
        rbMarried1.setText("Married");

        lbldob.setText("Date Of Birth");

        lblfather.setText("Father Name");

        rbUnmarried1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rbUnmarried1);
        rbUnmarried1.setText("Unmarried");

        jLabel46.setText("Course");

        jLabel47.setText("Branch");

        jLabel41.setText("Blood Group");

        lblReligion.setText("Religion");

        lblMother.setText("Mother Name");

        lblNation.setText("Nationality");

        jLabel35.setText("Middle Name");

        jLabel48.setText("Current Semester");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(lblfather)
                    .addComponent(lblfn)
                    .addComponent(lbldob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblReligion)
                    .addComponent(lblNation)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtReligion1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNationality1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_fname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_lname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFatherName1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dcDOB1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cmbSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161))
                    .addComponent(cmbCategory1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel35)
                            .addComponent(jLabel37)
                            .addComponent(lblMother)
                            .addComponent(jLabel41)
                            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblsession, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(rbMarried1)
                                .addGap(18, 18, 18)
                                .addComponent(rbUnmarried1))
                            .addComponent(txtMotherName1)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(rbMale1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbFemale1))
                            .addComponent(txt_mname)
                            .addComponent(cmbBloodGroup1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(yc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(yc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(cmbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(txt_mname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(rbMale1)
                            .addComponent(rbFemale1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMother)
                            .addComponent(txtMotherName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(cmbBloodGroup1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel43))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbMarried1)
                                    .addComponent(rbUnmarried1)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel46)
                                    .addComponent(cmbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(cmbBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblsession)
                            .addComponent(yc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblfn)
                            .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(txt_lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblfather)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbldob))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtFatherName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dcDOB1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNationality1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNation))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtReligion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblReligion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCategory1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48))))
                .addContainerGap())
        );

        btnSD.setText("next");
        btnSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSDActionPerformed(evt);
            }
        });

        btn_ClearProfile.setText("clear");
        btn_ClearProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearProfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panProfile1Layout = new javax.swing.GroupLayout(panProfile1);
        panProfile1.setLayout(panProfile1Layout);
        panProfile1Layout.setHorizontalGroup(
            panProfile1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panProfile1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panProfile1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator5)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panProfile1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panProfile1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnSD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ClearProfile)))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        panProfile1Layout.setVerticalGroup(
            panProfile1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panProfile1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panProfile1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panProfile1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSD)
                    .addComponent(btn_ClearProfile))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Student Details", panProfile1);

        panProfile2.setBackground(new java.awt.Color(255, 255, 255));
        panProfile2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", 1, 2, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        btnFD.setText("next");
        btnFD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFDActionPerformed(evt);
            }
        });

        btn_ClearFee.setText("clear");
        btn_ClearFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearFeeActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fee Details", 0, 0, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        cbTF.setBackground(new java.awt.Color(255, 255, 255));
        cbTF.setText("Tution Fee");
        cbTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTFActionPerformed(evt);
            }
        });

        cbHF.setBackground(new java.awt.Color(255, 255, 255));
        cbHF.setText("Hostel Fee");
        cbHF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHFActionPerformed(evt);
            }
        });

        cbEF.setBackground(new java.awt.Color(255, 255, 255));
        cbEF.setText("Exam Fee");
        cbEF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEFActionPerformed(evt);
            }
        });

        cbMF.setBackground(new java.awt.Color(255, 255, 255));
        cbMF.setText("Mess Fee");
        cbMF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMFActionPerformed(evt);
            }
        });

        cbBF.setBackground(new java.awt.Color(255, 255, 255));
        cbBF.setText("Bus Fare");
        cbBF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBFActionPerformed(evt);
            }
        });

        cbUC.setBackground(new java.awt.Color(255, 255, 255));
        cbUC.setText("Uniform Charge");
        cbUC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUCActionPerformed(evt);
            }
        });

        cbOF.setBackground(new java.awt.Color(255, 255, 255));
        cbOF.setText("Others");
        cbOF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOFActionPerformed(evt);
            }
        });

        txt_AFHF.setEditable(false);
        txt_AFHF.setText("0");

        txt_AFTF.setEditable(false);
        txt_AFTF.setText("0");

        txt_AFMF.setEditable(false);
        txt_AFMF.setText("0");

        txt_AFEF.setEditable(false);
        txt_AFEF.setText("0");

        txt_AFUF.setEditable(false);
        txt_AFUF.setText("0");

        txt_AFBF.setEditable(false);
        txt_AFBF.setText("0");

        txt_AFOF.setEditable(false);
        txt_AFOF.setText("0");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Actual Fee");

        txt_HFC.setText("0");
        txt_HFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_HFCKeyReleased(evt);
            }
        });

        txt_TFC.setText("0");
        txt_TFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_TFCKeyReleased(evt);
            }
        });

        txt_MFC.setText("0");
        txt_MFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_MFCKeyReleased(evt);
            }
        });

        txt_EFC.setText("0");
        txt_EFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_EFCKeyReleased(evt);
            }
        });

        txt_UFC.setText("0");
        txt_UFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_UFCKeyReleased(evt);
            }
        });

        txt_BFC.setText("0");
        txt_BFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_BFCKeyReleased(evt);
            }
        });

        txt_OFC.setText("0");
        txt_OFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_OFCKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Concession");

        txt_TAHF.setEditable(false);
        txt_TAHF.setText("0");

        txt_TATF.setEditable(false);
        txt_TATF.setText("0");

        txt_TAMF.setEditable(false);
        txt_TAMF.setText("0");

        txt_TAEF.setEditable(false);
        txt_TAEF.setText("0");

        txt_TAUF.setEditable(false);
        txt_TAUF.setText("0");

        txt_TABF.setEditable(false);
        txt_TABF.setText("0");
        txt_TABF.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txt_TABFPropertyChange(evt);
            }
        });

        txt_TAOF.setEditable(false);
        txt_TAOF.setText("0");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Total Amount");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbBF)
                    .addComponent(cbMF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbEF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbHF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbUC)
                    .addComponent(cbOF))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_AFMF, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_AFTF)
                    .addComponent(txt_AFOF, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_AFHF, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_AFBF, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_AFEF, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_AFUF, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_BFC, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_HFC, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_MFC, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_EFC, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_OFC, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TFC, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_UFC, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(txt_TABF, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(txt_TAHF, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(txt_TATF, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(txt_TAUF, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(txt_TAEF, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(txt_TAOF, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(txt_TAMF, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_AFHF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_HFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_TAHF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(cbHF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbTF)
                                    .addComponent(txt_AFTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_TFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_TATF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbMF)
                                    .addComponent(txt_AFMF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_MFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_TAMF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbEF)
                                    .addComponent(txt_AFEF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_EFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_TAEF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbUC)
                                    .addComponent(txt_AFUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_UFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_TAUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbBF)
                                    .addComponent(txt_AFBF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_BFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_TABF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbOF)
                                    .addComponent(txt_AFOF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_OFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_TAOF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jSeparator3))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Admission Mode", 0, 0, new java.awt.Font("Tahoma", 1, 10), java.awt.Color.black)); // NOI18N

        rb_jcecb.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(rb_jcecb);
        rb_jcecb.setText("JCECB Level");
        rb_jcecb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_jcecbActionPerformed(evt);
            }
        });

        rb_institute.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(rb_institute);
        rb_institute.setText("Institute Level");
        rb_institute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_instituteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rb_institute, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(rb_jcecb, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_institute)
                    .addComponent(rb_jcecb))
                .addContainerGap())
        );

        jLabel7.setText("Total :-");

        lblTotalResult.setText("0");

        javax.swing.GroupLayout panProfile2Layout = new javax.swing.GroupLayout(panProfile2);
        panProfile2.setLayout(panProfile2Layout);
        panProfile2Layout.setHorizontalGroup(
            panProfile2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panProfile2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panProfile2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panProfile2Layout.createSequentialGroup()
                        .addGroup(panProfile2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panProfile2Layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(btnFD)
                                .addGap(18, 18, 18)
                                .addComponent(btn_ClearFee))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(441, Short.MAX_VALUE))
                    .addGroup(panProfile2Layout.createSequentialGroup()
                        .addGroup(panProfile2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panProfile2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(lblTotalResult, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panProfile2Layout.setVerticalGroup(
            panProfile2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panProfile2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panProfile2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblTotalResult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panProfile2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFD)
                    .addComponent(btn_ClearFee))
                .addGap(45, 45, 45))
        );

        jTabbedPane1.addTab("Fee Details", panProfile2);

        panAddress.setBackground(new java.awt.Color(255, 255, 255));
        panAddress.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contact Details", 1, 2, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        panAddress.setPreferredSize(new java.awt.Dimension(1117, 339));

        panCorrespondance.setBackground(new java.awt.Color(255, 255, 255));
        panCorrespondance.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblpa.setText("Permanent Address");

        txtAdd1.setColumns(20);
        txtAdd1.setRows(5);
        txtAdd1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAdd1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAdd1KeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(txtAdd1);

        lblpc.setText("City");

        lblstate.setText("State");

        lblcountry.setText("Country");

        lblpin.setText("Pin Code");

        txtCity1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCity1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCity1KeyReleased(evt);
            }
        });

        txtState1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtState1ActionPerformed(evt);
            }
        });
        txtState1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtState1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtState1KeyReleased(evt);
            }
        });

        txtCountry1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCountry1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCountry1KeyReleased(evt);
            }
        });

        txtPin1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPin1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panCorrespondanceLayout = new javax.swing.GroupLayout(panCorrespondance);
        panCorrespondance.setLayout(panCorrespondanceLayout);
        panCorrespondanceLayout.setHorizontalGroup(
            panCorrespondanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCorrespondanceLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panCorrespondanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCorrespondanceLayout.createSequentialGroup()
                        .addComponent(lblpa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panCorrespondanceLayout.createSequentialGroup()
                        .addComponent(lblpc, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(txtCity1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panCorrespondanceLayout.createSequentialGroup()
                        .addComponent(lblstate, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(txtState1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panCorrespondanceLayout.createSequentialGroup()
                        .addComponent(lblcountry, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(txtCountry1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panCorrespondanceLayout.createSequentialGroup()
                        .addComponent(lblpin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(txtPin1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        panCorrespondanceLayout.setVerticalGroup(
            panCorrespondanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCorrespondanceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCorrespondanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCorrespondanceLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblpa))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panCorrespondanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblpc)
                    .addComponent(txtCity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panCorrespondanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblstate)
                    .addComponent(txtState1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panCorrespondanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcountry)
                    .addComponent(txtCountry1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panCorrespondanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblpin)
                    .addComponent(txtPin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panPermanent.setBackground(new java.awt.Color(255, 255, 255));
        panPermanent.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel78.setText("Corresspondance Address");

        txtAdd2.setColumns(20);
        txtAdd2.setRows(5);
        txtAdd2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAdd2KeyPressed(evt);
            }
        });
        scrollerAdd.setViewportView(txtAdd2);

        jLabel79.setText("City");

        jLabel80.setText("State");

        jLabel81.setText("Country");

        jLabel82.setText("Pin Code");

        cbSameContact.setBackground(new java.awt.Color(255, 255, 255));
        cbSameContact.setText("Same as Permanent Address");
        cbSameContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSameContactActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panPermanentLayout = new javax.swing.GroupLayout(panPermanent);
        panPermanent.setLayout(panPermanentLayout);
        panPermanentLayout.setHorizontalGroup(
            panPermanentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPermanentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panPermanentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panPermanentLayout.createSequentialGroup()
                        .addComponent(cbSameContact, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(scrollerAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panPermanentLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panPermanentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panPermanentLayout.createSequentialGroup()
                                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(txtCity2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panPermanentLayout.createSequentialGroup()
                                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(txtState2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panPermanentLayout.createSequentialGroup()
                                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(txtCountry2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panPermanentLayout.createSequentialGroup()
                                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(txtPin2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        panPermanentLayout.setVerticalGroup(
            panPermanentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPermanentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panPermanentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbSameContact)
                    .addComponent(scrollerAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panPermanentLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel78)))
                .addGap(10, 10, 10)
                .addGroup(panPermanentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panPermanentLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel79))
                    .addComponent(txtCity2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panPermanentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panPermanentLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel80))
                    .addComponent(txtState2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panPermanentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panPermanentLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel81))
                    .addComponent(txtCountry2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panPermanentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panPermanentLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel82))
                    .addComponent(txtPin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        lblmobile.setText("Mobile Number");

        jLabel84.setText("Home Phone");

        lblEmail.setText("Primary Email");

        jLabel86.setText("Secondary Email");

        btnCD.setText("next");
        btnCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCDActionPerformed(evt);
            }
        });

        btn_ClearAddress.setText("clear");
        btn_ClearAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearAddressActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panAddressLayout = new javax.swing.GroupLayout(panAddress);
        panAddress.setLayout(panAddressLayout);
        panAddressLayout.setHorizontalGroup(
            panAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAddressLayout.createSequentialGroup()
                .addGroup(panAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panAddressLayout.createSequentialGroup()
                            .addGap(147, 147, 147)
                            .addComponent(btnCD)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_ClearAddress))
                        .addGroup(panAddressLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(panCorrespondance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(panPermanent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(panAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblEmail)
                                .addComponent(lblmobile)
                                .addComponent(jLabel84)
                                .addComponent(jLabel86))
                            .addGap(18, 18, 18)
                            .addGroup(panAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMail1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtHomePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMail2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        panAddressLayout.setVerticalGroup(
            panAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAddressLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panAddressLayout.createSequentialGroup()
                        .addGroup(panAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblmobile)
                            .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtMail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel84)
                            .addComponent(txtHomePhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel86)
                            .addComponent(txtMail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panCorrespondance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panPermanent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(panAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCD)
                    .addComponent(btn_ClearAddress))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Contact Details", panAddress);

        panEducation.setBackground(new java.awt.Color(255, 255, 255));
        panEducation.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Educational Details", 1, 2, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        jLabel87.setText("Exam Type");

        jLabel88.setText("Name");

        jLabel89.setText("Board");

        jLabel90.setText("Subject");

        jLabel91.setText("Grade");

        jLabel92.setText("Passing Year");

        txtHBoard.setEditable(false);

        txtHSubject.setEditable(false);

        txtHGrade.setEditable(false);

        txtHYear.setEditable(false);

        txtHName.setEditable(false);

        cbHS.setBackground(new java.awt.Color(255, 255, 255));
        cbHS.setText("High School");
        cbHS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHSActionPerformed(evt);
            }
        });

        txtIBoard.setEditable(false);

        txtISubject.setEditable(false);

        txtIGrade.setEditable(false);

        txtIYear.setEditable(false);

        cbI.setBackground(new java.awt.Color(255, 255, 255));
        cbI.setText("Intermediate");
        cbI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIActionPerformed(evt);
            }
        });

        txtIName.setEditable(false);

        txtUGBoard.setEditable(false);

        txtUGSubject.setEditable(false);

        txtUGGrade.setEditable(false);

        txtUGYear.setEditable(false);

        cbUG.setBackground(new java.awt.Color(255, 255, 255));
        cbUG.setText("U.G.");
        cbUG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUGActionPerformed(evt);
            }
        });

        txtUGName.setEditable(false);

        txtPGBoard.setEditable(false);

        txtPGSubject.setEditable(false);

        txtPGGrade.setEditable(false);

        txtPGYear.setEditable(false);

        cbPG.setBackground(new java.awt.Color(255, 255, 255));
        cbPG.setText("P.G.");
        cbPG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPGActionPerformed(evt);
            }
        });

        txtPGName.setEditable(false);

        txtOBoard.setEditable(false);

        txtOSubject.setEditable(false);

        txtOGrade.setEditable(false);

        txtOYear.setEditable(false);

        cbOther.setBackground(new java.awt.Color(255, 255, 255));
        cbOther.setText("Other");
        cbOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOtherActionPerformed(evt);
            }
        });

        txtOName.setEditable(false);

        btnED.setText("next");
        btnED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEDActionPerformed(evt);
            }
        });

        btn_ClearED.setText("clear");
        btn_ClearED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearEDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panEducationLayout = new javax.swing.GroupLayout(panEducation);
        panEducation.setLayout(panEducationLayout);
        panEducationLayout.setHorizontalGroup(
            panEducationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEducationLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(btnED)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_ClearED)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panEducationLayout.createSequentialGroup()
                .addGroup(panEducationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panEducationLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator9, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panEducationLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel87)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel88)
                        .addGap(84, 84, 84)
                        .addComponent(jLabel89)
                        .addGap(88, 88, 88)
                        .addComponent(jLabel90)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel91)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel92))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panEducationLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panEducationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panEducationLayout.createSequentialGroup()
                                .addComponent(cbI, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIName, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtISubject, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIYear, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panEducationLayout.createSequentialGroup()
                                .addComponent(cbHS, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHName, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtHGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtHYear, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panEducationLayout.createSequentialGroup()
                                .addComponent(cbUG, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUGName, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUGBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUGSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtUGGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtUGYear, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panEducationLayout.createSequentialGroup()
                                .addComponent(cbPG, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPGName, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPGBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPGSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPGGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPGYear, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panEducationLayout.createSequentialGroup()
                                .addComponent(cbOther, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOName, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtOGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtOYear, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panEducationLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator6)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        panEducationLayout.setVerticalGroup(
            panEducationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEducationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panEducationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(jLabel88)
                    .addComponent(jLabel89)
                    .addComponent(jLabel90)
                    .addComponent(jLabel91)
                    .addComponent(jLabel92))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panEducationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbHS)
                    .addComponent(txtHName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panEducationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbI)
                    .addComponent(txtIName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtISubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panEducationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbUG)
                    .addComponent(txtUGName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUGBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUGSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUGGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUGYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panEducationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPG)
                    .addComponent(txtPGName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPGBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPGSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPGGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPGYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panEducationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbOther)
                    .addComponent(txtOName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panEducationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnED)
                    .addComponent(btn_ClearED))
                .addGap(59, 59, 59))
        );

        jTabbedPane1.addTab("Educational Details", panEducation);

        panAdmissionMode.setBackground(new java.awt.Color(255, 255, 255));
        panAdmissionMode.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " ", 1, 2, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jButton12.setText("Register");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        btn_ClearDoc.setText("clear");
        btn_ClearDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearDocActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Submited Documents", 0, 0, new java.awt.Font("Tahoma", 1, 10), java.awt.Color.black)); // NOI18N

        cb10c.setBackground(new java.awt.Color(255, 255, 255));
        cb10c.setText("10th Certificate");

        cb12c.setBackground(new java.awt.Color(255, 255, 255));
        cb12c.setText("12th Certificate");

        cb12m.setBackground(new java.awt.Color(255, 255, 255));
        cb12m.setText("12th Marksheet");

        cbgc.setBackground(new java.awt.Color(255, 255, 255));
        cbgc.setText("Graduation Certificate");

        cboc.setBackground(new java.awt.Color(255, 255, 255));
        cboc.setText("Others");
        cboc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbocActionPerformed(evt);
            }
        });

        txtOtherDoc.setEditable(false);

        cb10m.setBackground(new java.awt.Color(255, 255, 255));
        cb10m.setText("10th Marksheet");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbgc, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cboc, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOtherDoc))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cb10m, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cb10c, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cb12m, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cb12c, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb10c)
                    .addComponent(cb10m))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb12m)
                    .addComponent(cb12c))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboc)
                    .addComponent(txtOtherDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbgc))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Profile Picture", 0, 0, new java.awt.Font("Tahoma", 1, 12), java.awt.Color.black)); // NOI18N

        lbl_image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel94.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel94.setText("Profile Photo");

        btn_browseImage.setText("Browse");
        btn_browseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_browseImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pimage, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_browseImage)))
                .addGap(141, 141, 141))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel94)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pimage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_browseImage))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JScrollPane js = new JScrollPane();
        js.setViewportView(lbl_image);

        javax.swing.GroupLayout panAdmissionModeLayout = new javax.swing.GroupLayout(panAdmissionMode);
        panAdmissionMode.setLayout(panAdmissionModeLayout);
        panAdmissionModeLayout.setHorizontalGroup(
            panAdmissionModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAdmissionModeLayout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_ClearDoc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panAdmissionModeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAdmissionModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panAdmissionModeLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 154, Short.MAX_VALUE))
        );
        panAdmissionModeLayout.setVerticalGroup(
            panAdmissionModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAdmissionModeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAdmissionModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panAdmissionModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(btn_ClearDoc))
                .addGap(37, 37, 37))
        );

        jTabbedPane1.addTab("Others", panAdmissionMode);

        add(jTabbedPane1);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_browseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_browseImageActionPerformed
        // TODO add your handling code here:
        String path;
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF & PNG Images", "jpg", "gif", "png", "jpeg");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File f = chooser.getSelectedFile();
            path = f.getAbsolutePath();
            pimage.setText(path);
            ImageIcon i = new ImageIcon(path);
            lbl_image.setIcon(i);
        }
    }//GEN-LAST:event_btn_browseImageActionPerformed

    private void cbocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbocActionPerformed
        // TODO add your handling code here:
        if (cboc.isSelected()) {
            txtOtherDoc.setEditable(true);
        } else if (cboc.isSelected() == false) {
            txtOtherDoc.setEditable(false);
        }
    }//GEN-LAST:event_cbocActionPerformed

    private void btn_ClearDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearDocActionPerformed
        // TODO add your handling code here:
        cb10c.setSelected(false);
        cb10m.setSelected(false);
        cb12c.setSelected(false);
        cb12m.setSelected(false);
        cbgc.setSelected(false);
        cboc.setSelected(false);
        txtOtherDoc.setText("");
        cbocActionPerformed(null);
        pimage.setText("");
        lbl_image.setIcon(null);
    }//GEN-LAST:event_btn_ClearDocActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        validateStudentDetails();
        validationAddress();
        if (cbSameContact.isSelected() == false && txtAdd2.getText().equals("")) {
            cbSameContact.setSelected(true);
            cbSameContactActionPerformed(null);
        }
        if (list.size() <= 0 && list2.size() <= 0) {
            submitprofile();
            addImage();
            storedue();
            JOptionPane.showMessageDialog(this, "Data successfully updated");
        } else {
            JOptionPane.showMessageDialog(this, "Please enter all required data.");
            jTabbedPane1.setSelectedIndex(0);
        }
        clearProfile();
        clearfee();
        clearAddress();
        btn_ClearEDActionPerformed(evt);
        btn_ClearDocActionPerformed(evt);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void btn_ClearEDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearEDActionPerformed
        // TODO add your handling code here:
        cbHS.setSelected(false);
        cbHSActionPerformed(evt);
        cbI.setSelected(false);
        cbIActionPerformed(evt);
        cbUG.setSelected(false);
        cbUGActionPerformed(evt);
        cbPG.setSelected(false);
        cbPGActionPerformed(evt);
        cbOther.setSelected(false);
        cbOtherActionPerformed(evt);
    }//GEN-LAST:event_btn_ClearEDActionPerformed

    private void btnEDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEDActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_btnEDActionPerformed

    private void cbOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOtherActionPerformed
        // TODO add your handling code here:
        if (cbOther.isSelected()) {
            txtOName.setEditable(true);
            txtOBoard.setEditable(true);
            txtOSubject.setEditable(true);
            txtOGrade.setEditable(true);
            txtOYear.setEditable(true);
        } else if (cbOther.isSelected() == false) {
            txtOName.setEditable(false);
            txtOBoard.setEditable(false);
            txtOSubject.setEditable(false);
            txtOGrade.setEditable(false);
            txtOYear.setEditable(false);
        }
    }//GEN-LAST:event_cbOtherActionPerformed

    private void cbPGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPGActionPerformed
        // TODO add your handling code here:
        if (cbPG.isSelected()) {
            txtPGName.setEditable(true);
            txtPGBoard.setEditable(true);
            txtPGSubject.setEditable(true);
            txtPGGrade.setEditable(true);
            txtPGYear.setEditable(true);
        } else if (cbPG.isSelected() == false) {
            txtPGName.setEditable(false);
            txtPGBoard.setEditable(false);
            txtPGSubject.setEditable(false);
            txtPGGrade.setEditable(false);
            txtPGYear.setEditable(false);
        }
    }//GEN-LAST:event_cbPGActionPerformed

    private void cbUGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUGActionPerformed
        // TODO add your handling code here:
        if (cbUG.isSelected()) {
            txtUGName.setEditable(true);
            txtUGBoard.setEditable(true);
            txtUGSubject.setEditable(true);
            txtUGGrade.setEditable(true);
            txtUGYear.setEditable(true);
        } else if (cbUG.isSelected() == false) {
            txtUGName.setEditable(false);
            txtUGBoard.setEditable(false);
            txtUGSubject.setEditable(false);
            txtUGGrade.setEditable(false);
            txtUGYear.setEditable(false);
        }
    }//GEN-LAST:event_cbUGActionPerformed

    private void cbIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIActionPerformed
        // TODO add your handling code here:
        if (cbI.isSelected()) {
            txtIName.setEditable(true);
            txtIBoard.setEditable(true);
            txtISubject.setEditable(true);
            txtIGrade.setEditable(true);
            txtIYear.setEditable(true);
        } else if (cbI.isSelected() == false) {
            txtIName.setEditable(false);
            txtIBoard.setEditable(false);
            txtISubject.setEditable(false);
            txtIGrade.setEditable(false);
            txtIYear.setEditable(false);
        }
    }//GEN-LAST:event_cbIActionPerformed

    private void cbHSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHSActionPerformed
        if (cbHS.isSelected()) {
            txtHName.setEditable(true);
            txtHBoard.setEditable(true);
            txtHSubject.setEditable(true);
            txtHGrade.setEditable(true);
            txtHYear.setEditable(true);
        } else if (cbHS.isSelected() == false) {
            txtHName.setEditable(false);
            txtHBoard.setEditable(false);
            txtHSubject.setEditable(false);
            txtHGrade.setEditable(false);
            txtHYear.setEditable(false);
        }
    }//GEN-LAST:event_cbHSActionPerformed

    private void btn_ClearAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearAddressActionPerformed
        // TODO add your handling code here:
        clearAddress();
    }//GEN-LAST:event_btn_ClearAddressActionPerformed

    private void btnCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCDActionPerformed
        // TODO add your handling code here:
        validationAddress();
        if (list2.size() <= 0) {
            jTabbedPane1.setSelectedIndex(3);
        }
        System.out.println("list2" + list2);
        if (cbSameContact.isSelected() == false && txtAdd2.getText().isEmpty()) {
            cbSameContact.setSelected(true);
            cbSameContactActionPerformed(null);
        }
    }//GEN-LAST:event_btnCDActionPerformed

    private void cbSameContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSameContactActionPerformed
        if (cbSameContact.isSelected() == true) {
            txtAdd2.setText(txtAdd1.getText());
            txtAdd2.setEditable(false);
            txtCity2.setText(txtCity1.getText());
            txtCity2.setEditable(false);
            txtCountry2.setText(txtCountry1.getText());
            txtCountry2.setEditable(false);
            txtState2.setText(txtState1.getText());
            txtState2.setEditable(false);
            txtPin2.setText(txtPin1.getText());
            txtPin2.setEditable(false);
            txtMobile.requestFocus();
        } else if (cbSameContact.isSelected() == false) {
            txtAdd2.setEditable(true);
            txtAdd2.setText("");
            txtCity2.setEditable(true);
            txtCity2.setText("");
            txtCountry2.setEditable(true);
            txtCountry2.setText("");
            txtState2.setEditable(true);
            txtState2.setText("");
            txtPin2.setEditable(true);
            txtPin2.setText("");
        }
    }//GEN-LAST:event_cbSameContactActionPerformed

    private void txtAdd2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdd2KeyPressed
        int keyCode = evt.getKeyCode();
        if (keyCode == java.awt.event.KeyEvent.VK_TAB) {
            txtCity2.requestFocus();
        }
    }//GEN-LAST:event_txtAdd2KeyPressed

    private void txtCountry1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCountry1KeyPressed
        int keyCode = evt.getKeyCode();
        if (keyCode == java.awt.event.KeyEvent.VK_TAB) {
            txtPin1.requestFocus();
        }
    }//GEN-LAST:event_txtCountry1KeyPressed

    private void txtState1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtState1KeyPressed
        int keyCode = evt.getKeyCode();
        if (keyCode == java.awt.event.KeyEvent.VK_TAB) {
            txtCountry1.requestFocus();
        }
    }//GEN-LAST:event_txtState1KeyPressed

    private void txtState1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtState1ActionPerformed
        txtCountry1.requestFocus();
    }//GEN-LAST:event_txtState1ActionPerformed

    private void txtCity1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCity1KeyPressed
        int keyCode = evt.getKeyCode();
        if (keyCode == java.awt.event.KeyEvent.VK_TAB) {
            txtState1.requestFocus();
        }
    }//GEN-LAST:event_txtCity1KeyPressed

    private void txtAdd1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdd1KeyPressed
        int keyCode = evt.getKeyCode();
        if (keyCode == java.awt.event.KeyEvent.VK_TAB) {
            txtCity1.requestFocus();
        }
    }//GEN-LAST:event_txtAdd1KeyPressed

    private void rb_instituteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_instituteActionPerformed
        // TODO add your handling code here:
        retrieveTotal();
        calTF();
        totalAmount();
    }//GEN-LAST:event_rb_instituteActionPerformed

    private void rb_jcecbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_jcecbActionPerformed
        // TODO add your handling code here:
        retrieveTotal();
        calTF();
        totalAmount();
    }//GEN-LAST:event_rb_jcecbActionPerformed

    private void txt_TABFPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txt_TABFPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TABFPropertyChange

    private void txt_OFCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_OFCKeyReleased
        // TODO add your handling code here:
        if (!(txt_OFC.getText().isEmpty())) {
            try {

                calOF();

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Enter only digit");
                txt_OFC.setText("0");
            }
        } else {
            txt_OFC.setText("0");
        }
        totalAmount();
    }//GEN-LAST:event_txt_OFCKeyReleased

    private void txt_BFCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BFCKeyReleased
        // TODO add your handling code here:
        if (!(txt_BFC.getText().isEmpty())) {
            try {

                calBF();

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Enter only digit");
                txt_BFC.setText("0");
            }
        } else {
            txt_BFC.setText("0");
        }
        totalAmount();
    }//GEN-LAST:event_txt_BFCKeyReleased

    private void txt_UFCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_UFCKeyReleased
        // TODO add your handling code here:
        if (!(txt_UFC.getText().isEmpty())) {
            try {

                calUC();

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Enter only digit");
                txt_UFC.setText("0");
            }
        } else {
            txt_UFC.setText("0");
        }
        totalAmount();
    }//GEN-LAST:event_txt_UFCKeyReleased

    private void txt_EFCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_EFCKeyReleased
        // TODO add your handling code here:
        if (!(txt_EFC.getText().isEmpty())) {
            try {

                calEF();

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Enter only digit");
                txt_EFC.setText("0");
            }
        } else {
            txt_EFC.setText("0");
        }
        totalAmount();
    }//GEN-LAST:event_txt_EFCKeyReleased

    private void txt_MFCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_MFCKeyReleased
        // TODO add your handling code here:
        if (!(txt_MFC.getText().isEmpty())) {
            try {

                calMF();

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Enter only digit");
                txt_MFC.setText("0");
            }
        } else {
            txt_MFC.setText("0");
        }
        totalAmount();
    }//GEN-LAST:event_txt_MFCKeyReleased

    private void txt_TFCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TFCKeyReleased
        // TODO add your handling code here:
        if (!(txt_TFC.getText().isEmpty())) {
            try {

                calTF();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Enter only digit");
                txt_TFC.setText("0");
            }
        } else {
            txt_TFC.setText("0");
        }
        totalAmount();
    }//GEN-LAST:event_txt_TFCKeyReleased

    private void txt_HFCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_HFCKeyReleased
        if (!(txt_HFC.getText().isEmpty())) {
            try {

                calHF();

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Enter only digit");
                ex.printStackTrace();
                txt_HFC.setText("0");
            }
        } else {
            txt_HFC.setText("0");
        }
        totalAmount();
    }//GEN-LAST:event_txt_HFCKeyReleased

    private void cbOFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOFActionPerformed
        // TODO add your handling code here:
        try {
            con = Util.getConnection();
            psmnt = con.prepareStatement("select fee_amount from other_fee where attribute like 'Other%'");
            rs = psmnt.executeQuery();

            if (cbOF.isSelected()) {
                if (rs.next()) {
                    txt_AFOF.setText(rs.getString("fee_amount"));
                }
            } else {
                txt_AFOF.setText("0");
            }
            calOF();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        totalAmount();
    }//GEN-LAST:event_cbOFActionPerformed

    private void cbUCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUCActionPerformed
        // TODO add your handling code here:
        try {
            con = Util.getConnection();
            psmnt = con.prepareStatement("select fee_amount from other_fee where attribute like 'Uniform%'");
            rs = psmnt.executeQuery();

            if (cbUC.isSelected()) {
                if (rs.next()) {
                    txt_AFUF.setText(rs.getString("fee_amount"));
                }
            } else {
                txt_AFUF.setText("0");
            }
            calUC();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        totalAmount();
    }//GEN-LAST:event_cbUCActionPerformed

    private void cbBFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBFActionPerformed
        // TODO add your handling code here:
        try {
            con = Util.getConnection();
            psmnt = con.prepareStatement("select fee_amount from other_fee where attribute like 'Bus%'");
            rs = psmnt.executeQuery();

            if (cbBF.isSelected()) {
                if (rs.next()) {
                    txt_AFBF.setText(rs.getString("fee_amount"));
                }
            } else {
                txt_AFBF.setText("0");
            }
            calBF();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        totalAmount();
    }//GEN-LAST:event_cbBFActionPerformed

    private void cbMFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMFActionPerformed
        // TODO add your handling code here:
        try {
            con = Util.getConnection();
            psmnt = con.prepareStatement("select fee_amount from other_fee where attribute like 'Mess%'");
            rs = psmnt.executeQuery();

            if (cbMF.isSelected()) {
                if (rs.next()) {
                    txt_AFMF.setText(rs.getString("fee_amount"));
                }
            } else {
                txt_AFMF.setText("0");
            }
            calMF();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        totalAmount();
    }//GEN-LAST:event_cbMFActionPerformed

    private void cbEFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEFActionPerformed
        // TODO add your handling code here:
        try {
            con = Util.getConnection();
            psmnt = con.prepareStatement("select fee_amount from other_fee where attribute like 'Exam%'");
            rs = psmnt.executeQuery();

            if (cbEF.isSelected()) {
                if (rs.next()) {
                    txt_AFEF.setText(rs.getString("fee_amount"));
                }
            } else {
                txt_AFEF.setText("0");
            }
            calEF();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        totalAmount();
    }//GEN-LAST:event_cbEFActionPerformed

    private void cbHFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHFActionPerformed
        // TODO add your handling code here:
        try {
            con = Util.getConnection();
            psmnt = con.prepareStatement("select fee_amount from other_fee where attribute like 'Hostel%'");
            rs = psmnt.executeQuery();

            if (cbHF.isSelected()) {
                if (rs.next()) {
                    txt_AFHF.setText(rs.getString("fee_amount"));
                }
            } else {
                txt_AFHF.setText("0");
            }
            calHF();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        totalAmount();
    }//GEN-LAST:event_cbHFActionPerformed

    private void cbTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTFActionPerformed
        // TODO add your handling code here:
        retrieveTotal();
        calTF();
        totalAmount();
        cbTF.setForeground(Color.BLACK);
        if (cbTF.isSelected() == false) {
            txt_AFTF.setText("0");
            txt_TATF.setText("0");
            cbTF.setForeground(Color.red);
        }
    }//GEN-LAST:event_cbTFActionPerformed

    private void btn_ClearFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearFeeActionPerformed
        // TODO add your handling code here:
        clearfee();
    }//GEN-LAST:event_btn_ClearFeeActionPerformed

    private void btnFDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFDActionPerformed
        // TODO add your handling code here:
        if (cbTF.isSelected() == false) {
            cbTF.setForeground(Color.red);
            return;
        }
        cbTF.setForeground(Color.black);
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_btnFDActionPerformed

    private void cmbCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCourseActionPerformed
        retrieveBranch();
    }//GEN-LAST:event_cmbCourseActionPerformed

    private void txtRollFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRollFocusLost
    }//GEN-LAST:event_txtRollFocusLost

    private void txtRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRollActionPerformed
        // TODO add your handling code here:
        clearProfile();
        clearfee();
        clearAddress();
        btn_ClearEDActionPerformed(evt);
        btn_ClearDocActionPerformed(evt);

        try {
            con = Util.getConnection();
            psmnt = con.prepareStatement("select roll_number from student_details where roll_number=?");
            psmnt.setString(1, txtRoll.getText().trim());
            rs = psmnt.executeQuery();
            if (rs.first()) {
                retrievesdata();
                retrievefdata();
                retrievecdata();
                retrieveedudata();
                retrievesdocdata();
                retrieveImage();
            } else {
                JOptionPane.showMessageDialog(this, "Roll number doesnot exist.");

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error :- " + ex.toString());
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txtRollActionPerformed

    private void txtEnrollFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEnrollFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnrollFocusLost

    private void txtEnrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnrollActionPerformed
        // TODO add your handling code here:
        clearProfile();
        clearfee();
        clearAddress();
        btn_ClearEDActionPerformed(evt);
        btn_ClearDocActionPerformed(evt);
        try {
            con = Util.getConnection();
            psmnt = con.prepareStatement("select roll_number from student_details where enrollment_number=?");
            psmnt.setString(1, txtEnroll.getText().trim());
            rs = psmnt.executeQuery();
            if (rs.first()) {
                txtRoll.setText(rs.getString(1));
                retrievesdata();
                retrievefdata();
                retrievecdata();
                retrieveedudata();
                retrievesdocdata();
                retrieveImage();
            } else {
                JOptionPane.showMessageDialog(this, "Data doesnot exist.");
            }

        } catch (SQLException | HeadlessException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error :- " + ex.toString());
        }
    }//GEN-LAST:event_txtEnrollActionPerformed

    private void btnSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSDActionPerformed
        // TODO add your handling code here:
        validateStudentDetails();
        if (list.size() <= 0) {
            jTabbedPane1.setSelectedIndex(1);
        }
    }//GEN-LAST:event_btnSDActionPerformed

    private void btn_ClearProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearProfileActionPerformed
        clearProfile();
    }//GEN-LAST:event_btn_ClearProfileActionPerformed

    private void txtAdd1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdd1KeyReleased
        // TODO add your handling code here:
        if (cbSameContact.isSelected()) {
            txtAdd2.setText(txtAdd1.getText());
        }
    }//GEN-LAST:event_txtAdd1KeyReleased

    private void txtCity1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCity1KeyReleased
        // TODO add your handling code here:
        if (cbSameContact.isSelected()) {
            txtCity2.setText(txtCity1.getText());
        }
    }//GEN-LAST:event_txtCity1KeyReleased

    private void txtState1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtState1KeyReleased
        // TODO add your handling code here:
        if (cbSameContact.isSelected()) {
            txtState2.setText(txtState1.getText());
        }
    }//GEN-LAST:event_txtState1KeyReleased

    private void txtCountry1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCountry1KeyReleased
        // TODO add your handling code here:
        if (cbSameContact.isSelected()) {
            txtCountry2.setText(txtCountry1.getText());
        }
    }//GEN-LAST:event_txtCountry1KeyReleased

    private void txtPin1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPin1KeyReleased
        // TODO add your handling code here:
        if (cbSameContact.isSelected()) {
            txtPin2.setText(txtPin1.getText());
        }
    }//GEN-LAST:event_txtPin1KeyReleased

    public void submitprofile() {

        String roll = txtRoll.getText().isEmpty() ? "" : txtRoll.getText().trim();
        String enroll = txtEnroll.getText().isEmpty() ? "" : txtEnroll.getText().trim();
        String fn = txt_fname.getText().isEmpty() ? "" : txt_fname.getText().trim();
        String mn = txt_mname.getText().isEmpty() ? "" : txt_mname.getText().trim();
        String ln = txt_lname.getText().isEmpty() ? "" : txt_lname.getText();
        String gender = (rbMale1.isSelected()) ? rbMale1.getText() : rbFemale1.getText();
        String father = txtFatherName1.getText().isEmpty() ? "" : txtFatherName1.getText().trim();
        String mother = txtMotherName1.getText().isEmpty() ? "" : txtMotherName1.getText().trim();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dob = df.format(dcDOB1.getDate());
        String bg = cmbBloodGroup1.getSelectedItem().toString();
        String nation = txtNationality1.getText().isEmpty() ? "" : txtNationality1.getText().trim();
        String ms = (rbMarried1.isSelected()) ? rbMarried1.getText() : rbUnmarried1.getText();
        String religion = txtReligion1.getText().isEmpty() ? "" : txtReligion1.getText().trim();
        String course = cmbCourse.getSelectedItem().toString();
        String cast = cmbCategory1.getSelectedItem().toString();
        String branch = cmbBranch.getSelectedItem().toString();
        String sem = cmbSemester.getSelectedItem().toString();
        String session = yc1.getYear() + "-" + yc2.getYear();

        String mode = (rb_institute.isSelected()) ? rb_institute.getText() : rb_jcecb.getText();
        String hfc = txt_HFC.getText().isEmpty() ? "0" : txt_HFC.getText().trim();
        String tfc = txt_TFC.getText().isEmpty() ? "0" : txt_TFC.getText().trim();
        String mfc = txt_MFC.getText().isEmpty() ? "0" : txt_MFC.getText().trim();
        String efc = txt_EFC.getText().isEmpty() ? "0" : txt_EFC.getText().trim();
        String ufc = txt_UFC.getText().isEmpty() ? "0" : txt_UFC.getText().trim();
        String bfc = txt_BFC.getText().isEmpty() ? "0" : txt_BFC.getText().trim();
        String ofc = txt_OFC.getText().isEmpty() ? "0" : txt_OFC.getText().trim();
        String thf = txt_TAHF.getText().isEmpty() ? "0" : txt_TAHF.getText().trim();
        String ttf = txt_TATF.getText().isEmpty() ? "0" : txt_TATF.getText().trim();
        String tmf = txt_TAMF.getText().isEmpty() ? "0" : txt_TAMF.getText().trim();
        String tef = txt_TAEF.getText().isEmpty() ? "0" : txt_TAEF.getText().trim();
        String tuf = txt_TAUF.getText().isEmpty() ? "0" : txt_TAUF.getText().trim();
        String tbf = txt_TABF.getText().isEmpty() ? "0" : txt_TABF.getText().trim();
        String tof = txt_TAOF.getText().isEmpty() ? "0" : txt_TAOF.getText().trim();
        String total = lblTotalResult.getText().isEmpty() ? "0" : lblTotalResult.getText().trim();

        String padd = txtAdd1.getText().isEmpty() ? "" : txtAdd1.getText().trim();
        String pcity = txtCity1.getText().isEmpty() ? "" : txtCity1.getText().trim();
        String pstate = txtState1.getText().isEmpty() ? "" : txtState1.getText().trim();
        String pcountry = txtCountry1.getText().isEmpty() ? "" : txtCountry1.getText().trim();
        String ppin = txtPin1.getText().isEmpty() ? "" : txtPin1.getText().trim();
        String cadd = txtAdd2.getText().isEmpty() ? "" : txtAdd2.getText().trim();
        String ccity = txtCity2.getText().isEmpty() ? "" : txtCity2.getText().trim();
        String cstate = txtState2.getText().isEmpty() ? "" : txtState2.getText().trim();
        String ccountry = txtCountry2.getText().isEmpty() ? "" : txtCountry2.getText().trim();
        String cpin = txtPin2.getText().isEmpty() ? "" : txtPin2.getText().trim();
        String mobile = txtMobile.getText().isEmpty() ? "" : txtMobile.getText().trim();
        String pmail = txtMail1.getText().isEmpty() ? "" : txtMail1.getText().trim();
        String phone = txtHomePhone.getText().isEmpty() ? "" : txtHomePhone.getText().trim();
        String smail = txtMail2.getText().isEmpty() ? "" : txtMail2.getText().trim();

        String m10 = (cb10m.isSelected()) ? "Y" : "N";
        String c10 = (cb10c.isSelected()) ? "Y" : "N";
        String m12 = (cb12m.isSelected()) ? "Y" : "N";
        String c12 = (cb12c.isSelected()) ? "Y" : "N";
        String cg = (cbgc.isSelected()) ? "Y" : "N";
        String oth = txtOtherDoc.getText().isEmpty() ? "" : txtOtherDoc.getText().trim();


        try {
            Connection conn = Util.getConnection();
            conn.setAutoCommit(false);
            psmnt = conn.prepareStatement("update student_details set enrollment_number=?,first_name=?,middle_name=?,last_name=?,gender=?,father_name=?,mother_name=?,dob=?,bloodgroup=?,nationality=?,marital_status=?,religion=?,course=?,cast=?,branch=?,semester=?,session=? where roll_number=?");
            psmnt.setString(1, enroll);
            psmnt.setString(2, fn);
            psmnt.setString(3, mn);
            psmnt.setString(4, ln);
            psmnt.setString(5, gender);
            psmnt.setString(6, father);
            psmnt.setString(7, mother);
            psmnt.setString(8, dob);
            psmnt.setString(9, bg);
            psmnt.setString(10, nation);
            psmnt.setString(11, ms);
            psmnt.setString(12, religion);
            psmnt.setString(13, course);
            psmnt.setString(14, cast);
            psmnt.setString(15, branch);
            psmnt.setString(16, sem);
            psmnt.setString(17, session);
            psmnt.setString(18, roll);
            int a = psmnt.executeUpdate();
            if (a > 0) {
                System.out.println("Student Details successfully updated");
            }

            psmnt = conn.prepareStatement("update fee_details set admode=?,hfc=?,tfc=?,mfc=?,efc=?,ufc=?,bfc=?,ofc=?,thf=?,ttf=?,tmf=?,tef=?,tuf=?,tbf=?,tof=?,total=?,enrollmentno=? where roll_number=?");
            psmnt.setString(1, mode);
            psmnt.setString(2, hfc);
            psmnt.setString(3, tfc);
            psmnt.setString(4, mfc);
            psmnt.setString(5, efc);
            psmnt.setString(6, ufc);
            psmnt.setString(7, bfc);
            psmnt.setString(8, ofc);
            psmnt.setString(9, thf);
            psmnt.setString(10, ttf);
            psmnt.setString(11, tmf);
            psmnt.setString(12, tef);
            psmnt.setString(13, tuf);
            psmnt.setString(14, tbf);
            psmnt.setString(15, tof);
            psmnt.setString(16, total);
            psmnt.setString(17, enroll);
            psmnt.setString(18, roll);
            int b = psmnt.executeUpdate();
            if (b > 0) {
                System.out.println("Fee Details successfully updated");
            }

            psmnt = conn.prepareStatement("update student_address set padd=?,pcity=?,pstate=?,pcountry=?,ppin=?,cadd=?,ccity=?,cstate=?,ccountry=?,cpin=?,mobileno=?,pmail=?,phoneno=?,smail=?,enrollmentno=? where roll_number=?");
            psmnt.setString(1, padd);
            psmnt.setString(2, pcity);
            psmnt.setString(3, pstate);
            psmnt.setString(4, pcountry);
            psmnt.setString(5, ppin);
            psmnt.setString(6, cadd);
            psmnt.setString(7, ccity);
            psmnt.setString(8, cstate);
            psmnt.setString(9, ccountry);
            psmnt.setString(10, cpin);
            psmnt.setString(11, mobile);
            psmnt.setString(12, pmail);
            psmnt.setString(13, phone);
            psmnt.setString(14, smail);
            psmnt.setString(15, enroll);
            psmnt.setString(16, roll);
            int c = psmnt.executeUpdate();
            if (c > 0) {
                System.out.println("Address Details successfully updated");
            }

            psmnt = conn.prepareStatement("update submitteddoc set m10=?,c10=?,m12=?,c12=?,cgrd=?,other=?,enrollmentno=? where roll_number=?");
            psmnt.setString(1, m10);
            psmnt.setString(2, c10);
            psmnt.setString(3, m12);
            psmnt.setString(4, c12);
            psmnt.setString(5, cg);
            psmnt.setString(6, oth);
            psmnt.setString(7, enroll);
            psmnt.setString(8, roll);
            int d = psmnt.executeUpdate();
            if (d > 0) {
                System.out.println("Document details updated successfully.");
            }

            psmnt = conn.prepareStatement("update educational_details set hsexamtype=?, hsname=?, hsboard=?, hssubject=?, hsgrade=?, hspassingyear=?, iexamtype=?, iname=?, iboard=?, isubject=?, igrade=?, ipassingyear=?, ugexamtype=?, ugname=?, ugboard=?, ugsubject=?, uggrade=?, ugpassingyear=?, pgexamtype=?, pgname=?, pgboard=?, pgsubject=?, pggrade=?, pgpassingyear=?, oexamtype=?, oname=?, oboard=?, osubject=?, ograde=?, opassingyear=?, enrollment_number = ? where roll_number=?");

            psmnt.setString(1, cbHS.getText());
            psmnt.setString(2, txtHName.getText());
            psmnt.setString(3, txtHBoard.getText());
            psmnt.setString(4, txtHSubject.getText());
            psmnt.setString(5, txtHGrade.getText());
            psmnt.setString(6, txtHYear.getText());
            psmnt.setString(7, cbI.getText());
            psmnt.setString(8, txtIName.getText());
            psmnt.setString(9, txtIBoard.getText());
            psmnt.setString(10, txtISubject.getText());
            psmnt.setString(11, txtIGrade.getText());
            psmnt.setString(12, txtIYear.getText());
            psmnt.setString(13, cbUG.getText());
            psmnt.setString(14, txtUGName.getText());
            psmnt.setString(15, txtUGBoard.getText());
            psmnt.setString(16, txtUGSubject.getText());
            psmnt.setString(17, txtUGGrade.getText());
            psmnt.setString(18, txtUGYear.getText());
            psmnt.setString(19, cbPG.getText());
            psmnt.setString(20, txtPGName.getText());
            psmnt.setString(21, txtPGBoard.getText());
            psmnt.setString(22, txtPGSubject.getText());
            psmnt.setString(23, txtPGGrade.getText());
            psmnt.setString(24, txtPGYear.getText());
            psmnt.setString(25, cbOther.getText());
            psmnt.setString(26, txtOName.getText());
            psmnt.setString(27, txtOBoard.getText());
            psmnt.setString(28, txtOSubject.getText());
            psmnt.setString(29, txtOGrade.getText());
            psmnt.setString(30, txtOYear.getText());
            psmnt.setString(31, txtEnroll.getText());
            psmnt.setString(32, txtRoll.getText());

            int f = psmnt.executeUpdate();
            if (f > 0) {
                System.out.println("Educational Details successfully updated");
            }

            psmnt = conn.prepareStatement("Update pay_report set enrollmentno = '" + txtEnroll.getText().trim() + "' where rollno = '" + txtRoll.getText().trim() + "'");
            int g = psmnt.executeUpdate();
            if (g > 0) {
                System.out.println("Enrollment number updated on pay report.");
            }

            conn.commit();
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            Util.closeStatement(psmnt);
        }
    }

    public void addImage() {
        String logo = null;
        String l = pimage.getText().trim();
        
        if (l.length() != 0) {
            logo = (l.replace('\\', '/'));
        }
        try {
            FileInputStream fis = new FileInputStream(logo);
            byte b[] = new byte[fis.available()];
            fis.read(b);
            fis.close();
            con = Util.getConnection();
            psmnt = con.prepareStatement("update student_image set image = ? where roll_number='" + txtRoll.getText().trim() + "'");
            psmnt.setBytes(1, b);
            int a = psmnt.executeUpdate();
            if (a > 0) {
                System.out.println("Image successfully updated");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void storedue() {
        try {
            double fdtution = 0, fdhostel = 0, fdmess = 0, fdexam = 0, fduniform = 0, fdbus = 0, fdother = 0, fdtotal = 0;
            double prtution = 0, prhostel = 0, prmess = 0, prexam = 0, pruniform = 0, prbus = 0, prother = 0, prtotal = 0;
            con = Util.getConnection();

            stmt = con.createStatement();
            ResultSet rs_fd = stmt.executeQuery("select  ttf, thf, tmf, tef, tuf, tbf, tof, total from fee_details where roll_number = '" + txtRoll.getText() + "'");
            if (rs_fd.next()) {
                fdtution = Double.parseDouble(rs_fd.getString(1));
                fdhostel = Double.parseDouble(rs_fd.getString(2));
                fdmess = Double.parseDouble(rs_fd.getString(3));
                fdexam = Double.parseDouble(rs_fd.getString(4));
                fduniform = Double.parseDouble(rs_fd.getString(5));
                fdbus = Double.parseDouble(rs_fd.getString(6));
                fdother = Double.parseDouble(rs_fd.getString(7));
                fdtotal = Double.parseDouble(rs_fd.getString(8));

            }
            ResultSet rs_pr = stmt.executeQuery("select  sum(tutionfee), sum(hostelfee), sum(messfee), sum(examfee), sum(uniformcharge), sum(busfare), sum(other), sum(amount) from pay_report where rollno = '" + txtRoll.getText() + "'");
            if (rs_pr.next()) {
                prtution = (rs_pr.getString(1) != null) ? Double.parseDouble(rs_pr.getString(1)) : 0;
                prhostel = (rs_pr.getString(2) != null) ? Double.parseDouble(rs_pr.getString(2)) : 0;
                prmess = (rs_pr.getString(3) != null) ? Double.parseDouble(rs_pr.getString(3)) : 0;
                prexam = (rs_pr.getString(4) != null) ? Double.parseDouble(rs_pr.getString(4)) : 0;
                pruniform = (rs_pr.getString(5) != null) ? Double.parseDouble(rs_pr.getString(5)) : 0;
                prbus = (rs_pr.getString(6) != null) ? Double.parseDouble(rs_pr.getString(6)) : 0;
                prother = (rs_pr.getString(7) != null) ? Double.parseDouble(rs_pr.getString(7)) : 0;
                prtotal = (rs_pr.getString(8) != null) ? Double.parseDouble(rs_pr.getString(8)) : 0;

            }
            tutiondue = fdtution - prtution;
            hosteldue = fdhostel - prhostel;
            messdue = fdmess - prmess;
            examdue = fdexam - prexam;
            uniformdue = fduniform - pruniform;
            busdue = fdbus - prbus;
            otherdue = fdother - prother;
            wholedue = fdtotal - prtotal;

            psmnt = con.prepareStatement("update due set tdue=?, hdue=?, mdue=?, edue=?, udue=?, bdue=?, odue=?, totaldue=? where roll_number=? ");
            psmnt.setString(1, String.valueOf(tutiondue));
            psmnt.setString(2, String.valueOf(hosteldue));
            psmnt.setString(3, String.valueOf(messdue));
            psmnt.setString(4, String.valueOf(examdue));
            psmnt.setString(5, String.valueOf(uniformdue));
            psmnt.setString(6, String.valueOf(busdue));
            psmnt.setString(7, String.valueOf(otherdue));
            psmnt.setString(8, String.valueOf(wholedue));
            psmnt.setString(9, txtRoll.getText().trim());
            int a = psmnt.executeUpdate();
            if (a > 0) {
                System.out.println("Due successfully updated");
            }

        } catch (Exception ex) {
            ex.toString();
        }
    }

    public void clearfee() {
        rb_institute.setSelected(true);
        txt_HFC.setText("0");
        txt_TFC.setText("0");
        txt_MFC.setText("0");
        txt_EFC.setText("0");
        txt_UFC.setText("0");
        txt_BFC.setText("0");
        txt_OFC.setText("0");
        txt_TAHF.setText("0");
        txt_TATF.setText("0");
        txt_TAMF.setText("0");
        txt_TAEF.setText("0");
        txt_TAUF.setText("0");
        txt_TABF.setText("0");
        txt_TAOF.setText("0");
        lblTotalResult.setText("0");
        cbHF.setSelected(false);
        cbTF.setSelected(false);
        cbEF.setSelected(false);
        cbUC.setSelected(false);
        cbBF.setSelected(false);
        cbOF.setSelected(false);
        cbMF.setSelected(false);
    }

    private void retrieveCourse() {
        ArrayList course = new ArrayList();
        cmbCourse.removeAllItems();
        try {
            con = Util.getConnection();
            psmnt = con.prepareStatement("select course from course");
            rs = psmnt.executeQuery();
            while (rs.next()) {
                course.add(rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < course.size(); i++) {
            cmbCourse.addItem(course.get(i));
        }
    }

    private void retrieveBranch() {
        ArrayList course = new ArrayList();
        cmbBranch.removeAllItems();
        Object obj = cmbCourse.getSelectedItem();
        if (obj != null) {
            try {
                con = Util.getConnection();
                psmnt = con.prepareStatement("select branch from branch where course ='" + cmbCourse.getSelectedItem().toString() + "'");
                rs = psmnt.executeQuery();
                while (rs.next()) {
                    course.add(rs.getString(1));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < course.size(); i++) {
                cmbBranch.addItem(course.get(i));
            }
        }
    }

    public void retrievesdata() {
        try {
            psmnt = con.prepareStatement("select * from student_details where roll_number='" + txtRoll.getText().trim() + "'");
            ResultSet r1 = psmnt.executeQuery();
            if (r1.next()) {
                txtEnroll.setText(r1.getString(2));
                txt_fname.setText(r1.getString(3));
                txt_mname.setText(r1.getString(4));
                txt_lname.setText(r1.getString(5));
                txtFatherName1.setText(r1.getString(7));
                txtMotherName1.setText(r1.getString(8));
                dcDOB1.setDate(r1.getDate(9));

                txtNationality1.setText(r1.getString(11));
                txtReligion1.setText(r1.getString(13));
                cmbCourse.setSelectedItem(r1.getString(14));
                cmbSemester.setSelectedItem(r1.getString(17));
                yc1.setYear(Integer.parseInt(r1.getString(18).substring(0, 4)));
                yc2.setYear(Integer.parseInt(r1.getString(18).substring(5)));

                if (r1.getString(6).equals("Male") || r1.getString(6) == null) {
                    rbMale1.setSelected(true);
                } else {
                    rbFemale1.setSelected(true);
                }

                if (r1.getString(12).equals("Married") || r1.getString(12) == null) {
                    rbMarried1.setSelected(true);
                } else {
                    rbUnmarried1.setSelected(true);
                }

                cmbBloodGroup1.setSelectedItem(r1.getString(10));
                cmbCategory1.setSelectedItem(r1.getString(15));
                cmbBranch.setSelectedItem(r1.getString(16));
            }
        } catch (NullPointerException ex) {
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void retrievefdata() {
        try {
            psmnt = con.prepareStatement("select * from fee_details where roll_number = '" + txtRoll.getText().trim() + "'");
            ResultSet r2 = psmnt.executeQuery();
            if (r2.next()) {
                if (r2.getString(2).equals("Institute Level")) {
                    rb_institute.setSelected(true);
                } else {
                    rb_jcecb.setSelected(true);
                }
                txt_HFC.setText(r2.getString(3));
                txt_TFC.setText(r2.getString(4));
                txt_MFC.setText(r2.getString(5));
                txt_EFC.setText(r2.getString(6));
                txt_UFC.setText(r2.getString(7));
                txt_BFC.setText(r2.getString(8));
                txt_OFC.setText(r2.getString(9));
                txt_TAHF.setText(r2.getString(10));
                txt_TATF.setText(r2.getString(11));
                txt_TAMF.setText(r2.getString(12));
                txt_TAEF.setText(r2.getString(13));
                txt_TAUF.setText(r2.getString(14));
                txt_TABF.setText(r2.getString(15));
                txt_TAOF.setText(r2.getString(16));
                lblTotalResult.setText(r2.getString(17));
            }
        } catch (Exception ex) {
        }
    }

    public void retrievecdata() {
        try {
            psmnt = con.prepareStatement("select * from student_address where roll_number='" + txtRoll.getText().trim() + "'");
            ResultSet r3 = psmnt.executeQuery();
            if (r3.next()) {
                txtAdd1.setText(r3.getString(2).trim());
                txtCity1.setText(r3.getString(3));
                txtState1.setText(r3.getString(4));
                txtCountry1.setText(r3.getString(5));
                txtPin1.setText(r3.getString(6));
                txtAdd2.setText(r3.getString(7).trim());
                txtCity2.setText(r3.getString(8));
                txtState2.setText(r3.getString(9));
                txtCountry2.setText(r3.getString(10));
                txtPin2.setText(r3.getString(11));
                txtMobile.setText(r3.getString(12));
                txtMail1.setText(r3.getString(13));
                txtHomePhone.setText(r3.getString(14));
                txtMail2.setText(r3.getString(15));
            }
        } catch (Exception ex) {
        }
    }

    public void retrieveedudata() {
        try {
            psmnt = con.prepareStatement("select * from educational_details where roll_number='" + txtRoll.getText().trim() + "'");
            ResultSet r4 = psmnt.executeQuery();
            if (r4.next()) {
                txtHName.setText(r4.getString(3));
                txtHBoard.setText(r4.getString(4));
                txtHSubject.setText(r4.getString(5));
                txtHGrade.setText(r4.getString(6));
                txtHYear.setText(r4.getString(7));

                txtIName.setText(r4.getString(9));
                txtIBoard.setText(r4.getString(10));
                txtISubject.setText(r4.getString(11));
                txtIGrade.setText(r4.getString(12));
                txtIYear.setText(r4.getString(13));

                txtUGName.setText(r4.getString(15));
                txtUGBoard.setText(r4.getString(16));
                txtUGSubject.setText(r4.getString(17));
                txtUGGrade.setText(r4.getString(18));
                txtUGYear.setText(r4.getString(19));

                txtPGName.setText(r4.getString(21));
                txtPGBoard.setText(r4.getString(22));
                txtPGSubject.setText(r4.getString(23));
                txtPGGrade.setText(r4.getString(24));
                txtPGYear.setText(r4.getString(25));

                txtOName.setText(r4.getString(27));
                txtOBoard.setText(r4.getString(28));
                txtOSubject.setText(r4.getString(29));
                txtOGrade.setText(r4.getString(30));
                txtOYear.setText(r4.getString(31));
            }
        } catch (Exception ex) {
        }
    }

    public void retrievesdocdata() {
        try {
            psmnt = con.prepareStatement("select * from submitteddoc where roll_number = '" + txtRoll.getText().trim() + "'");
            ResultSet r5 = psmnt.executeQuery();
            if (r5.next()) {
                if (r5.getString(2).equals("Y")) {
                    cb10m.setSelected(true);
                } else {
                    cb10m.setSelected(false);
                }
                if (r5.getString(3).equals("Y")) {
                    cb10c.setSelected(true);
                } else {
                    cb10c.setSelected(false);
                }
                if (r5.getString(4).equals("Y")) {
                    cb12m.setSelected(true);
                } else {
                    cb12m.setSelected(false);
                }
                if (r5.getString(5).equals("Y")) {
                    cb12c.setSelected(true);
                } else {
                    cb12c.setSelected(false);
                }
                if (r5.getString(6).equals("Y")) {
                    cbgc.setSelected(true);
                } else {
                    cbgc.setSelected(false);
                }
                cboc.setSelected(true);
                if (cboc.isSelected()) {
                    txtOtherDoc.setText(r5.getString(7));
                } else {
                    txtOtherDoc.setText("");
                }
            }
        } catch (Exception ex) {
        }
    }

    public void retrieveImage() {
        try {
            con = Util.getConnection();
            psmnt = con.prepareStatement("select * from student_image where roll_number='" + txtRoll.getText().trim() + "' ");
            rs = psmnt.executeQuery();
            byte b[] = null;
            
            while (rs.next()) {
                b = rs.getBytes(2);
                //pimage.setText(rs.getString(2));
            }
            //String url = pimage.getText();
            ImageIcon myIcon = new ImageIcon(Toolkit.getDefaultToolkit().createImage(b));
            lbl_image.setIcon(myIcon);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clearProfile() {
        // txtRoll.setText("");
        // txtEnroll.setText("");
        txt_fname.setText("");
        txt_mname.setText("");
        txt_lname.setText("");
        rbMale1.setSelected(true);
        txtFatherName1.setText("");
        txtMotherName1.setText("");
        cmbBloodGroup1.setSelectedIndex(0);
        txtNationality1.setText("");
        rbUnmarried1.setSelected(true);
        txtReligion1.setText("");
        cmbCourse.setSelectedIndex(0);
        cmbCategory1.setSelectedIndex(0);
        cmbBranch.setSelectedIndex(0);
        cmbSemester.setSelectedIndex(0);
        yc1.setYear(2013);
        yc2.setYear(2013);
        txtRoll.setFocusable(true);
    }

    public void calHF() {
        String HFC = txt_HFC.getText();
        Double a = Double.parseDouble(txt_AFHF.getText());
        Double b;
        Double c;
        if (HFC.contains("%")) {
            b = Double.parseDouble(HFC.substring(0, HFC.length() - 1));
            c = a - (a * b) / 100;
        } else {
            c = a - Double.parseDouble(HFC);
        }
        txt_TAHF.setText(String.valueOf(c));
    }

    public void calMF() {
        String MFC = txt_MFC.getText();
        Double a = Double.parseDouble(txt_AFMF.getText());
        Double b;
        Double c;
        if (MFC.contains("%")) {
            b = Double.parseDouble(MFC.substring(0, MFC.length() - 1));
            c = a - (a * b) / 100;
        } else {
            c = a - Double.parseDouble(MFC);
        }
        txt_TAMF.setText(String.valueOf(c));
    }

    public void calEF() {
        String EFC = txt_EFC.getText();
        Double a = Double.parseDouble(txt_AFEF.getText());
        Double b;
        Double c;
        if (EFC.contains("%")) {
            b = Double.parseDouble(EFC.substring(0, EFC.length() - 1));
            c = a - (a * b) / 100;
        } else {
            c = a - Double.parseDouble(EFC);
        }
        txt_TAEF.setText(String.valueOf(c));
    }

    public void calUC() {
        String UFC = txt_UFC.getText();
        Double a = Double.parseDouble(txt_AFUF.getText());
        Double b;
        Double c;
        if (UFC.contains("%")) {
            b = Double.parseDouble(UFC.substring(0, UFC.length() - 1));
            c = a - (a * b) / 100;
        } else {
            c = a - Double.parseDouble(UFC);
        }
        txt_TAUF.setText(String.valueOf(c));
    }

    public void calBF() {
        String BFC = txt_BFC.getText();
        Double a = Double.parseDouble(txt_AFBF.getText());
        Double b;
        Double c;
        if (BFC.contains("%")) {
            b = Double.parseDouble(BFC.substring(0, BFC.length() - 1));
            c = a - (a * b) / 100;
        } else {
            c = a - Double.parseDouble(BFC);
        }
        txt_TABF.setText(String.valueOf(c));
    }

    public void calOF() {
        String OFC = txt_OFC.getText();
        Double a = Double.parseDouble(txt_AFOF.getText());
        Double b;
        Double c;
        if (OFC.contains("%")) {
            b = Double.parseDouble(OFC.substring(0, OFC.length() - 1));
            c = a - (a * b) / 100;
        } else {
            c = a - Double.parseDouble(OFC);
        }
        txt_TAOF.setText(String.valueOf(c));
    }

    public void calTF() {
        String TFC = txt_TFC.getText();
        Double a = Double.parseDouble(txt_AFTF.getText());
        Double b;
        Double c;
        if (TFC.contains("%")) {
            b = Double.parseDouble(TFC.substring(0, TFC.length() - 1));
            c = a - (a * b) / 100;
        } else {
            c = a - Double.parseDouble(TFC);
        }
        txt_TATF.setText(String.valueOf(c));
    }

    public void retrieveTotal() {
        try {
            con = Util.getConnection();
            if (rb_institute.isSelected()) {
                psmnt = con.prepareStatement("select 1st_year + 2nd_year + 3rd_year + 4th_year from fee_btech where fee_type='TOTAL'");
                rs = psmnt.executeQuery();
                if (rs.next()) {
                    txt_AFTF.setText(rs.getString(1));

                }
            } else if (rb_jcecb.isSelected()) {
                psmnt = con.prepareStatement("select 1st_year + 2nd_year + 3rd_year + 4th_year from fee_btech_jcecb where fee_type='TOTAL'");
                rs = psmnt.executeQuery();
                if (rs.next()) {
                    txt_AFTF.setText(rs.getString(1));
                }
            }
            if (cbTF.isSelected() == false) {
                txt_AFTF.setText("0");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void clearAddress() {
        txtAdd1.setText("");
        txtCity1.setText("");
        txtState1.setText("");
        txtCountry1.setText("");
        txtPin1.setText("");
        txtAdd2.setText("");
        txtCity2.setText("");
        txtState2.setText("");
        txtCountry2.setText("");
        txtPin2.setText("");
        txtMobile.setText("");
        txtMail1.setText("");
        txtHomePhone.setText("");
        txtMail2.setText("");
        cbSameContact.setSelected(false);
    }

    public void totalAmount() {
        double a = Double.parseDouble(txt_TAHF.getText());
        double b = Double.parseDouble(txt_TATF.getText());
        double c = Double.parseDouble(txt_TAMF.getText());
        double d = Double.parseDouble(txt_TAEF.getText());
        double e = Double.parseDouble(txt_TAUF.getText());
        double f = Double.parseDouble(txt_TABF.getText());
        double g = Double.parseDouble(txt_TAOF.getText());
        double total = a + b + c + d + e + f + g;
        lblTotalResult.setText(String.valueOf(total));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCD;
    private javax.swing.JButton btnED;
    private javax.swing.JButton btnFD;
    private javax.swing.JButton btnSD;
    private javax.swing.JButton btn_ClearAddress;
    private javax.swing.JButton btn_ClearDoc;
    private javax.swing.JButton btn_ClearED;
    private javax.swing.JButton btn_ClearFee;
    private javax.swing.JButton btn_ClearProfile;
    private javax.swing.JButton btn_browseImage;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox cb10c;
    private javax.swing.JCheckBox cb10m;
    private javax.swing.JCheckBox cb12c;
    private javax.swing.JCheckBox cb12m;
    private javax.swing.JCheckBox cbBF;
    private javax.swing.JCheckBox cbEF;
    private javax.swing.JCheckBox cbHF;
    private javax.swing.JCheckBox cbHS;
    private javax.swing.JCheckBox cbI;
    private javax.swing.JCheckBox cbMF;
    private javax.swing.JCheckBox cbOF;
    private javax.swing.JCheckBox cbOther;
    private javax.swing.JCheckBox cbPG;
    private javax.swing.JCheckBox cbSameContact;
    private javax.swing.JCheckBox cbTF;
    private javax.swing.JCheckBox cbUC;
    private javax.swing.JCheckBox cbUG;
    private javax.swing.JCheckBox cbgc;
    private javax.swing.JCheckBox cboc;
    private javax.swing.JComboBox cmbBloodGroup1;
    private javax.swing.JComboBox cmbBranch;
    private javax.swing.JComboBox cmbCategory1;
    private javax.swing.JComboBox cmbCourse;
    private javax.swing.JComboBox cmbSemester;
    private com.toedter.calendar.JDateChooser dcDOB1;
    private javax.swing.JButton jButton12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblMother;
    private javax.swing.JLabel lblNation;
    private javax.swing.JLabel lblReligion;
    private javax.swing.JLabel lblTotalResult;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JLabel lblcountry;
    private javax.swing.JLabel lbldob;
    private javax.swing.JLabel lblfather;
    private javax.swing.JLabel lblfn;
    private javax.swing.JLabel lblmobile;
    private javax.swing.JLabel lblpa;
    private javax.swing.JLabel lblpc;
    private javax.swing.JLabel lblpin;
    private javax.swing.JLabel lblsession;
    private javax.swing.JLabel lblstate;
    private javax.swing.JPanel panAddress;
    private javax.swing.JPanel panAdmissionMode;
    private javax.swing.JPanel panCorrespondance;
    private javax.swing.JPanel panEducation;
    private javax.swing.JPanel panPermanent;
    private javax.swing.JPanel panProfile1;
    private javax.swing.JPanel panProfile2;
    private javax.swing.JTextField pimage;
    private javax.swing.JRadioButton rbFemale1;
    private javax.swing.JRadioButton rbMale1;
    private javax.swing.JRadioButton rbMarried1;
    private javax.swing.JRadioButton rbUnmarried1;
    private javax.swing.JRadioButton rb_institute;
    private javax.swing.JRadioButton rb_jcecb;
    private javax.swing.JScrollPane scrollerAdd;
    private javax.swing.JTextArea txtAdd1;
    private javax.swing.JTextArea txtAdd2;
    private javax.swing.JTextField txtCity1;
    private javax.swing.JTextField txtCity2;
    private javax.swing.JTextField txtCountry1;
    private javax.swing.JTextField txtCountry2;
    private javax.swing.JTextField txtEnroll;
    private javax.swing.JTextField txtFatherName1;
    private javax.swing.JTextField txtHBoard;
    private javax.swing.JTextField txtHGrade;
    private javax.swing.JTextField txtHName;
    private javax.swing.JTextField txtHSubject;
    private javax.swing.JTextField txtHYear;
    private javax.swing.JTextField txtHomePhone;
    private javax.swing.JTextField txtIBoard;
    private javax.swing.JTextField txtIGrade;
    private javax.swing.JTextField txtIName;
    private javax.swing.JTextField txtISubject;
    private javax.swing.JTextField txtIYear;
    private javax.swing.JTextField txtMail1;
    private javax.swing.JTextField txtMail2;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtMotherName1;
    private javax.swing.JTextField txtNationality1;
    private javax.swing.JTextField txtOBoard;
    private javax.swing.JTextField txtOGrade;
    private javax.swing.JTextField txtOName;
    private javax.swing.JTextField txtOSubject;
    private javax.swing.JTextField txtOYear;
    private javax.swing.JTextField txtOtherDoc;
    private javax.swing.JTextField txtPGBoard;
    private javax.swing.JTextField txtPGGrade;
    private javax.swing.JTextField txtPGName;
    private javax.swing.JTextField txtPGSubject;
    private javax.swing.JTextField txtPGYear;
    private javax.swing.JTextField txtPin1;
    private javax.swing.JTextField txtPin2;
    private javax.swing.JTextField txtReligion1;
    private javax.swing.JTextField txtRoll;
    private javax.swing.JTextField txtState1;
    private javax.swing.JTextField txtState2;
    private javax.swing.JTextField txtUGBoard;
    private javax.swing.JTextField txtUGGrade;
    private javax.swing.JTextField txtUGName;
    private javax.swing.JTextField txtUGSubject;
    private javax.swing.JTextField txtUGYear;
    private javax.swing.JTextField txt_AFBF;
    private javax.swing.JTextField txt_AFEF;
    private javax.swing.JTextField txt_AFHF;
    private javax.swing.JTextField txt_AFMF;
    private javax.swing.JTextField txt_AFOF;
    private javax.swing.JTextField txt_AFTF;
    private javax.swing.JTextField txt_AFUF;
    private javax.swing.JTextField txt_BFC;
    private javax.swing.JTextField txt_EFC;
    private javax.swing.JTextField txt_HFC;
    private javax.swing.JTextField txt_MFC;
    private javax.swing.JTextField txt_OFC;
    private javax.swing.JTextField txt_TABF;
    private javax.swing.JTextField txt_TAEF;
    private javax.swing.JTextField txt_TAHF;
    private javax.swing.JTextField txt_TAMF;
    private javax.swing.JTextField txt_TAOF;
    private javax.swing.JTextField txt_TATF;
    private javax.swing.JTextField txt_TAUF;
    private javax.swing.JTextField txt_TFC;
    private javax.swing.JTextField txt_UFC;
    private javax.swing.JTextField txt_fname;
    private javax.swing.JTextField txt_lname;
    private javax.swing.JTextField txt_mname;
    private com.toedter.calendar.JYearChooser yc1;
    private com.toedter.calendar.JYearChooser yc2;
    // End of variables declaration//GEN-END:variables
}
