package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {
    ALICE, BOB;

    public boolean isAlice() {
        if(this == ALICE) {
            return true;
        }
        return false;
    }

    public boolean isBob() {
        if(this == BOB) {
            return true;
        }
        return false;
    }

    public String getCatchPhrase() {
        String catchPhrase = "Hey, my name is ";
        if(this == ALICE) {
            catchPhrase += "ALICE!";
        } else {
            catchPhrase += "BOB!";
        }
        return catchPhrase;
    }
}
