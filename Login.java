package medicaldiagnose;
import java.awt.Color;
import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Login extends JFrame {

    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel13;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JButton loginbtn;
    private JPasswordField passwordfield;
    private JLabel successfail;
    private java.awt.TextField usernamefield;
    
private boolean checkadmin;
    public Login() {
        LoginComponents();
    }
 
    private void LoginComponents() {

        jLabel8 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel1 = new JLabel();
        loginbtn = new JButton();
        usernamefield = new java.awt.TextField();
        successfail = new JLabel();
        jLabel7 = new JLabel();
        passwordfield = new JPasswordField();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel13 = new JLabel();
        jLabel11 = new JLabel();

        jLabel8.setIcon(new ImageIcon("C:\\Users\\Ayesha Zaka\\Downloads\\1st Semester\\New folder (2)\\abc.png")); 

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(java.awt.SystemColor.activeCaption);
        getContentPane().setLayout(new AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jLabel2.setText("PASSWORD:");
        getContentPane().add(jLabel2, new AbsoluteConstraints(320, 220, -1, 46));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jLabel3.setText("USERNAME:");
        getContentPane().add(jLabel3, new AbsoluteConstraints(320, 110, 149, 96));

        jLabel4.setIcon(new ImageIcon("C:\\Users\\Ayesha Zaka\\Downloads\\1st Semester\\New folder (2)\\43118-200.png")); 
        getContentPane().add(jLabel4, new AbsoluteConstraints(710, 210, 50, 52));
        getContentPane().add(jLabel5, new AbsoluteConstraints(642, 63, -1, 93));

        jLabel6.setIcon(new ImageIcon("C:\\Users\\Ayesha Zaka\\Downloads\\1st Semester\\New folder (2)\\User-512.png")); 
        getContentPane().add(jLabel6, new AbsoluteConstraints(710, 140, 40, 40));

        jLabel1.setIcon(new ImageIcon("C:\\Users\\Ayesha Zaka\\Downloads\\1st Semester\\New folder (2)\\login.png")); 
        getContentPane().add(jLabel1, new AbsoluteConstraints(20, 80, 270, 300));

        loginbtn.setBackground(java.awt.SystemColor.activeCaption);
        loginbtn.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        loginbtn.setText("LOGIN");
        loginbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginbtn, new AbsoluteConstraints(510, 280, 170, 70));

        usernamefield.setBackground(new java.awt.Color(208, 226, 244));
        usernamefield.setFont(new java.awt.Font("Tahoma", 0, 24)); 
        getContentPane().add(usernamefield, new AbsoluteConstraints(480, 140, 220, 40));

        successfail.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        successfail.setToolTipText("");
        getContentPane().add(successfail, new AbsoluteConstraints(100, 410, 606, 80));

        jLabel7.setFont(new java.awt.Font("Droid Sans", 1, 26)); 
        jLabel7.setText("PLEASE LOGIN TO ACCESS ADMIN PANEL");
        getContentPane().add(jLabel7, new AbsoluteConstraints(134, 22, -1, -1));

        passwordfield.setBackground(new java.awt.Color(208, 226, 244));
        getContentPane().add(passwordfield, new AbsoluteConstraints(480, 220, 220, 40));

        jLabel9.setIcon(new ImageIcon("C:\\Users\\Ayesha Zaka\\Downloads\\1st Semester\\New folder (2)\\abc.png")); 
        getContentPane().add(jLabel9, new AbsoluteConstraints(310, 80, 490, 300));

        jLabel10.setBackground(java.awt.SystemColor.activeCaptionBorder);
        jLabel10.setIcon(new ImageIcon("C:\\Users\\Ayesha Zaka\\Downloads\\1st Semester\\New folder (2)\\abcde.png")); 
        getContentPane().add(jLabel10, new AbsoluteConstraints(0, 70, 830, 340));

        jLabel13.setIcon(new ImageIcon("C:\\Users\\Ayesha Zaka\\Downloads\\1st Semester\\New folder (2)\\background.png")); 
        getContentPane().add(jLabel13, new AbsoluteConstraints(0, -50, 830, 120));

        jLabel11.setIcon(new ImageIcon("C:\\Users\\Ayesha Zaka\\Downloads\\1st Semester\\New folder (2)\\background1.png")); 
        getContentPane().add(jLabel11, new AbsoluteConstraints(0, 410, 830, 90));

        pack();
    }

    private void loginbtnActionPerformed(ActionEvent evt) {
        String username = usernamefield.getText();
        String password = new String(passwordfield.getPassword());
       if (this.connectiondb(username, password)==true){
                this.setVisible(false);
                HOME obj = new HOME();
                obj.setVisible(true);
       }else{
           
       }
    }

    public boolean connectiondb(String user, String pass){
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection connect = DriverManager.getConnection("jdbc:derby://localhost:1527/medicalDiagnose", "root", "root");
            Statement smt = connect.createStatement();
            String sqlquery = "SELECT USERNAME,PASSWORD FROM USERS WHERE USERNAME='"+user+"' AND PASSWORD='"+pass+"'";
            ResultSet result = smt.executeQuery(sqlquery);
            if(result.next()){
                return true;
            }else{
                successfail.setForeground(Color.red);
                successfail.setText("WRONG USERNAME OR PASSWORD ENTERED!");
            }
        }catch(ClassNotFoundException a){
            a.printStackTrace();
        }catch(SQLException b){
            b.printStackTrace();
        }
        return false;
    }
    
}
