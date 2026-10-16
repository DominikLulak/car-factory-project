package com.lulak.factory;

import com.lulak.model.engine.EletricEngine;
import com.lulak.model.engine.Engine;
import com.lulak.model.suspension.OffRoadSuspension;
import com.lulak.model.suspension.Suspension;

public class OffRoadFactory implements CarPartsFactory{

    @Override
    public Engine createEngine(){
        return new EletricEngine();
    }

    @Override
    public Suspension createSuspension(){
        return new OffRoadSuspension();
    }
}
