package org.itmo.lab3_4.actions;

import org.itmo.lab3_4.actions.Action;
import org.itmo.lab3_4.Human;
import org.itmo.lab3_4.actions.TypeOfAction;


public class Offend extends Action {
    String who;

    public Offend(Human human, TypeOfAction type, String who) {
        this.human = human;
        this.type = type;
        this.who = who;
        description = " пугает ";
    }

    public String doAction() {
        return human.name + description + who;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
