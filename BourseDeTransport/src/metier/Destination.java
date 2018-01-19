package metier;

public class Destination {
  private Long id;
  private String nom;
  private String prenom;
  private int numeroTel;
  private String adresse;
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public int getNumeroTel() {
	return numeroTel;
}
public void setNumeroTel(int numeroTel) {
	this.numeroTel = numeroTel;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public Destination( Long id,String nom, String prenom, int numeroTel, String adresse) {
	super();
	this.id=id;
	this.nom = nom;
	this.prenom = prenom;
	this.numeroTel = numeroTel;
	this.adresse = adresse;
}
public Destination() {
	super();
	
}
@Override
public String toString() {
	return id +" "+ nom + " " + prenom + " " + numeroTel + " " + adresse ;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
  
}
