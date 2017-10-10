package medicaldiagnose;
import java.util.ArrayList;
import java.util.Arrays;

public class Disease {
    
    Disease(){
        this.DiseaseList();
    }
    
    public ArrayList <String> disease;
    public void DiseaseList(){
        disease = new <String> ArrayList();
        disease.add("Food Allergy");
        disease.add("Anxiety");
        disease.add("Asthma");
        disease.add("Alzheimer");
        disease.add("Stomach Pain");
        disease.add("Cold");
        disease.add("Constipation");
        disease.add("Cough");
        disease.add("Cancer");
        disease.add("Dengue");
        disease.add("Depression");
        disease.add("Diabetes");
        disease.add("Diarrhea");
        disease.add("Flu");
        disease.add("High Blood Pressure");
        disease.add("Low Blood Pressure");
        disease.add("Kidney Stone");
        disease.add("Heart Attack");
        
    }
    
    public ArrayList <String> accesslist(){
        return this.disease;
    }
    
    public void printall(){
        ArrayList obj1 = this.disease;
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++ ");
        System.out.println(" THE FOLLOWING IS THE LIST OF DISEASES THAT CAN BE IDENTIFIED BY THIS SYSTEM: ");
        for (int i=0; i<obj1.size(); i++){
            System.out.println(i + ") " + (obj1.get(i)));
        }
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++ ");
    }
}
