import Products.Instruments.DoubleBass;
import Products.Instruments.Family;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoubleBassTest {

    DoubleBass doublebass;

    @Before
    public void setUp() throws Exception {
        doublebass = new DoubleBass("Cecilio", "CDB-100", 800, 1450, "wonderful", Family.STRINGS, "oak", "oak");
    }

    @Test
    public void hasDescription(){
        assertEquals("wonderful", doublebass.getDescription());
    }
}
