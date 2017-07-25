//Rocky Roccoco always selects rock
public class RockyRoccoco extends Player {
    public RockyRoccoco(String name, int wins, int losses) {
        super(name, wins, losses);
    }
    @Override
    public Roshambo generateRoshambo() {
        Roshambo r1 = Roshambo.ROCK;
        return r1;
    }
}
