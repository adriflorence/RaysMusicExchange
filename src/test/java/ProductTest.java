import Products.Instruments.Drums;
import Products.Instruments.Family;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductTest {

    Drums drums;

    @Before
    public void setUp() throws Exception {
        drums = new Drums("Premier", "Cabria Lite", 1000, 1200, "great kit", Family.PERCUSSION, "birch", "black", 4, 3);
    }

    @Test
    public void canCalculateProfit(){
        assertEquals(200, drums.calculateProfit());
    }
}
