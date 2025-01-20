package org.itmo.lab3_4;


public class ExceptionOfHavingOnePrioritie extends Exception {
    public ExceptionOfHavingOnePrioritie(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "dfg";
    }
}
