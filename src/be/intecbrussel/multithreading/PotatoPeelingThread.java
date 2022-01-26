package be.intecbrussel.multithreading;

public class PotatoPeelingThread extends Thread{
    private PotatoStock potatoStock;

    public PotatoPeelingThread(PotatoStock potatoStock) {
        this.potatoStock = potatoStock;
    }

    @Override
    public void run() {
        while (true) {

            potatoStock.peelPotato();

        }
    }
}
