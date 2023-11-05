import java.util.Collections;
import java.util.LinkedList;

public class Cup extends Competition {
    private LinkedList<Team> listTeam;
    private LinkedList<Match> listMatch;

    public Cup(String name, Country country, GENDER gender) {
        super(false, name, country, gender);
    }

    public LinkedList<Team> getListTeam() {
        return listTeam;
    }

    public LinkedList<Match> getListMatch() {
        return listMatch;
    }

    @Override
    public void generateMatches() {
        int size = listTeam.size();
        Collections.shuffle(listTeam);
        listTeam.removeIf(s -> s.equals(""));

        for(int i = 0; i < size && i + 1 < size; i = i + 2 ) {
            Team team1 = teamList.get(i);
            Team team2 = teamList.get(i + 1);
            Match match1 = new Match(team1, team2);
            matchList.add(match1);

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
            
            if (match.getAwayGoals() < match.getHomeGoals()) {
                listTeam.remove(awayTeam);

            } else {
                listTeam.remove(homeTeam);
                
            }
        }
    }
    
    /*
    public void printBracket() {
        
    }
    */
}
