package tn.esprit.gestionzoo.entities ;
public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
   private  int nbrCages;

    public Zoo(String name, String city, int nbrCages) {

        setName(name);
        this.city = city;
        setNbrCages(nbrCages);
        animals = new Animal[this.nbrCages];
    }
    public String getName() {
        return name;
    }


    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Erreur : Le nom du zoo ne doit pas être vide.");
        }
        this.name = name;
    }


    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        this.city = city;
    }


    public int getNbrCages() {
        return nbrCages;
    }


    public void setNbrCages(int nbrCages) {
        if (nbrCages > 25) {
            System.out.println("Erreur : le nombre de cages est limité à 25.");
            this.nbrCages = 25; // Limite à 25 cages
        } else {
            this.nbrCages = nbrCages;
        }
    }
    public Animal[] getAnimals() {
        return animals;
    }



    public boolean addAnimal(Animal animal) {


        if (isZooFull()) {
            System.out.println("Erreur : le zoo est plein. Impossible d'ajouter un nouvel animal.");
            return false;
        }

        if (searchAnimal(animal) != -1) {
            System.out.println("Erreur : l'animal existe déjà.");
            return false;
        }


        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                System.out.println(animal.getName() + " a été ajouté dans la cage " + (i + 1));
                return true;
            }
        }
        return false;
    }


    public void displayZooInfo() {
        System.out.println("Zoo: " + name + ", City: " + city + ", Nombre de cages: " + nbrCages);
    }


    public void displayAnimals() {
        System.out.println("Liste des animaux dans le zoo:");
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] != null) {
                System.out.println("Cage " + (i + 1) + ": " + animals[i].getName());
            } else {
               System.out.println("Cage " + (i + 1) + ": Vide");
            }
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrCages; i++) {

            if (animals[i] != null && animals[i].getName().equalsIgnoreCase(animal.getName())) {
                return i;
            }
        }
        return -1;
    }
   public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] != null && animals[i].getName().equalsIgnoreCase(animal.getName())) {
                animals[i] = null;
                System.out.println(animal.getName() + " a été supprimé de la cage " + (i + 1));
                return true;
            }

        }
        System.out.println("Erreur : l'animal " + animal.getName() + " n'existe pas dans le zoo.");
        return false;
    }
    public int countOccupiedCages() {
        int occupiedCages = 0;
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] != null) {
                occupiedCages++;
            }
        }
        return occupiedCages;
    }

    public boolean isZooFull() {
        return countOccupiedCages() >= nbrCages;
    }
    public Zoo comparerZoo(Zoo z1, Zoo z2) {
        int Z1 = z1.countOccupiedCages();
        int Z2 = z2.countOccupiedCages();

        if (Z1 > Z2) {
            return z1;
        } else if (Z2 > Z1) {
            return z2;
        } else {
            return null;
        }
    }


}



