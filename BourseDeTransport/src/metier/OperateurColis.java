package metier;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;

public class OperateurColis {
 private  ArrayList<Colis> colis = new ArrayList<Colis>();

public ArrayList<Colis> getColis() {
	return colis;
}

public void setColis(ArrayList<Colis> colis) {
	this.colis = colis;
}
  public void add(Colis c){
	try {
		Class.forName("com.mysql.jdbc.Driver");
		java.sql.Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/boursetansport","root","");
		PreparedStatement pr= cn.prepareStatement("INSERT INTO  colis VALUES(NULL,?,?,?,?,?)");
		/*pr.setFloat(1,(float) 2.0);
		pr.setFloat(2,(float)12345);
		pr.setString(3,"vellooo" );
		pr.setString(4, "sdzfe");
		pr.setString(5,"fes");
		pr.setString(6, "audincourt");*/
		pr.setFloat(1,c.getPoid());
		pr.setFloat(2,c.getQuantite());
		pr.setString(3,c.getType());
		pr.setString(4,c.getVolume());
		pr.setString(5,c.getAddresse());
		System.out.println(";)");
		pr.executeUpdate();
		System.out.println(";)");
		pr.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	 // colis.add(c);
  }
  public void remove(Long id){
	  for (Colis c : colis) {
	  if(c.getId()==id){
		  colis.remove(c);
		  break;
	  }
	  }
  }
  public ArrayList getAll(){
	  return colis; 
  }
 
}
