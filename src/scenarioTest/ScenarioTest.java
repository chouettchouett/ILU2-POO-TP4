package scenarioTest;

import produit.Poisson;
import produit.Produit;
import produit.Sanglier;
import villagegaulois.Etal;
import villagegaulois.IEtal;

public class ScenarioTest {
	public static void main(String[] args) {
		IEtal<Produit>[] marche = new IEtal[3];
		IEtal<Sanglier> etalS = new Etal<>();
		IEtal<Poisson> etalP = new Etal<>();
		marche[0] = etalS;
		marche[1] = etalP;
				
	}
	
}
