package mx.iteso.strategy.lifesaver;

import mx.iteso.strategy.lifesavers.ArmBands;
import mx.iteso.strategy.lifesavers.LifeVests;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Edmundo on 17/09/2016.
 */
public class LifeVestTest {
    @Test
    public void LifeVestTest() {

        LifeVests Vest = new  LifeVests();
        assertEquals("I'm a Life Vests",  Vest.display());
        assertEquals("I'm floating",  Vest.floating());
        assertEquals("I'm deflating!",  Vest.deflateBehavior.deflate());
        assertEquals("I'm inflating!",  Vest.deflateBehavior.inflate());
        assertEquals("I can float",  Vest.flotationCapacity.flotation());
    }
}
