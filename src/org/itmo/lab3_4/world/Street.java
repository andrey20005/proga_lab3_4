package org.itmo.lab3_4.world;

import org.itmo.lab3_4.world.Place;
import org.itmo.lab3_4.world.World;


public class Street implements Place {
    public Street() {
        World.addPlace(this);
    }
}
