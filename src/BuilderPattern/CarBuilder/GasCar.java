package BuilderPattern.CarBuilder;

// Business Object (Gas car extends basic car, so that the simple CarBuilder can also be used)
public class GasCar extends Car{

    // member all private, all final to make businessObject immutable
    private final String fuelConsumption;
    private final String tankSize;

    // Constructor
    protected GasCar(Car car, String fuelConsumption, String tankSize){
        super(car.getBrand(), car.getModel(), car.getAmountOfDoors(), car.getColor());
        this.fuelConsumption = fuelConsumption;
        this.tankSize = tankSize;
    }

    // Getter and no Setter for data-integrity //
    public String getFuelConsumption() { return fuelConsumption; }
    public String getTankSize() { return tankSize; }
    // Getter and no Setter for data-integrity //

    @Override
    public String toString() {
        return String.format("%s\nFuel Consumption: %s\nTank size: %s", super.toString(), fuelConsumption, tankSize);
    }
}
