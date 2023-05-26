package sas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Ravi9
 */
public class FeeModule extends javax.swing.JFrame {

    /**
     * Creates new form FeeModule
     */
    public FeeModule() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sports = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        lib = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fin = new javax.swing.JTextField();
        cricket = new javax.swing.JRadioButton();
        football = new javax.swing.JRadioButton();
        others = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        tf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        mont = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        paid = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        rm = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        clas = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        snc = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        name = new javax.swing.JTextField();
        roll = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 51));

        jButton2.setText("CALCULATE FEES");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Calculate Fees for The Student");

        jLabel10.setText("For the Month");

        combo.setMaximumRowCount(12);
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        jLabel2.setText("Library Fees");

        jLabel5.setText("Sports");

        jLabel6.setText("Fine");

        sports.add(cricket);
        cricket.setText("Cricket");

        sports.add(football);
        football.setText("Football");

        sports.add(others);
        others.setText("Others");

        jLabel11.setText("Total Fees");

        jLabel12.setText("Monthly Fees");

        jLabel17.setBackground(new java.awt.Color(255, 51, 102));
        jLabel17.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("<html>&#8592;</html>");
        jLabel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel17.setOpaque(true);
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(94, 94, 94)
                                .addComponent(fin, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lib, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mont, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(66, 66, 66)
                                .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(cricket)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(football)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(others)))
                        .addContainerGap(399, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(234, 234, 234)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                        .addGap(163, 163, 163))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(mont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(lib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cricket)
                    .addComponent(football)
                    .addComponent(others))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 720, 440));

        jPanel2.setBackground(new java.awt.Color(51, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setText("Enter the Fee Amount You Want To Pay");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 69, -1, 29));

        jButton3.setText("PAY FEES");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 156, -1, -1));
        jPanel2.add(paid, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 116, 136, -1));

        jLabel14.setText("Remaining Fees");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 202, -1, -1));
        jPanel2.add(rm, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 199, 142, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 440, 720, 530));

        jLabel8.setText("Roll No");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("FEE COUNTER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 138, 37));

        jLabel3.setText("Enter Student ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 120, -1));

        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        jLabel7.setText("Class");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));
        getContentPane().add(clas, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 158, -1));

        jLabel16.setText("Search by Name or Class");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));
        getContentPane().add(snc, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 170, -1));

        jButton4.setText("SEARCH");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, -1, -1));

        jButton5.setText("RESET");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 102, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 0));

        jTable1.setBackground(new java.awt.Color(255, 255, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Class", "Total Fees", "Remaining Fees"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roll, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(242, 242, 242))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(roll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 335, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 820, 980));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            Connection conn = DBConnection.getInstance().getConnection();
            String studentID = id.getText();
            String sql = "SELECT * FROM reg_students WHERE sid = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
                    statement.setString(1, studentID);
                    ResultSet rs = statement.executeQuery();
                    
                    if (rs.next()) {
                        // If the student ID exists, set the text fields to display the data
                        String na = rs.getString("name");
                        
                        String ro = rs.getString("roll");
                        String cl = rs.getString("class");
                        
                        name.setText(na);
                        roll.setText(ro);
                       
                        clas.setText(cl);
                        
                    } else {
                        // If the student ID doesn't exist, display a message
                        JOptionPane.showMessageDialog(FeeModule.this, "No student with ID " + studentID + " in the database.");
                    }
        }catch (SQLException ex) {
                    ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         double libraryFees = Double.parseDouble(lib.getText());
        double fineFees = Double.parseDouble(fin.getText());
        double monthFees = Double.parseDouble(mont.getText());
        String m = (String) combo.getSelectedItem();
        double sportsFees = 0;
        if (cricket.isSelected()) {
            sportsFees = 100;
        } else if (football.isSelected()) {
            sportsFees = 150;
        } else if (others.isSelected()) {
            sportsFees = 200;
        }
       
        double totalFees = libraryFees + fineFees + sportsFees + monthFees;
        tf.setText(String.format("%.2f", totalFees));
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
            double libraryFees = Double.parseDouble(lib.getText());
            double fineFees = Double.parseDouble(fin.getText());
            double monthFees = Double.parseDouble(mont.getText());
            String m = (String) combo.getSelectedItem();
            double sportsFees = 0;
        if (cricket.isSelected()) {
            sportsFees = 100;
        } else if (football.isSelected()) {
            sportsFees = 150;
        } else if (others.isSelected()) {
            sportsFees = 200;
        }
        double totalFees = Double.parseDouble(tf.getText());
        
        double paidFee = Double.parseDouble(paid.getText());
        double remFee = totalFees-paidFee ;
        rm.setText(Double.toString(remFee));
         String idStr = id.getText();
    String nameStr = name.getText();
    String monthStr = (String) combo.getSelectedItem();
    String monthfeeStr = mont.getText();
    String fineStr = (String) fin.getText();
    String libStr = lib.getText();
    String totalStr = tf.getText();
    String remStr = rm.getText();
    
        try{
        Connection conn = DBConnection.getInstance().getConnection();
        
        
    // Check if ID already exists in the table
    String selectQuery = "SELECT * FROM feesubmit WHERE id = ?";
    PreparedStatement selectStmt = conn.prepareStatement(selectQuery);
    selectStmt.setString(1, idStr);
    ResultSet selectResult = selectStmt.executeQuery();
        
       
     if (selectResult.next()) {
        // If ID exists, update the existing row
        String updateQuery = "UPDATE feesubmit SET name=?, monthname=?, monthfee=?, fine=?, library=?, total=?, remaining=? WHERE id=?";
        PreparedStatement updateStmt = conn.prepareStatement(updateQuery);
        updateStmt.setString(1, nameStr);
        updateStmt.setString(2, monthStr);
        updateStmt.setString(3, monthfeeStr);
        updateStmt.setString(4, fineStr);
        updateStmt.setString(5, libStr);
        updateStmt.setString(6, totalStr);
        updateStmt.setString(7, remStr);
        updateStmt.setString(8, idStr);

        int rowsUpdated = updateStmt.executeUpdate();
    
    
     if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "Data updated successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Data could not be updated");
        }
     } else {
        // If ID does not exist, insert a new row
        String insertQuery = "INSERT INTO feesubmit (id, name, monthname, monthfee, fine, library, total, remaining) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement insertStmt = conn.prepareStatement(insertQuery);
        insertStmt.setString(1, idStr);
        insertStmt.setString(2, nameStr);
        insertStmt.setString(3, monthStr);
        insertStmt.setString(4, monthfeeStr);
        insertStmt.setString(5, fineStr);
        insertStmt.setString(6, libStr);
        insertStmt.setString(7, totalStr);
        insertStmt.setString(8, remStr);

        int rowsInserted = insertStmt.executeUpdate();

        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(null, "Data stored successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Data could not be stored");
        }
    }

} catch (SQLException ex) {
    ex.printStackTrace();
}
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
      String searchText = snc.getText();
