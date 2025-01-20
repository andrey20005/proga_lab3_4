package org.itmo.lab3_4.features;

import org.itmo.lab3_4.Human;
import org.itmo.lab3_4.features.Feature;
import org.itmo.lab3_4.actions.*;


public class WorksAsMechanic extends Feature {
    public WorksAsMechanic(Human human) {
        this.human = human;
    }

    public void update() {
        human.addAction(new WorksAsMechanicAction(human, TypeOfAction.NECESSARY));
    }
}
