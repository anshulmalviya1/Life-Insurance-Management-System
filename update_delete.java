/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Siddhesh
 */

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class update_delete extends javax.swing.JFrame {

    /**
     * Creates new form update_delete
     */
    Connection con;
PreparedStatement pst1,pst2,pst3,pst4;
DefaultTableModel dtm;
ResultSet rs;
    public update_delete() {
      
        try {
initComponents();
setVisible(true);
Class.forName("org.apache.derby.jdbc.ClientDriver");
con=DriverManager.getConnection("jdbc:derby://localhost:1527/Life_Insurance","A","A");
JOptionPane.showMessageDialog(null,"DataBase Connected");
} catch (ClassNotFoundException ex) {
Logger.getLogger(update_delete.class.getName()).log(Level.SEVERE, null, ex);
} catch (SQLException ex) {
Logger.getLogger(update_delete.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        POLICY_SCHEME = new javax.swing.JTextField();
        FULL_NAME = new javax.swing.JTextField();
        GENDER = new javax.swing.JTextField();
        MARRIED_STATUS = new javax.swing.JTextField();
        DOB = new javax.swing.JTextField();
        EMAIL = new javax.swing.JTextField();
        PHONE_NO = new javax.swing.JTextField();
        PAN_NO = new javax.swing.JTextField();
        CITY = new javax.swing.JTextField();
        ID = new javax.swing.JTextField();
        PINCODE = new javax.swing.JTextField();
        STATE = new javax.swing.JTextField();
        COUNTRY = new javax.swing.JTextField();
        showrecord = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        home = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        table.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        table.setForeground(new java.awt.Color(0, 83, 166));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "POLICY_SCHEME", "FULL_NAME", "GENDER", "MARRIED_STATUS", "DOB", "EMAIL", "PHONE_NO", "PAN_NO", "CITY", "PINCODE", "STATE", "COUNTRY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.setToolTipText("");
        table.setGridColor(new java.awt.Color(0, 0, 0));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(0, 0, 1650, 190);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(410, 270, 30, 50);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Policy Scheme");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(410, 320, 170, 50);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Full Name");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(410, 370, 110, 50);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gender");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(410, 420, 110, 50);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Married Status");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(410, 470, 190, 50);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DOB");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(410, 520, 110, 50);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(410, 570, 110, 50);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Phone No");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(920, 270, 110, 50);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("PAN No");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(920, 320, 110, 50);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("City");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(920, 370, 110, 50);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Pincode");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(920, 420, 110, 50);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("State");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(920, 470, 110, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Country");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(920, 520, 110, 50);

        POLICY_SCHEME.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        POLICY_SCHEME.setForeground(new java.awt.Color(0, 83, 166));
        jPanel1.add(POLICY_SCHEME);
        POLICY_SCHEME.setBounds(610, 330, 170, 30);

        FULL_NAME.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        FULL_NAME.setForeground(new java.awt.Color(0, 83, 166));
        jPanel1.add(FULL_NAME);
        FULL_NAME.setBounds(610, 380, 170, 30);

        GENDER.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        GENDER.setForeground(new java.awt.Color(0, 83, 166));
        GENDER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GENDERActionPerformed(evt);
            }
        });
        jPanel1.add(GENDER);
        GENDER.setBounds(610, 430, 170, 30);

        MARRIED_STATUS.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        MARRIED_STATUS.setForeground(new java.awt.Color(0, 83, 166));
        jPanel1.add(MARRIED_STATUS);
        MARRIED_STATUS.setBounds(610, 480, 170, 30);

        DOB.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        DOB.setForeground(new java.awt.Color(0, 83, 166));
        DOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOBActionPerformed(evt);
            }
        });
        jPanel1.add(DOB);
        DOB.setBounds(610, 530, 170, 30);

        EMAIL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        EMAIL.setForeground(new java.awt.Color(0, 83, 166));
        jPanel1.add(EMAIL);
        EMAIL.setBounds(610, 580, 170, 30);

        PHONE_NO.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PHONE_NO.setForeground(new java.awt.Color(0, 83, 166));
        jPanel1.add(PHONE_NO);
        PHONE_NO.setBounds(1080, 280, 170, 30);

        PAN_NO.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PAN_NO.setForeground(new java.awt.Color(0, 83, 166));
        jPanel1.add(PAN_NO);
        PAN_NO.setBounds(1080, 330, 170, 30);

        CITY.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CITY.setForeground(new java.awt.Color(0, 83, 166));
        jPanel1.add(CITY);
        CITY.setBounds(1080, 380, 170, 30);

        ID.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ID.setForeground(new java.awt.Color(0, 83, 166));
        jPanel1.add(ID);
        ID.setBounds(610, 280, 170, 30);

        PINCODE.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PINCODE.setForeground(new java.awt.Color(0, 83, 166));
        jPanel1.add(PINCODE);
        PINCODE.setBounds(1080, 430, 170, 30);

        STATE.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        STATE.setForeground(new java.awt.Color(0, 83, 166));
        STATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STATEActionPerformed(evt);
            }
        });
        jPanel1.add(STATE);
        STATE.setBounds(1080, 480, 170, 30);

        COUNTRY.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        COUNTRY.setForeground(new java.awt.Color(0, 83, 166));
        jPanel1.add(COUNTRY);
        COUNTRY.setBounds(1080, 530, 170, 30);

        showrecord.setBackground(new java.awt.Color(0, 84, 166));
        showrecord.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        showrecord.setForeground(new java.awt.Color(255, 255, 255));
        showrecord.setText("Show Record");
        showrecord.setBorder(null);
        showrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showrecordActionPerformed(evt);
            }
        });
        jPanel1.add(showrecord);
        showrecord.setBounds(340, 740, 150, 50);

        delete.setBackground(new java.awt.Color(0, 84, 166));
        delete.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(970, 740, 150, 50);

        update.setBackground(new java.awt.Color(0, 84, 166));
        update.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(550, 740, 150, 50);

        home.setBackground(new java.awt.Color(0, 84, 166));
        home.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jPanel1.add(home);
        home.setBounds(1170, 740, 150, 50);

        clear.setBackground(new java.awt.Color(0, 84, 166));
        clear.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("Clear");
        clear.setBorder(null);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear);
        clear.setBounds(760, 740, 150, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Ad.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-250, -20, 1970, 930);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1653, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 901, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        int i=table.getSelectedRow();
       
  try {
        dtm=(DefaultTableModel)table.getModel();            
        pst1=con.prepareStatement("UPDATE DATA SET POLICY_SCHEME=?,FULL_NAME=?,GENDER=?,MARRIED_STATUS=?,DOB=?,EMAIL=?,PHONE_NO=?,PAN_NO=?,CITY=?,PINCODE=?,STATE=?,COUNTRY=? WHERE ID=?");
        pst1.setString(1,ID.getText());
        pst1.setString(2,POLICY_SCHEME.getText());
        pst1.setString(3,FULL_NAME.getText());
        pst1.setString(4,GENDER.getText());
        pst1.setString(5,MARRIED_STATUS.getText());
        pst1.setString(6,DOB.getText());
        pst1.setString(7,EMAIL.getText());
        pst1.setString(8,PHONE_NO.getText());
        pst1.setString(9,PAN_NO.getText());
        pst1.setString(10,CITY.getText());
        pst1.setString(11,PINCODE.getText());
        pst1.setString(12,STATE.getText());
        pst1.setString(13,COUNTRY.getText());
        int r1=pst1.executeUpdate();
            if(r1>=1)
{
            JOptionPane.showMessageDialog(this, "Updated Successfully");
        }
  }
  catch (Exception e){
      JOptionPane.showMessageDialog(null,e.getMessage());
      e.printStackTrace();
  }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        int i=table.getSelectedRow();
              try  {
                int r;
                dtm=(DefaultTableModel)table.getModel();
                r = Integer.parseInt(dtm.getValueAt(i,0).toString());
                pst3=con.prepareStatement("DELETE FROM DATA WHERE ID='"+r+"'");
                ID.setText(dtm.getValueAt(i,0).toString());
                POLICY_SCHEME.setText(dtm.getValueAt(i,1).toString().trim());
                FULL_NAME.setText(dtm.getValueAt(i,2).toString());
                GENDER.setText(dtm.getValueAt(i,3).toString());
                MARRIED_STATUS.setText(dtm.getValueAt(i,4).toString());
                DOB.setText(dtm.getValueAt(i,5).toString());
                EMAIL.setText(dtm.getValueAt(i,6).toString());
                PHONE_NO.setText(dtm.getValueAt(i,7).toString());
                PAN_NO.setText(dtm.getValueAt(i,8).toString());
                CITY.setText(dtm.getValueAt(i,9).toString());
                PINCODE.setText(dtm.getValueAt(i,10).toString());
                STATE.setText(dtm.getValueAt(i,11).toString());
                COUNTRY.setText(dtm.getValueAt(i,12).toString());
                int re=pst3.executeUpdate();
               if(re>=1){
                    JOptionPane.showConfirmDialog (null,"Do You really want to DELETE?","Confirmation",JOptionPane.YES_NO_OPTION);
                    JOptionPane.showMessageDialog(null,"Item Deleted");
                    dtm.removeRow(i);
                    ID.setText("");
                    POLICY_SCHEME.setText("");
                    FULL_NAME.setText("");
                    GENDER.setText("");    
                    MARRIED_STATUS.setText("");
                    DOB.setText("");
                    EMAIL.setText("");
                    PHONE_NO.setText("");
                    PAN_NO.setText("");
                    CITY.setText("");
                    PINCODE.setText("");
                    STATE.setText("");
                    COUNTRY.setText("");
                }  
        }
        catch(Exception e)
        {       JOptionPane.showMessageDialog(null,e.getMessage());
        }                                     

      


    }//GEN-LAST:event_deleteActionPerformed

    private void showrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showrecordActionPerformed
        // TODO add your handling code here:
        try
{
pst2=con.prepareStatement("SELECT * FROM DATA",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
rs=pst2.executeQuery();
ResultSetMetaData rsmd=rs.getMetaData();
int cols=rsmd.getColumnCount();
String colname[]=new String[cols];
for(int i=1;i<=cols;i++)
{
colname[i-1]=rsmd.getColumnName(i);
}
int rows=0;
while(rs.next())
{
rows++;
}
String data[][]=new String[rows][cols];
rs.beforeFirst();
rows=0;
while(rs.next())
{
for(int i=1;i<=cols;i++)
{
data[rows][i-1]=rs.getString(i);
}
rows++;
DefaultTableModel dtm = new DefaultTableModel(data,colname);
table.setModel(dtm);

}
}
catch (Exception e)
{
JOptionPane.showMessageDialog(null,e.getMessage());
}
    }//GEN-LAST:event_showrecordActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        ID.setText(" ");
        POLICY_SCHEME.setText(" ");
        FULL_NAME.setText(" ");
        GENDER.setText(" ");
        MARRIED_STATUS.setText(" ");
        DOB.setText(" ");
        EMAIL.setText(" ");
        PHONE_NO.setText(" ");
        PAN_NO.setText(" ");
        CITY.setText(" ");
        PINCODE.setText(" ");
        STATE.setText(" ");
        COUNTRY.setText(" ");
    }//GEN-LAST:event_clearActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:       
        setVisible(false);
        new HomeScreen().setVisible(true);    
                

    }//GEN-LAST:event_homeActionPerformed

    private void DOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DOBActionPerformed

    private void GENDERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GENDERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GENDERActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int i=table.getSelectedRow();
