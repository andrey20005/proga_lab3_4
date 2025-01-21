package org.itmo.lab3_4;


import org.itmo.lab3_4.Human;
import org.itmo.lab3_4.actions.Action;

import java.util.ArrayList;

public class Simulation {
    public ArrayList<Human> humans = new ArrayList<>();

    public void addHuman(Human human) {
        humans.add(human);
    }

    public void goSimulationStep() throws ExceptionOfHavingOnePrioritie {
        for (Human human : humans) {
            human.actionsToChoose = new ArrayList<Action>();
            human.updateFeatures();
            human.updateStates();
            if (human.actionsToChoose.isEmpty()) {
                System.out.println(human.name + " ничего не делает.");
                continue;
            }
            human.doAction();
        }
    }
}
