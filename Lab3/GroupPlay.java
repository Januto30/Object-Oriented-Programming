import java.util.LinkedList;

public class GroupPlay extends Competition {
    private int numGroups;
    private LinkedList<League> ListLeagues;

    public GroupPlay (boolean clubs, String name, Country country, GENDER gender) {
        super(false, name, country, gender);
    }

    public int getNumGroups() {
        return numGroups;
    }

    public LinkedList<League> getListLeagues() {
        return ListLeagues;
    }

    @Override
    public void generateMatches() {

        for (int i = 0; i < numGroups; i++) {

            for (int a = 0; a < teamList.size(); a++) {
                Team homeTeam = teamList.get(i);

                for (int j = a + 1; j < teamList.size(); j++) {
                    Team awayTeam = teamList.get(j);
                    Match match = new Match(homeTeam, awayTeam);
                    matchList.add(match);

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

    /*
    public void printTables() {
        
    }
    */
}
