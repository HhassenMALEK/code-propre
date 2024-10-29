package ex3;

/**
 * La classe {@code ZooApplication} est le point d'entrée de l'application du zoo.
 *
 * <p>Elle crée un zoo et y ajoute des animaux.</p>
 */

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new Animal("Gazelle", "MAMMIFERE", "HERBIVORE"));
		zoo.addAnimal(new Animal("Zèbre", "MAMIFERE", "HERBIVORE"));
		zoo.addAnimal(new Animal("Lion", "MAMMIFERE", "HERBIVORE"));
		zoo.addAnimal(new Animal("Panthère", "MAMMIFERE", "CARNIVORE"));
		zoo.addAnimal(new Animal("Requin blanc", "POISSON", "HERBIVORE"));
		zoo.addAnimal(new Animal("Truite dorée", "POISSON", "HERBIVORE"));
		zoo.addAnimal(new Animal("Boa constrictor", "SERPENT", "CARNIVORE"));
		zoo.addAnimal(new Animal("Python", "SERPENT", "CARNIVORE"));

		zoo.afficherListeAnimaux();
	}
}