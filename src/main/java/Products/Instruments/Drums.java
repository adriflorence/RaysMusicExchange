package Products.Instruments;

public class Drums extends Instrument {

    int cymbals;
    int toms;

    public String play() {
        return "drums are playing";
    }

    public Drums(String make, String model, int buyPrice, int sellPrice, String description, Family family, String material, String color, int cymbals, int toms) {
        super(make, model, buyPrice, sellPrice, description, family, material, color);
        this.cymbals = cymbals;
        this.toms = toms;
    }

}