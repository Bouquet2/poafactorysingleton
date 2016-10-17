package fr.paris10.poa.td3.client;

import fr.paris10.poa.td3.main.*;

/**
 * Created by vabouque on 10/10/2016.
 */
public class Client {
    private Product prodA;
    ProductFactory factory;

    public Client() {
        factory = ProductFactory.getInstance();
        prodA = factory.createProduct("ProductA");
    }

    public void foo() {
        prodA.doStuff();
        Product myProdB = factory.createProduct("ProductB");
        myProdB.doStuff();
        Product myProdC = factory.createProduct("ProductC");
        myProdC.doStuff();
    }
}
