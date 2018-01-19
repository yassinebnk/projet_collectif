package web;

import java.util.ArrayList;
import java.util.Vector;

import metier.Colis;

public class ColisBeans {

	  private Colis colis=new Colis();
	  private ArrayList<Colis> liste = new ArrayList<Colis>();
	public Colis getColis() {
		return colis;
	}
	public void setColis(Colis colis) {
		this.colis = colis;
	}
	public ArrayList<Colis> getListe() {
		return liste;
	}
	public void setListe(ArrayList arrayList) {
		this.liste = arrayList;
	}
	  
}
