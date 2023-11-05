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

        /*   S'ha de comprovar que es porter es local o visitant i posar es gols que ha marcat s'equip contrari.
        if (match.getHomeTeam().equals(this.getTeam())) {
            this.numSaves += random.nextInt(4);
            this.numGoalsLet += match.getHomeGoals();

        } else if (match.getAwayTeam().equals(this.getTeam())) {
            this.numSaves += random.nextInt(4);
            this.numGoalsLet += match.getAwayGoals();

        }
        */


        
    }
    
}
