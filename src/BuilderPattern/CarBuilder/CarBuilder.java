package BuilderPattern.CarBuilder;

import java.awt.Color;

// Class implements methods, which set the members of the car
public class CarBuilder {

    // Default-Values of the CarBuilder
    private String brand;
    private String model;
    private int amountOfDoors;
    private Color color;

    // Method returns a new instance of a Car
    public Car build() {
        return new Car(brand, model, amountOfDoors, color);
    }

    // set brand of the car and return this builder
    public CarBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    // set model of the car and return this builder
    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }

    // set amountOfDoors of the car and return this builder
    public CarBuilder amountOfDoors(int amountOfDoors) {
        this.amountOfDoors = amountOfDoors;
        return this;
    }

    // set Color of the car and return this builder
    public CarBuilder color(Color color) {
        this.color = color;
        return this;
    }
}
