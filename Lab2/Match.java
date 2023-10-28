package Lab2;

import java.util.LinkedList;

public class Match {
    private Team homeTeam;
    private Team awayTeam;
    private int homeGoals;
    private int awayGoals;
    private LinkedList<Player> homeScores;
    private LinkedList<Player> awayScores;
    
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
    public LinkedList<Player> getHomseScores() {
        return homeScores;
    }
    public LinkedList<Player> getAwayScores() {
        return awayScores;
    }
    public Match(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public void simulateMatch(){

    }



    
}
