import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        ZooManagment zooManagment =new ZooManagment();
        zooManagment.manageZoo();
        Zoo zoo = new Zoo("zoo", "Tunis", zooManagment.nbrCages);
        Animal lion = new Animal("Carnivore", "Lion", 20, true);
        Animal tigre = new Animal("Carnivore", "tigre", 20, true);
        Animal chat = new Animal("Carnivore", "chat", 20, true);
        zoo.displayZooInfo();
        zoo.displayAnimals();
        zoo.addAnimal(lion);
        zoo.addAnimal(tigre);
        zoo.addAnimal(chat);
        zoo.displayAnimals();
        zoo.removeAnimal(chat);
        Zoo zoo1 = new Zoo("z1", "Tunis", 5);
        Zoo zoo2 = new Zoo("z2", "Tunis", 4);
        zoo1.addAnimal(new Animal("Carnivore", "Lion", 20, true));
        zoo1.addAnimal(new Animal("Carnivore", "Tigre", 22, true));


        zoo2.addAnimal(new Animal("Carnivore", "Chat", 5, true));

        Zoo largerZoo = zoo1.comparerZoo(zoo1, zoo2);


        if (largerZoo != null) {
            System.out.println("Le zoo avec le plus d'animaux est: " + largerZoo);
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
        }

    }
        /*int index = zoo.searchAnimal(tigre);
        if (index != -1) {
          System.out.println("l'animal existe  dans la cage " + index);
        } else {
            System.out.println("Animal non trouvee");
       }*/

}
