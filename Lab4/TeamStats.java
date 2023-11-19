package Lab4;

public class TeamStats {
    private Team team;
    private int numMatches;
    private int numWins;
    private int numTies;
    private int numLosses;
    private int numGoalsScored;
    private int numGoalsAgainst;
    

    public TeamStats(int numMatches, int numWins, int numTies, int numLosses, int numGoalsScored, int numGoalsAgainst) {
        this.numMatches = numMatches;
        this.numWins = numWins;
        this.numTies = numTies;
        this.numLosses = numLosses;
        this.numGoalsScored = numGoalsScored;
        this.numGoalsAgainst = numGoalsAgainst;
    }

    public void updateStats(Match match) {
        this.numMatches++;
        if (match.getHomeTeam() == this.team){
            this.numGoalsScored += match.getHomeGoals();
            this.numGoalsAgainst += match.getAwayGoals();

            if (match.getHomeGoals() > match.getAwayGoals()) {
                this.numWins++;

            } else if (match.getHomeGoals() < match.getAwayGoals()) {
                this.numLosses++;

            } else {
                this.numTies++;

            }

            for (Player player : team.getPlayers()) {
                int goalsScored = 0;

                for (Player scorer : match.getHomeScorers()) {
                    if (scorer == player) {
                        goalsScored++;

                    }
                } 
                player.updateStats(match); 
            }

        } else if (match.getAwayTeam() == this.team) {
            this.numGoalsScored += match.getAwayGoals();
            this.numGoalsAgainst += match.getHomeGoals();

            if (match.getAwayGoals() > match.getHomeGoals()) {
                this.numWins++;

            } else if (match.getAwayGoals() < match.getHomeGoals()) {
                this.numLosses++;

            } else {
                this.numTies++;

            }

            for (Player player : team.getPlayers()) {
                int goalsScored = 0;
                
                for (Player scorer : match.getAwayScorers()) {
                    if (scorer == player) {
                        goalsScored++;

                    }
                }
                player.updateStats(match); 
            }
        }
    }

    public void printStats() {
        System.out.println("Estadístiques de l'equip " + team.getName() + ":");
        System.out.println("Partits jugats: " + numMatches);
        System.out.println("Partits guanyats: " + numWins);
        System.out.println("Partits empatats: " + numTies);
        System.out.println("Partits perduts: " + numLosses);
        System.out.println("Gols a favor: " + numGoalsScored);
        System.out.println("Gols en contra: " + numGoalsAgainst);
    }

}

