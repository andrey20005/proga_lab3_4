package org.itmo.lab3_4.world;

import org.itmo.lab3_4.world.Located;
import org.itmo.lab3_4.world.World;


public interface Place {
    default void add(Located located) {
        World.addLocated(this, located);
    }

    default void pop(Located located) {
        World.removeLocated(this, located);
    }
}
