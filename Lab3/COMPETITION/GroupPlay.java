package Lab3.COMPETITION;

import java.util.Collections;
import java.util.LinkedList;

import Lab3.COUNTRY.Country;
import Lab3.MATCH.Match;
import Lab3.TEAM.Team;

public class GroupPlay extends Competition {
    private Integer noGroups;
    private LinkedList<League> ListLeagues;

    public GroupPlay(String name, Country country, GENDER gender) {
        super(false, name, country, gender);
    }

    public Integer getNoGroups() {
        return noGroups;
    }

    public LinkedList<League> getListLeagues() {
        return ListLeagues;
    }

    @Override
    public void generateMatches(){
        for (int i = 0; i<noGroups; i++){
            for (int a = 0; a < teamList.size(); a++) {
                Team homeTeam = teamList.get(i);
                for (int j = a + 1; j < teamList.size(); j++) {
                    Team awayTeam = teamList.get(j);
                    Match match1 = new Match(homeTeam, awayTeam);
                    matchList.add(match1);
                }
            }
        }
    }

    @Override
    public void simulateMatches() {
        for (Match match : matchList) {
            match.simulateMatch();
            Team homeTeam = match.getHomeTeam();
            Team awayTeam = match.getAwayTeam();
            homeTeam.updateStats(match);
            awayTeam.updateStats(match);
             
        }
    }

    public void printTables(){
        
    }
}
