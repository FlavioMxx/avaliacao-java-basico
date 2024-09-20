package service.planner;

import entity.AirbusA330_200;
import entity.AirbusA350_900;
import entity.AirbusA380;
import entity.Boeing777_200;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlannerFactory {
    public static final int PASSENGER_QUANTITY_INDEX = 3;
    public static final int TOTAL_DISTANCE_INDEX = 4;
    Planner planner;

    AirbusA380 airbusA380 = new AirbusA380();
    AirbusA330_200 airbusA330200 = new AirbusA330_200();
    AirbusA350_900 airbusA350900 = new AirbusA350_900();
    Boeing777_200 boeing777200 = new Boeing777_200();

    public Map<String, Planner> getPlan(List<Double> userData) {
        Map<String, Planner> planList = new HashMap<>();

        try {
            for(int i = 0; i < 3; i++){
                int aircraftCode = userData.get(i).intValue();

                switch (aircraftCode) {
                    case 1:
                        planList.put(airbusA380.getModel(), new Planner(airbusA380, userData.get(PASSENGER_QUANTITY_INDEX).intValue(), userData.get(TOTAL_DISTANCE_INDEX)));
                        break;
                    case 2:
                        planList.put(airbusA330200.getModel(), new Planner(airbusA330200, userData.get(PASSENGER_QUANTITY_INDEX).intValue(), userData.get(TOTAL_DISTANCE_INDEX)));
                        break;
                    case 3:
                        planList.put(airbusA350900.getModel(), new Planner(airbusA350900, userData.get(PASSENGER_QUANTITY_INDEX).intValue(), userData.get(TOTAL_DISTANCE_INDEX)));
                        break;
                    case 4:
                        planList.put(boeing777200.getModel(), new Planner(boeing777200, userData.get(PASSENGER_QUANTITY_INDEX).intValue(), userData.get(TOTAL_DISTANCE_INDEX)));
                        break;
                    default:
                        throw new RuntimeException("Código de aeronave não existe");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return planList;
    }
}
