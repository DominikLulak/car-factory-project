package com.lulak.adapter;

import com.lulak.external.OldRegistrySystem;
import com.lulak.model.Car;

public class RegistryAdapter implements RegistryTarget{
    private final OldRegistrySystem oldRegistrySystem;

    public RegistryAdapter(OldRegistrySystem oldRegistrySystem){
        this.oldRegistrySystem = oldRegistrySystem;
    }

    @Override
    public void registerCar(String owner, Car car){
        String formattedDetails = "Model: " + car.getModelName() +
                ", Barva: " + car.getColor() +
                ", Pohon: " + car.getEngineDescription();

        oldRegistrySystem.registerVehicleData(owner, formattedDetails);
    }
}
