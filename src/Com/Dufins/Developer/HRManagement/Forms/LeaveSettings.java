/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.Dufins.Developer.HRManagement.Forms;

import Util.Util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Owner
 */
public class LeaveSettings extends javax.swing.JPanel {

    /**
     * Creates new form LeaveSettings
     */
    Connection connection = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    public LeaveSettings() {
        initComponents();
        try {
            connection = Util.getConnection();
            showLeave();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showLeave() {
        try {
            pstmt = connection.prepareStatement("select * from leave_setting");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                if (rs.getString(2).equalsIgnoreCase("General")) {
                    genCL.setText(rs.getString(3));
                    genPL.setText(rs.getString(4));
                    genSL.setText(rs.getString(5));
                    genEL.setText(rs.getString(6));
                    genOther.setText(rs.getString(7));
                    genMarital.setText(rs.getString(8));
                    genMaternity.setText(rs.getString(9));
                }
                if (rs.getString(2).equalsIgnoreCase("Jan")) {
                    janCL.setText(rs.getString(3));
                    janPL.setText(rs.getString(4));
                    janSL.setText(rs.getString(5));
                    janEL.setText(rs.getString(6));
                    janOther.setText(rs.getString(7));
                }
                if (rs.getString(2).equalsIgnoreCase("Feb")) {
                    febCL.setText(rs.getString(3));
                    febPL.setText(rs.getString(4));
                    febSL.setText(rs.getString(5));
                    febEL.setText(rs.getString(6));
                    febOther.setText(rs.getString(7));
                }
                if (rs.getString(2).equalsIgnoreCase("Mar")) {
                    marCL.setText(rs.getString(3));
                    marPL.setText(rs.getString(4));
                    marSL.setText(rs.getString(5));
                    marEL.setText(rs.getString(6));
                    marOther.setText(rs.getString(7));
                }
                if (rs.getString(2).equalsIgnoreCase("Apr")) {
                    aprCL.setText(rs.getString(3));
                    aprPL.setText(rs.getString(4));
                    aprSL.setText(rs.getString(5));
                    aprEL.setText(rs.getString(6));
                    aprOther.setText(rs.getString(7));
                }
                if (rs.getString(2).equalsIgnoreCase("May")) {
                    mayCL.setText(rs.getString(3));
                    mayPL.setText(rs.getString(4));
                    maySL.setText(rs.getString(5));
                    mayEL.setText(rs.getString(6));
                    mayOther.setText(rs.getString(7));
                }
                if (rs.getString(2).equalsIgnoreCase("Jun")) {
                    junCL.setText(rs.getString(3));
                    junPL.setText(rs.getString(4));
                    junSL.setText(rs.getString(5));
                    junEL.setText(rs.getString(6));
                    junOther.setText(rs.getString(7));
                }
                if (rs.getString(2).equalsIgnoreCase("Jul")) {
                    julCL.setText(rs.getString(3));
                    julPL.setText(rs.getString(4));
                    julSL.setText(rs.getString(5));
                    julEL.setText(rs.getString(6));
                    julOther.setText(rs.getString(7));
                }
                if (rs.getString(2).equalsIgnoreCase("Aug")) {
                    augCL.setText(rs.getString(3));
                    augPL.setText(rs.getString(4));
                    augSL.setText(rs.getString(5));
                    augEL.setText(rs.getString(6));
                    augOther.setText(rs.getString(7));
                }
                if (rs.getString(2).equalsIgnoreCase("Sep")) {
                    sepCL.setText(rs.getString(3));
                    sepPL.setText(rs.getString(4));
                    sepSL.setText(rs.getString(5));
                    sepEL.setText(rs.getString(6));
                    sepOther.setText(rs.getString(7));
                }
                if (rs.getString(2).equalsIgnoreCase("Oct")) {
                    octCL.setText(rs.getString(3));
                    octPL.setText(rs.getString(4));
                    octSL.setText(rs.getString(5));
                    octEL.setText(rs.getString(6));
                    octOther.setText(rs.getString(7));
                }
                if (rs.getString(2).equalsIgnoreCase("Nov")) {
                    novCL.setText(rs.getString(3));
                    novPL.setText(rs.getString(4));
                    novSL.setText(rs.getString(5));
                    novEL.setText(rs.getString(6));
                    novOther.setText(rs.getString(7));
                }
                if (rs.getString(2).equalsIgnoreCase("Dec")) {
                    decCL.setText(rs.getString(3));
                    decPL.setText(rs.getString(4));
                    decSL.setText(rs.getString(5));
                    decEL.setText(rs.getString(6));
                    decOther.setText(rs.getString(7));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        ChkGeneral = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        genCL = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        genPL = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        genSL = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        genEL = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        genOther = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        genMarital = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        genMaternity = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        ChkAdvance = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        janCL = new javax.swing.JTextField();
        febCL = new javax.swing.JTextField();
        marCL = new javax.swing.JTextField();
        aprCL = new javax.swing.JTextField();
        mayCL = new javax.swing.JTextField();
        junCL = new javax.swing.JTextField();
        julCL = new javax.swing.JTextField();
        augCL = new javax.swing.JTextField();
        sepCL = new javax.swing.JTextField();
        octCL = new javax.swing.JTextField();
        novCL = new javax.swing.JTextField();
        decCL = new javax.swing.JTextField();
        janPL = new javax.swing.JTextField();
        mayPL = new javax.swing.JTextField();
        aprPL = new javax.swing.JTextField();
        marPL = new javax.swing.JTextField();
        febPL = new javax.swing.JTextField();
        junPL = new javax.swing.JTextField();
        julPL = new javax.swing.JTextField();
        augPL = new javax.swing.JTextField();
        octPL = new javax.swing.JTextField();
        sepPL = new javax.swing.JTextField();
        decPL = new javax.swing.JTextField();
        novPL = new javax.swing.JTextField();
        janSL = new javax.swing.JTextField();
        maySL = new javax.swing.JTextField();
        aprSL = new javax.swing.JTextField();
        marSL = new javax.swing.JTextField();
        febSL = new javax.swing.JTextField();
        junSL = new javax.swing.JTextField();
        julSL = new javax.swing.JTextField();
        augSL = new javax.swing.JTextField();
        octSL = new javax.swing.JTextField();
        sepSL = new javax.swing.JTextField();
        decSL = new javax.swing.JTextField();
        novSL = new javax.swing.JTextField();
        janEL = new javax.swing.JTextField();
        mayEL = new javax.swing.JTextField();
        aprEL = new javax.swing.JTextField();
        marEL = new javax.swing.JTextField();
        febEL = new javax.swing.JTextField();
        junEL = new javax.swing.JTextField();
        julEL = new javax.swing.JTextField();
        augEL = new javax.swing.JTextField();
        octEL = new javax.swing.JTextField();
        sepEL = new javax.swing.JTextField();
        decEL = new javax.swing.JTextField();
        novEL = new javax.swing.JTextField();
        janOther = new javax.swing.JTextField();
        mayOther = new javax.swing.JTextField();
        aprOther = new javax.swing.JTextField();
        marOther = new javax.swing.JTextField();
        febOther = new javax.swing.JTextField();
        junOther = new javax.swing.JTextField();
        julOther = new javax.swing.JTextField();
        augOther = new javax.swing.JTextField();
        octOther = new javax.swing.JTextField();
        sepOther = new javax.swing.JTextField();
        decOther = new javax.swing.JTextField();
        novOther = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        BtnApply = new javax.swing.JLabel();
        BtnCancel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Leave Settings", 2, 3, new java.awt.Font("Arial", 1, 18), new java.awt.Color(0, 0, 51))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", 0, 0, new java.awt.Font("Arial", 1, 14), java.awt.Color.white)); // NOI18N

        ChkGeneral.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(ChkGeneral);
        ChkGeneral.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ChkGeneral.setText("General");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Casual Leave (CL)");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Paid Leave (PL)");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Sick Leave (SL)");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Earned Leave (EL)");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Other Leave ");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Marital Leave ");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Maternity  Leave ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(genPL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(genSL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(genCL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(13, 13, 13)
                                .addComponent(genEL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(genOther, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(genMarital, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(genMaternity, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ChkGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(ChkGeneral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genCL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genEL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genPL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genOther, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(genMaternity, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(genMarital, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(genSL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", 0, 0, new java.awt.Font("Arial", 1, 12), java.awt.Color.white)); // NOI18N

        ChkAdvance.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(ChkAdvance);
        ChkAdvance.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ChkAdvance.setText("Advance");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("JAN");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("FEB");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("MAR");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("APR");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setText("MAY");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setText("JUN");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setText("JUL");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setText("AUG");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setText("SEP");

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setText("NOV");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setText("DEC");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setText("OCT");

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setText("CL");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel21.setText("PL");

        jLabel22.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel22.setText("SL");

        jLabel23.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel23.setText("EL");

        jLabel24.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel24.setText("Other");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ChkAdvance, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel8)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel9)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel10)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel11)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel12)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel13)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel14)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel15)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel16)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel19)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel17)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel18)
                                .addGap(10, 10, 10))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(janCL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(febCL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(marCL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aprCL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(mayCL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(junCL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(julCL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(augCL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sepCL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(octCL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(novCL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(decCL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(janOther, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(febOther, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(marOther, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aprOther, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(mayOther, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(junOther, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(julOther, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(augOther, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sepOther, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(octOther, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(novOther, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(decOther, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(janEL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(febEL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(marEL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aprEL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(mayEL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(junEL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(julEL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(augEL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sepEL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(octEL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(novEL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(decEL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(janSL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(febSL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(marSL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aprSL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(maySL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(junSL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(julSL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(augSL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sepSL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(octSL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(novSL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(decSL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(janPL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(febPL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(marPL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aprPL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(mayPL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(junPL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(julPL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(augPL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sepPL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(octPL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(novPL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(decPL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(72, 72, 72))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ChkAdvance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(janOther, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(febOther, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(marOther, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(aprOther, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mayOther, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(junOther, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(julOther, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(augOther, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sepOther, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(octOther, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(novOther, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(decOther, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(janCL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(febCL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(marCL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(aprCL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mayCL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(junCL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(julCL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(augCL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sepCL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(octCL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(novCL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(decCL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(janPL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(febPL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(marPL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(aprPL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mayPL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(junPL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(julPL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(augPL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sepPL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(octPL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(novPL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(decPL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(janSL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(febSL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(marSL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(aprSL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(maySL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(junSL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(julSL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(augSL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sepSL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(octSL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(novSL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(decSL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(janEL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(febEL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(marEL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(aprEL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mayEL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(junEL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(julEL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(augEL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sepEL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(octEL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(novEL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(decEL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/nilaicon.png"))); // NOI18N

        BtnApply.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/save_as.png"))); // NOI18N
        BtnApply.setToolTipText("Apply Holiday Settings");
        BtnApply.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        BtnApply.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnApply.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnApplyMouseClicked(evt);
            }
        });

        BtnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Crystal_button_cancel.png"))); // NOI18N
        BtnCancel.setToolTipText("Apply Holiday Settings");
        BtnCancel.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        BtnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel25)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnApply)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCancel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnApply)
                    .addComponent(BtnCancel))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCancelMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_BtnCancelMouseClicked

    private void BtnApplyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnApplyMouseClicked
        // TODO add your handling code here:
        try {
            pstmt = connection.prepareStatement("update leave_setting set cl = ?, pl = ?, sl = ?, el = ?, other = ?, marital = ?, maternity = ? where month = ?");
            if (ChkGeneral.isSelected()) {
                pstmt.setString(1, genCL.getText());
                pstmt.setString(2, genPL.getText());
                pstmt.setString(3, genSL.getText());
                pstmt.setString(4, genEL.getText());
                pstmt.setString(5, genOther.getText());
                pstmt.setString(6, genMarital.getText());
                pstmt.setString(7, genMaternity.getText());
                pstmt.setString(8, "General");
                pstmt.executeUpdate();
            } else {
                //Insert january leave detail
                pstmt.setString(1, janCL.getText());
                pstmt.setString(2, janPL.getText());
                pstmt.setString(3, janSL.getText());
                pstmt.setString(4, janEL.getText());
                pstmt.setString(5, janOther.getText());
                pstmt.setString(6, genMarital.getText());
                pstmt.setString(7, genMaternity.getText());
                pstmt.setString(8, "Jan");
                pstmt.executeUpdate();
                //Insert february leave detail
                pstmt.setString(1, febCL.getText());
                pstmt.setString(2, febPL.getText());
                pstmt.setString(3, febSL.getText());
                pstmt.setString(4, febEL.getText());
                pstmt.setString(5, febOther.getText());
                pstmt.setString(6, genMarital.getText());
                pstmt.setString(7, genMaternity.getText());
                pstmt.setString(8, "Feb");
                pstmt.executeUpdate();
                //Insert march leave detail
                pstmt.setString(1, marCL.getText());
                pstmt.setString(2, marPL.getText());
                pstmt.setString(3, marSL.getText());
                pstmt.setString(4, marEL.getText());
                pstmt.setString(5, marOther.getText());
                pstmt.setString(6, genMarital.getText());
                pstmt.setString(7, genMaternity.getText());
                pstmt.setString(8, "Mar");
                pstmt.executeUpdate();
                //Insert april leave detail
                pstmt.setString(1, aprCL.getText());
                pstmt.setString(2, aprPL.getText());
                pstmt.setString(3, aprSL.getText());
                pstmt.setString(4, aprEL.getText());
                pstmt.setString(5, aprOther.getText());
                pstmt.setString(6, genMarital.getText());
                pstmt.setString(7, genMaternity.getText());
                pstmt.setString(8, "Apr");
                pstmt.executeUpdate();
                //Insert may leave detail
                pstmt.setString(1, mayCL.getText());
                pstmt.setString(2, mayPL.getText());
                pstmt.setString(3, maySL.getText());
                pstmt.setString(4, mayEL.getText());
                pstmt.setString(5, mayOther.getText());
                pstmt.setString(6, genMarital.getText());
                pstmt.setString(7, genMaternity.getText());
                pstmt.setString(8, "May");
                pstmt.executeUpdate();
                //Insert jun leave detail
                pstmt.setString(1, junCL.getText());
                pstmt.setString(2, junPL.getText());
                pstmt.setString(3, junSL.getText());
                pstmt.setString(4, junEL.getText());
                pstmt.setString(5, junOther.getText());
                pstmt.setString(6, genMarital.getText());
                pstmt.setString(7, genMaternity.getText());
                pstmt.setString(8, "Jun");
                pstmt.executeUpdate();
                //Insert july leave detail
                pstmt.setString(1, julCL.getText());
                pstmt.setString(2, julPL.getText());
                pstmt.setString(3, julSL.getText());
                pstmt.setString(4, julEL.getText());
                pstmt.setString(5, julOther.getText());
                pstmt.setString(6, genMarital.getText());
                pstmt.setString(7, genMaternity.getText());
                pstmt.setString(8, "Jul");
                pstmt.executeUpdate();
                //Insert august leave detail
                pstmt.setString(1, augCL.getText());
                pstmt.setString(2, augPL.getText());
                pstmt.setString(3, augSL.getText());
                pstmt.setString(4, augEL.getText());
                pstmt.setString(5, augOther.getText());
                pstmt.setString(6, genMarital.getText());
                pstmt.setString(7, genMaternity.getText());
                pstmt.setString(8, "Aug");
                pstmt.executeUpdate();
                //Insert september leave detail
                pstmt.setString(1, sepCL.getText());
                pstmt.setString(2, sepPL.getText());
                pstmt.setString(3, sepSL.getText());
                pstmt.setString(4, sepEL.getText());
                pstmt.setString(5, sepOther.getText());
                pstmt.setString(6, genMarital.getText());
                pstmt.setString(7, genMaternity.getText());
                pstmt.setString(8, "Sep");
                pstmt.executeUpdate();
                //Insert october leave detail
                pstmt.setString(1, octCL.getText());
                pstmt.setString(2, octPL.getText());
                pstmt.setString(3, octSL.getText());
                pstmt.setString(4, octEL.getText());
                pstmt.setString(5, octOther.getText());
                pstmt.setString(6, genMarital.getText());
                pstmt.setString(7, genMaternity.getText());
                pstmt.setString(8, "Oct");
                pstmt.executeUpdate();
                //Insert november leave detail
                pstmt.setString(1, novCL.getText());
                pstmt.setString(2, novPL.getText());
                pstmt.setString(3, novSL.getText());
                pstmt.setString(4, novEL.getText());
                pstmt.setString(5, novOther.getText());
                pstmt.setString(6, genMarital.getText());
                pstmt.setString(7, genMaternity.getText());
                pstmt.setString(8, "Nov");
                pstmt.executeUpdate();
                //Insert december leave detail
                pstmt.setString(1, decCL.getText());
                pstmt.setString(2, decPL.getText());
                pstmt.setString(3, decSL.getText());
                pstmt.setString(4, decEL.getText());
                pstmt.setString(5, decOther.getText());
                pstmt.setString(6, genMarital.getText());
                pstmt.setString(7, genMaternity.getText());
                pstmt.setString(8, "Dec");
                pstmt.executeUpdate();
            }
            JOptionPane.showMessageDialog(this, "Leave setting successfully updated.");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_BtnApplyMouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnApply;
    private javax.swing.JLabel BtnCancel;
    private javax.swing.JRadioButton ChkAdvance;
    private javax.swing.JRadioButton ChkGeneral;
    private javax.swing.JTextField aprCL;
    private javax.swing.JTextField aprEL;
    private javax.swing.JTextField aprOther;
    private javax.swing.JTextField aprPL;
    private javax.swing.JTextField aprSL;
    private javax.swing.JTextField augCL;
    private javax.swing.JTextField augEL;
    private javax.swing.JTextField augOther;
    private javax.swing.JTextField augPL;
    private javax.swing.JTextField augSL;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField decCL;
    private javax.swing.JTextField decEL;
    private javax.swing.JTextField decOther;
    private javax.swing.JTextField decPL;
    private javax.swing.JTextField decSL;
    private javax.swing.JTextField febCL;
    private javax.swing.JTextField febEL;
    private javax.swing.JTextField febOther;
    private javax.swing.JTextField febPL;
    private javax.swing.JTextField febSL;
    private javax.swing.JTextField genCL;
    private javax.swing.JTextField genEL;
    private javax.swing.JTextField genMarital;
    private javax.swing.JTextField genMaternity;
    private javax.swing.JTextField genOther;
    private javax.swing.JTextField genPL;
    private javax.swing.JTextField genSL;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JTextField janCL;
    private javax.swing.JTextField janEL;
    private javax.swing.JTextField janOther;
    private javax.swing.JTextField janPL;
    private javax.swing.JTextField janSL;
    private javax.swing.JTextField julCL;
    private javax.swing.JTextField julEL;
    private javax.swing.JTextField julOther;
    private javax.swing.JTextField julPL;
    private javax.swing.JTextField julSL;
    private javax.swing.JTextField junCL;
    private javax.swing.JTextField junEL;
    private javax.swing.JTextField junOther;
    private javax.swing.JTextField junPL;
    private javax.swing.JTextField junSL;
    private javax.swing.JTextField marCL;
    private javax.swing.JTextField marEL;
    private javax.swing.JTextField marOther;
    private javax.swing.JTextField marPL;
    private javax.swing.JTextField marSL;
    private javax.swing.JTextField mayCL;
    private javax.swing.JTextField mayEL;
    private javax.swing.JTextField mayOther;
    private javax.swing.JTextField mayPL;
    private javax.swing.JTextField maySL;
    private javax.swing.JTextField novCL;
    private javax.swing.JTextField novEL;
    private javax.swing.JTextField novOther;
    private javax.swing.JTextField novPL;
    private javax.swing.JTextField novSL;
    private javax.swing.JTextField octCL;
    private javax.swing.JTextField octEL;
    private javax.swing.JTextField octOther;
    private javax.swing.JTextField octPL;
    private javax.swing.JTextField octSL;
    private javax.swing.JTextField sepCL;
    private javax.swing.JTextField sepEL;
    private javax.swing.JTextField sepOther;
    private javax.swing.JTextField sepPL;
    private javax.swing.JTextField sepSL;
    // End of variables declaration//GEN-END:variables
}
