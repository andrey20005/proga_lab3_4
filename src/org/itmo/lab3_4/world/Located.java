package org.itmo.lab3_4.world;

import org.itmo.lab3_4.world.Place;
import org.itmo.lab3_4.world.World;


public interface Located {
    default public void move(Place place) {
        World.removeLocated(World.getPlace(this), this);
        World.addLocated(place, this);
    }

    default public void setPos(Place place) {
        World.addLocated(place, this);
    }

    default public Place getPlace() {
        return World.getPlace(this);
    }
}
