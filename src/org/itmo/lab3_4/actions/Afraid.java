package org.itmo.lab3_4.actions;

import org.itmo.lab3_4.actions.Action;
import org.itmo.lab3_4.Human;
import org.itmo.lab3_4.actions.TypeOfAction;


public class Afraid extends Action {
    String message;

    public Afraid(Human human, TypeOfAction type, String message) {
        this.human = human;
        this.type = type;
        this.message = message;
        description = ":";
    }

    public String doAction() {
        return human.name + description + message;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
