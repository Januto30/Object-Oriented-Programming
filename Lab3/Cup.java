package Lab3;

import java.util.LinkedList;

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

        
}
