package com.javarush.island.muraviov;

import com.javarush.island.muraviov.entity.location.Location;
import com.javarush.island.muraviov.services.LocationWorker;

public class Runner {
    public static void main(String[] args) {
        Location location = Location.getInstance();
        location.initialize();
        LocationWorker locationWorker = new LocationWorker();
        locationWorker.start();
    }
}
