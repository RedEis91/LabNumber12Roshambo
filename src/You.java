//human input
public class You extends Player{
    public You(String name, int wins, int losses) {
        super(name, wins, losses);
    }

    Roshambo r1;
    String s;
    @Override
    public Roshambo generateRoshambo() {
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

    public Roshambo getR1() {
        return r1;
    }

    public void setR1(Roshambo r1) {
        this.r1 = r1;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
