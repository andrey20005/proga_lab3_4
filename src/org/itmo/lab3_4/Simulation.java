package org.itmo.lab3_4;


import org.itmo.lab3_4.Human;
import org.itmo.lab3_4.actions.Action;

public class Simulation {
    public Human[] humans = new Human[0];

    public void addHuman(Human human) {
        Human[] newHumans = new Human[humans.length + 1];
        for (int i = 0; i < humans.length; i++) {
            newHumans[i] = humans[i];
        }
        newHumans[humans.length] = human;
        humans = newHumans;
    }

    public void goSimulationStep() throws ExceptionOfHavingOnePrioritie {
        for (int i = 0; i < humans.length; i++) {
            humans[i].actionsToChoose = new Action[0];
            humans[i].updateFeatures();
            humans[i].updateStates();
            if (humans[i].actionsToChoose.equals(new Action[0]) || humans[i].actionsToChoose.length == 0) {
                System.out.println(humans[i].name + " ничего не делает.");
                continue;
            }
            humans[i].doAction();
        }
    }
}
