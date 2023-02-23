package BuilderPattern.CarBuilder;

// Business Object (Electric car extends basic car, so that the "simple" CarBuilder can also be used)
public class ElectricCar extends Car {

    // member all private, all final to make businessObject immutable
    private final String powerConsumption;
    private final String chargingSpeed;

    // Constructor
    protected ElectricCar(Car car, String powerConsumption, String chargingSpeed) {
        super(car.getBrand(), car.getModel(), car.getAmountOfDoors(), car.getColor());

        this.powerConsumption = powerConsumption;
        this.chargingSpeed = chargingSpeed;
    }

    // Getter and no Setter for data-integrity //
    public String getPowerConsumption() { return powerConsumption; }
    public String getChargingSpeed() { return chargingSpeed; }
    // Getter and no Setter for data-integrity //


    @Override
    public String toString() {
        return String.format("%s\nPower Consumption: %s\nCharging Speed: %s", super.toString(), powerConsumption, chargingSpeed);
    }
}
