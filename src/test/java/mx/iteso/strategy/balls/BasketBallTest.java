package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Edmundo on 12/09/2016.
 */
public class BasketBallTest {
    @Test
    public void testBasketBallTest() {
        BasketBall  basketBallTest = new  BasketBall();
        assertEquals("I'm bouncing normally!",  basketBallTest.performBounce());
        assertEquals("I'm deflating!",  basketBallTest.performDeflate());
        assertEquals("I'm inflating!",  basketBallTest.performInflate());
        assertEquals("BasketBall ball is rolling!",  basketBallTest.roll());
        assertEquals("I'm biggy",  basketBallTest.getSize());
    }
}