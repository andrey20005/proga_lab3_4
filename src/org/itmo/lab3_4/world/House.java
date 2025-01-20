package org.itmo.lab3_4.world;

import org.itmo.lab3_4.world.Place;
import org.itmo.lab3_4.world.World;
import org.itmo.lab3_4.world.Located;
import org.itmo.lab3_4.Human;


public class House implements Place, Located {
    private Human[] residents;

    public House() {
        World.addPlace(this);
        residents = new Human[0];
    }

    public void addResident(Human human) {
        Human[] newResidents = new Human[residents.length + 1];
        for (int i = 0; i < residents.length; i++) {
            newResidents[i] = residents[i];
        }
        newResidents[residents.length] = human;
        residents = newResidents;
    }

    public Human[] getResident() {
        return residents;
    }
}
