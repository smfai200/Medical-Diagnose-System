package medicaldiagnose;

import java.util.ArrayList;

public class FoodAllergy extends Symptoms{

    int count=0;
    FoodAllergy(){
       foodallergy = new <String> ArrayList();
       foodallergy.add("hives");
       foodallergy.add("skin-rash");
       foodallergy.add("nausea");
       foodallergy.add("stomach-cramps");
       foodallergy.add("indigestion");
       foodallergy.add("vomiting");
       foodallergy.add("diarrhea");
       foodallergy.add("running-nose");
       foodallergy.add("sneezing");
       foodallergy.add("headaches");
       foodallergy.add("asthma");
       foodallergy.add("itching-mouth");
       foodallergy.add("respiratory-problem");
       foodallergy.add("swollen-lips");
       foodallergy.add("swollen-tongue");
       foodallergy.add("swollen-throat");
       foodallergy.add("itching-mouth");
       foodallergy.add("upset-stomach"); 
       searchfood = new <String> ArrayList();
    }
    public String reason(){
       String reason="\n ==================  REASONS FOR FOOD ALLERGY ====================" + 
               "\n  According to International Research, Eight Foods are responsible for 90% of Food Allergies" + 
               "\n 1. COW's MILK \n "
             + "2. Eggs \n "
             + "3. Peanuts \n "
             + "4. Fish \n "
             + "5. Wheat \n "
             + "6. Soy \n "
             + "7. Tree Nuts \n "
             + "8. Shell-Fish"+"\n I Assume that You recently have Eaten one of the Food that You are Allergic To! \n \t So, Please Avoid Eating That!";
       return reason;
    }
    
    public void search(String symptom){
        if(foodallergy.contains(symptom)){
            searchfood.add(symptom);
            count++;
        }
    }
    
    public void result(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\t\t =============> RESULT  <===============");
        if (count>=3){
        System.out.println("\t\t   " + count + " Of your Symptoms Matched for Allergy");
        for (int i=0; i<searchfood.size(); i++){
           System.out.println(i + ") " + searchfood.get(i));
            }
        System.out.println(" <--------------------------------->");
        
        try{
        Thread.sleep(5000);
         }catch(InterruptedException ex){
                ex.printStackTrace();
        
         }
        this.reason();
        
        }else{
            System.out.println("   " + count + " Of your Symptoms Matched for Allergy Which are Less than 3" +
                    "\t I would Assume that You are not Suffering from Allergy!");
        }
        
    }
}
