//random rochambo player

public class RegularSizedRudy extends Player {
    public RegularSizedRudy(String name, int wins, int losses) {
        super(name, wins, losses);}

    public Roshambo generateRoshambo() {
        Roshambo r1 = Roshambo.ROCK;
        int i = (int) (Math.floor(Math.random() * (3 - 1)) + 1); //The maximum is exclusive and the minimum is inclusive
        if (i == 1) {
            r1 = Roshambo.ROCK;
        }
        if (i == 2) {
            r1 = Roshambo.PAPER;
        }
        if (i == 3) {
            r1 = Roshambo.SCISSORS;
        }
        return r1;
    }
}

