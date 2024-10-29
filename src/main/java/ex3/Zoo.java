package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe qui représente un zoo avec sa liste d'animaux et son nom
 */
public class Zoo {
	/** Nom du zoo */
	private String nom;

	/** Liste des animaux du Zoo */
	private List<Animal> listeAnimaux = new ArrayList<>();

	/**
	 * Contructeur de la calsse Zoo
	 * @param nom nom du Zoo
	 */
	public Zoo(String nom){
		this.nom = nom;
	}

	/**
	 * Ajouter un animale a la liste des animaux du zoo
	 * @param animal l'animal à ajouter
	 */
	public void addAnimal(Animal animal){
		listeAnimaux.add(animal);
	}

	/**
	 * Afficher la liste des animaux du zoo
	 */
	public void afficherListeAnimaux(){
		for (int i=0; i<listeAnimaux.size(); i++) {
			System.out.println(listeAnimaux.get(i));
		}
	}

	/**
	 * Retourne la taille de la liste des animaux du zoo
	 * @return le nombre des animaux dans le zoo
	 */
	public int taille() {
		return listeAnimaux.size();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
