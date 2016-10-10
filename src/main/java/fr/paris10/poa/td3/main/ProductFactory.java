package fr.paris10.poa.td3.main;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vabouque on 10/10/2016.
 */
public class ProductFactory {
    private static Map<String, Product> registry = new HashMap<String, Product>();

    public static void registerProduct(String name, Product p) {
        registry.put(name,p);
    }

    public Product createProduct(String name) {
        return registry.get(name).createProduct();
    }
}
