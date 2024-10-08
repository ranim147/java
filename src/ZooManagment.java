import java.util.Scanner;
public class ZooManagment {
    int nbrCages;
    String zooName;



    public void manageZoo() {
        Scanner scanner = new Scanner(System.in);

        // Lire le nom du zoo
        System.out.println("Veuillez entrer le nom du zoo :");
        zooName = scanner.nextLine();

        // Initialisation du nombre de cages
        boolean validInput = false;

        while (!validInput) {
            System.out.println("Veuillez entrer le nombre de cages :");

            if (scanner.hasNextInt()) {
                nbrCages = scanner.nextInt();  // Lire l'entier

                // Vérifier si l'entier est positif
                if (nbrCages > 0) {
                    validInput = true;  // Sortir de la boucle si c'est valide
                } else {
                    System.out.println("Erreur : Le nombre doit être positif.");
                }
            } else {
                System.out.println("Erreur : Veuillez entrer un nombre entier valide.");
                scanner.next();  // Consommer l'entrée incorrecte
            }
        }

        // Afficher les informations du zoo
        System.out.println(zooName + " comporte " + nbrCages + " cages.");
    }
}
