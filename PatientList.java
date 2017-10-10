package medicaldiagnose;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PatientList extends JFrame {

    public PatientList() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        resultshowarea = new TextArea();
        jLabel1 = new JLabel();
        firstsearch = new TextField(null);
        label2 = new Label();
        label3 = new Label();
        genderlist = new TextField(null);
        label4 = new Label();
        lastsearch = new TextField(null);
        label5 = new Label();
        phonesearch = new TextField(null);
        label6 = new Label();
        emailsearch = new TextField(null);
        label7 = new Label();
        agelist = new TextField(null);
        jButton2 = new JButton();
        jButton1 = new JButton();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();

        setExtendedState(JFrame.MAXIMIZED_BOTH); //GETS THE FRAME TO FULL SIZE
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(204, 204, 255));
      //  getContentPane().setLayout(null);

        resultshowarea.setBackground(new Color(235, 235, 235));
        resultshowarea.setEditable(false);
        resultshowarea.setFont(new Font("Calibri", 0, 20)); // NOI18N
        getContentPane().add(resultshowarea);
        resultshowarea.setBounds(682, 21, 669, 695);
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection connect = DriverManager.getConnection("jdbc:derby://localhost:1527/medicalDiagnose", "root", "root");
            Statement smt = connect.createStatement();
            String sql = "SELECT * FROM PATIENTDETAILS";
            ResultSet rs = smt.executeQuery(sql);
            while(rs.next()){
                String fn1  = rs.getString("FIRSTNAME");
                String ln1  = rs.getString("LASTNAME");
                String gender1  = rs.getString("GENDER");
                String email1  = rs.getString("EMAIL");
                String phone1  = rs.getString("PHONE");
                String freq1  = rs.getString("FREQUENT");
                String age  = rs.getString("AGE");

                resultshowarea.append("FIRST NAME: " + fn1 + "\n" + "LAST NAME: " + ln1 + "\n" + "AGE: " + age +"\n" + "GENDER: "+gender1 + "\n"
                    + "EMAIL: "+email1 + "\n" + "PHONE: "+phone1 + "\n" + "FREQUENT PATIENT: "+freq1 + "\n ======================================\n");
            }
        }catch(ClassNotFoundException a){
            a.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        jLabel1.setFont(new Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setIcon(new ImageIcon("C:\\Users\\Ayesha Zaka\\Downloads\\1st Semester\\New folder (2)\\patient.png")); // NOI18N
        jLabel1.setText("PATIENT LIST/DETAILS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 21, 459, 120);

        firstsearch.setBackground(new Color(235, 235, 255));
        firstsearch.setFont(new Font("Calibri", 0, 24)); // NOI18N
        firstsearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                firstsearchActionPerformed(evt);
            }
        });
        getContentPane().add(firstsearch);
        firstsearch.setBounds(369, 181, 232, 40);

        label2.setFont(new Font("Arial", 0, 24)); // NOI18N
        label2.setText("SEARCH BY FIRST NAME:");
        getContentPane().add(label2);
        label2.setBounds(44, 188, 297, 33);

        label3.setBackground(new Color(235, 235, 235));
        label3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        label3.setFont(new Font("Arial", 0, 24)); // NOI18N
        label3.setText("SEARCH BY PHONE NUMBER:");
        getContentPane().add(label3);
        label3.setBounds(10, 346, 349, 33);

        genderlist.setBackground(new Color(235, 235, 255));
        genderlist.setFont(new Font("Calibri", 0, 24)); // NOI18N
        getContentPane().add(genderlist);
        genderlist.setBounds(369, 577, 232, 40);

        label4.setBackground(new Color(235, 235, 235));
        label4.setFont(new Font("Arial", 0, 24)); // NOI18N
        label4.setText("LIST BY GENDER:");
        getContentPane().add(label4);
        label4.setBounds(151, 577, 208, 33);

        lastsearch.setBackground(new Color(235, 235, 255));
        lastsearch.setFont(new Font("Calibri", 0, 24)); // NOI18N
        getContentPane().add(lastsearch);
        lastsearch.setBounds(369, 266, 232, 40);

        label5.setBackground(new Color(235, 235, 235));
        label5.setFont(new Font("Arial", 0, 24)); // NOI18N
        label5.setText("SEARCH BY LAST NAME:");
        getContentPane().add(label5);
        label5.setBounds(54, 266, 287, 33);

        phonesearch.setBackground(new Color(235, 235, 255));
        phonesearch.setFont(new Font("Calibri", 0, 24)); // NOI18N
        getContentPane().add(phonesearch);
        phonesearch.setBounds(369, 339, 232, 40);

        label6.setBackground(new Color(235, 235, 235));
        label6.setFont(new Font("Arial", 0, 24)); // NOI18N
        label6.setText("SEARCH BY EMAIL:");
        getContentPane().add(label6);
        label6.setBounds(135, 424, 224, 33);

        emailsearch.setBackground(new Color(235, 235, 255));
        emailsearch.setFont(new Font("Calibri", 0, 24)); // NOI18N
        getContentPane().add(emailsearch);
        emailsearch.setBounds(369, 417, 232, 40);

        label7.setBackground(new Color(235, 235, 235));
        label7.setFont(new Font("Arial", 0, 24)); // NOI18N
        label7.setText("LIST BY AGE:");
        getContentPane().add(label7);
        label7.setBounds(203, 501, 156, 33);

        agelist.setBackground(new Color(235, 235, 255));
        agelist.setFont(new Font("Calibri", 0, 24)); // NOI18N
        getContentPane().add(agelist);
        agelist.setBounds(369, 494, 232, 40);

        jButton2.setBackground(new Color(153, 153, 255));
        jButton2.setFont(new Font("Courier New", 1, 20)); // NOI18N
        jButton2.setText("SEARCH");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(262, 627, 174, 66);

        jButton1.setBackground(new Color(153, 153, 255));
        jButton1.setFont(new Font("Courier New", 1, 20)); // NOI18N
        jButton1.setText("CANCEL");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(471, 628, 174, 67);

        jLabel2.setIcon(new ImageIcon("C:\\Users\\Ayesha Zaka\\Downloads\\1st Semester\\New folder (2)\\Darshboard-Login.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1090, 720);

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(520, 60, 34, 14);

        jLabel4.setIcon(new ImageIcon("C:\\Users\\Ayesha Zaka\\Downloads\\1st Semester\\New folder (2)\\Darshboard-Login.png")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(950, 0, 400, 20);

        pack();
    }// </editor-fold>                        

    private void firstsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstsearchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String search[] = new String[6];
        search[0] = firstsearch.getText();
        search[1] = lastsearch.getText();
        search[2] = emailsearch.getText();
        search[3] = phonesearch.getText();
        search[4] = agelist.getText();
        search[5] = genderlist.getText();
        String fsearch;
        for (int i=0; i<search.length;i++){
            if (search[i]!= null){
                fsearch = search[i].toUpperCase();
                this.connectiondb(fsearch);
         }
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(ActionEvent evt) {
        this.setVisible(false);
        HOME obj = new HOME();
        obj.setVisible(true);
    }                                        

    public void connectiondb(String search){
        resultshowarea.setText("");
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection connect = DriverManager.getConnection("jdbc:derby://localhost:1527/medicalDiagnose", "root", "root");
            Statement smt = connect.createStatement();
         //   String sql = "SELECT * FROM PATIENTDETAILS WHERE FIRSTNAME LIKE '%"+search+"%' OR LASTNAME LIKE '%"+search+"%' OR GENDER LIKE '%"+search+"%'"
       //             + "  OR EMAIL LIKE '%"+search+"%'  OR PHONE LIKE '%"+search+ "%'  OR FREQUENT LIKE '%"+search+"%'  OR AGE LIKE '%"+search+"%'";
            String sql = "SELECT * FROM PATIENTDETAILS WHERE FIRSTNAME='"+search+"' OR LASTNAME='"+search+"' OR GENDER='"+search+"' OR EMAIL='"
                    + search + "' OR PHONE='"+search+"' OR AGE='"+search+"'";
            ResultSet rs = smt.executeQuery(sql);
            while(rs.next()){
            String fn1  = rs.getString("FIRSTNAME");
            String ln1  = rs.getString("LASTNAME");
            String gender1  = rs.getString("GENDER");
            String email1  = rs.getString("EMAIL");
            String phone1  = rs.getString("PHONE");
            String freq1  = rs.getString("FREQUENT");
            String age  = rs.getString("AGE");
            resultshowarea.append("FIRST NAME: " + fn1 + "\n" + "LAST NAME: " + ln1 + "\n" + "AGE: " + age +"\n" + "GENDER: "+gender1 + "\n"
            + "EMAIL: "+email1 + "\n" + "PHONE: "+phone1 + "\n" + "FREQUENT PATIENT: "+freq1 + "\n ======================================\n");
          }
        }catch(ClassNotFoundException a){
            a.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    // Variables declaration
    private TextField agelist;
    private TextField emailsearch;
    private TextField firstsearch;
    private TextField genderlist;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private Label label2;
    private Label label3;
    private Label label4;
    private Label label5;
    private Label label6;
    private Label label7;
    private TextField lastsearch;
    private TextField phonesearch;
    private TextArea resultshowarea;
    // End of variables declaration                   
}
