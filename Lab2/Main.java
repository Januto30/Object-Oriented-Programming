package Lab2;

public class Main {
    public static void main(String[] args) {

        Country argentina = new Country("Argentina");
        Country portugal = new Country("Portugal");
        Country espanya = new Country("Espanya");


        Player player1 = new Player(0, "Leo Messi", 36, argentina);
        Player player2 = new Player(0, "Cristiano Ronaldo", 38, portugal);

        player1.update(120, 13000, 4000, 362, 819);
        player2.update(200, 7500, 4500, 289, 855);

        player1.printStats();
        player2.printStats();

        Team team = new Team("Barça", espanya, 0);
    }
}


// Coses a fer:
//  - Utilitzar el constructor enum de Java per representar el genere (gender)
//  - Fer el mètodes addPlayer i removePlayer
//  - revisar que playMatch estigui bé
//  - comprovar que printStats funciona

//  - Fer sa 'documentació' 