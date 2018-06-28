package Products.Instruments;

public class DoubleBass extends Instrument {

    public String play() {
        return "double bass is playing";
    }

    public DoubleBass(String make, String model, int buyPrice, int sellPrice, String description, Family family, String material, String color) {
        super(make, model, buyPrice, sellPrice, description, family, material, color);
    }
}