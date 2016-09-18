package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.MediumSize;
import mx.iteso.strategy.behaviors.impl.NormalBounce;

public class tennisBall extends Ball {
    public tennisBall() {
        bounceBehavior = new NormalBounce();
        deflateBehavior = new NotDeflatable();
        size = new MediumSize();
        type = "tennis ball";
    }
}
