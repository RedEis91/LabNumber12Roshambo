//human input
public class You extends Player{
    public You(String name, int wins) {
        super(name, wins);
    }

    Roshambo r1;

    public Roshambo generateRoshambo(String s) {
        if (s.equalsIgnoreCase("ROCK")) {
            r1 = Roshambo.ROCK;
        }
        if (s.equalsIgnoreCase("PAPER")) {
            r1 = Roshambo.PAPER;
        }
        if (s.equalsIgnoreCase("SCISSORS")) {
            r1 = Roshambo.SCISSORS;
        }
        return r1;
    }


}
