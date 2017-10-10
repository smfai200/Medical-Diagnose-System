package medicaldiagnose;

public class HOME extends javax.swing.JFrame {

    public HOME() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        medicaldiagnose = new javax.swing.JButton();
        editpatient = new javax.swing.JButton();
        showpatient = new javax.swing.JButton();
        addpatient = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ayesha Zaka\\Downloads\\heart-checkup_318-49387.png")); // NOI18N
        jLabel1.setText("WELCOME TO MEDICAL DIAGNOSES SYSTEM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 736, 124));

        medicaldiagnose.setBackground(java.awt.SystemColor.activeCaption);
        medicaldiagnose.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        medicaldiagnose.setForeground(new java.awt.Color(255, 255, 255));
        medicaldiagnose.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ayesha Zaka\\Downloads\\1st Semester\\New folder (2)\\male-doctors-collection-005-186x400.png")); // NOI18N
        medicaldiagnose.setText("MEDICAL DIAGNOSES LOGS");
        medicaldiagnose.setActionCommand("SHOW PATIENT DETAILS");
        medicaldiagnose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicaldiagnoseActionPerformed(evt);
            }
        });
        getContentPane().add(medicaldiagnose, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 460, 179));

        editpatient.setBackground(java.awt.SystemColor.activeCaption);
        editpatient.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        editpatient.setForeground(new java.awt.Color(255, 255, 255));
        editpatient.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ayesha Zaka\\Downloads\\1st Semester\\New folder (2)\\editing-clip-art-edit-clipart-299_267.png")); // NOI18N
        editpatient.setText("EDIT/DELETE PATIENT DETAILS");
        editpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editpatientActionPerformed(evt);
            }
        });
        getContentPane().add(editpatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 540, 179));

        showpatient.setBackground(java.awt.SystemColor.activeCaption);
        showpatient.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        showpatient.setForeground(new java.awt.Color(255, 255, 255));
        showpatient.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ayesha Zaka\\Downloads\\1st Semester\\New folder (2)\\check-list-clip-art-vector-clip-art-online-royalty-free-long-list-to-do-clip-to-do-list-clip-art-486_596.png")); // NOI18N
        showpatient.setText("SHOW PATIENT DETAILS");
        showpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpatientActionPerformed(evt);
            }
        });
        getContentPane().add(showpatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 460, 181));

        addpatient.setBackground(java.awt.SystemColor.activeCaption);
        addpatient.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        addpatient.setForeground(new java.awt.Color(255, 255, 255));
        addpatient.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ayesha Zaka\\Downloads\\1st Semester\\New folder (2)\\k11031893.png")); // NOI18N
        addpatient.setText("ADD PATIENT DETAILS");
        addpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addpatientActionPerformed(evt);
            }
        });
        getContentPane().add(addpatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 540, 179));

        jLabel2.setBackground(new java.awt.Color(208, 208, 247));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ayesha Zaka\\Downloads\\1st Semester\\New folder (2)\\Darshboard-Login.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addpatientActionPerformed
            PatientDetails obj = new PatientDetails();
            obj.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_addpatientActionPerformed

    private void showpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpatientActionPerformed
            PatientList obj = new PatientList();
            obj.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_showpatientActionPerformed

    private void medicaldiagnoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicaldiagnoseActionPerformed
        HistoryLogs obj = new HistoryLogs();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_medicaldiagnoseActionPerformed

    private void editpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editpatientActionPerformed
          this.setVisible(false);
          Login obj = new Login();
          obj.setVisible(true);
          
    }//GEN-LAST:event_editpatientActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addpatient;
    private javax.swing.JButton editpatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton medicaldiagnose;
    private javax.swing.JButton showpatient;
    // End of variables declaration//GEN-END:variables
}
