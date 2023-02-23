package BuilderPattern.CarBuilder;

public class GasCarBuilder extends CarBuilder {

    // member, specific only to gas Cars
    private String fuelConsumption;
    private String tankSize;

    // set fuelConsumption of the car and return this builder
    public GasCarBuilder fuelConsumption(String powerConsumption) { this.fuelConsumption = powerConsumption; return this; }

    // set tankSize of the car and return this builder
    public GasCarBuilder tankSize(String chargingSpeed) { this.tankSize = chargingSpeed; return this; }

    @Override
    public Car build() {
        // return GasCar
        return new GasCar(super.build(), fuelConsumption, tankSize);
    }
}
