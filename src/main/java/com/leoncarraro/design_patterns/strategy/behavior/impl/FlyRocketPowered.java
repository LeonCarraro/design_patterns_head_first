package com.leoncarraro.design_patterns.strategy.behavior.impl;

import com.leoncarraro.design_patterns.strategy.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!!");
    }

}
