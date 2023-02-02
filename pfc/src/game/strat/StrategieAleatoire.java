package game.strat;
import game.Coup;

public class StrategieAleatoire implements Strategie {
    public Coup prochainCoup() {
        return Coup.alea();
    }
}
