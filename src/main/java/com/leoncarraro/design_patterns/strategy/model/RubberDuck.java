package com.leoncarraro.design_patterns.strategy.model;

import com.leoncarraro.design_patterns.strategy.behavior.impl.FlyNoWay;
import com.leoncarraro.design_patterns.strategy.behavior.impl.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        super(new FlyNoWay(), new Squeak());
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck!");
    }

}
