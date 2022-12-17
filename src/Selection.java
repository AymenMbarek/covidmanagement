

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Selection {
  private HashMap <String ,Integer> CritéreSelection=new  HashMap <String ,Integer>();
 public Selection(HashMap <String ,Integer> m)
 {
	 CritéreSelection=m;
	 
 }
 public Selection()
 {
	 CritéreSelection.put("Arrivée de l'étranger", 2);
	 CritéreSelection.put("Contact avec une personne positive", 2);
	 CritéreSelection.put("Température élevée", 2);
	 CritéreSelection.put("Toux séche", 2);
	 CritéreSelection.put("Difficulté respiratoire", 2);
	 CritéreSelection.put("Trouble digestifs", 1);
	 CritéreSelection.put("Mal de gorge", 1);
	 CritéreSelection.put("Maux de tête", 1);
	 CritéreSelection.put("Courbatures et douleurs", 1);
	 CritéreSelection.put("Fatigue générale", 1);
 }
 public boolean verifcritere(String cr)
 {
	 if(CritéreSelection.containsKey(cr))
	 {
		 return true;
	 }
	 else
		 return false;
 }
 public HashMap<String,Integer> getCritere()
 {
	 return  CritéreSelection;
	 
 }
 public void setCritére(HashMap criteres)
 {
	 CritéreSelection=criteres;
	 
	 	 
 }
 public void addCritere(String symp,int coef)
 {
	 CritéreSelection.put(symp,coef);	 
	 
 }
 public String getCritre(int pos)
 {
	 int i=0;
	 Object k=null;
	 Iterator iterator =  CritéreSelection.entrySet().iterator();
     while (iterator.hasNext()&& i<=pos-1)
     {
       Entry<String,Integer> mapentry =(Entry<String, Integer>) iterator.next();
       k=mapentry.getKey();
       i++;
	  }
     String ko=(String) k;
     return ko;
 }
 public int getScoreCritére(String s)
 {
        return CritéreSelection.get(s);
 }
 public String toString()
 {
	 String h="";
	 return h;
 }
}
 