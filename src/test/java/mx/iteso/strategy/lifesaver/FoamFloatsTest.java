package mx.iteso.strategy.lifesaver;

import mx.iteso.strategy.lifesavers.ArmBands;
import mx.iteso.strategy.lifesavers.FoamFloats;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Edmundo on 17/09/2016.
 */
public class FoamFloatsTest {
    @Test
    public void FoamFloatsTest() {

        FoamFloats foamFloats = new  FoamFloats();
        assertEquals("I'm a Foam Floats",  foamFloats.display());
        assertEquals("I'm floating",  foamFloats.floating());
        assertEquals("I can't deflate!",  foamFloats.deflateBehavior.deflate());
        assertEquals("I can't inflate!",  foamFloats.deflateBehavior.inflate());
        assertEquals("I can float",  foamFloats.flotationCapacity.flotation());
    }
}
