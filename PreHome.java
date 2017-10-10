package medicaldiagnose;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PreHome extends JFrame {

    public PreHome() {
        initComponents();
    }

    private void initComponents() {
        
        getContentPane().setBounds(100,100,500,500);
        jLabel3 = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jLabel2 = new JLabel();
        jLabel1 = new JLabel();
        jLabel3.setText("jLabel3");
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       // getContentPane().setLayout(null);
        getContentPane().setSize(100,100);
        jButton1.setBackground(java.awt.SystemColor.inactiveCaption);
        jButton1.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setIcon(new ImageIcon("C:\\Users\\Ayesha Zaka\\Downloads\\1st Semester\\New folder (2)\\patient.png")); // NOI18N
        jButton1.setText("USER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 170, 290, 230);

        jButton2.setBackground(java.awt.SystemColor.inactiveCaption);
        jButton2.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 51));
        jButton2.setIcon(new ImageIcon("C:\\Users\\Ayesha Zaka\\Downloads\\1st Semester\\New folder (2)\\user_login-512.png")); // NOI18N
        jButton2.setText("ADMIN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(400, 170, 300, 230);

        jLabel2.setFont(new java.awt.Font("Droid Sans", 1, 36)); // NOI18N
        jLabel2.setText("SELECT YOUR CHOICE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 50, 380, 80);

        jLabel1.setIcon(new ImageIcon("C:\\Users\\Ayesha Zaka\\Downloads\\1st Semester\\New folder (2)\\Darshboard-Login1.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 730, 480);

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        UserDashboard obj = new UserDashboard();
        obj.setVisible(true);
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        Login obj = new Login();
        obj.setVisible(true);
    }                          
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PreHome().setVisible(true);
            }
        });
    }

    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
}
