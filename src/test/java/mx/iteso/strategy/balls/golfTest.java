package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Edmundo on 12/09/2016.
 */
public class golfTest {

    @Test
    public void testGolfBall() {
        GolfBall golfBall = new GolfBall();
        assertEquals("I'm bouncing irregularly!", golfBall.performBounce());
        assertEquals("I can't deflate!", golfBall.performDeflate());
        assertEquals("I can't inflate!", golfBall.performInflate());
        assertEquals("GolfBall ball is rolling!", golfBall.roll());
        assertEquals("I'm Little", golfBall.getSize());
    }
}