package entity;

public class AirbusA330_200 extends Aircraft{

    public AirbusA330_200() {
        model = "Airbus A330-200";
        fuelStorage = 140000L;
        maxPassengers = 290;
        consumptionPerKM = 6.11;
        consumptionPerkmWithMaxCapacity = 0.1;
    }
}
