package Lab4;

public class TeamStats implements Comparable<TeamStats> {
    private Team team;
    private int numMatches;
    private int numWins;
    private int numTies;
    private int numLosses;
    private int numGoalsScored;
    private int numGoalsAgainst;
    private int points;

    public TeamStats(Team team) {
        this.team = team;
        this.numMatches = 0;
        this.numWins = 0;
        this.numTies = 0;
        this.numLosses = 0;
        this.numGoalsScored = 0;
        this.numGoalsAgainst = 0;
        this.points = 0;
        
    }

    public void updatePoints() {
        points = 3 * numWins + numTies;
    }

    public Team getTeam() {
        return team;
    }

    public int getNumMatches() {
        return numMatches;
    }

    public int getNumWins() {
        return numWins;
    }

    public int getNumTies() {
        return numTies;
    }

    public int getNumLosses() {
        return numLosses;
    }

    public int getNumGoalsScored() {
        return numGoalsScored;
    }

    public int getNumGoalsAgainst() {
        return numGoalsAgainst;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public int compareTo(TeamStats ts) {
        int pointsCompare = Integer.compare(this.getPoints(), ts.getPoints());

        if (pointsCompare != 0) {
            if (pointsCompare < 0) {
                return -1;

            } else return 1;
        }

        int difGoalsCompare = Integer.compare(this.getNumGoalsScored() - this.getNumGoalsAgainst(), ts.getNumGoalsScored() - ts.getNumGoalsAgainst());

        if (difGoalsCompare != 0) {
            if (difGoalsCompare < 0) {
                return -1;

            } else return 1;
        }

        int goalsCompare = Integer.compare(this.getNumGoalsScored(), ts.getNumGoalsScored());

        if (goalsCompare < 0) {
            return -1;

        } else return 1;
    }

    public void updateTeamStats(Match match) {
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
    
                if (player instanceof Goalkeeper) {
                    GoalkeeperStats goalkeeperStats = new GoalkeeperStats((Goalkeeper) player);
                    goalkeeperStats.updateStats(match);

                } else if (player instanceof Outfielder) {
                    OutfielderStats outfieldPlayerStats = new OutfielderStats((Outfielder) player);
                    outfieldPlayerStats.updateStats(match);

                }
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
    
                if (player instanceof Goalkeeper) {
                    GoalkeeperStats goalkeeperStats = new GoalkeeperStats((Goalkeeper) player);
                    goalkeeperStats.updateStats(match);

                } else if (player instanceof Outfielder) {
                    OutfielderStats outfieldPlayerStats = new OutfielderStats((Outfielder) player);
                    outfieldPlayerStats.updateStats(match);

                }
            }
        }
    }
    
    public void printStats() {
        System.out.println(getTeam().getName() + "\t\t " + getPoints() + "\t " + getNumMatches() + "\t  " + getNumWins() + "\t  " + getNumTies() + "\t  " + getNumLosses() + "\t " + getNumGoalsScored() + "\t " + getNumGoalsAgainst() + "\t " + (getNumGoalsScored() - getNumGoalsAgainst()));
    
    }

}