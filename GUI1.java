package medicaldiagnose;

import java.awt.Color;
import java.util.ArrayList;
import java.sql.*;
public class GUI1 extends javax.swing.JFrame {

    public GUI1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        symptom1 = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        symptom2 = new java.awt.TextField();
        symptom3 = new java.awt.TextField();
        symptom4 = new java.awt.TextField();
        symptom5 = new java.awt.TextField();
        resultshow = new java.awt.TextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MEDICAL DIAGNOSE SYSTEM");
        setBackground(new java.awt.Color(153, 153, 0));
        setSize(new java.awt.Dimension(1000, 1000));
        getContentPane().setLayout(null);

        symptom1.setBackground(new java.awt.Color(220, 251, 251));
        symptom1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        symptom1.setText("ENTER SYMPTOM");
        symptom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                symptom1ActionPerformed(evt);
            }
        });
        getContentPane().add(symptom1);
        symptom1.setBounds(60, 230, 270, 39);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ayesha Zaka\\Downloads\\heart-checkup_318-49387.png")); // NOI18N
        jLabel1.setText("MEDICAL DIAGNOSE SYSTEM");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 0, 760, 100);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ayesha Zaka\\Downloads\\1st Semester\\New folder (2)\\sick-clipart-aceBoqEc14.png")); // NOI18N
        jLabel2.setText("ENTER SYMPTOMS:");
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 90, 370, 80);

        symptom2.setBackground(new java.awt.Color(220, 251, 251));
        symptom2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        symptom2.setText("ENTER SYMPTOM");
        symptom2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                symptom2ActionPerformed(evt);
            }
        });
        getContentPane().add(symptom2);
        symptom2.setBounds(60, 300, 270, 39);

        symptom3.setBackground(new java.awt.Color(220, 251, 251));
        symptom3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        symptom3.setText("ENTER SYMPTOM");
        symptom3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                symptom3ActionPerformed(evt);
            }
        });
        getContentPane().add(symptom3);
        symptom3.setBounds(60, 370, 270, 39);

        symptom4.setBackground(new java.awt.Color(220, 251, 251));
        symptom4.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        symptom4.setText("ENTER SYMPTOM");
        symptom4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                symptom4ActionPerformed(evt);
            }
        });
        getContentPane().add(symptom4);
        symptom4.setBounds(60, 440, 270, 39);

        symptom5.setBackground(new java.awt.Color(220, 251, 251));
        symptom5.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        symptom5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                symptom5ActionPerformed(evt);
            }
        });
        getContentPane().add(symptom5);
        symptom5.setBounds(60, 170, 270, 39);
        symptom5.getAccessibleContext().setAccessibleName("ENTER SYMPTOM");

        Disease diseaselist = new Disease();
        ArrayList diseaselis = diseaselist.accesslist();
        for (int i=0; i<diseaselis.size();i++){
            resultshow.append(diseaselis.get(i)+"\n");
        }
        resultshow.setBackground(new java.awt.Color(235, 235, 235));
        resultshow.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        getContentPane().add(resultshow);
        resultshow.setBounds(460, 130, 660, 470);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 0, 0, 0);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ayesha Zaka\\Downloads\\1st Semester\\New folder (2)\\sliderBG11.jpg")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1240, 640);

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jButton1.setText("CANCEL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(210, 520, 148, 60);

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jButton2.setText("SEARCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(64, 522, 130, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void symptom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_symptom1ActionPerformed
        
    }//GEN-LAST:event_symptom1ActionPerformed

    private void symptom2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_symptom2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_symptom2ActionPerformed

    private void symptom3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_symptom3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_symptom3ActionPerformed

    private void symptom4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_symptom4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_symptom4ActionPerformed

    private void symptom5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_symptom5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_symptom5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.setVisible(false);
        UserDashboard obj = new UserDashboard();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String[] sympt = new String[5];
        sympt[0] = symptom5.getText().toLowerCase();
        sympt[1] = symptom1.getText().toLowerCase();
        sympt[2] = symptom2.getText().toLowerCase();
        sympt[3] = symptom3.getText().toLowerCase();
        sympt[4] = symptom4.getText().toLowerCase();

        GeneralDiseases checkobj = new GeneralDiseases();
        for (int i=0; i<5;i++){
            checkobj.search(sympt[i].toLowerCase());
        }
        for (int i=0; i<checkobj.searchfood.size();i++){
            resultshow.setText(null);
            this.resultshow.append(checkobj.searchfood.get(i) + "\n");
        }
        if (checkobj.searchfood.size()>1){
            this.connectiondb(sympt[0], sympt[1], sympt[2], sympt[3], sympt[4], checkobj.searchfood.get(0),checkobj.searchfood.get(1));
        }else{
            this.connectiondb(sympt[0], sympt[1], sympt[2], sympt[3], sympt[4], checkobj.searchfood.get(0),"NULL");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public void connectiondb(String symp1, String symp2, String symp3,String symp4,String symp5,String disease1,String disease2){
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection connect = DriverManager.getConnection("jdbc:derby://localhost:1527/medicalDiagnose", "root", "root");
            Statement stm = connect.createStatement();
            String sql = "INSERT INTO HISTORYLOG (SYMPTOM1,SYMPTOM2,SYMPTOM3,SYMPTOM4,SYMPTOM5,DISEASE1,DISEASE2) "+ "VALUES (?,?,?,?,?,?,?)";
            PreparedStatement pstmt = connect.prepareStatement(sql);
            pstmt.setString(1, symp1);
            pstmt.setString(2, symp2);
            pstmt.setString(3, symp3);
            pstmt.setString(4, symp4);
            pstmt.setString(5, symp5);
            pstmt.setString(6, disease1);
            pstmt.setString(7, disease2);
            pstmt.executeUpdate(); 
        }catch(ClassNotFoundException a){
            a.printStackTrace();
        } catch (SQLException b) {
            b.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private java.awt.TextArea resultshow;
    private java.awt.TextField symptom1;
    private java.awt.TextField symptom2;
    private java.awt.TextField symptom3;
    private java.awt.TextField symptom4;
    private java.awt.TextField symptom5;
    // End of variables declaration//GEN-END:variables
}
