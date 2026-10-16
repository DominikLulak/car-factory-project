package com.lulak.builder;

import com.lulak.model.Car;
import com.lulak.model.engine.Engine;
import com.lulak.model.suspension.Suspension;

public class CarBuilder {

    public String modelName = "Standartni model";
    public Engine engine;
    public Suspension suspension;
    public String color = "Bila";
    public boolean gpsNavigator = false;

    public CarBuilder setModelName(String modelName){
        this.modelName = modelName;
        return this;
    }
    public CarBuilder setEngine(Engine engine){
        this.engine = engine;
        return this;
    }
    public CarBuilder setSuspension (Suspension suspension){
        this.suspension = suspension;
        return this;
    }
    public CarBuilder setColor (String color){
        this.color = color;
        return this;
    }
    public CarBuilder setGpsNavigator (boolean gpsNavigator){
        this.gpsNavigator = gpsNavigator;
        return this;
    }

    public Car build(){
        return new Car(this);
    }
}
