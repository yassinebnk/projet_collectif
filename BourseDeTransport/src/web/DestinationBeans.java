package web;

import java.util.ArrayList;

import metier.Colis;
import metier.Destination;

public class DestinationBeans {
	  private Destination destination=new Destination();
	  private ArrayList<Destination> liste = new ArrayList<Destination>();
	public Destination getDestination() {
		return destination;
	}
	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	public ArrayList<Destination> getListe() {
		return liste;
	}
	public void setListe(ArrayList arrayList) {
		this.liste = arrayList;
	}
}
