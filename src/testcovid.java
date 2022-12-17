import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.*;
public class testcovid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc = new Scanner (System.in);   
		String cr, rep, nom, prenom, gouv;
		Selection s = new Selection(); 
		int age;
		listPatients lp = new listPatients(); 
	patient  p1= new patient ("AA", "AA", "Sousse", 45);  
	p1.addcritere(s.getCritre(1)); 
	p1.addcritere(s.getCritre(3));
	p1.addcritere(s.getCritre(5));
	lp.addPatient(p1);
	p1= new patient ("BB", "BB", "Tunis", 25); 
	p1.addcritere(s.getCritre(1)); 
	p1.addcritere(s.getCritre(3));
	p1.addcritere(s.getCritre(4));
	p1.addcritere(s.getCritre(6));
	p1.addcritere(s.getCritre(5));
	
	lp.addPatient(p1);
	  p1= new patient ("EE", "EE", "Tunis", 80); 
	  p1.addcritere(s.getCritre(1));
	  p1.addcritere(s.getCritre(2));
	  p1.addcritere(s.getCritre(3));
	  p1.addcritere(s.getCritre(4));
	  p1.addcritere(s.getCritre(6)); 
	  p1.addcritere(s.getCritre(5));  
	  lp.addPatient(p1);
	      p1= new patient ("CC", "CC", "Sousse", 75);
	      p1.addcritere(s.getCritre(1)); 
		  p1.addcritere(s.getCritre(3));
		  p1.addcritere(s.getCritre(4));
		  p1.addcritere(s.getCritre(6));
		  p1.addcritere(s.getCritre(8));
		  p1.addcritere(s.getCritre(5));
		  lp.addPatient(p1);
		  p1= new patient ("DD", "DD", "Ariana", 20);
		  lp.addPatient(p1); 
		
		  System.out.println ("Liste des patients:");
		  Set<patient> l= lp.getPatients(); 
		  Iterator<patient> itPatients = l.iterator();
		  while (itPatients.hasNext())
		  {    p1= itPatients.next();
		  System.out.println (p1);   
		  System.out.println ("Les symptômes sont :");   
		  System.out.println (p1.getCritére()); 
		  }  
		  System.out.println ("Les patients à tester:"); 
		 
		 Set<patient>lptest = lp.ToBeTested(3);   
		  itPatients = lptest.iterator();  
		  while (itPatients.hasNext()) 
		  { 
		  p1= itPatients.next();
		  System.out.println (p1);  
		  }  
		  System.out.println ("Les résultats des tests:");   
	       Iterator<patient> po=lptest.iterator();
	       String str="";
	       while(po.hasNext())
	       {
	    	   patient p=po.next();
		    do
	     	{
			System.out.println(p+" test positif? (O/N)");
			 str = sc.nextLine();

     	}while(str.toUpperCase().equals("O")==false && str.toUpperCase().equals("N")==false  );
			
			if(str.toUpperCase().equals("O"))
			
			
			p.setresultat(true);
			
			else if(str.toUpperCase().equals("N"))
			
				
				
				p.setresultat(false);
			
			
	       
	       }
		 lp.EnregistrerResultat(lptest); 
		 Statistics sta=new Statistics();
		  System.out.println ("Nombre de patients positifs par gouvernorat:");
		  Map<String, Integer> hmp1 =  sta.statsPositifsGouvernorat(lptest);
		  System.out.println (hmp1);
		
		 System.out.println ("Nombre de patients positifs par catégorie d'âges:"); 
		  Map<String, Integer> hmp2 =  sta.statsPositifsAge(lptest); 
		  System.out.println (hmp2);
		  
		
	}

}
