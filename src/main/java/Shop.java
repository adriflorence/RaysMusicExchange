import Products.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock = new ArrayList<ISell>();
    private Double money;

    public Shop(String name) {
        this.name = name;
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


}
