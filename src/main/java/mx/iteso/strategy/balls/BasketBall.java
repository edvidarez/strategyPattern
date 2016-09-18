package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.BigSize;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.NormalBounce;

public class BasketBall extends Ball {
    public BasketBall() {
        bounceBehavior = new NormalBounce();
        deflateBehavior = new Deflatable();
        size = new BigSize();
        type = "BasketBall ball";
    }
}
