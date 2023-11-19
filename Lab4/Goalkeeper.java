package Lab4;

public class Goalkeeper extends Player {

    public Goalkeeper (boolean g, String name, int age, Country nac) {
        super(g, name, age, nac);

    }

    @Override
    public void update(Competition c, Match m) {
        super.update(c, m);

        if (stats.containsKey(c)) {
            GoalkeeperStats goalkeeperStats = (GoalkeeperStats) stats.get(c);
            goalkeeperStats.updateStats(m);
        }
        
    }
    
}
