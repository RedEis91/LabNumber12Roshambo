import java.util.Scanner;

//main class
public class RoshamboApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.print("Please enter name: ");
        String name = scan.nextLine();
        int wins = 0;
        int losses = 0;
        String play;
        You you = new You(name, wins, losses);
        RegularSizedRudy rudy = new RegularSizedRudy("Rudy", 0, 0);
        do {

            System.out.println("Rock, paper or scissors?: ");
            String s = scan.next();
            you.generateRoshambo(s);
            Roshambo rosh1 = you.r1;
            Roshambo rosh2 = rudy.generateRoshambo();
            System.out.println("Rudys selection was " + rosh2);
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
            System.out.print("Play again? (Y/N) ");
            play = scan.next();

        } while (play.contains("Y") || play.contains("y"));

        System.out.println("Peace!");
    }
}
