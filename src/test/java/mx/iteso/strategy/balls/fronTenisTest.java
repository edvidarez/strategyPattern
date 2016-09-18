package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Edmundo on 12/09/2016.
 */

public class fronTenisTest {
    @Test
    public void fronTenis_Test() {
        frontenis frontenisBall = new frontenis();
        assertEquals("I'm bouncing normally!", frontenisBall.performBounce());
        assertEquals("I can't deflate!", frontenisBall.performDeflate());
        assertEquals("I can't inflate!", frontenisBall.performInflate());
        assertEquals("frontenis ball is rolling!", frontenisBall.roll());
        assertEquals("I'm a medium size", frontenisBall.getSize());
    }
}