package com.lulak.model;

import com.lulak.builder.CarBuilder;
import com.lulak.model.engine.Engine;
import com.lulak.model.suspension.Suspension;

public class Car {
    private String modelName;
    private Engine engine;
    private Suspension suspension;
    private String color;
    private boolean gpsNavigator;


    public Car(CarBuilder builder) {
        this.modelName = builder.modelName;
        this.engine = builder.engine;
        this.suspension = builder.suspension;
        this.color = builder.color;
        this.gpsNavigator = builder.gpsNavigator;
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
