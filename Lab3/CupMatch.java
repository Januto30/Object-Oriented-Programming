import java.util.List;
import java.util.Random;

public class CupMatch extends Match {
    
    public CupMatch (Team homeTeam, Team awayTeam) {
        super(homeTeam, awayTeam);

    }

    @Override
    public void simulateMatch() {
        Random random = new Random();
        super.homeGoals = random.nextInt(5);
        super.awayGoals = random.nextInt(5);

        while (homeGoals == awayGoals) {
            super.homeGoals += random.nextInt(3);
            super.awayGoals += random.nextInt(3);

        }

        List<Player> homePlayers = homeTeam.getPlayers();
        List<Player> awayPlayers = awayTeam.getPlayers();

        for (int i = 0; i < homeGoals; i++) {
            Player scorer = homePlayers.get(random.nextInt(homePlayers.size()));
            
            while (!(scorer instanceof Outfielder)) {
                scorer = homePlayers.get(random.nextInt(homePlayers.size()));
            
            }
            homeScorers.add(scorer);
        }

        for (int i = 0; i < awayGoals; i++) {
            Player scorer = awayPlayers.get(random.nextInt(awayPlayers.size()));
            
            while (!(scorer instanceof Outfielder)) {
                scorer = awayPlayers.get(random.nextInt(awayPlayers.size()));
            
            }
            awayScorers.add(scorer);
        }
    }
}
