package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.*;

public class PingPong extends Ball {
    public PingPong() {
        bounceBehavior = new NormalBounce();
        deflateBehavior = new NotDeflatable();
        size = new LittleSize();
        type = "PingPong ball";
    }
}
