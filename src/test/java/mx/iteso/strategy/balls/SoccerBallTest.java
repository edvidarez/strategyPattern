package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Edmundo on 17/09/2016.
 */
public class SoccerBallTest {
    @Test
    public void SoccerBallTest() {
        SoccerBall soccerBall = new  SoccerBall();
        assertEquals("I'm bouncing normally!",  soccerBall.performBounce());
        assertEquals("I'm deflating!",  soccerBall.performDeflate());
        assertEquals("I'm inflating!",  soccerBall.performInflate());
        assertEquals("Soccer ball is rolling!",  soccerBall.roll());
        assertEquals("I'm biggy",  soccerBall.getSize());
    }
}
