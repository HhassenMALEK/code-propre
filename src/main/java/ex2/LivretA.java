package ex2;

public class LivretA extends CompteBancaire {
	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;


	public LivretA(String type, double solde, double tauxRemuneration) {

		super("LA", solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}

	public void appliquerRemuAnnuelle(){
			this.solde = solde + solde*tauxRemuneration/100;
	}

}
