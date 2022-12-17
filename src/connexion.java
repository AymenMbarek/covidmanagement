import java.sql.Connection;
import java.sql.DriverManager;

public class connexion {
	private Connection cnx;
	public  connexion ()
	{
	
			
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				cnx=DriverManager.getConnection("jdbc:mysql://localhost/projetjava","root","");
			
			} catch (Exception e) 
			{
				
				e.getMessage();
			}
		
		
	}
	public  Connection getconnexion()
	{
		return cnx;
	}
	
	

}
