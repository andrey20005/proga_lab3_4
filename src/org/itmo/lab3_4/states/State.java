package org.itmo.lab3_4.states;

import org.itmo.lab3_4.Human;
import org.itmo.lab3_4.actions.Action;

public abstract class State {
    private Human human;

    public abstract void update();

    public abstract Action getAction();
}
