package org.itmo.lab3_4;

import org.itmo.lab3_4.features.*;

public class SimulationInitializer {
    public static void main(String[] args) throws UnityOfPriorityException {
        Simulation simulation = new Simulation();

        Human pilulkin = new Human("Пилюлькин");
        pilulkin.addFeature(new Hardworking(pilulkin));
        pilulkin.addFeature(new WorksAsDoctor(pilulkin));
        simulation.addHuman(pilulkin);

        Human vintik = new Human("Винтик");
        vintik.addFeature(new Hardworking(vintik));
        vintik.addFeature(new WorksAsMechanic(vintik));
        simulation.addHuman(vintik);

        Human siropchik = new Human("Сиропчик");
        siropchik.addFeature(new NormalPriorities(siropchik));
        siropchik.addFeature(new LoveSoda(siropchik));
        simulation.addHuman(siropchik);

        Human toptyshka = new Human("Торопыжка");
        toptyshka.addFeature(new NormalPriorities(toptyshka));
        simulation.addHuman(toptyshka);

        Human malyshka = new Human("Малышка");
        malyshka.addFeature(new NormalPriorities(malyshka));
        simulation.addHuman(malyshka);

        Human neznaika = new Human("Незнайка");
        neznaika.addFeature(new Lazy(neznaika));
        neznaika.addFeature(new TellTallTales(neznaika));
        neznaika.addFeature(new LikesToOffend(neznaika));
        simulation.addHuman(neznaika);

        simulation.goSimulationStep();
        simulation.goSimulationStep();
    }
}

