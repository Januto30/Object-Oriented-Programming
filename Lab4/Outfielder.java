package Lab4;
import java.util.Random;

public class Outfielder extends Player {
    private int numTackles;
    private int numPasses;
    private int numShots;
    private int numAssists;
    private int numGoals;

    public Outfielder (boolean g, String name, int age, Country nac) {
        super(g, name, age, nac);

        this.numTackles = 0;
        this.numPasses = 0;
        this.numShots = 0;
        this.numAssists = 0;
        this.numGoals = 0;
    }

    @Override
    public void updateStats(Match match) {
        Random random = new Random();
        int goalsScored = 0;

        super.updateStats(match);

        this.numTackles += random.nextInt(10);
        this.numPasses += random.nextInt(60);
        this.numShots += random.nextInt(2);

        this.numAssists += random.nextInt(1);           // Es podria fer millor

        for (Player player : match.getHomeTeam().getPlayers()) {
            if (player.getName().equals(super.getName()) && match.getHomeScorers().contains(player)) {
                goalsScored++;

            }
        }

        for (Player player : match.getAwayTeam().getPlayers()) {
            if (player.getName().equals(super.getName()) && match.getAwayScorers().contains(player)) {
                goalsScored++;

            }
        }

        this.numGoals += goalsScored;

    }
}