String query = "SELECT reg_students.sid, reg_students.name, reg_students.class, feesubmit.total, feesubmit.remaining " +
               "FROM reg_students INNER JOIN feesubmit " +
               "ON reg_students.sid = feesubmit.id " +
               "WHERE reg_students.name LIKE '%" + searchText + "%' OR reg_students.class LIKE '%" + searchText + "%'";

try {
    Connection conn = DBConnection.getInstance().getConnection();
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery(query);

    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    // Clear existing rows from the table
    while (model.getRowCount() > 0) {
        model.removeRow(0);
    }

    while(rs.next()) {
        int id = rs.getInt("sid");
        String name = rs.getString("name");
        String studentClass = rs.getString("class");
        int totalFees = rs.getInt("total");
        int remainingFees = rs.getInt("remaining");

        Object[] rowData = {id, name, studentClass, totalFees, remainingFees};
        model.addRow(rowData);
    }
} catch(SQLException e) {
    e.printStackTrace();
}


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        clas.setText("");
        fin.setText("");
        combo.setSelectedIndex(-1);
        cricket.setSelected(false);
        football.setSelected(false);
        others.setSelected(false);
        id.setText("");
        lib.setText("");
        mont.setText("");
        name.setText("");
        paid.setText("");
        rm.setText("");
        roll.setText("");
        tf.setText("");
        snc.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        new Welcome().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel17MouseClicked

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
            java.util.logging.Logger.getLogger(FeeModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeeModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeeModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeeModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeeModule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField clas;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JRadioButton cricket;
    private javax.swing.JTextField fin;
    private javax.swing.JRadioButton football;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lib;
    private javax.swing.JTextField mont;
    private javax.swing.JTextField name;
    private javax.swing.JRadioButton others;
    private javax.swing.JTextField paid;
    private javax.swing.JTextField rm;
    private javax.swing.JTextField roll;
    private javax.swing.JTextField snc;
    private javax.swing.ButtonGroup sports;
    private javax.swing.JTextField tf;
    // End of variables declaration//GEN-END:variables
}