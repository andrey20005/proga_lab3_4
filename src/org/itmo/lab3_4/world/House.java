package org.itmo.lab3_4.world;

import org.itmo.lab3_4.world.Place;
import org.itmo.lab3_4.world.World;
import org.itmo.lab3_4.world.Located;
import org.itmo.lab3_4.Human;

import java.util.ArrayList;


public class House implements Place, Located {
    private ArrayList<Human> residents;

    public House() {
        World.addPlace(this);
        ArrayList<Human> residents = new ArrayList<Human>();
    }

    public void addResident(Human human) {
        residents.add(human);
    }

    public ArrayList<Human> getResidents() {
        return residents;
    }
}
