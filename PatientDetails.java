package medicaldiagnose;
import java.sql.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class PatientDetails extends JFrame {

    private JButton addbutton2;
    private TextField age;
    private ButtonGroup buttonGroup1;
    private ButtonGroup buttonGroup2;
    private JButton cancelbutton;
    private TextField email;
    private TextField firstname;
    private JComboBox<String> gender;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private TextField lastname;
    private JRadioButton noradio;
    private TextField phone;
    private Label successful;
    private JRadioButton yesradio;
    
    public PatientDetails() {
        initComponents();
        
    }

    private void initComponents() {

        buttonGroup1 = new ButtonGroup();
        buttonGroup2 = new ButtonGroup();
        jLabel1 = new JLabel();
        lastname = new TextField();
        age = new TextField();
        firstname = new TextField();
        email = new TextField();
        phone = new TextField();
        yesradio = new JRadioButton();
        noradio = new JRadioButton();
        addbutton2 = new JButton();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        gender = new JComboBox<>();
        successful = new Label();
        jLabel9 = new JLabel();
        cancelbutton = new JButton();
        jLabel10 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(SystemColor.activeCaption);
       // getContentPane().setLayout(null);

        jLabel1.setFont(new Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setIcon(new ImageIcon("C:\\Users\\Ayesha Zaka\\Downloads\\heart-checkup_318-49387.png")); // NOI18N
        jLabel1.setText("PATIENT ENTRY");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(390, 10, 420, 110);

        lastname.setFont(new Font("Calibri", 0, 24)); // NOI18N
        getContentPane().add(lastname);
        lastname.setBounds(760, 140, 250, 40);

        age.setFont(new Font("Calibri", 0, 24)); // NOI18N
        age.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        getContentPane().add(age);
        age.setBounds(190, 240, 260, 40);

        firstname.setFont(new Font("Calibri", 0, 24)); // NOI18N
        firstname.setText(null);
        getContentPane().add(firstname);
        firstname.setBounds(190, 150, 260, 40);

        email.setFont(new Font("Calibri", 0, 24)); // NOI18N
        getContentPane().add(email);
        email.setBounds(190, 330, 260, 40);

        phone.setFont(new Font("Calibri", 0, 24)); // NOI18N
        getContentPane().add(phone);
        phone.setBounds(760, 330, 250, 40);

        yesradio.setText("YES");
        getContentPane().add(yesradio);
        yesradio.setBounds(270, 410, 80, 23);

        noradio.setText("NO");
        getContentPane().add(noradio);
        noradio.setBounds(370, 410, 100, 23);

        addbutton2.setFont(new Font("Calibri", 1, 28)); // NOI18N
        addbutton2.setText("ADD");
        addbutton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addbutton2ActionPerformed(evt);
            }
        });
        getContentPane().add(addbutton2);
        addbutton2.setBounds(380, 460, 200, 80);

        jLabel2.setFont(new Font("Droid Sans", 1, 24)); // NOI18N
        jLabel2.setText("FREQUENT PATIENT:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 400, 270, 50);

        jLabel3.setFont(new Font("Droid Sans", 1, 24)); // NOI18N
        jLabel3.setText("FIRST NAME:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 140, 150, 50);

        jLabel4.setFont(new Font("Droid Sans", 1, 24)); // NOI18N
        jLabel4.setText("LAST NAME:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(590, 130, 160, 50);

        jLabel5.setFont(new Font("Droid Sans", 1, 24)); // NOI18N
        jLabel5.setText("AGE:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 230, 80, 50);

        jLabel6.setFont(new Font("Droid Sans", 1, 24)); // NOI18N
        jLabel6.setText("GENDER:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(620, 230, 120, 50);

        jLabel7.setFont(new Font("Droid Sans", 1, 24)); // NOI18N
        jLabel7.setText("EMAIL:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(80, 320, 100, 50);

        jLabel8.setFont(new Font("Droid Sans", 1, 24)); // NOI18N
        jLabel8.setText("PHONE NUMBER:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(550, 320, 200, 50);

        gender.setFont(new Font("Calibri", 0, 24)); // NOI18N
        gender.setModel(new DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE"}));
        getContentPane().add(gender);
        gender.setBounds(760, 230, 250, 50);

        successful.setAlignment(Label.CENTER);
        successful.setBackground(new Color(204, 204, 204));
        successful.setFont(new Font("Arial Black", 1, 36)); // NOI18N
        successful.setForeground(new Color(255, 0, 0));
        successful.setName(""); // NOI18N
        getContentPane().add(successful);
        successful.setBounds(150, 560, 841, 99);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(900, 440, 160, 70);

        cancelbutton.setFont(new Font("Calibri", 1, 28)); // NOI18N
        cancelbutton.setText("CANCEL");
        cancelbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cancelbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelbutton);
        cancelbutton.setBounds(620, 460, 200, 80);

        jLabel10.setIcon(new ImageIcon("C:\\Users\\Ayesha Zaka\\Downloads\\1st Semester\\New folder (2)\\Darshboard-Login.png")); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, -10, 1100, 680);

        pack();
    }                      

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void addbutton2ActionPerformed(ActionEvent evt) {
        String first_name = firstname.getText().toUpperCase();
        String last_name = lastname.getText().toUpperCase();
        String a_ge = age.getText().toUpperCase();
        String emai_l = email.getText().toUpperCase();
        String phoneno = phone.getText().toUpperCase();
        String gen = (String)gender.getSelectedItem();
        String frequent;
        boolean freq;
        if(yesradio.isSelected()){
            frequent = "YES";
            freq = true;
        }else{
            frequent = "NO";
            freq = false;
        }
        
        if (first_name.equals("")){
            successful.setText("PLEASE ENTER FIRST NAME!");
        }else if (last_name.equals("")){
            successful.setText("PLEASE ENTER LAST NAME!");
        }else if (a_ge.equals("")){
            successful.setText("PLEASE ENTER AGE!");
        }else if (emai_l.equals("")){
            successful.setText("PLEASE ENTER EMAIL!");
        }else if (phoneno.equals("")){
            successful.setText("PLEASE ENTER PHONE NUMBER!");
        }else if (gen.equals("")){
            successful.setText("PLEASE SELECT YOUR GENDER");
        }else{
        this.connectiondb(first_name, last_name, a_ge, emai_l, phoneno, gen, frequent);
        GUI1 obj = new GUI1();
        obj.setVisible(true);
        this.setVisible(false);
        }
    }                                          

    private void cancelbuttonActionPerformed(ActionEvent evt) {
        Login obj1 = new Login();
        this.setVisible(false);
        UserDashboard obj = new UserDashboard();
        obj.setVisible(true);
        
    }                                            
    
    public void connectiondb(String fn, String ln, String age,String email,String phn,String gender,String frequent){
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection connect = DriverManager.getConnection("jdbc:derby://localhost:1527/medicalDiagnose", "root", "root");
            Statement stm = connect.createStatement();
            String sql = "INSERT INTO PATIENTDETAILS (FIRSTNAME,LASTNAME,GENDER,EMAIL,PHONE,FREQUENT,AGE) "+ "VALUES (?,?,?,?,?,?,?)";
            PreparedStatement pstmt = connect.prepareStatement(sql);
            pstmt.setString(1, fn);
            pstmt.setString(2, ln);
            pstmt.setString(3, gender);
            pstmt.setString(4, email);
            pstmt.setString(5, phn);
            pstmt.setString(6, frequent);
            pstmt.setString(7, age);
            pstmt.executeUpdate(); 
            successful.setText("DATA HAS BEEN SUCCESSFULLY ADDED!");
            successful.setVisible(true);
        }catch(ClassNotFoundException a){
            a.printStackTrace();
        } catch (SQLException b) {
            b.printStackTrace();
        }
    }

                  
}
