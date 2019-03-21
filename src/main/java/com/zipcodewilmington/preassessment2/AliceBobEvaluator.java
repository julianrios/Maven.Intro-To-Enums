package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {
    String input;

    public AliceBobEvaluator(String input) {
        this.input = input;
    }

    public boolean isAlice() {
        if(input.equals("Alice")) {
            return true;
        }
        return false;
    }

    public boolean isBob() {
        if(input.equals("Bob")) {
            return true;
        }
        return false;
    }
}
