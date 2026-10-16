package com.lulak.factory;

import com.lulak.model.engine.Engine;
import com.lulak.model.engine.SportEngine;
import com.lulak.model.suspension.SportSuspension;
import com.lulak.model.suspension.Suspension;

public class SportCarFactory implements CarPartsFactory{

    @Override
    public Engine createEngine(){
        return new SportEngine();
    }

    @Override
    public Suspension createSuspension(){
        return new SportSuspension();
    }
}
