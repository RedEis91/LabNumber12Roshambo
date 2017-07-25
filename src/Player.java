//abstract master human class
public class Player {
    //needs abstract generate rochambo method
    private String name;
    private int wins;

    public Player() {
        name = "";
        wins = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWins() {
        return wins;
    }

    public void setWins() {
        this.wins++;
    }


    public Player(String name, int wins) {
        this.name = name;
        this.wins = wins;
    }
    public Roshambo generateRoshambo() {
        Roshambo r1 = Roshambo.ROCK;
        double i =  Math.floor(Math.random() * (3 - 1)) + 1; //The maximum is exclusive and the minimum is inclusive
        if (i == 1.00) {
            r1 = Roshambo.ROCK;
        }
        if (i == 2.00) {
            r1 = Roshambo.PAPER;
        }
        if (i == 2.00) {
            r1 = Roshambo.SCISSORS;
        }
        return r1;
    }



}
