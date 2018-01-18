package Super.league;

public class Team implements Comparable <Team> {

    private String name;
    private int wins;
    private int loses;
    private int draws;
    private int totalPointsScored;
    private int totalPointsConceded;

    public Team(String name) {
        this.name = name;
        this.wins = 0;
        this.loses = 0;
        this.totalPointsScored = 0;
        this.totalPointsConceded = 0;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    @Override
    public String toString () {
        return "Member{" +
                "name='" + name + '\'' +
                ", wins='" + wins + '\'' +
                ", amountRaised=" +  +
                '}';
    }

    public void printFormatted () {

        final String formatString = "%-4s %-12s %8s";

        System.out.println (String.format (formatString, this.wins, this.name, (this.amountRaised)));
    }

    @Override
    public int compareTo (Team fr) {
        if (fr.amountRaised > this.amountRaised) {
            return 1;
        }
        else if (fr.amountRaised < this.amountRaised) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
