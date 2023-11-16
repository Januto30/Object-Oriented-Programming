package Lab4;
import java.util.LinkedList;

public class Team {
    private String name;
    protected Country country;
    public enum GENDER {MALE, FEMALE, MIXED};
    private GENDER gender;

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

    public LinkedList<Player> getPlayers() {
        return playerList;
    }


    public void addPlayer(Player p) {
        boolean gen_equip;
        if (this.gender == GENDER.FEMALE) {
            gen_equip = true;

        } else {
            gen_equip = false;

        }

        if (this.gender == GENDER.MIXED) {
            playerList.add(p);
            if (p.getGender() == true) {
                System.out.println("- S'ha assignat la jugador " + p.getName() + " al equip: " + this.name + ".");

            } else {
                System.out.println("- S'ha assignat el jugador " + p.getName() + " al equip: " + this.name + ".");

            }

        } else if (gen_equip == p.getGender()) {
            this.playerList.add(p);            
            if (p.getGender() == true) {
                System.out.println("- S'ha assignat la jugador " + p.getName() + " al equip: " + this.name + ".");

            } else {
                System.out.println("- S'ha assignat el jugador " + p.getName() + " al equip: " + this.name + ".");
            
            }
            
        } else {
            if (p.getGender() == true) {
                System.out.println("-> La jugadora " + p.getName() +  " no se la pot assignar per raons de gènere al equip: " + this.name +".");

            } else {
                System.out.println("-> El jugador " + p.getName() +  " no se'l pot assignar per raons de gènere al equip: " + this.name + ".");
            
            }
        }

        System.out.println("");
    }


    public void removePlayer(Player p) {
        playerList.remove(p);

    }

}