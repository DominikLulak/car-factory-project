package com.lulak.model;

import com.lulak.builder.CarBuilder;
import com.lulak.model.engine.Engine;
import com.lulak.model.suspension.Suspension;

public class Car {
    private final String modelName;
    private final Engine engine;
    private final Suspension suspension;
    private final String color;
    private final boolean gpsNavigator;


    public Car(String modelName, Engine engine, Suspension suspension, String color, boolean gpsNavigator) {
        this.modelName = modelName;
        this.engine = engine;
        this.suspension = suspension;
        this.color = color;
        this.gpsNavigator = gpsNavigator;
    }

    @Override
    public String toString(){
        return "--- Konfigurace vozu: " + modelName + " ---\n" +
                "  Barva: " + color + "\n" +
                "  Motor: " + (engine != null ? engine.getDescription() : "Nezvolen") + "\n" +
                "  Podvozek:  " + (suspension != null ? suspension.getDescription() : "Nezvolen") + "\n" +
                "  GPS Navigace: " + (gpsNavigator ? "Ano" : "Ne") + "\n" +
                "-----------------------------------";
    }
}
