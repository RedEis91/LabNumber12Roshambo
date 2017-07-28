//abstract master human class
public abstract class Player {
    //needs abstract generate rochambo method
    private String name;
    private int wins;
    private int losses;

    public Player() {
        name = "";
        wins = 0;
        losses = 0;
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
    public void setLosses() {
        this.losses++;
    }
    public int getLosses() {
        return losses;
    }


    public Player(String name, int wins, int losses) {
        this.name = name;
        this.wins = wins;
        this.losses = losses;
    }
    abstract Roshambo generateRoshambo();


}
