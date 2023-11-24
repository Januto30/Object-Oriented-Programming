package Lab4;

import java.util.HashMap;

public class Player {
    protected boolean gender;
    protected String name;
    protected int age;
    protected Country country;
    protected HashMap<Competition, PlayerStats> stats;

    public Player (boolean g, String name, int age, Country nac) {
        this.gender = g;
        this.name = name;
        this.age = age;
        this.country = nac;
        stats = new HashMap<Competition, PlayerStats>();
    }

    public boolean getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Country getNacionality() {
        return country;
    }

    public HashMap<Competition, PlayerStats> getStats(Competition c) {  // potser que estigui malament
        return stats;
    }

    public void update(Competition c, Match m) {
        if(!stats.containsKey(c)) {
            if (this instanceof Outfielder) {
                stats.put(c, new OutfielderStats(this));

            } else if (this instanceof Goalkeeper) {
                stats.put(c, new GoalkeeperStats(this));

            }
        }

        PlayerStats playerStats = stats.get(c);
        playerStats.updateStats(m);

    }

}