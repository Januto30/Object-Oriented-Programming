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
        stats = new HashMap<>();
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

    public PlayerStats getStats(Competition c) {
        return stats.get(c);
    }

    public void update(Competition c, Match m) {
        PlayerStats playerStats = null;

        if(!stats.containsKey(c)) {
            if (this instanceof Outfielder) {
                playerStats = new OutfielderStats(this);

            } else if (this instanceof Goalkeeper) {
                playerStats = new GoalkeeperStats(this);

            } else {
                System.out.println("El player no es ni Outfielder ni Goalkeeper");
            }

            stats.put(c, playerStats);
        }

        if (playerStats != null) {
            playerStats.updateStats(m);

        }
    }

}