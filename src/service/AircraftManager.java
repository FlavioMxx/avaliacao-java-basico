package service;

import entity.*;

import java.util.ArrayList;
import java.util.List;

public class AircraftManager{

    public void showAircrafts() {
        List<Aircraft> aircraftList = getAircraftList();

        for(Aircraft al : aircraftList) {
            System.out.println(al);
        }
    }

    private List<Aircraft> getAircraftList() {
        List<Aircraft> aircraftList = new ArrayList<>();

        aircraftList.add(new AirbusA380());
        aircraftList.add(new AirbusA330_200());
        aircraftList.add(new AirbusA350_900());
        aircraftList.add(new Boeing777_200());

        return aircraftList;
    }
}
