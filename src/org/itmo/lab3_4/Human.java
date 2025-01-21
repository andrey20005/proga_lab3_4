package org.itmo.lab3_4;

import org.itmo.lab3_4.actions.Action;
import org.itmo.lab3_4.states.State;
import org.itmo.lab3_4.world.Place;
import org.itmo.lab3_4.world.Located;
import org.itmo.lab3_4.features.Feature;
import org.itmo.lab3_4.features.Priorities;

import java.util.ArrayList;
import java.util.Objects;


public class Human implements Located, Place {
    public String name;
    public Action action;
    public ArrayList<Action> actionsToChoose = new ArrayList<Action>();
    public ArrayList<State> states = new ArrayList<State>();
    public ArrayList<Feature> features = new ArrayList<Feature>();

    public Human(String name) {
        this.name = name;
    }

    public void updateStates() {
        for (State state : states) {
            state.update();
        }
    }

    public void updateFeatures() throws ExceptionOfHavingOnePrioritie {
        int countOfPriorities = 0;
        for (Feature feature : features) {
            if (feature instanceof Priorities) {
                countOfPriorities++;
            }
        }
        if (countOfPriorities != 1) {
            throw new ExceptionOfHavingOnePrioritie("You need have only one Priorities");
        }
        for (Feature value : features) {
            value.update();
        }
    }

    public void doAction() {
        for (Feature feature : features) {
            if (feature instanceof Priorities priorities) {
                action = priorities.selectAction(actionsToChoose);
            }
        }
        String description = action.doAction();
        System.out.println(description);
    }

    public void addAction(Action action) {
        actionsToChoose.add(action);
    }

    public void addState(State state) {
        states.add(state);
    }

    public void addFeature(Feature feature) {
        features.add(feature);
    }

    public void removeState(State state) {
        states.remove(state);
    }

    public void removeFeature(Feature feature) {
        features.remove(feature);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Human human) {
            if (this == human) return true;
            if (Objects.equals(human.name, this.name) && human.features.equals(this.features)) return true;
            if (human.hashCode() == this.hashCode()) return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (name.hashCode() % (2 ^ 16) + ((features.hashCode() % (2 ^ 16)) * 2^16));
    }

    @Override
    public String toString() {
        return this.name;
    }
}
