package org.itmo.lab3_4.features;

import org.itmo.lab3_4.actions.Action;
import org.itmo.lab3_4.actions.Tell;
import org.itmo.lab3_4.actions.TypeOfAction;
import org.itmo.lab3_4.Human;

import java.util.ArrayList;


public class Lazy extends Feature implements Priorities {
    public Lazy(Human human) {
        this.human = human;
    }

    public void update() {
    }

    public Action selectAction(ArrayList<Action> actions) {
        Action action = actions.get(0);
        int val = importance(action.type);
        for (Action localAction : actions) {
            int localVal = importance(localAction.type);
            if (localVal > val) {
                action = localAction;
                val = localVal;
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
