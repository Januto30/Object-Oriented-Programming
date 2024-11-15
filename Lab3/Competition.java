import java.util.LinkedList;

public class Competition {
    protected String name;
    protected boolean clubs;
    protected enum GENDER {MALE, FEMALE, MIXED};
    protected GENDER gender;
    protected Country country;
    protected LinkedList<Team> teamList;
    protected LinkedList<Match> matchList;

    public Competition (boolean clubs, String name, Country country, GENDER gender) {
        this.name = name;
        this.country = country;
        this.gender = gender;
        this.clubs = clubs;
        this.teamList = new LinkedList<>();
        this.matchList = new LinkedList<>();
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
        boolean validTeamNat = true;
        boolean validTeamGen = true;

        if (this.clubs && !(team instanceof NationalTeam)) {
            validTeam = false;

        } else if (!this.clubs && team instanceof NationalTeam) {
            validTeam = false;

        } 

        if (team.getCountry() != this.country) {
            validTeamNat = false;

        }

        if (team instanceof NationalTeam) {
            for (Team t : teamList) {
                if (t.getName().equals(team.getName())) {
                    validTeam = false;                   // Per verificar que 
                    break;
                
                }
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

        }

        System.out.println("");
        if (validTeamGen && validTeamNat && validTeam) {
            teamList.add(team);
            System.out.println("- S'ha afegit l'equip " + team.getName() + " a la competició " + this.name + ".");
        
        } else {
            if (!validTeamGen) {
                System.out.println("-> L'equip " + team.getName() + " no pot ser afegit a la competició " + this.name + " perquè no concorden els gèneres.");
            
            } else if (!validTeamNat) {
                System.out.println("-> L'equip " + team.getName() + " no pot ser afegit a la competició " + this.name + " perquè no concorden les nacionalitats.");
            
            } else if (!validTeam) {
                System.out.println("-> L'equip " + team.getName() + " no pot ser afegit a la competició " + this.name + ".");

            }
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

    /*          No importa fer
     * public void printGoalScorers(int k) {
     * 
     * }
     */
}
