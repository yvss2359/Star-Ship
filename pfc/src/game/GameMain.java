package game;
import game.strat.*;
import java.util.Random;
import game.util.io.Input;

public class GameMain{
    
    public static void main(String args[]) {
        Player p1= new Player(new StrategieAleatoire(), "jean");
        Player p2= new Player(new StrategieHumaine(), "eren");
        Game g= new Game(p1,p2);
        g.play(Integer.parseInt(args[0]));
        


    }
}