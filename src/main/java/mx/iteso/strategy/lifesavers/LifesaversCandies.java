package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.NotFlotable;

public class LifesaversCandies extends Lifesaver{
    public LifesaversCandies() {
        type = "Lifesavers Candies";
        flotationCapacity= new NotFlotable();
        deflateBehavior= new NotDeflatable();
    }
}