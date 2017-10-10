package medicaldiagnose;

import java.util.ArrayList;

public class GeneralDiseases extends Symptoms{
    public ArrayList <ArrayList> generaldiseases;
    public ArrayList <String> issues;
    public ArrayList <String> fever;
    public ArrayList <String> cough;
    public ArrayList <String> fatique;
    public ArrayList <String> headache;
    public ArrayList <String> diarrhea;
    public ArrayList <String> flu;
    public ArrayList <String> stomachpain;
    public ArrayList <String> constipation;
    public ArrayList <String> cold;
    public ArrayList <String> soarthroat;
    public ArrayList <String> anxiety;
    
    GeneralDiseases(){
        this.initiliazing();
        generaldiseases = new <ArrayList> ArrayList();      //ARRAYLIST FOR STORING SUB-ARRAYLISTS
        generaldiseases.add(fever);  
        generaldiseases.add(cough);
        generaldiseases.add(fatique);
        generaldiseases.add(headache);
        generaldiseases.add(diarrhea);
        generaldiseases.add(flu);
        generaldiseases.add(stomachpain);
        generaldiseases.add(constipation);
        generaldiseases.add(cold);
        generaldiseases.add(soarthroat);
        generaldiseases.add(anxiety); 
        searchfood = new <String> ArrayList();
        //----------------------INITILIZE-------------
        issues = new <String> ArrayList();    //NECESSAITY FOR SEARCHING ALGORITHM AND NATURE OF GENERAL DISEASES
        issues.add("FEVER");                  // AS A SYMPTOM MAY REPRESENT MORE THAN ONE DISEASES!
        issues.add("COUGH");
        issues.add("FATIQUE");
        issues.add("HEADACHE");
        issues.add("DIARRHEA");
        issues.add("FLU");
        issues.add("STOMACH PAIN");
        issues.add("CONSTIPATION");
        issues.add("COLD");
        issues.add("SORE THROAT");
        issues.add("ANXIETY");
    }
    
    public void initiliazing(){  //ARRAYLISTS NEEDS TO BE INITIALIZED | CALLED IN CONSTRUCTOR
        this.fever();
        this.cough();
        this.fatique();
        this.headache();
        this.diarrhea();
        this.flu();
        this.stomachpain();
        this.constipation();
        this.cold();
        this.soarthroat();
        this.anxiety();
    }
    
    public void fever(){
        fever = new <String> ArrayList();
        fever.add("sweating");
        fever.add("shivering");
        fever.add("headache");
        fever.add("dehydration");
        fever.add("weakness");
        fever.add("cold");
        fever.add("pain-in-body");
        fever.add("soarthroat");
    }
    
    public void cough(){
        cough = new <String> ArrayList();
        cough.add("cold");
        cough.add("running-nose");
        cough.add("voice-change");
        cough.add("bad-breath");
        cough.add("sour-taste");
        cough.add("pain-in-throat");
        cough.add("heartburn");
        cough.add("throat-problem");
        cough.add("soar-throat");
    }
    
    public void fatique(){
        fatique = new <String> ArrayList();
        fatique.add("tiredness");
        fatique.add("sleepiness");
        fatique.add("sore-muscles");
        fatique.add("dizziness");
        fatique.add("weakness");
        fatique.add("irritate-response");
        fatique.add("impared-decisions");
        fatique.add("vomiting");
        fatique.add("pain-in-chest");
        fatique.add("depression");
        fatique.add("weight-loss");
    }
    
    public void headache(){
        headache = new <String> ArrayList();
        headache.add("pain-in-head");
        headache.add("headache");
        headache.add("tension");
        headache.add("pressure-on-head");
    }
    
    public void diarrhea(){
        diarrhea = new <String> ArrayList();
        diarrhea.add("loose-stool");
        diarrhea.add("abdominal-pain");
        diarrhea.add("bloody-stool");
        diarrhea.add("nausea");
        diarrhea.add("bloating");
        diarrhea.add("urgent-use-of-washroom");
    }
    
    public void flu(){
        flu = new <String> ArrayList();
        flu.add("fever");
        flu.add("running-nose");
        flu.add("headache");
        flu.add("body-pain");
        flu.add("fatique");
        flu.add("flu");
        flu.add("soar-throat");
        flu.add("sneezing");
        flu.add("chest-pain");
    }
    
    public void stomachpain(){
        stomachpain = new <String> ArrayList();
        stomachpain.add("constipation");
        stomachpain.add("diarrhea");
        stomachpain.add("gas");
        stomachpain.add("vomiting");
        stomachpain.add("stress");
        stomachpain.add("abdominal-pain");
        stomachpain.add("abdomin-pain");
    }
    public void constipation(){
        constipation = new <String> ArrayList();
        constipation.add("less-bowel-movement");
        constipation.add("hard-stool");
        constipation.add("belly-pain");
        constipation.add("abdominal-pain");
        constipation.add("bloating");
        constipation.add("depression");
        constipation.add("stress");
    }
    public void cold(){
        cold = new <String> ArrayList();
        cold.add("running-nose");
        cold.add("cough");
        cold.add("depression");
        cold.add("soarthroat");
        cold.add("fever");
        cold.add("red-nose");
    }
    public void soarthroat(){
        soarthroat = new <String> ArrayList();
        soarthroat.add("pain-in-throat");
        soarthroat.add("fever");
        soarthroat.add("cough");
        soarthroat.add("pain-in-throat");
        soarthroat.add("voice-change");
        soarthroat.add("swallon-throat");
        soarthroat.add("difficult-swallow");
    }
    public void anxiety(){
        anxiety = new <String> ArrayList();
        anxiety.add("nervousness");
        anxiety.add("panic");
        anxiety.add("high-heart-rate");
        anxiety.add("sweating");
        anxiety.add("losing-control");
        anxiety.add("stress");
        anxiety.add("fear");
        anxiety.add("nausea");
        anxiety.add("bad-breath");
        anxiety.add("depression");
    }
    
    public ArrayList search(String symptom){
        int i;
        for (i=0; i<generaldiseases.size(); i++){
            if (generaldiseases.get(i).contains(symptom)){
                if(!searchfood.contains(issues.get(i))){
                  searchfood.add(issues.get(i));
                  System.out.println(issues.get(i)+"\n");
                }
           }else{
                generaldiseases.remove(i);
                issues.remove(i);
            }
      }
        return searchfood;
    }
    
    public void reason(){
        
    }
    
    public void result(){
        for (int i=0; i<searchfood.size(); i++){
            
            searchfood.get(i);
        }
        
  /*      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\t\t =============> RESULT  <===============");
        for (int i=0; i<searchfood.size(); i++){
           System.out.println("\t\t" + i + ") " + searchfood.get(i));
        }
        System.out.println("\t\t <--------------------------------->"); */
    }
}
