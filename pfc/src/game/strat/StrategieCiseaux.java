package game.strat;
import game.Coup;

public class StrategieCiseaux implements Strategie {
    public Coup prochainCoup() {
        return Coup.CISEAUX;
    }
}