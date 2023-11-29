package Lab4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Cup extends Competition {
    private LinkedList<ArrayList<Team>> teamsRounds;
    private LinkedList<ArrayList<CupMatch>> matchRounds;

    public Cup (boolean clubs, String name, Country country, GENDER gender) {
        super(false, name, country, gender);
        teamsRounds = new LinkedList<>();
        matchRounds = new LinkedList<>();
    }

    public LinkedList<ArrayList<Team>> getTeamRounds() {
        return teamsRounds;
    }

    public LinkedList<ArrayList<CupMatch>> getMatchRounds() {
        return matchRounds;
    }

    @Override
    public void generateMatches() {
        List<Team> shuffleList = new ArrayList<>(teamList);
        Collections.shuffle(shuffleList);

        teamsRounds.add(new ArrayList<>(shuffleList));
    }

    @Override
    public void simulateMatches() {
        ArrayList<Team> nextRoundTeams = new ArrayList<>();
        List<ArrayList<Team>> teamsToRemove = new ArrayList<>();

        for (ArrayList<Team> roundTeams : teamsRounds) {
            ArrayList<CupMatch> matches = new ArrayList<>();

            for (int i = 0; i < roundTeams.size(); i = i + 2) {
                if (i != roundTeams.size() - 1) {
                    CupMatch match = new CupMatch(roundTeams.get(i), roundTeams.get(i + 1));
                    matches.add(match);

                } else {
                    nextRoundTeams.add(roundTeams.get(i));

                }
            }

            matchRounds.add(matches);

            for (CupMatch match : matches) {
                match.simulateMatch();
                Team winner = (match.getAwayGoals() < match.getHomeGoals()) ? match.getAwayTeam() : match.getAwayTeam();
                nextRoundTeams.add(winner);

            }

            teamsToRemove.add(roundTeams);
        }

        teamsRounds.removeAll(teamsToRemove);

        if(!nextRoundTeams.isEmpty()) {
            teamsRounds.add(new ArrayList<>(nextRoundTeams));

        } else {
            System.out.println("La final està buida.");

        }
    }
}
