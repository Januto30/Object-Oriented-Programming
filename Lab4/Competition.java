package Lab4;
import java.util.LinkedList;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

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
                    validTeam = false;
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

        if (validTeamGen && validTeamNat && validTeam) {
            teamList.add(team);
            //System.out.println("- S'ha afegit l'equip " + team.getName() + " a la competició " + this.name + ".");
        
        } else {
            if (!validTeamGen) {
                System.out.println("-> L'equip " + team.getName() + " no pot ser afegit a la competició " + this.name + " perquè no concorden els gèneres.");
            
            } else if (!validTeamNat) {
                System.out.println("-> L'equip " + team.getName() + " no pot ser afegit a la competició " + this.name + " perquè no concorden les nacionalitats.");
            
            } else if (!validTeam) {
                System.out.println("-> L'equip " + team.getName() + " no pot ser afegit a la competició " + this.name + ".");

            }
            System.out.println("");
        }
    }

    public List<OutfielderStats> getOutfielderStats() {
        List<OutfielderStats> outfielderStatsList = new ArrayList<>();
        
        for (Team team : teamList) {

            for (Player player : team.getPlayers()) {
                
                if (player instanceof Outfielder) {
                    PlayerStats playerStats = player.getStats(this);

                    if (playerStats instanceof OutfielderStats) {
                        OutfielderStats outStats = (OutfielderStats) playerStats;
                        outfielderStatsList.add(outStats);

                        //playerStats.printStats();    //Per imprimir per pantalla les estadístiques de tots els Outfielders

                    }
                }
            }
        }
        return outfielderStatsList;
    }
    

    public void generateMatches() {

    }


    public void simulateMatches() {
        for (Match match : matchList) {
            match.simulateMatch();
            
            TeamStats tsH = match.getHomeTeam().getStats(this);
            TeamStats tsA = match.getAwayTeam().getStats(this);

            if (tsH != null && tsA != null) {
                tsH.updateTeamStats(match);
                tsA.updateTeamStats(match);

                for (Player player : match.getHomeTeam().getPlayers()) {
                    player.update(this, match);

                }

                for (Player player : match.getAwayTeam().getPlayers()) {
                    player.update(this, match);

                }
                
            } else {
                System.out.println("Ojo: TeamStats es null per un equip");
            }
        }
    }

    public void printMatches() {
        for (Match match : matchList) {
            System.out.println(" ");
            match.printMatch();
            System.out.println(" ");
        }
    }

    public void printGoalsScorers() {
        List<OutfielderStats> outfielderStatsList = getOutfielderStats();

        if (outfielderStatsList.isEmpty()) {
            System.out.println("No hay jugadores de campo en la lista.");
            return;
        }
        
        Collections.sort(outfielderStatsList, Collections.reverseOrder());

        System.out.println(" ");
        System.out.println("Llista de jugadors que més gols han marcat a " + this.getName() + ":");

        int contador = 0;

        for (OutfielderStats stats : outfielderStatsList) {

            if (contador < 10 && stats.getPlayer() != null) {
                System.out.println((contador + 1) + ". " + stats.getPlayer().getName() + ": " + stats.getNumGoals() + " gols.");
                contador++;

            }
        }
    }
}