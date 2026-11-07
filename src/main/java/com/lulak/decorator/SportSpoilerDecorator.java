package com.lulak.decorator;

import com.lulak.model.CarComponent;

public class SportSpoilerDecorator extends CarDecorator {

    public SportSpoilerDecorator(CarComponent decoratedCar){
        super(decoratedCar);
    }

    @Override
    public String getDescription(){
        return decoratedCar.getDescription() + " + Sportovní spoiler";
    }

    @Override
    public double getPrice(){
        return decoratedCar.getPrice() + 15000.0;
    }
}
