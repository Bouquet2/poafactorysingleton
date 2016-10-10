package fr.paris10.poa.td3.client;

import fr.paris10.poa.td3.main.*;

/**
 * Created by vabouque on 10/10/2016.
 */
public class Client {
    private ProductA prodA;
    private ProductB prodB;

    public Client() {
        prodA = new ProductA();
    }

    public void foo() {
        prodA.doStuff();
        ProductB myProdB = new ProductB();
        myProdB.doStuff();
        ProductC myProdC = new ProductC();
        myProdC.doStuff();
    }
}
