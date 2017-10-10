package medicaldiagnose;
import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class HistoryLogs extends JFrame {


    public HistoryLogs() {
        initComponents();
    }

    private void initComponents() {

        cancel = new JButton();
        jButton2 = new JButton();
        history_logs = new TextArea();
        jButton3 = new JButton();
        jLabel1 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       // getContentPane().setLayout(null);

        cancel.setBackground(SystemColor.inactiveCaption);
        cancel.setFont(new Font("Droid Sans", 1, 24)); 
        cancel.setText("CANCEL");
        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(970, 20, 155, 56);

        jButton2.setBackground(SystemColor.scrollbar);
        jButton2.setFont(new Font("Droid Sans", 1, 18)); 
        jButton2.setText("SEE DISEASE SEARCH LOGS");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(399, 23, 265, 56);

        history_logs.setBackground(SystemColor.control);
        history_logs.setEditable(false);
        history_logs.setFont(new Font("Courier New", 0, 18)); 
        getContentPane().add(history_logs);
        history_logs.setBounds(0, 89, 1142, 441);
        this.connectiondb("a");

        jButton3.setBackground(SystemColor.scrollbar);
        jButton3.setFont(new Font("Droid Sans", 1, 18)); 
        jButton3.setText("SEE MEDICAL SYMPTOMS HISTORY LOGS");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(10, 23, 385, 56);

        jLabel1.setIcon(new ImageIcon("C:\\Users\\Ayesha Zaka\\Downloads\\1st Semester\\New folder (2)\\sliderBG11.jpg")); 
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1140, 420);

        pack();
    }                       

    private void jButton2ActionPerformed(ActionEvent evt) {
        this.connectiondb("b");
    }                                        

    private void cancelActionPerformed(ActionEvent evt) {
        this.setVisible(false);
        HOME obj = new HOME();
        obj.setVisible(true);
    }                                      

    private void jButton3ActionPerformed(ActionEvent evt) {
            this.connectiondb("a");
    }                                        

    public void connectiondb(String choice){
        history_logs.setText("");
        String sql;
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection connect = DriverManager.getConnection("jdbc:derby://localhost:1527/medicalDiagnose", "root", "root");
            Statement smt = connect.createStatement();
         if (choice.equals("a")){
             sql = "SELECT * FROM HISTORYLOG";
            ResultSet rs = smt.executeQuery(sql);
            while(rs.next()){
            String fn1  = rs.getString("SYMPTOM1");
            String ln1  = rs.getString("SYMPTOM2");
            String gender1  = rs.getString("SYMPTOM3");
            String email1  = rs.getString("SYMPTOM4");
            String phone1  = rs.getString("SYMPTOM5");
            String freq1  = rs.getString("DISEASE1");
            String age  = rs.getString("DISEASE2");
            history_logs.append("SYMPTOM1: " + fn1 + " | " + "SYMPTOM2: " + ln1 + " | " + "SYMPTOM3: " + gender1 +" | " + "SYMPTOM4: "+email1 + " | "
            + "SYMPTOM5: "+phone1 + "\n" + "DIEASE1: "+freq1 + " | " + "DIEASE2: " + age + " | " + "\n ======================================\n");
            }
          }else{
             sql = "SELECT * FROM DISEASEINFOSEARCH";
            ResultSet rs = smt.executeQuery(sql);
            while(rs.next()){
             String term  = rs.getString("SEARCHTERM");
             history_logs.append("SEARCH TERM: " + term + "\n"); 
            }
         }
        }catch(ClassNotFoundException a){
            a.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private JButton cancel;
    private TextArea history_logs;
    private JButton jButton2;
    private JButton jButton3;
    private JLabel jLabel1;              
}
