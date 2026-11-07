package com.lulak.decorator;

import com.lulak.model.CarComponent;

public abstract class CarDecorator implements CarComponent {
    protected CarComponent decoratedCar;

    public CarDecorator(CarComponent decoratedCar){
        this.decoratedCar = decoratedCar;
    }

    @Override
    public String getDescription(){
        return decoratedCar.getDescription();
    }

    @Override
    public double getPrice(){
        return decoratedCar.getPrice();
    }
}
