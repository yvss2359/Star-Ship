import jdk.jfr.Timestamp;
import org.junit.*;
import static org.junit.Assert.*;

public class GameTest{
   
  /**private Game game;
    private Player p1;
    private Player p2;
    @Before
    public void init(){
        p1= new Player(new StrategieAleatoire(), "jean");
        p2= new Player(new StrategieAleatoire(), "eren");
        game=new Game(p1,p2);
      }
      */
      @Test
      public void testDeGivepointsQaundJoueurEstGagant(){
        Player p1= new Player(new StrategieAleatoire(), "jean");
        Player p2= new Player(new StrategieAleatoire(), "eren");
        Game game=new Game(p1,p2);
        assertSame(p1.getPoints(),0);
        assertSame(p2.getPoints(),0);
        game.givePoints(1);
        assertSame(p1.getPoints(),2);
        assertSame(p2.getPoints(),0);
      }
      @Test
      public void testDeGivepointsQaundMatchNull(){
        Player p1= new Player(new StrategieAleatoire(), "jean");
        Player p2= new Player(new StrategieAleatoire(), "eren");
        Game game=new Game(p1,p2);
        assertSame(p1.getPoints(),0);
        assertSame(p2.getPoints(),0);
        game.givePoints(0);
        assertSame(p1.getPoints(),1);
        assertSame(p2.getPoints(),1);
      }
      @Test
      public void testDeGivepointsQaundJoueurEstPerdand(){
        Player p1= new Player(new StrategieAleatoire(), "jean");
        Player p2= new Player(new StrategieAleatoire(), "eren");
        Game game=new Game(p1,p2);
        assertSame(p1.getPoints(),0);
        assertSame(p2.getPoints(),0);
        game.givePoints(-1);
        assertSame(p1.getPoints(),0);
        assertSame(p2.getPoints(),2);
      }
      @Test
      public void testDePlaysip1gagant(){
        Player p1= new Player(new StrategiePierre(), "jean");
        Player p2= new Player(new StrategieCiseaux(), "eren");
        Game game=new Game(p1,p2);
        assertEquals(p1,game.play(1));
      }
      @Test
      public void testDePlaysip2gagant(){
        Player p1= new Player(new StrategiePierre(), "jean");
        Player p2= new Player(new StrategieFeuille(), "eren");
        Game game=new Game(p1,p2);
        assertEquals(p2,game.play(1));
      }
      @Test
      public void testDePlayQuandMatchNull(){
        Player p1= new Player(new StrategieFeuille(), "jean");
        Player p2= new Player(new StrategieFeuille(), "eren");
        Game game=new Game(p1,p2);
        assertEquals(null,game.play(1));
      }
      @Test
    public void testCompareAvecPierreEtFeuille(){
        Coup c1=Coup.PIERRE;
        Coup c2=Coup.FEUILLE;
        assertSame(-1,Coup.compare(c1, c2));
        assertSame(1,Coup.compare(c2, c1));
    }
    @Test
    public void testCompareAvecCiseauxEtFeuille(){
        Coup c1=Coup.FEUILLE;
        Coup c2=Coup.CISEAUX;
        assertSame(-1,Coup.compare(c1, c2));
        assertSame(1,Coup.compare(c2, c1));
    }
    @Test 
    public void testCompareAvecCiseauxEtPierre(){
        Coup c1=Coup.CISEAUX;
        Coup c2=Coup.PIERRE;
        assertSame(-1,Coup.compare(c1, c2));
        assertSame(1,Coup.compare(c2, c1));
    }
    @Test
    public void testCompareAvecMemeCoups(){
        Coup c1=Coup.PIERRE;
        Coup c2=Coup.PIERRE;
        Coup c3=Coup.FEUILLE;
        Coup c4=Coup.FEUILLE;
        Coup c5=Coup.CISEAUX;
        Coup c6=Coup.CISEAUX;
        assertSame(0,Coup.compare(c1, c2));
        assertSame(0,Coup.compare(c2, c1));
        assertSame(0,Coup.compare(c3, c4));
        assertSame(0,Coup.compare(c4, c3));
        assertSame(0,Coup.compare(c5, c6));
        assertSame(0,Coup.compare(c6, c5));
    }
    @Test 
    public void testDegetCoup(){
        Player p=new Player(new StrategieFeuille(), "reiner");
        assertEquals(Coup.FEUILLE,p.getCoup());
    }
    @Test 
    public void testDegetName(){
        Player p=new Player(new StrategieFeuille(), "reiner");
        assertEquals("reiner",p.getName());
    }
    @Test 
    public void testDegetPoints(){
        Player p=new Player(new StrategieFeuille(), "reiner");
        assertSame(0,p.getPoints());
    }
    @Test 
    public void testDeAddpoint(){
        Player p=new Player(new StrategieFeuille(), "reiner");
        p.addPoints(2);
        assertSame(2,p.getPoints());
    }
      public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(GameTest.class);
    }
    
}