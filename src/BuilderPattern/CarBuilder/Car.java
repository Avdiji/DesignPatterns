package BuilderPattern.CarBuilder;

import java.awt.Color;

// Business Object
public class Car {

    // member all private, all final to make businessObject immutable
    private final String brand;
    private final String model;
    private final int amountOfDoors;
    private final Color color;

    // Constructor (includes a big amount of parameters and gets messy)
    // set to protected, so that access to this Constructor is denied outside of this package
    protected Car(String brand, String model, int amountOfDoors, Color color) {
        this.brand = brand;
        this.model = model;
        this.amountOfDoors = amountOfDoors;
        this.color = color;
    }

    // Getter and no Setter for data-integrity //
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getAmountOfDoors() { return amountOfDoors; }
    public Color getColor() { return color; }
    // Getter and no Setter for data-integrity //

    @Override
    public String toString(){
        return String.format("Brand: %s\nModel: %s\nAmountOfDoors: %d\nColor: %s", brand, model, amountOfDoors, color.toString());
    }
}
