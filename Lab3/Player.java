package Lab3;

public class Player {
    private boolean gender;
    private String name;
    private int age;
    private Country country;
    private int numMatches;
    private int numTackles;
    private int numPasses;
    private int numShots;
    private int numAssists;
    private int numGoals;

    public Player(boolean g, String name, int age, Country nac) {
        this.gender = g;
        this.name = name;
        this.age = age;
        this.country = nac;
    }

    public boolean getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Country getNacionality() {
        return country;
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
        System.out.println("______________________________________________");
        System.out.println("|PLAYER STATS");
        System.out.println("|_____________________________________________");
        System.out.println("| Nom:\t\t\t" + name);
        if (gender == false){
            System.out.println("| Genere:\t\t" + "Home");
        } else  {
            System.out.println("| Genere:\t\t" + "Dona");

        }
        System.out.println("| Edat:\t\t\t" + age);
        System.out.println("| Nacionalitat:\t\t" + country.getName());
        System.out.println("| Partits jugats:\t" + numMatches);
        System.out.println("| Entrades:\t\t" + numTackles);
        System.out.println("| Passes:\t\t" + numPasses);
        System.out.println("| Dispars:\t\t" + numShots);
        System.out.println("| Assistencies:\t\t" + numAssists);
        System.out.println("| Gols:\t\t\t" + numGoals);
        System.out.println("|_____________________________________________");
        System.out.println("");
    }
}
