package org.itmo.lab3_4.features;

import org.itmo.lab3_4.Human;
import org.itmo.lab3_4.features.Feature;
import org.itmo.lab3_4.items.WhiteCoat;
import org.itmo.lab3_4.actions.*;


public class WorksAsDoctor extends Feature {
    Boolean is_in_coat = false;

    public WorksAsDoctor(Human human) {
        this.human = human;
    }

    public void update() {
        if (is_in_coat) {
            human.addAction(new WorksAsDoctorAction(human, TypeOfAction.NECESSARY));
        } else {
            human.addAction(new DressUp(human, TypeOfAction.NECESSARY, new WhiteCoat()));
            is_in_coat = true;
        }
    }
}
