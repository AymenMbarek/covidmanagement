

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Selection {
  private HashMap <String ,Integer> Crit�reSelection=new  HashMap <String ,Integer>();
 public Selection(HashMap <String ,Integer> m)
 {
	 Crit�reSelection=m;
	 
 }
 public Selection()
 {
	 Crit�reSelection.put("Arriv�e de l'�tranger", 2);
	 Crit�reSelection.put("Contact avec une personne positive", 2);
	 Crit�reSelection.put("Temp�rature �lev�e", 2);
	 Crit�reSelection.put("Toux s�che", 2);
	 Crit�reSelection.put("Difficult� respiratoire", 2);
	 Crit�reSelection.put("Trouble digestifs", 1);
	 Crit�reSelection.put("Mal de gorge", 1);
	 Crit�reSelection.put("Maux de t�te", 1);
	 Crit�reSelection.put("Courbatures et douleurs", 1);
	 Crit�reSelection.put("Fatigue g�n�rale", 1);
 }
 public boolean verifcritere(String cr)
 {
	 if(Crit�reSelection.containsKey(cr))
	 {
		 return true;
	 }
	 else
		 return false;
 }
 public HashMap<String,Integer> getCritere()
 {
	 return  Crit�reSelection;
	 
 }
 public void setCrit�re(HashMap criteres)
 {
	 Crit�reSelection=criteres;
	 
	 	 
 }
 public void addCritere(String symp,int coef)
 {
	 Crit�reSelection.put(symp,coef);	 
	 
 }
 public String getCritre(int pos)
 {
	 int i=0;
	 Object k=null;
	 Iterator iterator =  Crit�reSelection.entrySet().iterator();
     while (iterator.hasNext()&& i<=pos-1)
     {
       Entry<String,Integer> mapentry =(Entry<String, Integer>) iterator.next();
       k=mapentry.getKey();
       i++;
	  }
     String ko=(String) k;
     return ko;
 }
 public int getScoreCrit�re(String s)
 {
        return Crit�reSelection.get(s);
 }
 public String toString()
 {
	 String h="";
	 return h;
 }
}
 