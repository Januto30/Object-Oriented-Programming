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

        super.updateStats(match);

        this.numTackles += random.nextInt(10);
        this.numPasses += random.nextInt(60);
        this.numShots += random.nextInt(2);
        // this.numAssists +=           // si es jugador ha fet asistencia es suma un
        // this.numGoals +=             // si es jugador ha fet gol es suma un
        // per mirar si es jugador forma part de sa llista de jugadors que han marcat
        // s'ha de mirar de quin equip es (home o away) i mirar sa llista corresponent

    }
}
