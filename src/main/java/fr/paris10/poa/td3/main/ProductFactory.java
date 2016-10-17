package fr.paris10.poa.td3.main;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vabouque on 10/10/2016.
 */
public class ProductFactory {

    static ProductFactory instance;

    public static ProductFactory getInstance() {
        if(instance == null) {
            instance = new ProductFactory();
        }
        return instance;
    }

    public Product createProduct(String productName) {
        if (productName.equals("ProductA")) {
            return new ProductA();
        }
        if (productName.equals("ProductB")) {
            return new ProductB();
        }
        if (productName.equals("ProductC")) {
            return new ProductC();
        }

        return new ProductA();
    }

    public Product createProduct() {
        return new ProductA();
    }
}
