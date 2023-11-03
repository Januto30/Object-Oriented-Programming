package Lab3.TEAM;

import Lab3.COUNTRY.Country;
import Lab3.PLAYER.Player;

public class NationalTeam extends Team{
    
    public NationalTeam(String n, Country c, GENDER g){
        super (n, c, g);        
    }

    @Override
    public void addPlayer(Player p){
        if(country.equals(p.getNacionality())){
            super.addPlayer(p);
        }
    }
}