package service.planner;

import entity.Aircraft;

import java.util.Objects;

public class Planner implements FlightPlanner{
    private final Aircraft aircraft;
    private final Integer passengerQuantity;
    private final Double travelDistance;

    public Aircraft getAircraft() {
        return aircraft;
    }

    public Integer getPassengerQuantity() {
        return passengerQuantity;
    }

    public Double getTravelDistance() {
        return travelDistance;
    }

    public Planner(Aircraft aircraft, Integer passengerQuantity, Double travelDistance) {
        this.aircraft = aircraft;
        this.passengerQuantity = passengerQuantity;
        this.travelDistance = travelDistance;
    }

    @Override
    public boolean maxCapacityReached() {
        if(aircraft.getMaxPassengers() < passengerQuantity) {
            throw new RuntimeException(String.format("Ultrapassou capacidade da aeronave (%d)", aircraft.getMaxPassengers()));
        }

        return Objects.equals(aircraft.getMaxPassengers(), passengerQuantity);
    }

    @Override
    public Double getConsuptionPerKM() {
        return getAmountOfFuelSpent() / travelDistance;
    }

    @Override
    public Double getTotalFuelAddedPerPassenger() {
        return getAmountOfFuelSpent() / passengerQuantity;
    }


    @Override
    public Double getAmountOfFuelSpent() {
        if (maxCapacityReached()) {
            return (aircraft.getConsumptionPerKM() * travelDistance) * aircraft.getConsumptionPerkmWithMaxCapacity();
        }
        return aircraft.getConsumptionPerKM() * travelDistance;
    }
}
