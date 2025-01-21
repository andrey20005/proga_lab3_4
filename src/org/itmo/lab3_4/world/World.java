package org.itmo.lab3_4.world;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.itmo.lab3_4.world.Located;
import org.itmo.lab3_4.world.Place;


public class World {
    static private Map<Place, ArrayList<Located>> places = new HashMap<Place, ArrayList<Located>>();

    static public void addPlace(Place place) {
        places.put(place, new ArrayList<Located>());
    }

    static public void addLocated(Place place, Located located) {
        places.get(place).add(located);
    }

    static public Place getPlace(Located located) {
        for (Place place : places.keySet()) {
            if (places.get(place).contains(located)) {
                return place;
            }
        }
        return null;
    }

    static public ArrayList<Located> getLocated(Place place) {
        return places.get(place);
    }

    static public void removePlace(Place place) {
        places.remove(place);
    }

    static public void removeLocated(Place place, Located located) {
        places.get(place).remove(located);
    }
}
