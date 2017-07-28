import java.util.Scanner;

//main class
public class RoshamboApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Rock Paper Scissors!");
        //prompt for name
        System.out.print("Please enter name: ");
        String name = scan.nextLine();
        int wins = 0;
        int losses = 0;
        //create new You instance from Player superclass
        You you = new You(name, wins, losses);
        RegularSizedRudy rudy = new RegularSizedRudy("Rudy", 0, 0);
        RockyRoccoco rocky = new RockyRoccoco("Rocky", 0, 0);
        Player p = new RegularSizedRudy("P", 0, 0);
        String play;
        //string to hold opponent selection
        String opponent;
        //greet user by name
        System.out.println("Welcome " + you.getName() +"!");

        //have user select who they are playing against
        System.out.println("Would you like to play against Rocky or Rudy today?");
        //assign user input to their opponent
        opponent = scan.next();
        if (opponent.equalsIgnoreCase("Rocky")) {
            RPS(scan, you, rocky);
        } else if (opponent.equalsIgnoreCase("Rudy")) {
            RPS(scan, you, rudy);
        } else {
            System.out.println("\"" +opponent + "\"?" + "\n" + "Hmm...." + "\n" + "I don't know who that is so you're playing against the computer, p.");
            System.out.println("Have fun!");
            RPS(scan, you, p);
        }
        // final greeting
        System.out.println("Peace out " + you.getName() + "!");
    }
    public static void RPS(Scanner scan, You you, Player p) {
        String play;
        do {
            String s = getMove(scan);
            if (!s.equalsIgnoreCase("Rock") && !s.equalsIgnoreCase("Paper") && !s.equalsIgnoreCase("Scissors")) {
                System.out.println("Invalid selection");
                s = getMove(scan);
            }
            you.s = s;
            you.generateRoshambo();
            Roshambo rosh1 = you.r1;


            Roshambo rosh2 = p.generateRoshambo();
            System.out.println(""+ p.getName()+ "'s selection was " + rosh2);
            //conditional logic to see who wins and who loses
            if (rosh1.equals(Roshambo.ROCK) && rosh2.equals(Roshambo.SCISSORS) || rosh1.equals(Roshambo.SCISSORS) && rosh2.equals(Roshambo.PAPER) || rosh1.equals(Roshambo.PAPER) && rosh2.equals(Roshambo.ROCK)) {
                System.out.println("You win!");
                you.setWins();
            } else if (rosh1.equals(rosh2)) {
                System.out.println("You tied, so everyone kinda loses...but we won't hold that against you.");
            } else {
                System.out.println("You lost!");
                you.setLosses();
            }
            System.out.println("You've won " + you.getWins() + " times.");
            System.out.println("You've lost " + you.getLosses() + " times.");
            play = playAgain(scan);
            if (!play.contains("Y") && !play.contains("y") && !play.contains("n") && !play.contains("N") ) {
                System.out.println("Invalid selection.");
                play = playAgain(scan);
            }

        } while (play.contains("Y") || play.contains("y"));
    }

    public static String getMove(Scanner scan) {
        System.out.println("Rock, paper or scissors?: ");
        return scan.next();
    }

    public static String playAgain(Scanner scan) {
        String play;
        System.out.print("Play again? (Y/N) ");
        play = scan.next();
        return play;
    }
}
