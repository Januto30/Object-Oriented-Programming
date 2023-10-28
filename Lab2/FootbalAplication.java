package Lab2;

public class FootbalAplication {
    public static void main(String[] args) {
        
        League league = new League("EjemploLeague", new Country("EjemploCountry"), League.GENDER.MALE);
        Team team2 = new Team("Team1", new Country("Country1"), Team.GENDER.MALE);
        team2.playMatch(3, 1);
        Team team1 = new Team("Team2", new Country("Country2"), Team.GENDER.MALE);
        team1.playMatch(2, 2);
        Team team3 = new Team("Team3", new Country("Country3"), Team.GENDER.MALE);
        team3.playMatch(1, 3);

        // Agregar los equipos a la liga
        league.addTeam(team2);
        league.addTeam(team1);
        league.addTeam(team3);

        // Imprimir la clasificación de la liga
        league.printLeagueStandings();

    }
}