package ex1;

import java.util.Date;

/**
 * Classe qui représenete le concept d'entreprise
 */
public class Entreprise {
	/** Numéro de SIRET */
	private int siret;

	/** le nom de l'entreprise*/
	private String nom;

	/** Adresse de l'entreprise */
	private String adresse;

	/** la date de création */
	private Date dateCreation;

	/** Capitale sociale de l'entreprise */
	public static final int CAPITAL_MAX = 3000000;

	/**
	 * Méthode pour affcher  le statut de l'entreprise
	 */
	public void afficherStatut(){
		System.out.println("SIRET: " +siret + ", Nom: "+ nom +",  Adresse" +adresse +", Date de création: "+dateCreation);
	}

	/**
	 * Getter
	 *
	 * @return siret
	 */
	public int getSiret() {
		return siret;
	}

	/**
	 * Setter
	 *
	 * @param siret siret
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/**
	 * Getter
	 *
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 *
	 * @param nom nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 *
	 * @return adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Setter
	 *
	 * @param adresse adresse
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * Getter
	 *
	 * @return dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * Setter
	 *
	 * @param dateCreation dateCreation
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
}
