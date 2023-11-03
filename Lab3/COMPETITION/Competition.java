package Lab3.COMPETITION;

import java.util.LinkedList;

import Lab3.COUNTRY.Country;
import Lab3.MATCH.Match;
import Lab3.TEAM.NationalTeam;
import Lab3.TEAM.Team;
import Lab3.TEAM.Team.GENDER;

public class Competition {
    protected String name;
    protected boolean clubs;
    protected enum GENDER {MALE, FEMALE, MIXED};
    protected GENDER gender;
    protected Country country;
    protected LinkedList<Team> teamList;
    protected LinkedList<Match> matchList;

    public Competition(boolean clubs, String name, Country country, GENDER gender) {
        this.name = name;
        this.country = country;
        this.gender = gender;
        this.clubs = clubs;
        this.teamList = new LinkedList<>();
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

    public LinkedList<Match> getMatchList() {
        return matchList;
    }

    public void addTeam(Team team) {
        boolean validTeamNat = true;
        boolean validTeamGen = true;
        boolean validTeam = true;


        if (team instanceof NationalTeam){
            int size = teamList.size();
            for (int i=0; i<size; i++){
                if (teamList.get(i).getName().equals(team.getName())){
                    validTeamNat = false;
                }
            }
            if (this.gender == GENDER.MIXED) {
            validTeamGen = true;

            } else if (this.gender == GENDER.FEMALE && team.getGender() == Team.GENDER.FEMALE) {
                validTeamGen = true;

            } else if (this.gender == GENDER.MALE && team.getGender() == Team.GENDER.MALE) {
                validTeamGen = true;

            } else {
                validTeamGen = false;

            } if (validTeamGen == validTeamNat){
                teamList.add(team);

            } else {
                System.out.println("-> L'equip " + team.getName() + " no pot ser afegit a aquesta competició perque no concorden els generes o la nacionalitat.");
            }
        
        
        } else {
            if (this.gender == GENDER.MIXED) {
            validTeamGen = true;

        } else if (this.gender == GENDER.FEMALE && team.getGender() == Team.GENDER.FEMALE) {
            validTeamGen = true;

        } else if (this.gender == GENDER.MALE && team.getGender() == Team.GENDER.MALE) {
            validTeamGen = true;

        } else {
            validTeamGen = false;
        }

        } if (validTeamGen == validTeamNat){
                teamList.add(team);

        } else {
            System.out.println("-> L'equip " + team.getName() + " no pot ser afegit a aquesta competició perque no concorden els generes o la nacionalitat.");
        }
    }

    public void generateMatches() {
    }

    public void simulateMatches() {
        for (Match match : matchList) {
            match.simulateMatch();
            Team homeTeam = match.getHomeTeam();
            Team awayTeam = match.getAwayTeam();
            homeTeam.updateStats(match);
            awayTeam.updateStats(match);

        }
    }

    public void printMatches() {
        for (Match match : matchList) {
            System.out.println(" ");
            match.printMatch();
            System.out.println(" ");
        }
    }

}