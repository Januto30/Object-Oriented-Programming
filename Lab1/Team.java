package Lab1;
import java.util.*;

public class Team {
    private String name;
    private Country country;
    private LinkedList <Player> playersList;
    public enum GENDER {MALE, FEMALE, MIXED};
    private GENDER gender;
    private int numMatches;
    private int numWins;
    private int numTies;
    private int numLosses;
    private int numGoalsScored;
    private int numGoalsAgainst;

    public Team(String name, Country country, GENDER gender) {
        this.name = name;
        this.country = country;
        this.gender = gender;
        LinkedList <Player> playersList = new LinkedList <Player> ();
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    public GENDER getGender() {
        return gender;
    }

    public void addPlayer(Player p) {
        GENDER aux = p.getGender();
        if (aux==this.gender){
            playersList.add(p);
        } else {
            System.out.println();
        }
    
    }

    public void removePlayer(Player p) {
        playersList.remove(p);
    }

    public void playMatch(int scored, int against) {        // revisar si està bé
        numMatches++;       
        numGoalsScored += scored;
        numGoalsAgainst += against;

        if (scored > against) {
            numWins++;

        } else if (scored < against) {
            numLosses++;

        } else {
            numTies++;
        }
    }

    public void printStats() {
        System.out.println("Informació de l'equip: ");
        System.out.println("Nom equip: " + name);
        System.out.println("Pais: " + country);
        System.out.println("Genere: " + gender);
        System.out.println("Total partits jugats: " + numMatches);
        System.out.println("Total partits guanyats: " + numWins);
        System.out.println("Total psrtits empatats: " + numTies);
        System.out.println("Total partits perduts: " + numLosses);
        System.out.println("Total gols marcats: " + numGoalsScored);
        System.out.println("Total gols encajados: " + numGoalsAgainst);
    }


}
