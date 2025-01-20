package org.itmo.lab3_4.features;

import org.itmo.lab3_4.Human;
import org.itmo.lab3_4.features.Feature;
import org.itmo.lab3_4.actions.*;


public class LikesToOffend extends Feature {
    Boolean is_in_coat = false;

    public LikesToOffend(Human human) {
        this.human = human;
    }

    public void update() {
        if (Math.random() >= 0.3) {
            human.addAction(new Offend(human, TypeOfAction.INTRESTING_BUT_NOT_NECESSARY, "малышка"));
        }
    }
}
