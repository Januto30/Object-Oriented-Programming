package Lab2;

import java.lang.System.Logger.Level;

public class FootbalAplication {
    public static void main(String[] args) {
        // COUNTRYS:
        Country spain = new Country("Spain");
        Country argentina = new Country("Argentina");
        Country brasil = new Country("Brasil");
        Country uruguay = new Country("Uruguay");
        Country croacia = new Country("Croacia");
        Country portugal = new Country("Portugal");
        Country germany = new Country("Alemanya");

        Team.GENDER males = Team.GENDER.MALE;
        League.GENDER male = League.GENDER.MALE;

        // JUGADORS:
        Player player1 = new Player(false, "Lionel Messi", 36, argentina);
        Player player2 = new Player(false, "Neymar", 23, brasil);
        Player player3 = new Player(false, "Luis Suarez", 28, uruguay);
        Player player4 = new Player(false, "Rakitic", 27, croacia);
        Player player5 = new Player(false, "Pique", 28, spain);
        Player player6 = new Player(false, "Iniesta", 31, spain);
        Player player7 = new Player(false, "Ter Stegen", 23, spain);

        Player player8 = new Player(false, "Sergio Ramos" , 31, spain);
        Player player9 = new Player(false, "Cristiano Ronaldo", 32, portugal);
        Player player10 = new Player(false, "Vinicius", 23, brasil);
        Player player11 = new Player(false, "Fede Valverde", 25, uruguay);
        Player player12 = new Player(false, "Modric", 32, croacia);
        Player player13 = new Player(false, "Kroos", 27, germany);
        Player player14 = new Player(false, "Casillas", 29, spain);

        Player player15 = new Player(false, "Jesus Navas" , 31, spain);
        Player player16 = new Player(false, "Bade", 32, portugal);
        Player player17 = new Player(false, "Acuña", 25, argentina);
        Player player18 = new Player(false, "Sergio Rico" , 31, spain);

        Player player19 = new Player(false, "Gaya", 32, spain);
        Player player20 = new Player(false, "Paulista", 23, brasil);
        Player player21 = new Player(false, "Cavani", 25, uruguay);
        Player player22 = new Player(false, "Santiago Cañizares" , 31, spain);

        // EQUIPS:
        Team barcelona = new Team("Barcelona", spain, males);
        Team realMadrid = new Team("Real Madrid", spain, males);
        Team sevilla = new Team("SevillaFC", spain, males);
        Team valencia = new Team("Valencia", spain, males);

        barcelona.addPlayer(player1);
        barcelona.addPlayer(player2);
        barcelona.addPlayer(player3);
        barcelona.addPlayer(player4);
        barcelona.addPlayer(player5);
        barcelona.addPlayer(player6);
        barcelona.addPlayer(player7);

        realMadrid.addPlayer(player8);
        realMadrid.addPlayer(player9);
        realMadrid.addPlayer(player10);
        realMadrid.addPlayer(player11);
        realMadrid.addPlayer(player12);
        realMadrid.addPlayer(player13);
        realMadrid.addPlayer(player14);

        sevilla.addPlayer(player15);
        sevilla.addPlayer(player16);
        sevilla.addPlayer(player17);
        sevilla.addPlayer(player18);

        valencia.addPlayer(player19);
        valencia.addPlayer(player20);
        valencia.addPlayer(player21);
        valencia.addPlayer(player22);

        // LLIGA:
        League laLiga = new League("La Liga", spain, male);

        laLiga.addTeam(barcelona);
        laLiga.addTeam(realMadrid);
        laLiga.addTeam(sevilla);
        laLiga.addTeam(valencia);

        // COMPROVACIONS:
        barcelona.printTeam();
        realMadrid.printTeam();
        sevilla.printTeam();
        valencia.printTeam();

        laLiga.generateMatches();
        laLiga.simulateMatches();
        laLiga.printMatches();
        laLiga.printLeagueStandings();

        barcelona.printStats();
        realMadrid.printStats();
        sevilla.printStats();
        valencia.printStats();

        player1.printStats();
        player10.printStats();
        player15.printStats();
        player20.printStats();


        System.out.println();


        
    }
}