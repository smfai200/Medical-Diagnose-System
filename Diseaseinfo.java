package medicaldiagnose;

import java.util.ArrayList;
import java.sql.*;
public class Diseaseinfo extends javax.swing.JFrame {

    public Diseaseinfo() {
        initComponents();
    }

    private void initComponents() {

        resultshow = new java.awt.TextArea();
        diseasetext = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        searchdisease1 = new javax.swing.JButton();
        searchdisease12 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      //  getContentPane().setLayout(null);

        resultshow.setEditable(false);
        resultshow.setFont(new java.awt.Font("Dialog", 0, 18));
        getContentPane().add(resultshow);
        resultshow.setBounds(0, 160, 1010, 410);

        diseasetext.setFont(new java.awt.Font("Droid Sans", 0, 24)); 
        diseasetext.setName(""); 
        getContentPane().add(diseasetext);
        diseasetext.setBounds(190, 110, 260, 40);

        jLabel2.setFont(new java.awt.Font("Droid Sans", 1, 36)); 
        jLabel2.setText("DISEASE INFORMATION MODULE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 10, 570, 40);

        jLabel3.setFont(new java.awt.Font("Droid Sans", 1, 22)); 
        jLabel3.setText("ENTER DISEASE:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 110, 180, 40);

        searchdisease1.setBackground(java.awt.SystemColor.activeCaption);
        searchdisease1.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        searchdisease1.setText("SEARCH");
        searchdisease1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchdisease1ActionPerformed(evt);
            }
        });
        getContentPane().add(searchdisease1);
        searchdisease1.setBounds(510, 110, 140, 40);

        searchdisease12.setBackground(java.awt.SystemColor.activeCaption);
        searchdisease12.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        searchdisease12.setText("CANCEL");
        searchdisease12.setToolTipText("");
        searchdisease12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchdisease12ActionPerformed(evt);
            }
        });
        getContentPane().add(searchdisease12);
        searchdisease12.setBounds(670, 110, 140, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ayesha Zaka\\Downloads\\1st Semester\\New folder (2)\\Darshboard-Login2.png")); 
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1010, 570);

        pack();
    }// </editor-fold>                        

    private void searchdisease1ActionPerformed(java.awt.event.ActionEvent evt) {
        resultshow.setText(null);
        String searchterm = diseasetext.getText().toLowerCase();
        String searchterm1 = diseasetext.getText().toUpperCase();
        GeneralDiseases ds1 = new GeneralDiseases();
        ArrayList searchds1 = ds1.issues;
        boolean check=false;
        //SEARCHING FOR ALLERGY LIST
        if (searchterm.contains("allergy")){
             FoodAllergy ds2 = new FoodAllergy();
             ArrayList searchds2 = ds2.foodallergy;
             resultshow.append("SYMPTOMS: \n");
             for (int i=0; i<searchds2.size();i++){
                 resultshow.append(searchds2.get(i)+"\n");
             }
             resultshow.append(ds2.reason());
             check = true;
        } //SEARCHNG IN GENERAL DISEASES LIST
                   for (int i=0; i<searchds1.size(); i++){
                if(searchterm1.equals(searchds1.get(i))){
                    check = true;
                    resultshow.append("SYMPTOMS: ");
                    for (int j=0; j < ds1.generaldiseases.get(i).size(); j++){
                    resultshow.append("\n" + ds1.generaldiseases.get(i).get(j));
                    }
                }
        }
        if (check == false){
            resultshow.append("THIS DISEASE IS NOT YET ADDED TO OUR DATABASE! \n WE WILL BE ADDING IT SOON BY REVIEWING USERS LOGS! \n KEEP UPDATED!");
            this.connectiondb(searchterm.toLowerCase());
        }
    }

    private void searchdisease12ActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        UserDashboard obj = new UserDashboard();
        obj.setVisible(true);
    }                                               

    public void connectiondb(String searchterm){
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection connect = DriverManager.getConnection("jdbc:derby://localhost:1527/medicalDiagnose", "root", "root");
            Statement smt = connect.createStatement();
            String sql = "INSERT INTO DISEASEINFOSEARCH VALUES '"+searchterm+"'";
            ResultSet rs = smt.executeQuery(sql);
        }catch(ClassNotFoundException a){
            a.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Variables declaration
    private java.awt.TextField diseasetext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.TextArea resultshow;
    private javax.swing.JButton searchdisease1;
    private javax.swing.JButton searchdisease12;
    // End of variables declaration                   
}
