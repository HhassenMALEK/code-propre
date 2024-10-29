package ex3;

import java.util.Objects;

/**
 * Classe qui représente le concept d'animal
 */
public class Animal {

    /** Nom */
    private String nomAnimal;

    /** Type : MAMMIFERE ... */
    private String typeAnimal;

    /** comportement alimentaire : HERBIVORE, CARNIVORE, OMNIVORE*/
    private String comportement;

    /**
     * Constructeur
     * @param nomAnimal nom
     * @param typeAnimal type
     * @param comportement comportement
     */
    public Animal(String nomAnimal, String typeAnimal, String comportement) {
        this.nomAnimal = nomAnimal;
        this.typeAnimal = typeAnimal;
        this.comportement = comportement;
    }

    /**
     * compare un objet Animal avec un autre pour vérifier leur égalité
     * @param o l'objet à comparer avec Animal
     * @return true si les deux objets sont égaux, si non false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Animal)) {
            return false;
        }
        Animal animal = (Animal) o;
        return Objects.equals(nomAnimal, animal.nomAnimal) && Objects.equals(typeAnimal, animal.typeAnimal) && Objects.equals(comportement, animal.comportement);
    }

    /**
     * génére le code de hachage pour cet objet Animal
     * @return le code de hachage basé sir les attributs de l'animal.
     */
    @Override
    public int hashCode() {
        return Objects.hash(nomAnimal, typeAnimal, comportement);
    }

    /**
     * reoutne une réprésentation sous forme de string de l'objet Animal
     * @return les information de l'animal
     */
    @Override
    public String toString() {
        return "Animal{" +
                "nomAnimal='" + nomAnimal + '\'' +
                ", typeAnimal='" + typeAnimal + '\'' +
                ", comportement='" + comportement + '\'' +
                '}';
    }

    /**
     * Getter
     *
     * @return nomAnimal
     */
    public String getNomAnimal() {
        return nomAnimal;
    }

    /**
     * Setter
     *
     * @param nomAnimal nomAnimal
     */
    public void setNomAnimal(String nomAnimal) {
        this.nomAnimal = nomAnimal;
    }

    /**
     * Getter
     *
     * @return typeAnimal
     */
    public String getTypeAnimal() {
        return typeAnimal;
    }

    /**
     * Setter
     *
     * @param typeAnimal typeAnimal
     */
    public void setTypeAnimal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    /**
     * Getter
     *
     * @return comportement
     */
    public String getComportement() {
        return comportement;
    }

    /**
     * Setter
     *
     * @param comportement comportement
     */
    public void setComportement(String comportement) {
        this.comportement = comportement;
    }
}
