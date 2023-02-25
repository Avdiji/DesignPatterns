package BuilderPattern.CarBuilder;

import java.awt.Color;

// Concrete Class (implements the Builder Interface)
public class CarBuilder implements ICarBuilder {

    private String brand;
    private String model;
    private int amountOfDoors;
    private Color color;

    @Override
    public Car build() {
        return new Car(brand, model, amountOfDoors, color);
    }

    @Override
    public ICarBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public ICarBuilder model(String model) {
        this.model = model;
        return this;
    }

    @Override
    public ICarBuilder amountOfDoors(int amountOfDoors) {
        this.amountOfDoors = amountOfDoors;
        return this;
    }

    @Override
    public ICarBuilder color(Color color) {
        this.color = color;
        return this;
    }
}
