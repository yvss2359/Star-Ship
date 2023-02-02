package game.strat;
import game.Coup;
import game.util.io.Input;

public class StrategieHumaine implements Strategie {
    public Coup prochainCoup() {
        String user=Input.readString();
        String pierre="PIERRE";
        String feuille="FEUILLE";
        String ciseaux="CISEAUX";
        if (user.equals("PIERRE") || user.equals("pierre") || user.equals("ROCK") || user.equals("rock")){
            user=pierre;
        }
        else if (user.equals("FEUILLE") || user.equals("feuille") || user.equals("PAPER") || user.equals("paper")){
            user=feuille;
        }
        else if (user.equals("CISEAUX") || user.equals("ciseaux") || user.equals("SCISSORS") || user.equals("scissors")){
            user=ciseaux;
        }

        return Coup.valueOf(user);
    }
}