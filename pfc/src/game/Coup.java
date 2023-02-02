package game;
import java.util.Random;

public enum Coup{
    PIERRE,FEUILLE,CISEAUX;
    private static Random random= new Random();
    /**compare les coupe et designe le gagant
     * @param le premier coup a comparer
     * @param le deuxiemme coup a comparer
     * @return le resultat de la comparaison
     */
    public static int compare( Coup c1, Coup c2){
        int res=0;
        if(c1.equals(FEUILLE) && c2.equals(PIERRE) || c1.equals(CISEAUX) && c2.equals(FEUILLE) || c1.equals(PIERRE) && c2.equals(CISEAUX)){
            res=1;
        }
        if(c1.equals(PIERRE) && c2.equals(FEUILLE) || c1.equals(FEUILLE) && c2.equals(CISEAUX) || c1.equals(CISEAUX) && c2.equals(PIERRE)){
            res=-1;
        }
        return res;
    }

    public static Coup alea(){
        return Coup.values()[random.nextInt(Coup.values().length)];
    }
}