using System.Drawing;

namespace BuilderPattern.NSCarBuilder {

    // interface declares all the methods, needed to create a Car (multiple implementations of this interface can be used with the same director)
    internal interface ICarBuilder {

        // Method returns a new instance of a Car
        Car Build();

        // set brand of the car and return this builder
        ICarBuilder Brand(string brand);

        // set model of the car and return this builder
        ICarBuilder Model(string model);

        // set amountOfDoors of the car and return this builder
        ICarBuilder AmountOfDoors(int amountOfDoors);

        // set Color of the car and return this builder
        ICarBuilder Color(Color color);
    }
}
