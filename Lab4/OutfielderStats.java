package Lab4;

import java.util.Random;

public class OutfielderStats extends PlayerStats {
    private int numTackles;
    private int numPasses;
    private int numShots;
    private int numAssists;
    private int numGoals;

    public OutfielderStats (Player p) {
        super(p);
        this.numTackles = 0;
        this.numPasses = 0;
        this.numShots = 0;
        this.numAssists = 0;
        this.numGoals = 0;

    }

    public int getNumTackles() {
        return numTackles;
    }

    public int getNumPasses() {
        return numPasses;
    }

    public int getNumShots() {
        return numShots;
    }

    public int getNumAssists() {
        return numAssists;
    }

    public int getNumGoals() {
        return numGoals;
    }


    @Override
    public void updateStats(Match match) {
        Random random = new Random();
        int goalsScored = 0;

        this.numTackles += random.nextInt(10);
        this.numPasses += random.nextInt(60);

        this.numAssists += random.nextInt(2);

        for (Player player : match.getHomeTeam().getPlayers()) {
            if (player.getName().equals(this.player.getName()) && match.getHomeScorers().contains(player)) {
                goalsScored++;

            }
        }

        for (Player player : match.getAwayTeam().getPlayers()) {
            if (player.getName().equals(this.player.getName()) && match.getAwayScorers().contains(player)) {
                goalsScored++;

            }
        }

        this.numGoals += goalsScored;
        this.numShots = numShots + goalsScored + random.nextInt(3);

        super.updateStats(match);
    }

    @Override
    public void printStats() {

        System.out.println("______________________________________________");
        System.out.println("|PLAYER STATS");
        System.out.println("|_____________________________________________");
        System.out.println("| Nom:\t\t\t" + player.name);

        if (player.gender == false) {
            System.out.println("| Genere:\t\t" + "Home");
        } else  {
            System.out.println("| Genere:\t\t" + "Dona");

        }

        System.out.println("| Edat:\t\t\t" + player.age);
        System.out.println("| Nacionalitat:\t\t" + player.country.getName());
        System.out.println("| Partits jugats:\t" + (numMatches-1));
        System.out.println("| Entrades:\t\t" + getNumTackles());
        System.out.println("| Passes:\t\t" + getNumPasses());
        System.out.println("| Dispars:\t\t" + getNumShots());
        System.out.println("| Assistencies:\t\t" + getNumAssists());
        System.out.println("| Gols:\t\t\t" + (getNumGoals()-1));
        System.out.println("|_____________________________________________");
        System.out.println("");
        
    }

    @Override
    public int compareTo(PlayerStats ps) {
        if (ps instanceof OutfielderStats) {
            OutfielderStats os = (OutfielderStats) ps;
            int goalsCompare = Integer.compare(this.getNumGoals(), os.getNumGoals());

            if (goalsCompare < 0) {
                return -1;

            } else if (goalsCompare > 0) {
                return 1;

            } else {
                return getPlayer().getName().compareTo(os.getPlayer().getName());

            }
        }
        return 0;
    }
}
