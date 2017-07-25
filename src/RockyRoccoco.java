//Rocky Roccoco always selects rock
public class RockyRoccoco extends Player {
    public RockyRoccoco(String name, int wins) {
        super(name, wins);
    }
    @Override
    public Roshambo generateRoshambo() {
        Roshambo r1 = Roshambo.ROCK;
        return r1;
    }
}
