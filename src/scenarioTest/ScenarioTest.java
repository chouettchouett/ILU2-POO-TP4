package scenarioTest;

import produit.Produit;
import vilagegauloisold.Etal;
import vilagegauloisold.IEtal;

public class ScenarioTest {
	public static void main(String[] args) {
		IEtal[] etals = new IEtal[3];
		Etal<Sanglier> etalSanglier = new Etal<>();
		etals[0] = etalSanglier;
	}
	
}
