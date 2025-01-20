package org.itmo.lab3_4.actions;

import org.itmo.lab3_4.actions.TypeOfAction;
import org.itmo.lab3_4.Human;


public abstract class Action {
    public TypeOfAction type;
    protected Human human;
    public String description;

    public abstract String doAction();

    public abstract void setDescription(String description);
}
