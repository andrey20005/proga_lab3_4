package org.itmo.lab3_4;

import org.itmo.lab3_4.actions.Action;
import org.itmo.lab3_4.states.State;
import org.itmo.lab3_4.world.Place;
import org.itmo.lab3_4.world.Located;
import org.itmo.lab3_4.features.Feature;
import org.itmo.lab3_4.features.Priorities;


public class Human implements Located, Place {
    public String name;
    public Action action;
    public Action[] actionsToChoose = new Action[0];
    public State[] states = new State[0];
    public Feature[] features = new Feature[0];

    public Human(String name) {
        this.name = name;
        this.features = new Feature[0];
    }

    public void updateStates() {
        for (State state : states) {
            state.update();
        }
    }

    public void updateFeatures() throws ExceptionOfHavingOnePrioritie {
        for (Feature value : features) {
            value.update();
        }
        int countOfPriorities = 0;
        for (Feature feature : features) {
            if (feature instanceof Priorities) {
                countOfPriorities++;
            }
        }
        if (countOfPriorities != 1) {
            throw new ExceptionOfHavingOnePrioritie("You need have only one Priorities");
        }
    }

    public void doAction() {
        for (Feature feature : features) {
            if (feature instanceof Priorities) {
                Priorities priorities = (Priorities) feature;
                action = priorities.selectAction(actionsToChoose);
            }
        }
        String description = action.doAction();
        System.out.println(description);
    }

    public void addAction(Action action) {
        Action[] newActions = new Action[actionsToChoose.length + 1];
        for (int i = 0; i < actionsToChoose.length; i++) {
            newActions[i] = actionsToChoose[i];
        }
        newActions[actionsToChoose.length] = action;
        actionsToChoose = newActions;
    }

    public void addState(State state) {
        State[] newStates = new State[states.length + 1];
        for (int i = 0; i < states.length; i++) {
            newStates[i] = states[i];
        }
        newStates[states.length] = state;
        states = newStates;
    }

    public void addFeature(Feature feature) {
        Feature[] newFeatures = new Feature[features.length + 1];
        for (int i = 0; i < features.length; i++) {
            newFeatures[i] = features[i];
        }
        newFeatures[features.length] = feature;
        features = newFeatures;
    }

    public void popState(State state) {
        State[] newStates = new State[states.length - 1];
        int shift = 0;
        for (int i = 0; i < states.length - 1; i++) {
            if (states[i + shift] == state) {
                shift = 1;
            } else {
                newStates[i] = states[i + shift];
            }
        }
        states = newStates;
    }

    public void popFeature(Feature feature) {
        Feature[] newFeatures = new Feature[features.length - 1];
        int shift = 0;
        for (int i = 0; i < features.length - 1; i++) {
            if (features[i + shift] == feature) {
                shift = 1;
            } else {
                newFeatures[i] = features[i + shift];
            }
        }
        features = newFeatures;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Human) {
            Human human = (Human) object;
            if (this == human) return true;
            if (human.name == this.name && human.features.equals(this.features)) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
