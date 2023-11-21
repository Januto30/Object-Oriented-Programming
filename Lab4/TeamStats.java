package Lab4;

public class TeamStats implements Comparable<TeamStats>{
    private Team team;
    private int numMatches;
    private int numWins;
    private int numTies;
    private int numLosses;
    private int numGoalsScored;
    private int numGoalsAgainst;
    private int puntos;

    public TeamStats(Team team) {
        this.team = team;
        
    }

    public void updatePuntos(){
        puntos= 3*numWins + numTies;
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

    public int getPuntos() {
        return puntos;
    }

    @Override
    public int compareTo(TeamStats ts) {
        int puntosCompare = Integer.compare(this.puntos, ts.puntos);

        if (puntosCompare == 0){
            int difGoals = Integer.compare((this.numGoalsScored-this.numGoalsAgainst),(ts.numGoalsScored-ts.numGoalsAgainst));

            if (difGoals == 0){
                int morePoints = Integer.compare(this.numGoalsScored,ts.numGoalsScored);

                if (morePoints == 0){
                    return -1;
                } else {
                    if (morePoints < 0){
                        return -1;
                    } else {
                        return +1;
                    }
                }

            } else {
                if (difGoals < 0){
                return -1;
                } else {
                return +1;
                }
            }

        } else {
            if (puntosCompare < 0){
                return -1;
            } else {
                return +1;
            }
        
        }
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
    
                if (player instanceof Goalkeeper) {
                    GoalkeeperStats goalkeeperStats = new GoalkeeperStats((Goalkeeper) player);
                    goalkeeperStats.updateStats(match);
                } else if (player instanceof Outfielder) {
                    OutfielderStats fieldPlayerStats = new OutfielderStats((Outfielder) player);
                    fieldPlayerStats.updateStats(match);
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

            for (Player s : team.getPlayers()) {
                int goalsScored = 0;
    
                for (Player scorer : match.getAwayScorers()) {
                    if (scorer == s) {
                        goalsScored++;
                    }
                }
    
                if (s instanceof Goalkeeper) {
                    GoalkeeperStats goalkeeperStats = new GoalkeeperStats((Goalkeeper) s);
                    goalkeeperStats.updateStats(match);
                } else if (s instanceof Outfielder) {
                    OutfielderStats fieldPlayerStats = new OutfielderStats((Outfielder) s);
                    fieldPlayerStats.updateStats(match);
                }
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