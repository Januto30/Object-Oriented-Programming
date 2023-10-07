package Lab2;

public class Player {
    private int gender;
    private String name;
    private int age;
    private Country nacionality;
    private int numMatches;
    private int numTackles;
    private int numPasses;
    private int numShots;
    private int numAssists;
    private int numGoals;

    public Player(int gender, String name, int age, Country nac) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.nacionality = nac;
        this.numMatches = 0;
        this.numTackles = 0;
        this.numPasses = 0;
        this.numShots = 0;
        this.numAssists = 0;
        this.numGoals = 0;
    }

    public int getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Country getNacionality() {
        return nacionality;
    }

    public void update(int tackles, int passes, int shots, int assists, int goals) {
        numMatches += 1;
        numTackles += tackles;
        numPasses += passes;
        numShots += shots;
        numAssists += assists;
        numGoals += goals;
    }

    public void printStats() {
        System.out.println("PLAYER STATS: ");
        System.out.println("Nom: " + name);
        System.out.println("Genere: " + gender);
        System.out.println("Edat: " + age);
        System.out.println("Nacionalitat: " + nacionality);
        System.out.println("Total de partits jugats: " + numMatches);
        System.out.println("Total entrades: " + numTackles);
        System.out.println("Total passes: " + numPasses);
        System.out.println("Total dispars: " + numShots);
        System.out.println("Total assistencies: " + numAssists);
        System.out.println("Total gols: " + numGoals);
    }

}
