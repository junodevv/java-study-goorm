package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Cart {
    private Map<Product, Integer> items;

    public Cart(){
        items = new HashMap<>();
    }

    public void addProduct(Product product, int amount){
        items.merge(product, amount, (oldValue, newValue) -> oldValue+newValue);
    }

    public void showItems(){
        System.out.println("장바구니에 담은 목록:");
        for(Product item : items.keySet()){
            System.out.println(item.getName() + ", " + items.get(item)+ "개");
        }
    }
}
