package BuilderPattern.CarBuilder;

import java.awt.Color;

// Car Director build premade Car-configurations
public class CarDirector {

    // Default-Values of the CarBuilder (optional)
    private static final String defaultBrand = "";
    private static final String defaultModel = "";
    private static final int defaultAmountOfDoors = 4;
    private static final Color defaultColor = Color.BLACK;

    // Method to build the default car (optional)
    public ICarBuilder buildDefaultCar(ICarBuilder builder) {
        return builder.brand(defaultBrand)
                .model(defaultModel)
                .amountOfDoors(defaultAmountOfDoors)
                .color(defaultColor);
    }

    // Method to build BMW's
    public void buildBMW(ICarBuilder builder) {
        buildDefaultCar(builder).brand("BMW");
    }

    // Method to build Blue Audi's
    public void buildBlueAudi(ICarBuilder builder) {
        buildDefaultCar(builder).brand("Audi").color(Color.BLUE);
    }

    // Build White Smart's
    public void buildWhiteSmart(ICarBuilder builder) {
        buildDefaultCar(builder).brand("Smart").color(Color.WHITE).amountOfDoors(2);
    }

}
