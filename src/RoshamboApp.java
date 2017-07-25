import java.util.Scanner;

//main class
public class RoshamboApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter name: ");
        String name = scan.nextLine();
        int wins = 0;
        String play;
        You you = new You(name, wins);
        do {
            RegularSizedRudy rudy = new RegularSizedRudy("Rudy", 0);
            System.out.println("Rock, paper or scissors?: ");
            String s = scan.next();
            you.generateRoshambo(s);

            Roshambo rosh1 = you.r1;
            Roshambo rosh2 = rudy.generateRoshambo();
            System.out.println("your selection was " + rosh1);
            System.out.println("Rudys selection was " + rosh2);

            if (rosh1.equals(Roshambo.ROCK) && rosh2.equals(Roshambo.SCISSORS) || rosh1.equals(Roshambo.SCISSORS) && rosh2.equals(Roshambo.PAPER) || rosh1.equals(Roshambo.PAPER) && rosh2.equals(Roshambo.ROCK)) {
                System.out.println("You win!");
                you.setWins();
            } else if (rosh1.equals(rosh2)) {
                System.out.println("You tied! Everyone loses");
            } else {
                System.out.println("You lost!");
                System.out.println(rosh1);
                System.out.println(rosh2);
            }
            System.out.println("You've won " + you.getWins() + " times.");
            System.out.println("Wanna play again?");
            play = scan.next();

        } while (play.contains("Y") || play.contains("y"));
    }
}
