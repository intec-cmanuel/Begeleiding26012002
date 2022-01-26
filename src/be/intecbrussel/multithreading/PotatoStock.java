package be.intecbrussel.multithreading;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PotatoStock {
    private int amountOfPotatoesPeeled = 0;
    private Deque<Potato> potatoes = new LinkedList<>();
    private boolean hasUnpeeledPotatoes = false;

    public Deque<Potato> getPotatoes() {
        return potatoes;
    }

    public void peelPotato(){
        Potato potato = potatoes.pollFirst();

        if (potato == null) {
            hasUnpeeledPotatoes = false;
            return;
        }

        if (!potato.isPeeled()){
            potato.peel();
            amountOfPotatoesPeeled++;
        } else {
            hasUnpeeledPotatoes = false;
        }
        potatoes.offer(potato);
    }

    public void addPotatoes(int amount) {
        for (int i = 0; i < amount; i++) {
            potatoes.offerFirst(new Potato());
            hasUnpeeledPotatoes = true;
        }
    }

    public int getAmountOfPeeledPotatoes() {
        return amountOfPotatoesPeeled;
    }
}
