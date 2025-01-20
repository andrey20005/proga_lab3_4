package org.itmo.lab3_4.actions;

import org.itmo.lab3_4.actions.Action;
import org.itmo.lab3_4.Human;
import org.itmo.lab3_4.actions.TypeOfAction;
import org.itmo.lab3_4.items.Item;
import org.itmo.lab3_4.items.WhiteCoat;


public class DressUp extends Action {
    Item cloth;

    public DressUp(Human human, TypeOfAction type, Item cloth) {
        this.human = human;
        this.type = type;
        this.cloth = cloth;
        description = " надевает белый халат.";
    }

    public String doAction() {
        // cloth.move(human);
        return human.name + description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
