package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

public class SwimBelts extends Lifesaver{
    public SwimBelts() {
        type = "Swim Belts";
        deflateBehavior = new NotDeflatable();
    }
}