package Lab3;

public class League extends Competition {

    public League(String name, Country country, GENDER gender) {
        super(false, name, country, gender);
    }

    @Override
    public void generateMatches(){

    }

    public void printTables(){

    }

    /*
    public void printLeagueClasification() {
        System.out.println(" ");
        System.out.println("Classificació de la lliga:");
        System.out.println("Equip\t\t   Jugats\t Guanyats\t Empatats\t  Perduts");

        // Ordenar la llista d'equips segons el número de partitss guanyats de forma descendent usant l'algoritme d'ordenació' de bombolla
        for (int i = 0; i < teamList.size() - 1; i++) {
            for (int j = 0; j < teamList.size() - i - 1; j++) {
                if (teamList.get(j).getNumWins() < teamList.get(j + 1).getNumWins()) {
                    Team temp = teamList.get(j);
                    teamList.set(j, teamList.get(j + 1));
                    teamList.set(j + 1, temp);
                }
            }
        }

        for (Team team : teamList) {
            System.out.println(team.getName() + "\t\t" + team.getNumMatches() + "\t\t" + team.getNumWins() +
                    "\t\t" + team.getNumTies() + "\t\t" + team.getNumLosses());
        }
    }
    */
}