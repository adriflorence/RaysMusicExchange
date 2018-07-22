import Products.ISell;
import Products.Instruments.Family;
import Products.Instruments.Instrument;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock = new ArrayList<ISell>();
    private int money;

    public Shop(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public int getStockCount() {
        return stock.size();
    }

    public void addToStock(ISell product) {
        stock.add(product);
    }

    public void removeFromStock(ISell product) {
        if(stock.contains(product)) {
            stock.remove(product);
        }
    }

    public int totalPotentialProfit() {
        int totalProfit = 0;
        for(ISell item : stock) {
            totalProfit += item.calculateProfit();
        }
        return totalProfit;
    }


    public ArrayList<ISell> getAllOfOneType(Family familyToFind) {
        ArrayList<ISell> certainType = new ArrayList<ISell>();
        for(ISell item : stock){
            if (item instanceof Instrument){
                if (((Instrument) item).getFamily() == familyToFind){
                    certainType.add(item);
                }
            }
        }
        return certainType;
    }


}
