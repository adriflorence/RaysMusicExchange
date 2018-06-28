package Products;

public abstract class Product implements ISell {

    String make;
    String model;
    int buyPrice;
    int sellPrice;
    String description;

    public Product(String make, String model, int buyPrice, int sellPrice, String description) {
        this.make = make;
        this.model = model;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.description = description;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public int calculateProfit() {
        return sellPrice - buyPrice;
    }
}
