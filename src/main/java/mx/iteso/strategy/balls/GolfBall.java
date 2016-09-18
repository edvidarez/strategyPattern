package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.*;

public class GolfBall extends Ball {
    public GolfBall() {
        bounceBehavior = new IrregularBounce();
        deflateBehavior = new NotDeflatable();
        size = new LittleSize();
        type = "GolfBall ball";
    }
}
