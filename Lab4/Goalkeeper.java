package Lab4;
import java.util.Random;

public class Goalkeeper extends Player {
    private int numSaves;
    private int numGoalsLet;

    public Goalkeeper (boolean g, String name, int age, Country nac) {
        super(g, name, age, nac);

        this.numSaves = 0;
        this.numGoalsLet = 0;
    }

    @Override
    public void updateStats(Match match) {
        Random random = new Random();

        super.updateStats(match);

        for (Player player : match.getHomeTeam().getPlayers()) {
            if (player.getName().equals(super.getName())) {
                this.numSaves += random.nextInt(5);
                this.numGoalsLet += match.getAwayGoals();

            }
        }

        for (Player player : match.getAwayTeam().getPlayers()) {
            if (player.getName().equals(super.getName())) {
                this.numSaves += random.nextInt(5);
                this.numGoalsLet += match.getHomeGoals();
                
            }
        }
        
    }
    
}
