package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Edmundo on 17/09/2016.
 */
public class PingPongBallTest {
    @Test
    public void PingPongBallTest() {
        PingPong pingpong = new PingPong();
        assertEquals("I'm bouncing normally!", pingpong.performBounce());
        assertEquals("I can't deflate!", pingpong.performDeflate());
        assertEquals("I can't inflate!", pingpong.performInflate());
        assertEquals("PingPong ball is rolling!", pingpong.roll());
        assertEquals("I'm Little", pingpong.getSize());
    }
}
