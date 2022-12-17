import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Statistics 
{
	private   static String[] Gouvernorats= new String[] {"Tunis","Sousse","Ariana","Ben Arouse","Monastir","Biserte","Kébili","Sfax","Manouba","Sidi Bouzid","Kairouan","Jendouba"}; 
    private static String [] tranchesAges=new String[] {"Nourisson","Enfant","Jeune","Adulte","vieux"};
    public Statistics ()
    {
    	
    }
    
    public static Map<String,Integer> statsPositifsGouvernorat(Collection<patient> v)
    {
    	
    	Iterator<patient> k=v.iterator();
    	Map<String,Integer> stat=new HashMap<String,Integer>();
   
    	for(int i=0;i<11;i++)
    	{
    		stat.putIfAbsent(Gouvernorats[i],0);
    	}
    	while(k.hasNext() )
    	{
    		patient po=k.next();
    		if(po.iscovid())
    		{
    			stat.replace(po.getgouvernorat(),stat.get(po.getgouvernorat())+1 );
    		}
       }
    	return stat;
    	
    	
    }
    public static Map<String,Integer> statsPatientsGouvernorat(Collection<patient> patien)
    {
    	Iterator<patient> k=patien.iterator();
    	Map<String,Integer> stat=new HashMap<String,Integer>();
   
    	for(int i=0;i<11;i++)
    	{
    		stat.putIfAbsent(Gouvernorats[i],0);
    	}
    	while(k.hasNext() )
    	{
    		patient p=k.next();
    		
    			stat.replace(p.getgouvernorat(),stat.get(p.getgouvernorat())+1 );
    		
         }
    	return stat;
    	
    	
    	
    }
    public static Map<String,Integer> statsPositifsAge(Collection<patient> patienttestée)
    {
    	Iterator<patient> k=patienttestée.iterator();
    	Map<String,Integer> stat=new HashMap<String,Integer>();
   
    	for(int i=0;i<5;i++)
    	{
    		stat.putIfAbsent(tranchesAges[i],0);
    	}
    	while(k.hasNext() )
    	{
    		patient p=k.next();
    		
    		if(p.iscovid())
    		{
    			stat.replace(p.getcatage(),stat.get(p.getcatage())+1 );
    		}
       }
    	return stat;
    	
    }
    public static Map<String,Integer> statsPatientsAge(Collection<patient> patients)
    {
    	Iterator<patient> k= patients.iterator();
    	Map<String,Integer> stat=new HashMap<String,Integer>();
   
    	for(int i=0;i<11;i++)
    	{
    		stat.putIfAbsent(tranchesAges[i],0);
    	}
    	while(k.hasNext() )
    	{
    		patient po=k.next();
    		
    		
    			stat.replace(po.getcatage(),stat.get(po.getcatage())+1 );
    		
       }
    	return stat;
    	
    	
    }





















}
