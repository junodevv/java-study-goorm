package org.example;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> items;

    public Cart(){
        items = new HashMap<>();
    }

    public void addProduct(Product product, int amount){
        items.merge(product, amount, (oldValue, newValue) -> oldValue+newValue);
    }

}
