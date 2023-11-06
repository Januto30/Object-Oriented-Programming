
public class NationalTeam extends Team {

    public NationalTeam(String n, Country c, GENDER g) {
        super (n, c, g);        
    }

    @Override
    public void addPlayer(Player p) {
        super.addPlayer(p);

        if(country.equals(p.getNacionality())) {
            super.addPlayer(p);

        }
    }
}
