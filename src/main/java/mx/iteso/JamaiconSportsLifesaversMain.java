package mx.iteso;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Flotable;
import mx.iteso.strategy.lifesavers.*;

public class JamaiconSportsLifesaversMain {
    public static void status(Lifesaver ls)
    {
        System.out.println(ls.display());
        System.out.println(ls.floating());
        System.out.println(ls.deflateBehavior.deflate());
        System.out.println(ls.deflateBehavior.inflate());
        System.out.println(ls.flotationCapacity.flotation());
        System.out.println();
    }
        public static void main (String[] args) {
            Lifesaver swimRing = new SwimRing();
            Lifesaver swimSeat = new SwimSeat();
            Lifesaver armBands = new ArmBands();
            Lifesaver vest = new LifeVests();
            Lifesaver foam = new FoamFloats();
            Lifesaver belt = new SwimBelts();
            Lifesaver wTube = new WaterTubes();
            Lifesaver candies = new LifesaversCandies();

            status(armBands);
            status(swimRing);
            status(swimSeat);
            status(vest);
            status(foam);
            status(belt);
            status(wTube);
            status(candies);

        }
}
