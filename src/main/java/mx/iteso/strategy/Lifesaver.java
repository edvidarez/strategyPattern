package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FlotationCapacity;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Flotable;

public class Lifesaver {
    public String type;
    public DeflateBehavior deflateBehavior = new Deflatable();
    public FlotationCapacity flotationCapacity = new Flotable();
  /*  public String inflating() {
        return "I'm inflating";
    }
    public String deflating() {
        return "I'm deflating";
    }*/
    public String floating() {
        if(flotationCapacity.flotation() != "I can't float")
            return "I'm floating";
        else
        {
            return "I'm sinking";
        }
    }
    public String display() {
        return "I'm a " + type;
    }

}
