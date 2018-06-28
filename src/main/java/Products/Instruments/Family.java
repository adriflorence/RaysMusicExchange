package Products.Instruments;

public enum Family {

    BRASS("brass"),
    STRINGS("strings"),
    WOODWIND("woodwind"),
    PERCUSSION("percussion"),
    KEYBOARD("keyboard");

    private final String name;

    Family(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
