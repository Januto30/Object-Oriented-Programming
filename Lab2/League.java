package Lab2;

import java.util.LinkedList;

public class League {
    private String name;
    private boolean gender;
    private Country country;
    private LinkedList<Team> teamList;
    private LinkedList<Match> playerMatch;
    
    public String getName() {
        return name;
    }
    public boolean isGender() {
        return gender;
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



    

}
