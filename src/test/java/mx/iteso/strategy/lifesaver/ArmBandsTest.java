package mx.iteso.strategy.lifesaver;

import mx.iteso.strategy.lifesavers.ArmBands;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Edmundo on 17/09/2016.
 */
public class ArmBandsTest {
    @Test
    public void ArmBandsTest() {

        ArmBands armbands = new  ArmBands();
        assertEquals("I'm a Arm bands",  armbands.display());
        assertEquals("I'm floating",  armbands.floating());
        assertEquals("I'm deflating!",  armbands.deflateBehavior.deflate());
        assertEquals("I'm inflating!",  armbands.deflateBehavior.inflate());
        assertEquals("I can float",  armbands.flotationCapacity.flotation());
    }
}
