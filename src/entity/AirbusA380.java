package entity;

public class AirbusA380 extends Aircraft{

    public AirbusA380() {
        model = "Airbus A380";
        fuelStorage = 323000L;
        maxPassengers = 470;
        consumptionPerKM = 13.02;
        consumptionPerkmWithMaxCapacity = 0.15;
    }
}
