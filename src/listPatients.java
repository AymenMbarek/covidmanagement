
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;


public class listPatients {
	Set<patient> listpatient=new TreeSet<patient> () ;
	
	public listPatients()
	{

	}
	public void setpatien(Set<patient> h)
	{
		listpatient=h;
	}
public void addPatient(patient p)
{
	System.out.println(p.nom+" "+p.prenom + "("+ p.getage() +")"+" , score Covid-19 : "+ p.calculScore()+" : Ajout effectué");
	listpatient.add(p);
	}
public void removePatient(patient p)
{
	listpatient.remove(p);
}
public int getNbPatients()
{
	return listpatient.size();
}
public patient getPatient(int pos)
{
	patient p=null;
	int i=0;
	Iterator<patient> it=listpatient.iterator();
	while(it.hasNext() && i<=pos-1)
	{
		 p=it.next();
		 i++;
    }
	
	return p;
	
}
public Set<patient> getPatients()
{
	return listpatient;
}
public Set<patient>  ToBeTested (int nb)
{
	 int i=0;
	Set<patient> l=new HashSet<patient>();
	 Iterator<patient> iv=listpatient.iterator();
	 while(iv.hasNext() && i<=nb-1)
		{
		
			l.add(iv.next());
			 i++;
	    }
	 return l;
}
public  ArrayList<patient> PatientsParGouv(String g)
{
	 ArrayList<patient> lp=new  ArrayList<patient> ();
	 Iterator<patient> t=listpatient.iterator();

	 while(t.hasNext())
		{
		 patient p=t.next();
		 if(p.getgouvernorat().equals(g))
			 lp.add(p);
		}
	return lp;
}
public ArrayList<patient> PatientsParAge(int a)
{

	 ArrayList<patient> lo=new  ArrayList<patient> ();
	 Iterator<patient> li=listpatient.iterator();
	
	 while(li.hasNext())
		{
		 patient pat=li.next();
		 if(pat. getage()==a)
			 lo.add(pat);
			
	    }
	return lo;
}
public void EnregistrerResultat(Set<patient> lp)
{
	listpatient=lp;
	
}


}
