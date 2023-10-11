package Lab1;

public class Main {
    public static void main(String[] args) {

        Country c1 = new Country("Argentina");
        Country c2 = new Country("Portugal");
        Country c3 = new Country("Espanya");


        Player p1 = new Player(0, "Leo Messi", 36, c1);
        Player p2 = new Player(0, "Cristiano Ronaldo", 38, c2);

        
        p1.update(120, 13000, 4000, 362, 819);
        p2.update(200, 7500, 4500, 289, 855);

        p1.printStats();
        p2.printStats();

        Team team = new Team("Barça", c3, 0);
    }
}


// Coses a fer:
//  - Utilitzar el constructor enum de Java per representar el genere (gender)
//  - Fer el mètodes addPlayer i removePlayer
//  - revisar que playMatch estigui bé
//  - comprovar que printStats funciona

//  - Fer sa 'documentació' 