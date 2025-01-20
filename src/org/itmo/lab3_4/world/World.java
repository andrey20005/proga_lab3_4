package org.itmo.lab3_4.world;

import java.util.HashMap;

import org.itmo.lab3_4.world.Located;
import org.itmo.lab3_4.world.Place;


public class World {
    static private HashMap<Place, Located[]> places = new HashMap<Place, Located[]>();

    static public void addPlace(Place place) {
        places.put(place, new Located[0]);
    }

    static public void addLocated(Place place, Located located) {
        Located[] newLocated = new Located[places.get(place).length + 1];
        for (int i = 0; i < places.get(place).length; i++) {
            newLocated[i] = places.get(place)[i];
        }
        newLocated[places.get(place).length] = located;
        places.put(place, newLocated);
    }

    static public Place getPlace(Located located) {
        for (Place place : places.keySet()) {
            for (Located l : places.get(place)) {
                if (l.equals(located)) {
                    return place;
                }
            }
        }
        return null;
    }

    static public Located[] getLocated(Place place) {
        return places.get(place);
    }

    static public void popPlace(Place place) {
        places.remove(place);
    }

    static public void popLocated(Place place, Located located) {
        Located[] newLocated = new Located[places.get(place).length - 1];
        int j = 0;
        for (int i = 0; i < places.get(place).length; i++) {
            if (!places.get(place)[i].equals(located)) {
                newLocated[j] = places.get(place)[i];
                j++;
            }
        }
        places.put(place, newLocated);
    }
}
