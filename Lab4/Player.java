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

    public HashMap<Competition, PlayerStats> getStats(Competition c) {    /// ???????????
        return stats;
    }

    public boolean equals (Object o) {          /// WTF ?? Que es això? Que he de fer
        if (this == o) {
            return true;

        }

        if (o == null || getClass() != o.getClass()) {
            return false;

        }

        Player player = (Player) o;                 /// ??????????????????
        return gender == player.gender && age == player.age && numMatches == player.numMatches && name.equals(player.name) && country.equals(player.country);

    }

    public void update(Competition c, Match m) {
        // Escriure...

    }


}
