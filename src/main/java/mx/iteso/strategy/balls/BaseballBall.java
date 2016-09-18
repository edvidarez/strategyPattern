package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.MediumSize;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

public class BaseballBall extends Ball {
    public BaseballBall() {
        bounceBehavior = new IrregularBounce();
        deflateBehavior = new NotDeflatable();
        size = new MediumSize();
        type = "Baseball ball";
    }
}
