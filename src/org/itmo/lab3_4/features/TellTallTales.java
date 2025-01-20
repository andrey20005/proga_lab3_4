package org.itmo.lab3_4.features;

import org.itmo.lab3_4.Human;
import org.itmo.lab3_4.features.Feature;
import org.itmo.lab3_4.actions.*;
import org.itmo.lab3_4.features.TallTalesRandomizer;;


public class TellTallTales extends Feature {
    public TellTallTales(Human human) {
        this.human = human;
    }

    public void update() {
        human.addAction(new Tell(human, TypeOfAction.INTRESTING_BUT_NOT_NECESSARY, TallTalesRandomizer.getRandomMessage()));
    }
}
