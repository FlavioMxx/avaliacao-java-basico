import service.AircraftManager;
import service.planner.PlannerFactory;

public class Main {
    public static void main(String[] args) {

        AircraftManager aircraftManager = new AircraftManager();

        System.out.print("QSD Airlines\n" +
                        "Aeronaves disponíveis.:\n\n");

        aircraftManager.showAircrafts();

        UserIterator ui = new UserIterator();

        PlannerFactory factory = new PlannerFactory();

        ui.showPlans(factory.getPlan(ui.getUserData()));
    }
}