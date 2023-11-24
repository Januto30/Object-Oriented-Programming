package Lab4;
import java.util.LinkedList;
import java.util.Collections;
import java.util.HashMap;

public class League extends Competition {
    private LinkedList<TeamStats> stats = new LinkedList<TeamStats>();
    

    public League (boolean clubs, String name, Country country, GENDER gender) {
        super(false, name, country, gender);
    }

    @Override
    public void generateMatches() {
        for (int i = 0; i < teamList.size(); i++) {
            Team homeTeam = teamList.get(i);
            
            for (int j = i + 1; j < teamList.size(); j++) {
                Team awayTeam = teamList.get(j);
                Match match1 = new Match(homeTeam, awayTeam);
                Match match2 = new Match(awayTeam, homeTeam);
                matchList.add(match1);
                matchList.add(match2);

            }
        }
    }

    public void printTable() {
        for (Team team : teamList) {
            TeamStats teamStats = team.getStats(this); // Assuming this is the current competition
            stats.add(teamStats);
        }
    
        Collections.sort(stats);
    
        System.out.printf("%-20s%-10s%-10s%-10s%-10s%n", "Team", "Played", "Won", "Drawn", "Lost");
    
        for (TeamStats teamStats : stats) {
            System.out.printf("%-20s%-10d%-10d%-10d%-10d%n",
                    teamStats.getTeam().getName(),
                    teamStats.getNumMatches(),
                    teamStats.getNumWins(),
                    teamStats.getNumTies(),
                    teamStats.getNumLosses());
        }
    }
    
}