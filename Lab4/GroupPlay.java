package Lab4;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class GroupPlay extends Competition {
    private int numGroups;
    private LinkedList<League> listLeagues;

    public GroupPlay (boolean clubs, String name, Country country, GENDER gender) {
        super(false, name, country, gender);
        this.listLeagues = new LinkedList<>();
        generateMatches();
    }

    public int getNumGroups() {
        return numGroups;
    }

    public LinkedList<League> getListLeagues() {
        return listLeagues;
    }

    @Override
    public void generateMatches() {
        LinkedList<Team> randomizedTeams = new LinkedList<>(getTeamList());
        Collections.shuffle(randomizedTeams);

        int numTeamsPerGroup = 4;

        int numGroups = getTeamList().size() / numTeamsPerGroup;
        int currentGroupIndex = 0;

        for (int i = 0; i < numGroups; i++) {
            List<Team> teamsInGroup = randomizedTeams.subList(currentGroupIndex, currentGroupIndex + numTeamsPerGroup);
            listLeagues.add(new League(this.clubs, "Grupo " + (i + 1), this.country, this.gender));
            
            for (int a = 0; a < teamsInGroup.size(); a++) {
                Team homeTeam = teamsInGroup.get(a);

                for (int j = a + 1; j < teamsInGroup.size(); j++) {
                    Team awayTeam = teamsInGroup.get(j);
                    Match match = new Match(homeTeam, awayTeam);
                    matchList.add(match);

                }
            }

            currentGroupIndex += numTeamsPerGroup;
        }
    
    }

    @Override
    public void simulateMatches() {
        for (Match match : matchList) {
            match.simulateMatch();
            
            TeamStats tsH = new TeamStats(match.getHomeTeam());
            TeamStats tsA = new TeamStats(match.getAwayTeam());
    
            tsH.updateTeamStats(match);
            tsA.updateTeamStats(match);
        }
    }
}