try
{
dtm=(DefaultTableModel)table.getModel();
pst4=con.prepareStatement("SELECT * FROM DATA WHERE ID=?");

pst4.setString(1,ID.getText());
ID.setText(dtm.getValueAt(i,0).toString());
POLICY_SCHEME.setText(dtm.getValueAt(i,1).toString().trim());
FULL_NAME.setText(dtm.getValueAt(i,2).toString());
GENDER.setText(dtm.getValueAt(i,3).toString());
MARRIED_STATUS.setText(dtm.getValueAt(i,4).toString());
DOB.setText(dtm.getValueAt(i,5).toString());
EMAIL.setText(dtm.getValueAt(i,6).toString());
PHONE_NO.setText(dtm.getValueAt(i,7).toString());
PAN_NO.setText(dtm.getValueAt(i,8).toString());
CITY.setText(dtm.getValueAt(i,9).toString());
PINCODE.setText(dtm.getValueAt(i,10).toString());
STATE.setText(dtm.getValueAt(i,11).toString());
COUNTRY.setText(dtm.getValueAt(i,12).toString());

}
catch (Exception e)
{
JOptionPane.showMessageDialog(null,e.getMessage());
}
    }//GEN-LAST:event_tableMouseClicked

    private void STATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STATEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_STATEActionPerformed

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
            java.util.logging.Logger.getLogger(update_delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(update_delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(update_delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(update_delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new update_delete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CITY;
    private javax.swing.JTextField COUNTRY;
    private javax.swing.JTextField DOB;
    private javax.swing.JTextField EMAIL;
    private javax.swing.JTextField FULL_NAME;
    private javax.swing.JTextField GENDER;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField MARRIED_STATUS;
    private javax.swing.JTextField PAN_NO;
    private javax.swing.JTextField PHONE_NO;
    private javax.swing.JTextField PINCODE;
    private javax.swing.JTextField POLICY_SCHEME;
    private javax.swing.JTextField STATE;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton showrecord;
    private javax.swing.JTable table;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}