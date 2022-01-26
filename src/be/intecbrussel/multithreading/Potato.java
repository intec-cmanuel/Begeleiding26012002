package be.intecbrussel.multithreading;

public class Potato {
    private boolean isPeeled;

    public void peel() {
        this.isPeeled = true;
    }

    public boolean isPeeled() {
        return isPeeled;
    }
}
