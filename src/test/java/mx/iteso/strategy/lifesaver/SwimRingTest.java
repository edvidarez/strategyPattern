package mx.iteso.strategy.lifesaver;

import mx.iteso.strategy.lifesavers.SwimBelts;
import mx.iteso.strategy.lifesavers.SwimRing;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Edmundo on 17/09/2016.
 */
public class SwimRingTest {
    @Test
    public void SwimRingTest() {

        SwimRing Ring = new  SwimRing();
        assertEquals("I'm a Swim ring",  Ring.display());
        assertEquals("I'm floating",  Ring.floating());
        assertEquals("I'm deflating!",  Ring.deflateBehavior.deflate());
        assertEquals("I'm inflating!",  Ring.deflateBehavior.inflate());
        assertEquals("I can float",  Ring.flotationCapacity.flotation());
    }
}
