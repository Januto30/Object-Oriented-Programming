package Lab4;

public class FootballAplication {
    public static void main(String[] args) {
        // COUNTRYS:
        Country spain = new Country("Spain");
        Country argentina = new Country("Argentina");
        Country brasil = new Country("Brasil");
        Country uruguay = new Country("Uruguay");
        Country croacia = new Country("Croacia");
        Country portugal = new Country("Portugal");
        Country germany = new Country("Alemanya");
        Country norway = new Country("Noruega");

        // JUGADORS:
        System.out.println("");
        System.out.println("------------------------------------------------ PLAYERS -----------------------------------------------------");
        Outfielder player1 = new Outfielder(false, "Lionel Messi", 36, argentina);
        Outfielder player2 = new Outfielder(false, "Neymar", 23, brasil);
        Outfielder player3 = new Outfielder(false, "Luis Suarez", 28, uruguay);
        Outfielder player4 = new Outfielder(false, "Rakitic", 27, croacia);
        Outfielder player5 = new Outfielder(false, "Pique", 28, spain);
        Outfielder player6 = new Outfielder(false, "Iniesta", 31, spain);
        Outfielder player7 = new Outfielder(false, "Xavi", 32, spain);
        Outfielder player8 = new Outfielder(false, "Mascherano", 30, argentina);
        Outfielder player9 = new Outfielder(false, "Jordi Alba", 27, spain);
        Outfielder player10 = new Outfielder(false, "Puyol", 37, spain);
        Goalkeeper player11 = new Goalkeeper(false, "Ter Stegen", 23, germany);
        
        Outfielder player12 = new Outfielder(false, "Modric", 32, croacia);
        Outfielder player13 = new Outfielder(false, "Kroos", 27, germany);
        Outfielder player14 = new Outfielder(false, "Sergio Ramos" , 31, spain);
        Outfielder player15 = new Outfielder(false, "Cristiano Ronaldo", 32, portugal);
        Outfielder player16 = new Outfielder(false, "Vinicius", 23, brasil);
        Outfielder player17 = new Outfielder(false, "Fede Valverde", 25, uruguay);
        Outfielder player18 = new Outfielder(false, "Casemiro", 28, brasil);
        Outfielder player19 = new Outfielder(false, "Rodrygo", 21, brasil);
        Outfielder player20 = new Outfielder(false, "Arbeloa", 30, spain);
        Outfielder player21 = new Outfielder(false, "Kovacic", 23, croacia);
        Goalkeeper player22 = new Goalkeeper(false, "Casillas", 29, spain);

        Outfielder player23 = new Outfielder(false, "Jesus Navas" , 31, spain);
        Outfielder player24 = new Outfielder(false, "Bade", 32, portugal);
        Outfielder player25 = new Outfielder(false, "Acuña", 25, argentina);
        Outfielder player26 = new Outfielder(false, "Maradona" , 56, argentina);
        Outfielder player27 = new Outfielder(false, "Ocampos" , 25, argentina);
        Outfielder player28 = new Outfielder(false, "Gudelj" , 28, croacia);
        Outfielder player29 = new Outfielder(false, "Fernando" , 33, brasil);
        Outfielder player30 = new Outfielder(false, "Lamela" , 26, argentina);
        Outfielder player31 = new Outfielder(false, "Mariano" , 24, brasil);
        Outfielder player32 = new Outfielder(false, "Suso" , 28, spain);
        Goalkeeper player33 = new Goalkeeper(false, "Sergio Rico" , 31, spain);

        Outfielder player34 = new Outfielder(false, "Gaya", 32, spain);
        Outfielder player35 = new Outfielder(false, "Pepelu", 22, spain);
        Outfielder player36 = new Outfielder(false, "Mendes", 25, portugal);
        Outfielder player37 = new Outfielder(false, "Parejo", 34, spain);
        Outfielder player38 = new Outfielder(false, "Javi Guerra", 20, spain);
        Outfielder player39 = new Outfielder(false, "Fran Perez", 21, spain);
        Outfielder player40 = new Outfielder(false, "Hugo Duro", 24, spain);
        Outfielder player41 = new Outfielder(false, "Diego Lopez", 21, spain);
        Outfielder player42 = new Outfielder(false, "Paulista", 23, brasil);
        Outfielder player43 = new Outfielder(false, "Cavani", 25, uruguay);
        Goalkeeper player44 = new Goalkeeper(false, "Diego Alves" , 28, brasil);

        Outfielder player23 = new Outfielder(true, "Mariona", 32, spain);
        Outfielder player24 = new Outfielder(true, "Alexia", 23, spain);
        Outfielder player25 = new Outfielder(true, "Aitana", 25, spain);
        Outfielder player30 = new Outfielder(true, "Engen", 25, norway);
        Goalkeeper player26 = new Goalkeeper(true, "Cata Coll" , 31, spain);

        Outfielder player27 = new Outfielder(false, "Cavani", 36, uruguay);
        Outfielder player28 = new Outfielder(false, "Marcos Rojo", 36, argentina);
        Goalkeeper player29 = new Goalkeeper(false, "Sergio Romero", 36, argentina);


        // EQUIPS:
        System.out.println("");
        System.out.println("------------------------------------------------ TEAMS -----------------------------------------------------");
        Team barcelona = new Team("Barcelona", spain, Team.GENDER.MALE);
        Team realMadrid = new Team("Real Madrid", spain, Team.GENDER.MALE);
        Team sevilla = new Team("SevillaFC", spain, Team.GENDER.MALE);
        Team valencia = new Team("Valencia", spain, Team.GENDER.MALE);
        Team barcelonaFem = new Team("Barcelona Femení", spain, Team.GENDER.FEMALE);
        Team boca = new Team("Boca Juniors", argentina, Team.GENDER.MALE);

        NationalTeam espanya = new NationalTeam("Espanya", spain, Team.GENDER.MALE);
        NationalTeam espanyaFem = new NationalTeam("Espanya Femení", spain, Team.GENDER.FEMALE);

        barcelona.addPlayer(player1);
        barcelona.addPlayer(player2);
        barcelona.addPlayer(player3);
        barcelona.addPlayer(player4);
        barcelona.addPlayer(player5);
        barcelona.addPlayer(player6);
        barcelona.addPlayer(player7);
        barcelona.addPlayer(player8);
        barcelona.addPlayer(player9);
        barcelona.addPlayer(player10);
        barcelona.addPlayer(player11);

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

        barcelonaFem.addPlayer(player1);    // Ha de sortir malament (genere)
        barcelonaFem.addPlayer(player23);
        barcelonaFem.addPlayer(player24);
        barcelonaFem.addPlayer(player25);
        barcelonaFem.addPlayer(player26);
        barcelonaFem.addPlayer(player30);

        boca.addPlayer(player27);
        boca.addPlayer(player28);
        boca.addPlayer(player29);

        espanya.addPlayer(player1);         // Ha de sortir malament (nacionalitat)
        espanya.addPlayer(player23);        // ha de sortir malament (genere)
        espanya.addPlayer(player5);
        espanya.addPlayer(player6);
        espanya.addPlayer(player8);
        espanya.addPlayer(player14);

        espanyaFem.addPlayer(player29);     // Ha de sortir malament (nacionalitat)
        espanyaFem.addPlayer(player8);     // Ha de sortir malament (genere)
        espanyaFem.addPlayer(player30);     // Ha de sortir malament (nacionalitat)
        espanyaFem.addPlayer(player23);
        espanyaFem.addPlayer(player24);
        espanyaFem.addPlayer(player25);
        espanyaFem.addPlayer(player26);

        // COMPETITIONS:
        // Leagues:
        System.out.println("");
        System.out.println("------------------------------------------------ LEAGUE -----------------------------------------------------");
        League laLiga = new League(true, "La Liga", spain, League.GENDER.MALE);
        League laLigaFem = new League(true, "La Liga Femenina", spain, League.GENDER.FEMALE);
        League LPF = new League(true, "Liga Profesional de Argentina", argentina, League.GENDER.MALE);

        laLiga.addTeam(barcelona);
        laLiga.addTeam(realMadrid);
        laLiga.addTeam(sevilla);
        laLiga.addTeam(valencia);
        laLiga.addTeam(boca);               // Ha de sortir malament (nacionalitat)
        laLiga.addTeam(espanya);             // Ha de sortir malament (no és un club)

        laLigaFem.addTeam(barcelonaFem);
        laLigaFem.addTeam(realMadrid);      // Ha de sortir malament (genere)
        laLigaFem.addTeam(espanyaFem);      // ha de sortir malament (no és un club)

        LPF.addTeam(boca);
        LPF.addTeam(sevilla);              // Ha de sortir malament

        laLiga.generateMatches();
        laLiga.simulateMatches();
        laLiga.printMatches();
        laLiga.printTable();

        // Cup:
        System.out.println("");
        System.out.println("------------------------------------------------ CUP -----------------------------------------------------");
        Cup kingsCup = new Cup(true, "Copa del Rei", spain, Cup.GENDER.MALE);
        Cup queensCup = new Cup(true, "Copa de la Reina", spain, Cup.GENDER.FEMALE);

        kingsCup.addTeam(barcelona);
        kingsCup.addTeam(realMadrid);
        kingsCup.addTeam(sevilla);
        kingsCup.addTeam(valencia);
        kingsCup.addTeam(barcelonaFem);     // Ha de sortir malament (genere)
        kingsCup.addTeam(espanya);          // Ha de sortir malament (no és un club)
        kingsCup.addTeam(boca);             // Ha de sortir malament (nacionalitat)

        queensCup.addTeam(barcelonaFem);
        queensCup.addTeam(espanyaFem);      // Ha de sortir malament (no és un club)
        
        kingsCup.generateMatches();
        kingsCup.simulateMatches();
        kingsCup.printMatches();

        // GroupPlay:
        System.out.println("");
        System.out.println("------------------------------------------------ GROUP PLAY -----------------------------------------------------");
        GroupPlay champions = new GroupPlay(true, "Champions League", spain, GroupPlay.GENDER.MALE);

        champions.addTeam(barcelona);
        champions.addTeam(realMadrid);
        champions.addTeam(sevilla);
        champions.addTeam(valencia);

        champions.generateMatches();
        champions.simulateMatches();


        System.out.println();

        
    }
}
