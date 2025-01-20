package org.itmo.lab3_4.features;

import org.itmo.lab3_4.Human;
import org.itmo.lab3_4.features.Feature;
import org.itmo.lab3_4.actions.*;


public class LoveSoda extends Feature {
    public LoveSoda(Human human) {
        this.human = human;
    }

    public void update() {
        if (Math.random() > 0.5) {
            human.addAction(new DrinkSoda(human, TypeOfAction.INTRESTING_BUT_NOT_NECESSARY));
        }
    }
}
