import java.util.Collections;
import java.util.LinkedList;

public class Cup extends Competition {
    private LinkedList<Team> listTeam;
    private LinkedList<CupMatch> listMatch;
    private LinkedList<LinkedList<Team>> teamRounds;
    private LinkedList<LinkedList<CupMatch>> matchRounds;

    public Cup (boolean clubs, String name, Country country, GENDER gender) {
        super(false, name, country, gender);
        listTeam = new LinkedList<>(getTeamList());
        listMatch = new LinkedList<>();
        teamRounds = new LinkedList<>();
        matchRounds = new LinkedList<>();

        generateMatches();
    }

    public LinkedList<Team> getListTeam() {
        return listTeam;
    }

    public LinkedList<CupMatch> getListMatch() {
        return listMatch;
    }

    public LinkedList<LinkedList<Team>> getTeamRounds() {
        return teamRounds;
    }

    public LinkedList<LinkedList<CupMatch>> getMatchRounds() {
        return matchRounds;
    }

    @Override
    public void generateMatches() {
        int size = listTeam.size();
        Collections.shuffle(listTeam);
        listTeam.removeIf(team -> team == null);

        for (int i = 0; i < size && i + 1 < size; i = i + 2 ) {
            Team team1 = listTeam.get(i);
            Team team2 = listTeam.get(i + 1);
            CupMatch cupMatch = new CupMatch(team1, team2);
            listMatch.add(cupMatch);
        }
    }

    /*
    @Override                               // NO FUNCIONA, s'ha d'utilitzar el mètode simulateMatch() de CupMatch
    public void simulateMatches() {
        LinkedList<CupMatch> roundMatches = new LinkedList<>(listMatch);

        while (roundMatches.size() > 1) {
            LinkedList<CupMatch> nextRoundMatches = new LinkedList<>();

            for (int i = 0; i < roundMatches.size(); i = i + 2) {
                CupMatch match1 = roundMatches.get(i);
                CupMatch match2 = roundMatches.get(i + 1);
                CupMatch nextRoundMatch = new CupMatch ((match1.getHomeGoals() > match1.getAwayGoals()) ? match1.getHomeTeam() : match1.getAwayTeam(), (match2.getHomeGoals() > match2.getAwayGoals()) ? match2.getHomeTeam() : match2.getAwayTeam());
                nextRoundMatches.add(nextRoundMatch);
            }

            matchRounds.add(roundMatches);
            roundMatches = nextRoundMatches;

        }

        listMatch.addAll(roundMatches);
    }
    */

    @Override                           // NO FUNCIONA, crec que ha de ser com adalt però usant simulateMatch() de CupMatch
    public void simulateMatches() {
        for (CupMatch cupMatch : listMatch) {
            cupMatch.simulateMatch();
            Team homeTeam = cupMatch.getHomeTeam();
            Team awayTeam = cupMatch.getAwayTeam();
            homeTeam.updateStats(cupMatch);
            awayTeam.updateStats(cupMatch);

            if (cupMatch.getAwayGoals() < cupMatch.getHomeGoals()) {
                listTeam.remove(awayTeam);

            } else {
                listTeam.remove(homeTeam);

            }
        }
    }

    @Override
    public void printMatches() {
        for (CupMatch cupMatch : listMatch) {
            System.out.println(" ");
            cupMatch.printMatch();
            System.out.println(" ");
        }
    }
    
    /*
    public void printBracket() {
        
    }
    */
}
