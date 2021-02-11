package com.leoncarraro.design_patterns.strategy.model;

import com.leoncarraro.design_patterns.strategy.behavior.impl.FlyWithWings;
import com.leoncarraro.design_patterns.strategy.behavior.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck!");
    }

}
