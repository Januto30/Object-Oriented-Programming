package Lab4;

public abstract class PlayerStats implements Comparable<PlayerStats> {
    protected Player player;
    protected int numMatches;

    public PlayerStats(Player p) {
        this.player = p;

    }

    public void updateStats(Match match) {
        this.numMatches += 1;
        
    }

    public abstract void printStats();
    
}