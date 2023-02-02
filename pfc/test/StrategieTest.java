import jdk.jfr.Timestamp;
import org.junit.*;
import static org.junit.Assert.*;

public class StrategieTest{
    @Test 
    public void testDeProchainCoupStrategiePierre(){
        Strategie s=new StrategiePierre();
        assertEquals(Coup.PIERRE,s.prochainCoup());
    }
    @Test 
    public void testDeProchainCoupStrategieCiseaux(){
        Strategie s=new StrategieCiseaux();
        assertEquals(Coup.CISEAUX,s.prochainCoup());
    }
    @Test 
    public void testDeProchainCoupStrategieFeuille(){
        Strategie s=new StrategieFeuille();
        assertEquals(Coup.FEUILLE,s.prochainCoup());
    }
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(StrategieTest.class);
    }
}