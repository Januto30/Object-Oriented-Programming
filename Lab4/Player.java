package Lab4;
public class Player {
    protected boolean gender;
    protected String name;
    protected int age;
    protected Country country;
    protected int numMatches;

    public Player (boolean g, String name, int age, Country nac) {
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

    public boolean equals (Object o) {
        if (this == o) {
            return true;

        }

        if (o == null || getClass() != o.getClass()) {
            return false;

        }

        Player player = (Player) o;
        return gender == player.gender && age == player.age && numMatches == player.numMatches && name.equals(player.name) && country.equals(player.country);

    }

    public void updateStats(Match match) {
        this.numMatches += 1;
        
    }

    /*                          JA NO IMPORTA
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
        // System.out.println("| Entrades:\t\t" + numTackles);
        // System.out.println("| Passes:\t\t" + numPasses);
        // System.out.println("| Dispars:\t\t" + numShots);
        // System.out.println("| Assistencies:\t\t" + numAssists);
        // System.out.println("| Gols:\t\t\t" + numGoals);
        System.out.println("|_____________________________________________");
        System.out.println("");
    }
    */
}
