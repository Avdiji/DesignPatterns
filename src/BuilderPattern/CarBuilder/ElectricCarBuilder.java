package BuilderPattern.CarBuilder;

public class ElectricCarBuilder extends CarBuilder {

    // member, specific only to electric Cars
    private String powerConsumption;
    private String chargingSpeed;

    // set powerConsumption of the car and return this builder
    public ElectricCarBuilder powerConsumption(String powerConsumption) { this.powerConsumption = powerConsumption; return this; }

    // set charging of the car and return this builder
    public ElectricCarBuilder chargingSpeed(String chargingSpeed) { this.chargingSpeed = chargingSpeed; return this; }

    @Override
    public Car build() {
        // return ElectricCar
        return new ElectricCar(super.build(), powerConsumption, chargingSpeed);
    }

}
