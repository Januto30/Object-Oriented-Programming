package Lab4;
public class NationalTeam extends Team {

    public NationalTeam(String name, Country country, GENDER gender) {
        super (name, country, gender);        
    }

    @Override
    public void addPlayer(Player p) {
        if(country.equals(p.getNacionality())) {
            super.addPlayer(p);

        } else {
            if (p.getGender() == true) {
                System.out.println("-> La jugadora " + p.getName() +  " no se la pot assignar per raons de nacionalitat al equip " + super.getName() + ", perquè és de " + p.country.getName() + ".");

            } else {
                System.out.println("-> El jugador " + p.getName() +  " no se'l pot assignar per raons de nacionalitat al equip " + super.getName() + ", perquè és de " + p.country.getName() + ".");
            
            }

            System.out.println("");
        }
    }
}
