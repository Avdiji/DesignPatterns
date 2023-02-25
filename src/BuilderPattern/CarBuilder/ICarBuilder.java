package BuilderPattern.CarBuilder;

import java.awt.Color;

// interface declares all the methods, needed to create a Car (multiple implementations of this interface can be used with the same director)
public interface ICarBuilder {

    // Method returns a new instance of a Car
    Car build();

    // set brand of the car and return this builder
    ICarBuilder brand(String brand);

    // set model of the car and return this builder
    ICarBuilder model(String model);

    // set amountOfDoors of the car and return this builder
    ICarBuilder amountOfDoors(int amountOfDoors);

    // set Color of the car and return this builder
    ICarBuilder color(Color color);
}
