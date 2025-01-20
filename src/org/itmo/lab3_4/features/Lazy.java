package org.itmo.lab3_4.features;

import org.itmo.lab3_4.actions.Action;
import org.itmo.lab3_4.actions.Tell;
import org.itmo.lab3_4.actions.TypeOfAction;
import org.itmo.lab3_4.Human;


public class Lazy extends Feature implements Priorities {
    public Lazy(Human human) {
        this.human = human;
    }

    public void update() {
    }

    public Action selectAction(Action[] actions) {
        Action action = actions[0];
        int val = importance(action.type);
        for (int i = 1; i < actions.length; i++) {
            int val_i = importance(actions[i].type);
            if (val_i > val) {
                action = actions[i];
                val = val_i;
            }
        }
        return action;
    }

    private int importance(TypeOfAction type) {
        if (type == TypeOfAction.VERY_IMPORTANT) {
            return 80 - random();
        } else if (type == TypeOfAction.IMPORTANT) {
            return 80 - random();
        } else if (type == TypeOfAction.NECESSARY) {
            return 50 - random();
        } else if (type == TypeOfAction.BORING_BUT_NECESSARY) {
            return 40 - random();
        } else if (type == TypeOfAction.INTRESTING_BUT_NOT_NECESSARY) {
            return 70 - random();
        } else {
            return 40 - random();
        }
    }

    private int random() {
        return (int) (Math.random() * 20.);
    }
}
