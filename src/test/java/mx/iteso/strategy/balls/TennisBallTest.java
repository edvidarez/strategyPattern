package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Edmundo on 17/09/2016.
 */
public class TennisBallTest {
    @Test
    public void TennisBallTest() {
        tennisBall tennisBall_t = new tennisBall();
        assertEquals("I'm bouncing normally!", tennisBall_t.performBounce());
        assertEquals("I can't deflate!", tennisBall_t.performDeflate());
        assertEquals("I can't inflate!", tennisBall_t.performInflate());
        assertEquals("tennis ball is rolling!", tennisBall_t.roll());
        assertEquals("I'm a medium size", tennisBall_t.getSize());
    }
}
