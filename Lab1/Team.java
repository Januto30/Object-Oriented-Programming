package Lab1;
import java.util.*;

public class Team {
    private String name;
    private Country country;
    public enum GENDER {MALE, FEMALE, MIXED};
    private GENDER gender;
    private int numMatches;
    private int numWins;
    private int numTies;
    private int numLosses;
    private int numGoalsScored;
    private int numGoalsAgainst;
    private LinkedList<Player> playerList;


    public Team(String name, Country country, GENDER gender) {
        this.name = name;
        this.country = country;
        this.gender = gender;
        playerList = new LinkedList <Player>();
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
        boolean gen_equip;
        if (this.gender == GENDER.FEMALE){
            gen_equip = true;
        }   else    {
            gen_equip = false;
        }

        if (this.gender == GENDER.MIXED){
            playerList.add(p);
        }

        if (gen_equip == p.getGender()){
            this.playerList.add(p);            
            System.out.println("S'ha assignat el jugador " + p.getName() + " al equip " + this.name);
        } else {
            System.out.println("El jugador" + p.getName() +  "no se'l pot assignar per raon de genere");
        }
    }

    public void removePlayer(Player p) {
        playerList.remove(p);
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
