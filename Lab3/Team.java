import java.util.LinkedList;

public class Team {
    private String name;
    protected Country country;
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

    public int getNumMatches() {
        return numMatches;
    }

    public int getNumWins() {
        return numWins;
    }

    public int getNumTies() {
        return numTies;
    }

    public int getNumLosses() {
        return numLosses;
    }

    public int getNumGoalsScored() {
        return numGoalsScored;
    }

    public int getNumGoalsAgainst() {
        return numGoalsAgainst;
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


    public void updateStats(Match match) {
        this.numMatches++;

        if (match.getHomeTeam() == this) {
            this.numGoalsScored += match.getHomeGoals();
            this.numGoalsAgainst += match.getAwayGoals();

            if (match.getHomeGoals() > match.getAwayGoals()) {
                this.numWins++;

            } else if (match.getHomeGoals() < match.getAwayGoals()) {
                this.numLosses++;

            } else {
                this.numTies++;

            }

            for (Player player : playerList) {
                int goalsScored = 0;

                for (Player scorer : match.getHomeScorers()) {
                    if (scorer == player) {
                        goalsScored++;

                    }
                } 
                player.updateStats(match); 
            }

        } else if (match.getAwayTeam() == this) {
            this.numGoalsScored += match.getAwayGoals();
            this.numGoalsAgainst += match.getHomeGoals();

            if (match.getAwayGoals() > match.getHomeGoals()) {
                this.numWins++;

            } else if (match.getAwayGoals() < match.getHomeGoals()) {
                this.numLosses++;

            } else {
                this.numTies++;

            }

            for (Player player : playerList) {
                int goalsScored = 0;
                
                for (Player scorer : match.getAwayScorers()) {
                    if (scorer == player) {
                        goalsScored++;

                    }
                }
                player.updateStats(match); 
            }
        }
    }


    /*  Tot això ja importa que ho faci l'objecte TEAM
    ------------------------------------------------------------------------------------------
    public void playMatch(int scored, int against) {
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
        System.out.println(" ");
        System.out.println("Informació de l'equip: ");
        System.out.println("Nom equip: " + name);
        System.out.println("Pais: " + country.getName());
        System.out.println("Genere: " + gender);
        System.out.println("Total partits jugats: " + numMatches);
        System.out.println("Total partits guanyats: " + numWins);
        System.out.println("Total partits empatats: " + numTies);
        System.out.println("Total partits perduts: " + numLosses);
        System.out.println("Total gols marcats: " + numGoalsScored);
        System.out.println("Total gols encaixats: " + numGoalsAgainst);
        System.out.println(" ");
    }

    public void printTeam() {
        System.out.println(" ");
        System.out.println("________________");
        System.out.println("|"+ name);
        System.out.println("|---------------");

        for (Player player : playerList) {
            System.out.println("|- "+ player.getName());
        }
        System.out.println("----------------");
        System.out.println(" ");
    }

    ------------------------------------------------------------------------------------------
    */
}
