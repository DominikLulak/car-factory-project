package com.lulak.builder;

import com.lulak.model.Car;
import com.lulak.model.engine.Engine;
import com.lulak.model.suspension.Suspension;

public class CarBuilder {

    private String modelName = "Standartní model";
    private Engine engine;
    private Suspension suspension;
    private String color = "Bílá";
    private boolean gpsNavigator = false;

    public CarBuilder setModelName(String modelName){
        if(modelName == null || modelName.trim().isEmpty()){
            throw new IllegalArgumentException("Název modelu nesmí být prázdný.");
        }
        this.modelName = modelName;
        return this;
    }
    public CarBuilder setEngine(Engine engine){
        if(engine == null){
            throw new IllegalArgumentException("Motor nesmí být null");
        }
        this.engine = engine;
        return this;
    }
    public CarBuilder setSuspension (Suspension suspension){
        if(suspension == null){
            throw new IllegalArgumentException("Podvozek nesmí být null");
        }
        this.suspension = suspension;
        return this;
    }
    public CarBuilder setColor (String color){
        if(engine == null || color.trim().isEmpty()){
            throw new IllegalArgumentException("Barva nesmí být prázdná");
        }
        this.color = color;
        return this;
    }
    public CarBuilder setGpsNavigator (boolean gpsNavigator){
        this.gpsNavigator = gpsNavigator;
        return this;
    }

    public Car build(){
        if(engine == null){
            throw new IllegalStateException("Chyba: Nelze sestavit vozidlo bez motoru.");
        }
        if(suspension == null){
            throw new IllegalStateException("Chyba: Nelze sestavit vozidlo bez podvozku.");
        }
        if(modelName == null || modelName.trim().isEmpty()){
            throw new IllegalStateException("Chyba: Vozidlo musí mít platný název.");
        }
        if(color == null || color.trim().isEmpty()){
            throw new IllegalStateException("Chyba: Vozidlo musí mít zvoleno barvu.");
        }

        return new Car(modelName, engine, suspension, color, gpsNavigator);
    }
}
