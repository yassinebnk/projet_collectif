package metier;

public class Colis {
	private Long id;
	private float poid;
	private float quantite;
	private String type;
	private String volume;
	private String addresse;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public float getPoid() {
		return poid;
	}
	public void setPoid(float poid) {
		this.poid = poid;
	}
	public float getQuantite() {
		return quantite;
	}
	public void setQuantite(float quantite) {
		this.quantite = quantite;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public String getAddresse() {
		return addresse;
	}
	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}

	public Colis(Long id, float poid, float quantite, String type, String volume, String addresse) {
		super();
		this.id = id;
		this.poid = poid;
		this.quantite = quantite;
		this.type = type;
		this.volume = volume;
		this.addresse = addresse;
	}
	public Colis() {
		super();
	}
	@Override
	public String toString() {
		return  id + " " + poid + " " + quantite + " " + type + " " + volume
				+ " " + addresse  ;
	}

public void afficher(){
	System.out.println(toString());
}

}
