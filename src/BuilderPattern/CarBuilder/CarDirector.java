package BuilderPattern.CarBuilder;

import java.awt.Color;

public class CarDirector {

    // Default-Values of the CarBuilder (optional)
    private static final String defaultBrand = "";
    private static final String defaultModel = "";
    private static final String defaultMotorType = "";
    private static final int defaultAmountOfDoors = 0;
    private static final Color defaultColor = Color.BLACK;

    // Method to build the default car (optional)
    public CarBuilder buildDefaultCar(CarBuilder builder) {
        return builder.brand(defaultBrand)
                .model(defaultModel)
                .amountOfDoors(defaultAmountOfDoors)
                .color(defaultColor);
    }

    // Method to build BMW's
    public void buildBMW(CarBuilder builder) {
        buildDefaultCar(builder).brand("BMW");
    }

    // Method to build Blue Audi's
    public void buildBlueAudi(CarBuilder builder) {
        buildDefaultCar(builder).brand("Audi").color(Color.BLUE);
    }

    // Build White Smart's
    public void buildWhiteSmart(CarBuilder builder) {
        buildDefaultCar(builder).brand("Smart").color(Color.WHITE).amountOfDoors(2);
    }

}
