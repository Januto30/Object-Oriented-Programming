package Lab3;

import java.util.LinkedList;

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
    boolean validTeam = true;

    if (this.gender == GENDER.MIXED) {
        validTeam = true;

        } else if (this.gender == GENDER.FEMALE && team.getGender() == Team.GENDER.FEMALE) {
            validTeam = true;

        } else if (this.gender == GENDER.MALE && team.getGender() == Team.GENDER.MALE) {
            validTeam = true;

        } else {
            validTeam = false;
        }

        if (team.getCountry() != this.country) {
            validTeam = false;
        }

        if (validTeam == false) {
            System.out.println("-> L'equip " + team.getName() + " no pot ser afegit a aquesta lliga perque no concorden els generes o la nacionalitat.");

        } else {
            teamList.add(team);
        }
    }

    public void generateMatches() {
        matchList = new LinkedList<>();

        for (int i = 0; i < teamList.size(); i++) {
            Team homeTeam = teamList.get(i);
            for (int j = i + 1; j < teamList.size(); j++) {
                Team awayTeam = teamList.get(j);
                Match match1 = new Match(homeTeam, awayTeam);
                Match match2 = new Match(awayTeam, homeTeam);
                matchList.add(match1);
                matchList.add(match2);
            }
        }
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
