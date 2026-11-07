package com.lulak.adapter;

import com.lulak.model.Car;

public interface RegistryTarget {
    void registerCar(String owner, Car car);
}
