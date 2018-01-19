package metier;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class OperateurDestination {
	private  ArrayList<Destination> destination = new ArrayList<Destination>();

	public ArrayList<Destination> getDestination() {
		return destination;
	}

	public void setDestination(ArrayList<Destination> destination) {
		this.destination = destination;
	}
	 public void add(Destination d){
		 Colis c = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				java.sql.Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/boursetansport","root","");
				PreparedStatement pr= cn.prepareStatement("INSERT INTO  destnation VALUES(NULL,?,?,?,?)");
				/*pr.setFloat(1,(float) 2.0);
				pr.setFloat(2,(float)12345);
				pr.setString(3,"vellooo" );
				pr.setString(4, "sdzfe");
				pr.setString(5,"fes");
				pr.setString(6, "audincourt");*/
				pr.setFloat(1, c.getId());
				pr.setString(2,d.getNom());
				pr.setString(3,d.getPrenom());
				pr.setInt(4,d.getNumeroTel());
				pr.setString(5,d.getAdresse());
				System.out.println(";)");
				pr.executeUpdate();
				System.out.println(";)");
			} catch (Exception e) {
				e.printStackTrace();
			}
			 // colis.add(c);
		  }
		  public void remove(Long id){
			 for (Destination d : destination) {
				if(d.getId()==id){
					destination.remove(d);
				}
			}
			  
			  }
		  
		  public ArrayList getAll(){
			  return destination ; 
		  }
}
