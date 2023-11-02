package Lab3;

import java.util.LinkedList;

public class League {
    private String name;
    public enum GENDER {MALE, FEMALE, MIXED};
    private GENDER gender;
    private Country country;
    private LinkedList<Team> teamList;
    private LinkedList<Match> matchList;

    public League(String name, Country country, GENDER gender) {
        this.name = name;
        this.country = country;
        this.gender = gender;
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

    /*
    public void printLeagueClasification() {
        System.out.println(" ");
        System.out.println("Classificació de la lliga:");
        System.out.println("Equip\t\t   Jugats\t Guanyats\t Empatats\t  Perduts");

        // Ordenar la llista d'equips segons el número de partitss guanyats de forma descendent usant l'algoritme d'ordenació' de bombolla
        for (int i = 0; i < teamList.size() - 1; i++) {
            for (int j = 0; j < teamList.size() - i - 1; j++) {
                if (teamList.get(j).getNumWins() < teamList.get(j + 1).getNumWins()) {
                    Team temp = teamList.get(j);
                    teamList.set(j, teamList.get(j + 1));
                    teamList.set(j + 1, temp);
                }
            }
        }

        for (Team team : teamList) {
            System.out.println(team.getName() + "\t\t" + team.getNumMatches() + "\t\t" + team.getNumWins() +
                    "\t\t" + team.getNumTies() + "\t\t" + team.getNumLosses());
        }
    }
    */
}