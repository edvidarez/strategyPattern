package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Edmundo on 17/09/2016.
 */
public class BaseBallTest {
    @Test
    public void BaseBallTest() {
        BaseballBall baseballBall = new BaseballBall();
        assertEquals("I'm bouncing irregularly!", baseballBall.performBounce());
        assertEquals("I can't deflate!", baseballBall.performDeflate());
        assertEquals("I can't inflate!", baseballBall.performInflate());
        assertEquals("Baseball ball is rolling!", baseballBall.roll());
        assertEquals("I'm a medium size", baseballBall.getSize());
    }
}
