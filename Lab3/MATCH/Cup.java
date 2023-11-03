package Lab3.MATCH;

import java.util.LinkedList;

import Lab3.COMPETITION.Competition;
import Lab3.COUNTRY.Country;
import Lab3.TEAM.Team;

public class Cup extends Competition{
        private LinkedList<Team> ListTeam;
        private LinkedList<Match> ListMatch;

        public Cup(String name, Country country, GENDER gender) {
            super(false, name, country, gender);
        }

        public LinkedList<Team> getListTeam() {
            return ListTeam;
        }

        public LinkedList<Match> getListMatch() {
            return ListMatch;
        }

        @Override
        public void simulateMatches() {
            
        }
        
        public void printBracket(){
            
        }
}
