package Lab4;

import java.util.Collections;
import java.util.LinkedList;

public class League extends Competition {

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

    public void pritTable() {              // Crec que no ha de ser així sa forma de llistar, s'ha d'utilitzar comprateTo()
        System.out.println(" ");
        System.out.println("Classificació de la lliga:");
        System.out.println("Equip\t\t   Jugats\t Guanyats\t Empatats\t  Perduts");

        // Ordenar la llista d'equips segons el número de partitss guanyats de forma descendent usant l'algoritme d'ordenació' de bombolla
        for (int i = 0; i < teamList.size() - 1; i++) {

            for (int j = 0; j < teamList.size() - i - 1; j++) {
                TeamStats teamStats1 = new TeamStats(teamList.get(j));
                TeamStats teamStats2 = new TeamStats(teamList.get(j+1));

                // Assuming TeamStats has a method getNumWins
                if (teamStats1.getNumWins() < teamStats2.getNumWins()) {
                    Team temp = teamList.get(j);
                    teamList.set(j, teamList.get(j + 1));
                    teamList.set(j + 1, temp);
                }
            }
        }

        for (Team team : teamList) {
            TeamStats teamStats = new TeamStats(team);
            System.out.println(team.getName() + "\t\t" + teamStats.getNumMatches() + "\t\t" +
                    teamStats.getNumWins() + "\t\t" + teamStats.getNumTies() + "\t\t" +
                    teamStats.getNumLosses());
        }
    }

    public void printTable() {
        System.out.println(" ");
        System.out.println("Classificació de la lliga:");
        System.out.println("Equip\t\t   Jugats\t Guanyats\t Empatats\t  Perduts");

        List<TeamStats> teamStatsList = new ArrayList<>();

        for (Team team: teamList) {
            teamStatsList.add(teamList.)
        }

        Collections.sort(LinkedList<Team> teamList);

        for (int i = 0; i < teamList.size(); i++) {
            TeamStats team = teamList.get(i);
            System
        }


    } 
}