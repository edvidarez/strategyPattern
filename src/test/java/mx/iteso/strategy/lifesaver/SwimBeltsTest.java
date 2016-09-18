package mx.iteso.strategy.lifesaver;

import mx.iteso.strategy.lifesavers.FoamFloats;
import mx.iteso.strategy.lifesavers.SwimBelts;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Edmundo on 17/09/2016.
 */
public class SwimBeltsTest {
    @Test
    public void SwimBeltsTest() {

        SwimBelts Belt = new  SwimBelts();
        assertEquals("I'm a Swim Belts",  Belt.display());
        assertEquals("I'm floating",  Belt.floating());
        assertEquals("I can't deflate!",  Belt.deflateBehavior.deflate());
        assertEquals("I can't inflate!",  Belt.deflateBehavior.inflate());
        assertEquals("I can float",  Belt.flotationCapacity.flotation());
    }
}
