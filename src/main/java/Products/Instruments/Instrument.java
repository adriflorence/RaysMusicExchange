package Products.Instruments;

import Products.Product;

public abstract class Instrument extends Product implements IPlay {

    Family family;
    String material;
    String color;

    public Instrument(String make, String model, int buyPrice, int sellPrice, String description, Family family, String material, String color) {
        super(make, model, buyPrice, sellPrice, description);
        this.family = family;
        this.material = material;
        this.color = color;
    }

    public Family getFamily() {
        return family;
    }
}
