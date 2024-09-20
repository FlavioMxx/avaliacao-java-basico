package entity;

public abstract class Aircraft {
    protected String model;
    protected Long fuelStorage;
    protected Integer maxPassengers;
    protected Double consumptionPerKM;
    protected Double consumptionPerkmWithMaxCapacity;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getFuelStorage() {
        return fuelStorage;
    }

    public void setFuelStorage(Long fuelStorage) {
        this.fuelStorage = fuelStorage;
    }

    public Integer getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(Integer maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public Double getConsumptionPerKM() {
        return consumptionPerKM;
    }

    public void setConsumptionPerKM(Double consumptionPerKM) {
        this.consumptionPerKM = consumptionPerKM;
    }

    public Double getConsumptionPerkmWithMaxCapacity() {
        return consumptionPerkmWithMaxCapacity;
    }

    public void setConsumptionPerkmWithMaxCapacity(Double consumptionPerkmWithMaxCapacity) {
        this.consumptionPerkmWithMaxCapacity = consumptionPerkmWithMaxCapacity;
    }

    @Override
    public String toString() {
        return "Aeronave (" +
                "\n - Modelo: " + model +
                "\n - Capacidade de combustível: " + fuelStorage +
                "\n - Capacidade máxima de passageiros: " + maxPassengers +
                "\n - Consumo por quilometro: " + consumptionPerKM +
                "\n - Excedente de consumo por quilometro com capacidade máxima de passageiros: " + (consumptionPerkmWithMaxCapacity * 100) + "%"  +
                "\n)";
    }
}
