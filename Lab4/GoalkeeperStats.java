package Lab4;

import java.util.Random;

public class GoalkeeperStats extends PlayerStats {
    private int numSaves;
    private int numGoalsLet;

    public GoalkeeperStats (Player p) {
        super(p);
        this.numSaves = 0;
        this.numGoalsLet = 0;

    }

    public int getNumSaves() {
        return numSaves;
    }

    public int getNumGoalsLet() {
        return numGoalsLet;
    }

    @Override
    public void updateStats(Match match) {
        Random random = new Random();

        for (Player player : match.getHomeTeam().getPlayers()) {
            if (player.getName().equals(this.player.getName())) {
                this.numSaves += random.nextInt(5);
                this.numGoalsLet += match.getAwayGoals();

            }
        }

        for (Player player : match.getAwayTeam().getPlayers()) {
            if (player.getName().equals(this.player.getName())) {
                this.numSaves += random.nextInt(5);
                this.numGoalsLet += match.getHomeGoals();
                
            }
        }
        
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
        System.out.println("| Partits jugats:\t" + numMatches);
        System.out.println("| Parades:\t\t" + getNumSaves());
        System.out.println("| Gols encaixats:\t" + getNumGoalsLet());
        System.out.println("|_____________________________________________");
        System.out.println("");
        
    }

    @Override
    public int compareTo(PlayerStats ps) {
        if (ps instanceof GoalkeeperStats) {
            GoalkeeperStats gs = (GoalkeeperStats) ps;
            int goalsLetCompare = Integer.compare(gs.numGoalsLet, this.numGoalsLet);

            if (goalsLetCompare != 0) {
                return goalsLetCompare;

            }

            int savesCompare = Integer.compare(this.numSaves, gs.numSaves);
            
            return savesCompare;

        }
        
        return 0;
    }  
}
