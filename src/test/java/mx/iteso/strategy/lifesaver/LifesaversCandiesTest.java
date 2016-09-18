package mx.iteso.strategy.lifesaver;

import mx.iteso.strategy.lifesavers.FoamFloats;
import mx.iteso.strategy.lifesavers.LifesaversCandies;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Edmundo on 17/09/2016.
 */
public class LifesaversCandiesTest {
    @Test
    public void LifesaversCandiesTest() {

        LifesaversCandies LifeCandie = new  LifesaversCandies();
        assertEquals("I'm a Lifesavers Candies",  LifeCandie.display());
        assertEquals("I'm sinking",  LifeCandie.floating());
        assertEquals("I can't deflate!",  LifeCandie.deflateBehavior.deflate());
        assertEquals("I can't inflate!",  LifeCandie.deflateBehavior.inflate());
        assertEquals("I can't float",  LifeCandie.flotationCapacity.flotation());
    }
}
