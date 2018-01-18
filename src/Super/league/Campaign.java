package Super.league;



import java.text.NumberFormat;
import java.util.Locale;

public class Campaign {

    public static void main (String[] args) {

        SuperLeague theTeams = new SuperLeague();

        theTeams.addTeam(new Team("Fred"));
        theTeams.addTeam(new Team("Jim"));
        theTeams.addTeam(new Team("Alice"));
        theTeams.addTeam(new Team("Jane"));
        theTeams.addTeam(new Team("Emily"));

        theTeams.sortTeam ();
        theTeams.printTeam ();

        NumberFormat gb = NumberFormat.getCurrencyInstance (Locale.UK);

        System.out.println ();
        System.out.println ("Total Amount Raised: " + gb.format (theTeams.getTotalRaised ()));

    }
}
