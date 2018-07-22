import Products.Accessories.DrumSticks;
import Products.ISell;
import Products.Instruments.Cello;
import Products.Instruments.DoubleBass;
import Products.Instruments.Drums;
import Products.Instruments.Family;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    DoubleBass doublebass;
    Drums drums;
    Cello cello;
    DrumSticks drumsticks;
    Shop shop;

    @Before
    public void setUp() throws Exception {
        doublebass = new DoubleBass("Cecilio", "CDB-100", 800, 1450, "wonderful", Family.STRINGS, "oak", "oak");
        drums = new Drums("Premier", "Cabria Lite", 1000, 1200, "great kit", Family.PERCUSSION, "birch", "black", 4, 3);
        cello = new Cello("Primavera", "100", 290, 470, "great condition", Family.STRINGS, "maple", "light","4/4");
        drumsticks = new DrumSticks("Vic Firth", "American Classic", 9, 12, "brilliantly balanced, great sounding drum-sticks", "5A" );

        shop = new Shop("CodeClan Music Shop");

        shop.addToStock(doublebass);
        shop.addToStock(drumsticks);
        shop.addToStock(drums);
        shop.addToStock(cello);
    }

    @Test
    public void canAdd(){
        shop.addToStock(cello);
        assertEquals(5, shop.getStockCount());
    }

    @Test
    public void canRemove(){
        shop.removeFromStock(drums);
        assertEquals(3, shop.getStockCount());
    }

    @Test
    public void calculateTotalPotentialProfit(){
        assertEquals(1033, shop.totalPotentialProfit());
    }

    @Test
    public void canReturnInstancesOfType(){
        ArrayList<ISell> strings = new ArrayList<ISell>();
        strings.add(doublebass);
        strings.add(cello);
        assertEquals(strings, shop.getAllOfOneType(Family.STRINGS));
    }

}
