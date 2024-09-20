package service.planner;

public interface FlightPlanner {

    boolean maxCapacityReached();

    Double getConsuptionPerKM();

    Double getTotalFuelAddedPerPassenger(); //Deve ser utilizado getAmountOfFuelSpent(Integer travelDistance) para facilitar no calculo.

    Double getAmountOfFuelSpent(); //Deve validar desde o inicio com o maxCapacityReached(Integer passengerQuantity) para retorno correto.

}
