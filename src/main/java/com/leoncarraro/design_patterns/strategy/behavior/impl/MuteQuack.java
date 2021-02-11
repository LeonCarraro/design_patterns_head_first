package com.leoncarraro.design_patterns.strategy.behavior.impl;

import com.leoncarraro.design_patterns.strategy.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<<< Silence >>>");
    }

}
