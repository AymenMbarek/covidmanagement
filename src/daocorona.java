import java.sql.Connection;

	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.List;
public class daocorona{
	

		Connection cnx;
		connexion con=new connexion();
		private Statement x;
		private ResultSet s;
		

		public daocorona()
		{
			cnx=con.getconnexion();
			
		}
		public Object findByID(Object id) {
			String mat=(String)id;
			projetjava v=null;
			try {

				x=cnx.createStatement();
				s=x.executeQuery("select * from patient WHERE NOM ='"+nom+"'");
				while(s.next())
				{
					
					v=new Voiture(s.getString("MATRICULE"),s.getString("MARQUE"),s.getString("MODELE"),s.getString("COULEUR"),s.getDouble("PRIX"));
				}
				
		
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
			return v;
			
		}

		@Override
		public ArrayList<Voiture> findAll() {
			ArrayList<Voiture> f=new ArrayList<Voiture>();
			try {
				x=cnx.createStatement();
				s=x.executeQuery("select * from voiture");
				while(s.next())
				{
					f.add(new Voiture(s.getString("MATRICULE"),s.getString("MARQUE"),s.getString("MODELE"),s.getString("COULEUR"),s.getDouble("PRIX")));
					
				}
				
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
			return f;
		}

		public boolean update(Object o) {
			Voiture v=(Voiture)o;
			 boolean verif=false;
				try 
				{
					x=cnx.createStatement();
					String rq="UPDATE voiture SET MARQUE = '"+ v.getMarque()+"',MODELE='"+v.getModele()+"',COULEUR='"+ v.getModele()+"',PRIX='"+v.getPrix()+"' WHERE MATRICULE ='"+v.getMatricule()+"'";
					x.executeUpdate(rq);
					System.out.println("la modification est fait");
					verif=true;
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.getMessage();
				}
				return verif;
		}

		public boolean delete(Object o) {
			String v=(String)o;
		 boolean verif=false;
			try 
			{
				x=cnx.createStatement();
				String rq="DELETE FROM voiture WHERE MATRICULE ="+v;
				x.executeUpdate(rq);
				System.out.println("la supprésion est fait");
				verif=true;
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
			return verif;
		}

		public boolean insert(Object o) 
		{
	        Voiture v=(Voiture)o;
	        String matricule=v.getMatricule();
	        String couleure=v.getCouleur();
	        Double prix=v.getPrix();
	        String marque=v.getMarque();
	        String Modele=v.getModele();
	        boolean verif=false;
			
			try 
			{
				x=cnx.createStatement();
				String req="INSERT INTO voiture VALUES('"+matricule+"','"+marque+"','"+Modele+"','"+couleure+"','"+prix+"')";
				x.executeUpdate(req);
				System.out.println("l'ajout est bien effectuée");
				verif=true;
			} 
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return verif;
			
		}

	}


