import Products.Instruments.Cello;
import Products.Instruments.Family;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CelloTest {

    Cello cello;

    @Before
    public void setUp() throws Exception {
        cello = new Cello("Primavera", "100", 290, 470, "great condition", Family.STRINGS, "maple", "light","4/4");
    }

    @Test
    public void hasSize() {
        assertEquals("4/4", cello.getSize());
    }
}