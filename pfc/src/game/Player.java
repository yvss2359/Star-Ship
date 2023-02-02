package game;
import  game.strat.*;

public class Player  {

    private Strategie strategie;
    private String name;
    private int points;

    public Player(Strategie strategie, String name)  {
        this.strategie=strategie;
        this.name=name;
        this.points=0;

    }
    public Player ( String name){
        this.name=name;
        this.points=0;
        this.strategie=null;
    }

    /**
    *   @return coup selon type joueur
    */
    public Coup getCoup() {
        return strategie.prochainCoup();
    }
    /**
     * @return name le nom du joueur
     */
    public String getName(){
        return this.name;
    }
    /**
     * @return les points du joueur
     */
    public int getPoints(){
        return this.points;
    }
    /**
     * ajoute des points au gagnant et si match null
     * @param le nombre de points a ajouter 
     */
    public void addPoints(int n){
      this.points=this.points+n;
        
    }
    /**verifie si les deux joueurs sont egeaux
     * @return <code>true</code> si c'est vrais et <code>false</code> sinon
     */
}




