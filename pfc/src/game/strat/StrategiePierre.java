package game.strat;
import game.Coup;

public class StrategiePierre implements Strategie {
    public Coup prochainCoup() {
        return Coup.PIERRE;
    }
}