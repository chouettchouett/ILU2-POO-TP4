package scenarioTest;

import personnages.Gaulois;
import vilagegauloisold.Etal;

public class Scenario {

	public static class DepenseMarchand {
		private Gaulois marchand;
		private int qteVendue;
		private double prixPaye;
		private double sommeDepensee;
		private String produit;

		public DepenseMarchand(Gaulois marchand, int qteVendue, String produit, double prixPaye, double sommeDepensee) {
			this.marchand = marchand;
			this.qteVendue = qteVendue;
			this.prixPaye = prixPaye;
			this.sommeDepensee = sommeDepensee;
			this.produit = produit;

			if (qteVendue > 1) {
				this.produit += "s";
			}
		}

		public String toString() {
			return "Achat de " + qteVendue + " " + produit + " sur l'�tal du marchand " + marchand.getNom()
					+ " pour un total de " + sommeDepensee + " sous.\n";
		}

	}

	public static void main(String[] args) {

		// TODO Partie 4 : creer de la classe anonyme Village

		// fin

		Gaulois ordralfabetix = new Gaulois("Ordralfab�tix", 9);
		Gaulois obelix = new Gaulois("Ob�lix", 20);
		Gaulois asterix = new Gaulois("Ast�rix", 6);

		Etal<Sanglier> etalSanglierObelix = new Etal<>();
		Etal<Sanglier> etalSanglierAsterix = new Etal<>();
		Etal<Poisson> etalPoisson = new Etal<>();

		Sanglier sanglier1 = new Sanglier(2000, obelix);
		Sanglier sanglier2 = new Sanglier(1500, obelix);
		Sanglier sanglier3 = new Sanglier(1000, asterix);
		Sanglier sanglier4 = new Sanglier(500, asterix);

		Sanglier[] sangliersObelix = { sanglier1, sanglier2 };
		Sanglier[] sangliersAsterix = { sanglier3, sanglier4 };

		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = { poisson1 };

		village.installerVendeur(etalSanglierAsterix, asterix, sangliersAsterix, 10);
		village.installerVendeur(etalSanglierObelix, obelix, sangliersObelix, 8);
		village.installerVendeur(etalPoisson, ordralfabetix, poissons, 5);

		System.out.println(village);

		DepenseMarchand[] depense = village.acheterProduit("sanglier", 3);

		for (int i = 0; i < depense.length && depense[i] != null; i++) {
			System.out.println(depense[i]);
		}

		System.out.println(village);

	}

}
