package Lab1;

public class Main {
    public static void main(String[] args) {

        Country c1 = new Country("Argentina");
        Country c2 = new Country("Portugal");
        Country c3 = new Country("Espanya");
        Country c4 = new Country("EUUA");
        

        Player p1 = new Player(false, "Leo Messi", 36, c1);
        Player p2 = new Player(false, "Cristiano Ronaldo", 38, c2);
        Player p3 = new Player(true, "Alexia Putellas",29, c3);
        Player p4 = new Player(false, "Julian Alvarez", 23, c2);
        Player p5 = new Player(false, "Leandro Paredes", 29, c2);
        Player p6 = new Player(false, "Rodrigo de Paul", 29, c2);
        Player p7 = new Player(false, "Angel di María", 35, c2);
        Player p8 = new Player(true, "Alex Morgan",34, c4);
        Player p9 = new Player(true, "Megan Rapionoe", 38, c4);
        Player p10 = new Player(true, "Sam Kerr", 30, c4);



        
        p1.update(120, 13000, 4000, 362, 819);
        p2.update(200, 7500, 4500, 289, 855);
        p3.update(14, 700, 4346, 534, 345);

        
        p1.printStats();
        p3.printStats();


        Team t1 = new Team("Barça", c3, Team.GENDER.MALE);
        Team t2 = new Team("Madrid", c3, Team.GENDER.FEMALE);
        Team t3 = new Team("Boca Júniors", c1, Team.GENDER.MALE);
        Team t4 = new Team("RiverPlade", c1, Team.GENDER.FEMALE);
        Team t5 = new Team("Racing", c1, Team.GENDER.MIXED);

        System.out.println("__________BARÇA________________________________________");
        t1.addPlayer(p1);
        t1.addPlayer(p2);

        System.out.println("__________MADRID________________________________________");
        t2.addPlayer(p3);

        System.out.println("__________BOCA JÚNIORS__________________________________");
        t3.addPlayer(p3);
        t3.addPlayer(p4);
        t3.addPlayer(p5);
        t3.addPlayer(p6);
        t3.addPlayer(p7);

        System.out.println("__________RIVER PLADE___________________________________");
        t4.addPlayer(p7);
        t4.addPlayer(p8);
        t4.addPlayer(p9);
        t4.addPlayer(p10);
        t4.addPlayer(p6);
        
        System.out.println("__________RACING________________________________________");
        t5.addPlayer(p1);
        t5.addPlayer(p2);
        t5.addPlayer(p3);
        t5.addPlayer(p4);
        t5.addPlayer(p5);
        t5.addPlayer(p6);
        t5.addPlayer(p7);
        t5.addPlayer(p8);
        t5.addPlayer(p9);
        t5.addPlayer(p10);

        t4.removePlayer(p10);

        t3.printTeam();
        t4.printTeam();
        t5.printTeam();

        System.out.println("__________PAISOS________________________________________");
        System.out.println("A Argentina hi ha 3 equips: " + t3.getName() +", "+ t4.getName() +", "+ t5.getName()+".");
        System.out.println("A Espanya hi ha 2 equips: " + t1.getName() +", "+ t2.getName()+".");

    }
}