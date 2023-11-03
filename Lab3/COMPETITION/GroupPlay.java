package Lab3.COMPETITION;

import java.util.LinkedList;

import Lab3.COUNTRY.Country;

public class GroupPlay extends Competition {
    private Integer noGroups;
    private LinkedList<League> ListLeagues;

    public GroupPlay(String name, Country country, GENDER gender) {
        super(false, name, country, gender);
    }

    public Integer getNoGroups() {
        return noGroups;
    }

    public LinkedList<League> getListLeagues() {
        return ListLeagues;
    }

    @Override
    public void generateMatches() {

    }

    @Override
    public void simulateMatches() {

    }

    public void printTables(){
        
    }
}
