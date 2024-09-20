package entity;

public class AirbusA350_900 extends Aircraft{

    public AirbusA350_900() {
        model = "Airbus A350-900";
        fuelStorage = 141000L;
        maxPassengers = 325;
        consumptionPerKM = 5.85;
        consumptionPerkmWithMaxCapacity = 0.12;
    }
}
