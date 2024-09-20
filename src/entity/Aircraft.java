package entity;

public abstract class Aircraft {
    protected String model;
    protected Long fuelStorage;
    protected Integer maxPassengers;
    protected Double consumptionPerKM;
    protected Double consumptionPerkmWithMaxCapacity;

    @Override
    public String toString() {
        return "Aeronave (" +
                "\n - Modelo: " + model +
                "\n - Capacidade de combustível: " + fuelStorage +
                "\n - Capacidade máxima de passageiros: " + maxPassengers +
                "\n - Consumo por quilometro: " + consumptionPerKM +
                "\n - Excedente de consumo por quilometro com capacidade máxima de passageiros: " + consumptionPerkmWithMaxCapacity +
                "\n)";
    }
}
