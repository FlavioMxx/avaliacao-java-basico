package entity;

public class Boeing777_200 extends  Aircraft{

    public Boeing777_200() {
        model = "Boeing 777-200";
        fuelStorage = 117500L;
        maxPassengers = 370;
        consumptionPerKM = 6.38;
        consumptionPerkmWithMaxCapacity = 0.2;
    }
}
