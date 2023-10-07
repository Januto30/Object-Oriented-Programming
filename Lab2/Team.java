package Lab2;

public class Team {
    private String name;
    private Country country;
    private int gender;
    private Player[] players;
    private int numMatches;
    private int numWins;
    private int numTies;
    private int numLosses;
    private int numGoalsScored;
    private int numGoalsAgainst;

    public Team(String name, Country country, int gender) {
        this.name = name;
        this.country = country;
        this.gender = gender;
        this.players = new Player[11];  // Assumim que l'equip té 11 jugadors
        this.numMatches = 0;
        this.numWins = 0;
        this.numTies = 0;
        this.numLosses = 0;
        this.numGoalsScored = 0;
        this.numGoalsAgainst = 0;
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    public int getGender() {
        return gender;
    }

    public void addPlayer(Player p) {
        // Afegir un jugador a l'equip
    }

    public void removePlayer(Player p) {
        // Eliminar un jugador de l'equip
    }

    public void playMatch(int scored, int against) {        // revisar si està bé
        numMatches++;       
        numGoalsScored += scored;
        numGoalsAgainst += against;

        if (scored > against) {
            numWins++;

        } else if (scored < against) {
            numLosses++;

        } else {
            numTies++;
        }
    }

    public void printStats() {
        System.out.println("Informació de l'equip: ");
        System.out.println("Nom equip: " + name);
        System.out.println("Pais: " + country);
        System.out.println("Genere: " + gender);
        System.out.println("Total partits jugats: " + numMatches);
        System.out.println("Total partits guanyats: " + numWins);
        System.out.println("Total psrtits empatats: " + numTies);
        System.out.println("Total partits perduts: " + numLosses);
        System.out.println("Total gols marcats: " + numGoalsScored);
        System.out.println("Total gols encajados: " + numGoalsAgainst);
    }


}
