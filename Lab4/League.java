package Lab4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

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

    public void printTable() {      // !!!!!!!!!!!!!!!!!!!

        List<TeamStats> leagueTable = new ArrayList<TeamStats>();

        for (Team team : teamList) {
            TeamStats stats = team.getStats(this);
            if (stats != null) {
                leagueTable.add(stats);

            }
        }

        Collections.sort(leagueTable, Collections.reverseOrder());

        System.out.println(" ");
        System.out.println("Classificació de: " + this.name);
        System.out.println("Equip \t\t\t    Punts\t   Jugats\t Guanyats\t Empatats\t  Perduts");

        for (TeamStats stats : leagueTable) {
            if (stats != null) {
                System.out.println(stats.getTeam() + "\t\t" + stats.getPoints() + "\t\t" + stats.getNumMatches() + "\t\t" + stats.getNumWins() + "\t\t" + stats.getNumTies() + "\t\t" + stats.getNumLosses());
            
            } else {
                System.out.println("Una estadistica de Team es null !!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            
            }
        }
    }
}

    /*
    public void printTable() {
        for (Team team : teamList) {
            TeamStats teamStats = team.getStats(this);
            if (teamStats != null) {
                stats.add(teamStats);

            } else {
                System.out.println("Una estadistica de Team es null!!!!!!!!!!!!!!!!!!!!!!!!!!!!!11");
            }
        }

        Collections.sort(stats);

        System.out.println(" ");
        System.out.println("Classificació de la lliga:");
        System.out.println("Equip \t\t\t    Punts\t   Jugats\t Guanyats\t Empatats\t  Perduts");

        for (TeamStats teamStats : stats) {
            System.out.println(teamStats.getTeam() + "\t\t" + teamStats.getPoints() + "\t\t" + teamStats.getNumMatches() + "\t\t" + teamStats.getNumWins() + "\t\t" + teamStats.getNumTies() + "\t\t" + teamStats.getNumLosses());
        
        }
    }
}
    public void printttable() {
        System.out.println(" ");
        System.out.println("Classificació de la lliga:");
        System.out.println("Equip\t\t   Jugats\t Guanyats\t Empatats\t  Perduts");

        List<TeamStats> teamStatsList = new ArrayList<>();

        for (Team team: teamList) {
            teamStatsList.add(teamList)
        }

        Collections.sort(LinkedList<Team> teamList);

        for (int i = 0; i < teamList.size(); i++) {
            TeamStats team = teamList.get(i);
            System
        }


    } 
}
*/