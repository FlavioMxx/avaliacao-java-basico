import entity.Aircraft;
import service.planner.Planner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserIterator {
    
    public List<Double> getUserData() {
        List<Double> userData = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("\nEscolha 3 aeronaves para fazer o plano de vôo:\n" +
                    "1 - Airbus A380,\n" +
                    "2 - Airbus A330-200,\n" +
                    "3 - Airbus A350-900,\n" +
                    "4 - Boeing 777-200\n");

            for(int i = 0; i < 3; i++) {
                System.out.print((i + 1) + "a: ");
                int aircraftCode = sc.nextInt();

                while (existingCodeValidator(aircraftCode)) {
                    System.out.print((i + 1) + "a: ");
                    aircraftCode = sc.nextInt();

                    existingCodeValidator(aircraftCode);
                };

                userData.add((double) aircraftCode);
            }

            System.out.println("Quantos passageiros irão viajar?");
            int passengersQuantity = sc.nextInt();
            userData.add((double) passengersQuantity);

            System.out.println("Qual a distancia que irão viajar?");
            double travelDistance = sc.nextDouble();
            userData.add(travelDistance);

            sc.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return userData;
    }

    public void showPlans(Map<String, Planner> planList) {
        System.out.print("\nQSD Airlines:\n\n");

        for(Map.Entry<String, Planner> entry : planList.entrySet()) {
            System.out.printf("A aeronave selecionada: %s\n", entry.getValue().getAircraft().getModel());
            System.out.printf("A quantidade de passageiros: %d\n", entry.getValue().getPassengerQuantity());
            System.out.printf("A distância que será percorrida: %f\n", entry.getValue().getTravelDistance());
            System.out.printf("A quantidade de combustível consumida por km: %f\n", entry.getValue().getConsuptionPerKM());
            System.out.printf("A quantidade de combustível que precisou ser acrescentada por passageiro: %f\n", entry.getValue().getTotalFuelAddedPerPassenger());
            System.out.printf("A quantidade de combustível total que será consumidas durante o voo: %f\n", entry.getValue().getAmountOfFuelSpent());
            System.out.println("======================================================================");
            System.out.println("======================================================================");
        }
    }

    private static boolean existingCodeValidator(int aircraftCode) {
        if (aircraftCode > 4 || aircraftCode < 1) {
            System.out.println("Código inexistente!\n" +
                                "Tente novamente.");
            return true;
        }

        return false;
    }
}
