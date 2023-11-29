package Lab4;

import java.util.Collections;
import java.util.LinkedList;

public class League extends Competition {

    private LinkedList<TeamStats> stats = new LinkedList<>();

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
            TeamStats teamStats = team.getStats(this);
            if (teamStats != null) {
                stats.add(teamStats);

            } else {
                System.out.println("Una estadistica de Team es null");
            }
        }

        for (TeamStats teamStats : stats) {
            teamStats.updatePoints();

        }

        Collections.sort(stats, Collections.reverseOrder());

        System.out.println(" ");
        System.out.println("Classificació de " + this.name + ":");
        System.out.println("Equip\t\t\tPTS\t PJ\t PG\t PE\t PP\t GF\t GC\t DG");

        for (TeamStats teamStats : stats) {
            teamStats.printStats();        
        }
    }
}