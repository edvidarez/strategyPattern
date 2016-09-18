package mx.iteso.strategy.lifesaver;

import mx.iteso.strategy.lifesavers.ArmBands;
import mx.iteso.strategy.lifesavers.WaterTubes;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Edmundo on 17/09/2016.
 */
public class WaterTubesTest {
    @Test
    public void WaterTubesTest() {

        WaterTubes Tubes = new  WaterTubes();
        assertEquals("I'm a Water Tubes",  Tubes.display());
        assertEquals("I'm floating",  Tubes.floating());
        assertEquals("I'm deflating!",  Tubes.deflateBehavior.deflate());
        assertEquals("I'm inflating!",  Tubes.deflateBehavior.inflate());
        assertEquals("I can float",  Tubes.flotationCapacity.flotation());
    }
}
