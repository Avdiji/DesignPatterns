package BuilderPattern;

import BuilderPattern.CarBuilder.Car;
import BuilderPattern.CarBuilder.CarBuilder;
import BuilderPattern.CarBuilder.CarDirector;
import BuilderPattern.CarBuilder.ICarBuilder;

import java.awt.Color;

public class BuilderPatternMain {
    public static void main(String... args) {

//        Car car = new Car("Audi", "A6", 4, Color.BLACK); // unable to initialize Car like this, since the Constructor is protected

        // initialize the director and CarBuilder
        CarDirector director = new CarDirector();
        ICarBuilder builder = new CarBuilder();

        //build default car
        director.buildDefaultCar(builder);
        Car defaultCar = builder.build();

        // build white Smart
        director.buildWhiteSmart(builder);
        Car whiteSmart = builder.build();

        // build other custom Cars
        Car whitePolo = builder.brand("VW").model("Polo").color(Color.WHITE).build();
        Car blackFordMustang = builder.brand("Ford").model("Mustang").color(Color.BLACK).amountOfDoors(2).build();
    }

}
