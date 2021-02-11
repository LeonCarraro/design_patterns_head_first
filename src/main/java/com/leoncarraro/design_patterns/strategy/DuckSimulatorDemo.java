package com.leoncarraro.design_patterns.strategy;

import com.leoncarraro.design_patterns.strategy.behavior.impl.FlyRocketPowered;
import com.leoncarraro.design_patterns.strategy.behavior.impl.MuteQuack;
import com.leoncarraro.design_patterns.strategy.model.RubberDuck;
import com.leoncarraro.design_patterns.strategy.model.Duck;
import com.leoncarraro.design_patterns.strategy.model.MallardDuck;

public class DuckSimulatorDemo {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        System.out.println("- - -");

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.performQuack();
        rubberDuck.setQuackBehavior(new MuteQuack());
        rubberDuck.performQuack();
        rubberDuck.performFly();
        rubberDuck.setFlyBehavior(new FlyRocketPowered());
        rubberDuck.performFly();
    }

}
