package game.strat;
import game.Coup;

public class StrategieFeuille implements Strategie {
    public Coup prochainCoup() {
        return Coup.FEUILLE;
    }
}