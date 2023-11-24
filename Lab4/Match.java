package Lab4;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Match {
    protected Team homeTeam;
    protected Team awayTeam;
    protected int homeGoals;
    protected int awayGoals;
    protected LinkedList<Player> homeScorers;
    protected LinkedList<Player> awayScorers;
    
    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public int getAwayGoals() {
        return awayGoals;
    }

    public LinkedList<Player> getHomeScorers() {
        return homeScorers;
    }

    public LinkedList<Player> getAwayScorers() {
        return awayScorers;
    }


    public Match (Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScorers = new LinkedList<>();
        this.awayScorers = new LinkedList<>();
    }
    

    public void simulateMatch() {
        Random random = new Random();
        this.homeGoals = random.nextInt(4);
        this.awayGoals = random.nextInt(4);

        List<Player> homePlayers = homeTeam.getPlayers();
        List<Player> awayPlayers = awayTeam.getPlayers();

        for (int i = 0; i < homeGoals; i++) {
            Player scorer = homePlayers.get(random.nextInt(homePlayers.size()));
            
            while (!(scorer instanceof Outfielder)) {
                scorer = homePlayers.get(random.nextInt(homePlayers.size()));
            
            }
            homeScorers.add(scorer);

            /*       // Si en un partit, l'equip Away ha fet 3 gols, tots tres per un mateix jugador, aquest no pot haver fet assistències.
             * Player assistant = homePlayers.get(random.nextInt(homePlayers.size()));
            while (assistant.equals(scorer)) {
                assistant = homePlayers.get(random.nextInt(homePlayers.size()));

            }
            homeAssists.add(assistant);
            */
            
        }

        for (int i = 0; i < awayGoals; i++) {
            Player scorer = awayPlayers.get(random.nextInt(awayPlayers.size()));
            
            while (!(scorer instanceof Outfielder)) {
                scorer = awayPlayers.get(random.nextInt(awayPlayers.size()));
            
            }
            awayScorers.add(scorer);

            /*
            Player assistant = awayPlayers.get(random.nextInt(awayPlayers.size()));
            while (assistant.equals(scorer)) {
                assistant = awayPlayers.get(random.nextInt(awayPlayers.size()));

            }
            awayAssists.add(assistant);
            */

        }

    }

    public void printMatch() {
        System.out.println(homeTeam.getName() + " " + homeGoals + "  vs  " + awayTeam.getName() + " " +  awayGoals);
        
        if (homeGoals == 0) {
            System.out.println("");

        } else {
            System.out.println("");
            System.out.println("Golejadors de l'equip local " + homeTeam.getName() + ":");
            
            for (Player scorer : homeScorers) {
                System.out.println(" - " + scorer.getName());

            }
        }
        
        if (awayGoals == 0) {
            System.out.println(" ");

        } else {
            System.out.println(" ");
            System.out.println("Golejadors de l'equip visitant " + awayTeam.getName() + ":");
            
            for (Player scorer : awayScorers) {
                System.out.println(" - " + scorer.getName());

            }
        }
    }
}
