package be.intecbrussel.multithreading;

public class Multithreading {
    public static void main(String[] args) {
        PotatoStock potatoStock = new PotatoStock();
        potatoStock.addPotatoes(5000);

        PotatoPeelingThread t1 = new PotatoPeelingThread(potatoStock);
        PotatoPeelingThread t2 = new PotatoPeelingThread(potatoStock);
        PotatoPeelingThread t3 = new PotatoPeelingThread(potatoStock);

        t1.start();
        t2.start();
        t3.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(potatoStock.getAmountOfPeeledPotatoes());
        System.out.println(potatoStock.getPotatoes().size());
    }
}
