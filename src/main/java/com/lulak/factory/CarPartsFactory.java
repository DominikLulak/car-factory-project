package com.lulak.factory;

import com.lulak.model.engine.Engine;
import com.lulak.model.suspension.Suspension;

public interface CarPartsFactory {
    Engine createEngine();
    Suspension createSuspension();
}
