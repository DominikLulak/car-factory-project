package com.lulak.decorator;

import com.lulak.model.CarComponent;

public class PremiumAudioDecorator extends CarDecorator{

    public PremiumAudioDecorator(CarComponent decoratedCar){
        super(decoratedCar);
    }

    @Override
    public String getDescription(){
        return decoratedCar.getDescription() + " + Přemiové Surround Audio";
    }

    @Override
    public double getPrice(){
        return decoratedCar.getPrice() + 25000.0;
    }
}
