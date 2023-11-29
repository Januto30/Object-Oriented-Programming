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
        Country korea = new Country ("Corea");

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

        Outfielder player45 = new Outfielder(true, "Mariona", 27, spain);
        Outfielder player46 = new Outfielder(true, "Alexia", 29, spain);
        Outfielder player47 = new Outfielder(true, "Aitana", 25, spain);
        Outfielder player48 = new Outfielder(true, "Maria Leon", 28, spain);
        Outfielder player49 = new Outfielder(true, "Paredes", 26, spain);
        Outfielder player50 = new Outfielder(true, "Patri", 24, spain);
        Outfielder player51 = new Outfielder(true, "Pina", 22, spain);
        Outfielder player52 = new Outfielder(true, "Graham", 28, norway);
        Outfielder player53 = new Outfielder(true, "Salma Paralluelo", 20, spain);
        Outfielder player54 = new Outfielder(true, "Engen", 25, norway);
        Goalkeeper player55 = new Goalkeeper(true, "Cata Coll" , 22, spain);

        Outfielder player56 = new Outfielder(false, "Cavani", 36, uruguay);
        Outfielder player57 = new Outfielder(false, "Marcos Rojo", 36, argentina);
        Outfielder player58 = new Outfielder(false, "Figal", 36, argentina);
        Outfielder player59 = new Outfielder(false, "Advincula", 36, argentina);
        Outfielder player60 = new Outfielder(false, "Fabra", 36, argentina);
        Outfielder player61 = new Outfielder(false, "Barco", 36, argentina);
        Outfielder player62 = new Outfielder(false, "Medina", 36, argentina);
        Outfielder player63 = new Outfielder(false, "Langoni", 36, argentina);
        Outfielder player64 = new Outfielder(false, "Zeballos", 36, argentina);    
        Outfielder player65 = new Outfielder(false, "Pol Fernandez", 36, argentina);
        Goalkeeper player66 = new Goalkeeper(false, "Sergio Romero", 36, argentina);

        Outfielder player67 = new Outfielder(false, "Muriqi", 30, norway);
        Outfielder player68 = new Outfielder(false, "Dani Rodriguez", 29, spain);
        Outfielder player69 = new Outfielder(false, "Jaume Costa", 30, spain);
        Outfielder player70 = new Outfielder(false, "Kang-in Lee", 24, korea);
        Outfielder player71 = new Outfielder(false, "Raillo", 28, spain);
        Outfielder player72 = new Outfielder(false, "Darder", 31, spain);
        Outfielder player73 = new Outfielder(false, "Abdon Prats", 26, spain);
        Outfielder player74 = new Outfielder(false, "Maffeo", 24, argentina);
        Outfielder player75 = new Outfielder(false, "Morlanes", 25, spain);
        Outfielder player76 = new Outfielder(false, "Lato", 30, spain);
        Goalkeeper player77 = new Goalkeeper(false, "Rajkovic", 32, croacia);

        Outfielder player78 = new Outfielder(false, "Nico Williams", 21, spain);
        Outfielder player79 = new Outfielder(false, "Iñaki Williams", 28, spain);
        Outfielder player80 = new Outfielder(false, "Berenguer", 24, spain);
        Outfielder player81 = new Outfielder(false, "De Marcos", 30, spain);
        Outfielder player82 = new Outfielder(false, "Muniain", 33, spain);
        Outfielder player83 = new Outfielder(false, "Yuri", 30, spain);
        Outfielder player84 = new Outfielder(false, "Sancet", 26, spain);
        Outfielder player85 = new Outfielder(false, "Yeray", 30, spain);
        Outfielder player86 = new Outfielder(false, "Asier Villalibre", 27, spain);
        Outfielder player87 = new Outfielder(false, "De Galarreta", 28, spain);
        Goalkeeper player88 = new Goalkeeper(false, "Unai Simón", 24, spain);


        // EQUIPS:
        System.out.println("");
        System.out.println("------------------------------------------------ TEAMS -----------------------------------------------------");
        Team barcelona = new Team("Barcelona", spain, Team.GENDER.MALE);
        Team realMadrid = new Team("Real Madrid", spain, Team.GENDER.MALE);
        Team sevilla = new Team("SevillaFC", spain, Team.GENDER.MALE);
        Team valencia = new Team("Valencia", spain, Team.GENDER.MALE);
        Team barcelonaFem = new Team("Barcelona Femení", spain, Team.GENDER.FEMALE);
        Team boca = new Team("Boca Juniors", argentina, Team.GENDER.MALE);
        Team mallorca = new Team("Mallorca", spain, Team.GENDER.MALE);
        Team athletic = new Team("Athletic Club", spain, Team.GENDER.MALE);

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

        realMadrid.addPlayer(player12);
        realMadrid.addPlayer(player13);
        realMadrid.addPlayer(player14);
        realMadrid.addPlayer(player15);
        realMadrid.addPlayer(player16);
        realMadrid.addPlayer(player17);
        realMadrid.addPlayer(player18);
        realMadrid.addPlayer(player19);
        realMadrid.addPlayer(player20);
        realMadrid.addPlayer(player21);
        realMadrid.addPlayer(player22);

        sevilla.addPlayer(player23);
        sevilla.addPlayer(player24);
        sevilla.addPlayer(player25);
        sevilla.addPlayer(player26);
        sevilla.addPlayer(player27);
        sevilla.addPlayer(player28);
        sevilla.addPlayer(player29);
        sevilla.addPlayer(player30);
        sevilla.addPlayer(player31);
        sevilla.addPlayer(player32);
        sevilla.addPlayer(player33);

        valencia.addPlayer(player34);
        valencia.addPlayer(player35);
        valencia.addPlayer(player36);
        valencia.addPlayer(player37);
        valencia.addPlayer(player38);
        valencia.addPlayer(player39);
        valencia.addPlayer(player40);
        valencia.addPlayer(player41);
        valencia.addPlayer(player42);
        valencia.addPlayer(player43);
        valencia.addPlayer(player44);

        barcelonaFem.addPlayer(player1);    // Ha de sortir malament (genere)
        barcelonaFem.addPlayer(player45);
        barcelonaFem.addPlayer(player46);
        barcelonaFem.addPlayer(player47);
        barcelonaFem.addPlayer(player48);
        barcelonaFem.addPlayer(player49);
        barcelonaFem.addPlayer(player50);
        barcelonaFem.addPlayer(player51);
        barcelonaFem.addPlayer(player52);
        barcelonaFem.addPlayer(player53);
        barcelonaFem.addPlayer(player54);
        barcelonaFem.addPlayer(player55);

        boca.addPlayer(player56);
        boca.addPlayer(player57);
        boca.addPlayer(player58);
        boca.addPlayer(player59);
        boca.addPlayer(player60);
        boca.addPlayer(player61);
        boca.addPlayer(player62);
        boca.addPlayer(player63);
        boca.addPlayer(player64);
        boca.addPlayer(player65);
        boca.addPlayer(player66);

        mallorca.addPlayer(player67);
        mallorca.addPlayer(player68);
        mallorca.addPlayer(player69);
        mallorca.addPlayer(player70);
        mallorca.addPlayer(player71);
        mallorca.addPlayer(player72);
        mallorca.addPlayer(player73);
        mallorca.addPlayer(player74);
        mallorca.addPlayer(player75);
        mallorca.addPlayer(player76);
        mallorca.addPlayer(player77);

        athletic.addPlayer(player78);
        athletic.addPlayer(player79);
        athletic.addPlayer(player80);
        athletic.addPlayer(player81);
        athletic.addPlayer(player82);
        athletic.addPlayer(player83);
        athletic.addPlayer(player84);
        athletic.addPlayer(player85);
        athletic.addPlayer(player86);
        athletic.addPlayer(player87);
        athletic.addPlayer(player88);


        espanya.addPlayer(player1);         // Ha de sortir malament (nacionalitat)
        espanya.addPlayer(player45);        // ha de sortir malament (genere)
        espanya.addPlayer(player5);
        espanya.addPlayer(player6);
        espanya.addPlayer(player7);
        espanya.addPlayer(player9);
        espanya.addPlayer(player10);
        espanya.addPlayer(player14);
        espanya.addPlayer(player20);
        espanya.addPlayer(player22);
        espanya.addPlayer(player23);
        espanya.addPlayer(player32);
        espanya.addPlayer(player34);

        espanyaFem.addPlayer(player54);     // Ha de sortir malament (nacionalitat)
        espanyaFem.addPlayer(player5);     // Ha de sortir malament (genere)
        espanyaFem.addPlayer(player45);
        espanyaFem.addPlayer(player46);
        espanyaFem.addPlayer(player47);
        espanyaFem.addPlayer(player48);
        espanyaFem.addPlayer(player49);
        espanyaFem.addPlayer(player50);
        espanyaFem.addPlayer(player51);
        espanyaFem.addPlayer(player53);
        espanyaFem.addPlayer(player55);


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
        laLiga.addTeam(mallorca);
        laLiga.addTeam(athletic);
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
        laLiga.printGoalsScorers();
        

        // Cup:
        System.out.println("");
        System.out.println("------------------------------------------------ CUP -----------------------------------------------------");
        Cup kingsCup = new Cup(true, "Copa del Rei", spain, Cup.GENDER.MALE);
        Cup queensCup = new Cup(true, "Copa de la Reina", spain, Cup.GENDER.FEMALE);

        kingsCup.addTeam(barcelona);
        kingsCup.addTeam(realMadrid);
        kingsCup.addTeam(sevilla);
        kingsCup.addTeam(valencia);
        kingsCup.addTeam(mallorca);
        kingsCup.addTeam(athletic);
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

        System.out.println("Acabat");

        
    }
}
