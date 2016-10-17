package fr.paris10.poa.td3.main;

/**
 * Created by vabouque on 10/10/2016.
 */
final class ProductB implements Product {

    ProductB() {
    }

    @Override
    public void doStuff() {
        System.out.println("I'm Product B, " +
                "doing it");
    }
}
