package org.itmo.lab3_4;


public class UnityOfPriorityException extends Exception {
    Human human;
    int countOfPriorities;
    public UnityOfPriorityException(Human human, int countOfPriorities) {
        super();
        this.human = human;
        this.countOfPriorities = countOfPriorities;
    }

    @Override
    public String getMessage() {
        return "Human should have one priority. " + human.name + " have " + countOfPriorities + " priorities.";
    }
}
