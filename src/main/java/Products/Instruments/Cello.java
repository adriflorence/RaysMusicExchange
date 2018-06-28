package Products.Instruments;

public class Cello extends Instrument{

    String size;

    public String play() {
        return "cello is playing";
    }

    public Cello(String make, String model, int buyPrice, int sellPrice, String description, Family family, String material, String color, String size) {
        super(make, model, buyPrice, sellPrice, description, family, material, color);
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
