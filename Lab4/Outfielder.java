package Lab4;

public class Outfielder extends Player {

    public Outfielder (boolean g, String name, int age, Country nac) {
        super(g, name, age, nac);

    }

    @Override
    public void update(Competition c, Match m) {
        super.update(c, m);

        if (stats.containsKey(c)) {
            OutfielderStats outfielderStats = (OutfielderStats) stats.get(c);
            outfielderStats.updateStats(m);
            
        }
        
    }
}
