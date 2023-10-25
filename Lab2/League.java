package Lab2;

import java.util.LinkedList;

public class League {
    private String name;
    public enum GENDER {MALE, FEMALE, MIXED};
    private GENDER gender;
    private Country country;
    private LinkedList<Team> teamList;
    private LinkedList<Match> playerMatch;

    public League(String name, Country country, GENDER gender) {
        this.name = name;
        this.country = country;
        this.gender = gender;
    }

    public GENDER getGender() {
        return gender;
    }
    
    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    public LinkedList<Team> getTeamList() {
        return teamList;
    }

    public LinkedList<Match> getPlayerMatch() {
        return playerMatch;
    }

    public void generateMatches () {
        int sizeTeamList = teamList.size();
    }
}
