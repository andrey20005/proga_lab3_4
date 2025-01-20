package org.itmo.lab3_4.actions;

import org.itmo.lab3_4.actions.Action;
import org.itmo.lab3_4.Human;
import org.itmo.lab3_4.actions.TypeOfAction;


public class WorksAsDoctorAction extends Action {
    public WorksAsDoctorAction(Human human, TypeOfAction type) {
        this.human = human;
        this.type = type;
        description = " работает врачем.";
    }

    public String doAction() {
        return human.name + description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
