package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.FlotationCapacity;

/**
 * Created by Edmundo on 17/09/2016.
 */
public class NotFlotable implements FlotationCapacity{
    public String flotation() {
        return "I can't float";
    }
}
