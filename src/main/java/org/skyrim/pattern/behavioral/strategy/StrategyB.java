package org.skyrim.pattern.behavioral.strategy;

public class StrategyB  implements Strategy{

    @Override
    public void show() {
        System.out.println("满200减50");
    }
}
