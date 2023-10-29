package Lab2;

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
        teamList.add(team);
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
            System.out.println("En el partit entre " + match.getHomeTeam().getName() + " i " + match.getAwayTeam().getName());
            System.out.println("L'equip " + match.getHomeTeam().getName() +" ha fet " + match.getHomeGoals() + " gols.");
            System.out.println("L'equip " + match.getAwayTeam().getName() +" ha fet " + match.getAwayGoals() + " gols.");
            System.out.println(" ");
        }
    }

    /*
    public void printLeagueMatches() {
        for (Team team : teamList) {
            System.out.println("Partits del " + team.getName() + ":");
            
            System.out.println("- Com LOCAL:");
            for (Match match : matchList) {
                if (match.getHomeTeam() == team) {
                    System.out.println("\t" + match.getAwayTeam().getName());
                }
            }

            System.out.println("- Com VISITANT:");
                for (Match match : matchList) {
                    if (match.getAwayTeam() == team) {
                        System.out.println("\t" + match.getHomeTeam().getName());
                    }
                }
            
                System.out.println();
        }
    }
    */


    public void printLeagueStandings() {
        System.out.println(" ");
        System.out.println("Classificació de la lliga:");
        System.out.println("Equip\t\t   Jugats\t Guanyats\t Empatats\t  Perduts");

        // Ordenar la lista de equipos según el número de partidos ganados de forma descendente usando el algoritmo de ordenación de burbuja
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
}


/*Per fer allo de quins jugadors fan quins gols necessito primer l'algoritme del pau
 * per saber quants gols a cada un així després poder-ho repartir entre els jugadors
*/