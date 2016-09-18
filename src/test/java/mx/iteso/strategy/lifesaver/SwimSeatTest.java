package mx.iteso.strategy.lifesaver;

import mx.iteso.strategy.lifesavers.ArmBands;
import mx.iteso.strategy.lifesavers.SwimSeat;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Edmundo on 17/09/2016.
 */
public class SwimSeatTest {
    @Test
    public void SwimSeatTest() {

        SwimSeat Seat = new  SwimSeat();
        assertEquals("I'm a Swim seat",  Seat.display());
        assertEquals("I'm floating",  Seat.floating());
        assertEquals("I'm deflating!",  Seat.deflateBehavior.deflate());
        assertEquals("I'm inflating!",  Seat.deflateBehavior.inflate());
        assertEquals("I can float",  Seat.flotationCapacity.flotation());
    }
}
