package com.lulak.model;

import com.lulak.model.engine.Engine;
import com.lulak.model.suspension.Suspension;

public class Car implements CarComponent {
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

    public String getModelName(){
        return modelName;
    }
    public String getColor(){
        return color;
    }
    public String getEngineDescription(){
        return engine.getDescription();
    }

    @Override
    public String getDescription(){
        return "Vůz: " + modelName + " (Barva: " + color + ", Motor: " + engine.getDescription() + ", Podvozek: " + suspension.getDescription() + ")";
    }

    @Override
    public double getPrice(){
        double basePrice = 400000.0;
        if(gpsNavigator){
            basePrice += 15000.0;
        }
        return basePrice;
    }

    @Override
    public String toString(){
        return "--- Konfigurace vozu: " + modelName + " ---\n" +
                "  Barva: " + color + "\n" +
                "  Motor: " + (engine != null ? engine.getDescription() : "Nezvolen") + "\n" +
                "  Podvozek:  " + (suspension != null ? suspension.getDescription() : "Nezvolen") + "\n" +
                "  GPS Navigace: " + (gpsNavigator ? "Ano" : "Ne") + "\n" +
                "  Celkova cena: " + getPrice() + " Kč\n" +
                "-----------------------------------";
    }
}
