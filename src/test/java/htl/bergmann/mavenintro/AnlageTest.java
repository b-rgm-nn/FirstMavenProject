package htl.bergmann.mavenintro;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matthias
 */
public class AnlageTest {

    public AnlageTest() {
    }

    @Test
    public void testJahresAfa() {
        Anlage a = new Anlage(2000.0, 10);
        assertEquals(200.0, a.jahresAfa(), 0.01);
    }

    @Test
    public void testBuchwert1() {
        Anlage a = new Anlage(2000.0, 10);
        a.updateBuchwert(5);
        assertEquals(1000.0, a.getBuchwert(), 0.01);
    }

    @Test
    public void testBuchwert2() {
        Anlage a = new Anlage(2000.0, 10);
        a.updateBuchwert(12);
        assertEquals(1.0, a.getBuchwert(), 0.01);
    }

}
