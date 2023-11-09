package produit;

public class Poisson extends Produit {
	private String date;

	public Poisson(String date) {
		super("poisson", Unite.Kilogramme);
		this.date = date;
	}

	public String description() {
		return (nom + " peches " + date + " .\n");
	}

}