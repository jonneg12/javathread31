package ru.netology;

public class Tumbler {
    private volatile boolean tumbler;

    public boolean isTumbler() {
        return tumbler;
    }

    public void setTumbler(boolean tumbler) {
        this.tumbler = tumbler;
    }

    @Override
    public String toString() {
        return !tumbler ? "Tumbler is on " : "Tumbler is off";

    }
}
