package game.strat;
import game.Coup;

public interface Strategie {
    /**
     * decide du prochain coup que va jouer le joueur 
     */
    public Coup prochainCoup();
}
