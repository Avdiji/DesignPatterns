package BuilderPattern;


import BuilderPattern.CarBuilder.Car;
import BuilderPattern.CarBuilder.CarBuilder;
import BuilderPattern.CarBuilder.CarDirector;
import BuilderPattern.CarBuilder.ElectricCarBuilder;
import BuilderPattern.CarBuilder.GasCarBuilder;

import java.awt.Color;

public class BuilderPatternMain {
    public static void main(String... args) {

        // unable to initialize Car like this, since the constructor is protected
        //Car car = new Car();

        //initialize director
        CarDirector director = new CarDirector();

        //initialize builders
        CarBuilder simpleBuilder = new CarBuilder();
        CarBuilder electricCarBuilder = new ElectricCarBuilder();
        CarBuilder gasCarBuilder = new GasCarBuilder();

        //build default cars
        director.buildDefaultCar(simpleBuilder);
        director.buildDefaultCar(electricCarBuilder);
        director.buildDefaultCar(gasCarBuilder);

        //initialize default Cars
        Car defaultSimpleCar = simpleBuilder.build();
        Car defaultElectricCar = electricCarBuilder.build();
        Car defaultGasCar = gasCarBuilder.build();

        //build different kinds of Cars
        director.buildBlueAudi(simpleBuilder);
        director.buildWhiteSmart(electricCarBuilder);
        director.buildBMW(gasCarBuilder);

        //initialize different kinds of Cars
        Car simpleBlueAudi = simpleBuilder.build();
        Car electricWhiteSmart = electricCarBuilder.build();
        Car gasBMW = gasCarBuilder.build();

        //build custom Cars
        simpleBuilder.brand("Mercedes").amountOfDoors(2);
        //cast to ElectricCarBuilder to initialize members specific to electric car
        ((ElectricCarBuilder) electricCarBuilder).chargingSpeed("1h").powerConsumption("0,20 kWh/km").color(Color.RED);
        ((GasCarBuilder) gasCarBuilder).fuelConsumption("7.2l/100km").tankSize("60l").brand("Ford");
    }

}
