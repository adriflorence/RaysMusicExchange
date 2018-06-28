package Products.Accessories;

import Products.Product;

public class DrumSticks extends Product {

    String size;

    public DrumSticks(String make, String model, int buyPrice, int sellPrice, String description, String size) {
        super(make, model, buyPrice, sellPrice, description);
        this.size = size;
    }

}
