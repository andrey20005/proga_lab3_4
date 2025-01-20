package org.itmo.lab3_4.features;

import org.itmo.lab3_4.actions.Action;
import org.itmo.lab3_4.states.State;
import org.itmo.lab3_4.Human;

public abstract class Feature {
    public Human human;

    public abstract void update();
}
