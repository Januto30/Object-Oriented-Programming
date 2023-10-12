package Lab1;

public class Main {
    public static void main(String[] args) {

        Country c1 = new Country("Argentina");
        Country c2 = new Country("Portugal");
        Country c3 = new Country("Espanya");
        

        Player p1 = new Player(false, "Leo Messi", 36, c1);
        Player p2 = new Player(false, "Cristiano Ronaldo", 38, c2);
        Player p3 = new Player(true, "Alexia Putellas",29, c3);

        
        p1.update(120, 13000, 4000, 362, 819);
        p2.update(200, 7500, 4500, 289, 855);
        p3.update(14, 700, 4346, 534, 345);

        
        p1.printStats();
        p3.printStats();


        Team t1 = new Team("Barça", c3, Team.GENDER.MALE);
        Team t2 = new Team("Madrid", c3, Team.GENDER.FEMALE);

        t1.addPlayer(p1);
        t1.addPlayer(p3);


    }
}


// Coses a fer:
//  - Fer el mètodes addPlayer i removePlayer
//  - revisar que playMatch estigui bé
//  - comprovar que printStats funciona

//  - Fer sa 'documentació' 