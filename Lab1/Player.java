package Lab1;

public class Player {
    public enum GENDER {MALE, FEMALE, MIXED};
    private GENDER gender;
    private String name;
    private int age;
    private Country nacionality;
    private int numMatches;
    private int numTackles;
    private int numPasses;
    private int numShots;
    private int numAssists;
    private int numGoals;

    public Player(GENDER g, String name, int age, Country nac) {
        this.gender = g;
        this.name = name;
        this.age = age;
        this.nacionality = nac;
    }

    public GENDER getGender() {
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
        this.numMatches += 1;
        this.numTackles += tackles;
        this.numPasses += passes;
        this.numShots += shots;
        this.numAssists += assists;
        this.numGoals += goals;
    }

    public void printStats() {
        System.out.println("PLAYER STATS: ");
        System.out.println("Nom: " + name);
        System.out.println("Genere: " + gender);
        System.out.println("Edat: " + age + " anys");
        System.out.println("Nacionalitat: " + nacionality.getName());
        System.out.println("Total de partits jugats: " + numMatches);
        System.out.println("Total entrades: " + numTackles);
        System.out.println("Total passes: " + numPasses);
        System.out.println("Total dispars: " + numShots);
        System.out.println("Total assistencies: " + numAssists);
        System.out.println("Total gols: " + numGoals);
        System.out.println("------------------------------------");
        System.out.println("");
    }

}
