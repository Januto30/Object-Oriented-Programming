package Lab2;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Match {
    private Team homeTeam;
    private Team awayTeam;
    private int homeGoals;
    private int awayGoals;
    private LinkedList<Player> homeScorers;
    private LinkedList<Player> awayScorers;
    
    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public int getAwayGoals() {
        return awayGoals;
    }

    public LinkedList<Player> getHomeScorers() {
        return homeScorers;
    }

    public LinkedList<Player> getAwayScorers() {
        return awayScorers;
    }

    public Match(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScorers = new LinkedList<>();
        this.awayScorers = new LinkedList<>();
    }

    public void simulateMatch() {
        Random random = new Random();
        this.homeGoals = random.nextInt(4);
        this.awayGoals = random.nextInt(4);

        List<Player> homePlayers = homeTeam.getPlayers();
        List<Player> awayPlayers = awayTeam.getPlayers();

        for (int i = 0; i < homeGoals; i++) {
            Player scorer = homePlayers.get(random.nextInt(homePlayers.size()));
            homeScorers.add(scorer);
        }

        for (int i = 0; i < awayGoals; i++) {
            Player scorer = awayPlayers.get(random.nextInt(awayPlayers.size()));
            awayScorers.add(scorer);
        }

    }

    public void printMatch() {
        System.out.println(homeTeam.getName() + " " + homeGoals + "  vs  " + awayTeam.getName() + " " +  awayGoals);
        
        if (homeGoals == 0) {
            System.out.println("");

        } else {
            System.out.println("");
            System.out.println("Golejadors de l'equip local " + homeTeam.getName() + ":");
            for (Player scorer : homeScorers) {
                System.out.println(" - " + scorer.getName());
            }

        }
        
        if (awayGoals == 0) {
            System.out.println("");

        } else {
            System.out.println("");
            System.out.println("Golejadors de l'equip visitant " + awayTeam.getName() + ":");
            for (Player scorer : awayScorers) {
                System.out.println(" - " + scorer.getName());
            }
        }
    }



    
}
