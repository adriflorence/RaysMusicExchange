import Products.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;
    private Double money;

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
}
