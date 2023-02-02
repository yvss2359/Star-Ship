package game;
import game.strat.*;

public class Game{
    private Player p1;
    private Player p2;

    public Game(Player p1, Player p2){
        this.p1=p1;
        this.p2=p2;
    }
    /**
     * Distribue les points au joueurs
     */
    public void givePoints(int n){
        if (n==1){
            this.p1.addPoints(2);
            System.out.println(p1.getName()+" l emporte et gagne 2 points !");
        }
        if (n==0){
            this.p1.addPoints(1);
            this.p2.addPoints(1);
            System.out.println(p1.getName()+" et "+p2.getName()+" on fait match nul et chaqu'un gagne  1 point!");
        }
        else if (n==-1){
            this.p2.addPoints(2);
            System.out.println(p2.getName()+" l emporte et gagne 2 points !");
        }
    }
    
    /**
     * Une manche de jeu
     */
    public void playOneRound(){
        Coup c1=this.p1.getCoup(); 
        Coup c2=this.p2.getCoup();
        int res=Coup.compare(c1, c2);
        System.out.println(p1.getName()+" a joue "+c1);
        System.out.println(p2.getName()+" a joue "+c2);
        givePoints(res);
    }
    
    /** renvoi le gagnant de la partie 
     * @param nbRounds le nombre de manches de la partie 
     * @return le joueur gagant de la partie
     */
    public Player play(int nbRounds){
        int i=0;
        Player winner=null;
        
        while(i<nbRounds){
            playOneRound();
            i++;
        }
        if (this.p1.getPoints()>this.p2.getPoints()){
            System.out.println("SCORE FINALE: "+ p1.getName()+" gagne avec "+p1.getPoints()+" points contre "+p2.getName()+" avec "+p2.getPoints()+" de points !"); 
            winner=p1;
        }
        else if (this.p1.getPoints()<this.p2.getPoints()){
            System.out.println("SCORE FINALE: "+ p2.getName()+" gagne avec "+p2.getPoints()+" points contre "+p1.getName()+" avec "+p1.getPoints()+" de points !");
            winner=p2;
        }
        else if (this.p1.getPoints()==this.p2.getPoints()){
            System.out.println("SCORE FINALE: "+ p2.getName()+" et "+ p1.getName()+" sont egseceaux avec "+ p1.getPoints()+" de point !");
        }
            
        return winner;
    } 


}
