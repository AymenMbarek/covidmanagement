import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;



public class patient implements Comparable<patient> {
	public  String nom;
	public  String prenom;
	private String Gouvernorat;
	private int Age;
	private HashSet<String> Critéres=new HashSet<String>() ;
	private  boolean testCovid;
	public patient()
	{
		
	}
	public patient(String n,String p,String g,int a)
	{
		nom=n;
		prenom=p;
		Gouvernorat=g;
		Age=a;
		}
	public int calculScore()
	{
		Selection s=new Selection();
		int score=0;
		int i=0;
		HashMap <String ,Integer> v=s.getCritere();
		Iterator<String> p= Critéres.iterator();

		while(p.hasNext())
		{
	      score=score+v.get(p.next());
		}
		return score;
	}
	public void addcritere(String sy)
	{
		
		 Critéres.add(sy);
	}
	public HashSet<String> getCritére()
	{
		
		return Critéres ;
	}
	public String getgouvernorat()
	{
		return Gouvernorat; 
	}
	
	public boolean equals(Object v)
	{
		patient pat=(patient) v;
		if(nom.equals(pat.nom)&&prenom.equals(pat.prenom))
		{
			return true;
			
		}
		else
			return false;
	}
	
	
	public boolean iscovid()
	{
		return testCovid;
	}
	public void setresultat(boolean test)
	{
		testCovid=test;
		
	}
	public String toString()
	{
		String h="";
		h=nom+" "+prenom+" "+Age;
		return h;
	}
	public String categorieAge()
	{
		String h="";
		if(Age>=0 && Age<=3)
		{
			h="Nourisson:[0..3]";
		}
		if(Age>3 && Age<=18)
		{
			h="Enfant:]3..18]";
		}
		if(Age>18 && Age<=40)
		{
			h="Jeune:[18..40]";
		}
		if(Age>40&& Age<=65)
		{
			h="Adulte:[40..65]";
		}
		if(Age>65)
		{
			h="vieux:>65";
		}
		return h;
		
	}
	public String getcatage()
	{
		String h="";
		if(Age>=0 && Age<=3)
		{
			h="Nourisson";
		}
		if(Age>3 && Age<=18)
		{
			h="Enfant";
		}
		if(Age>18 && Age<=40)
		{
			h="Jeune";
		}
		if(Age>40&& Age<=65)
		{
			h="Adulte";
		}
		if(Age>65)
		{
			h="vieux";
		}
		return h;
	}
	public int getage()
	{
		return Age;
	}
	
	@Override
	public int compareTo(patient p) 
	{
		if(calculScore()==p.calculScore())
			return 0;
		else if(calculScore()>p.calculScore())
			return 1;
		else
			return -1;
	}
	

}
