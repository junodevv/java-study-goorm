package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Cart {
    private Map<Product, Integer> items;

    public Cart(){
        items = new HashMap<>();
    }

    public void addProduct(Product product, int count){
        items.merge(product, count, (oldValue, newValue) -> oldValue+newValue);
    }

    public void removeProduct(Product product){
        if(!items.containsKey(product)){
            throw new IllegalArgumentException("없는 상품입니다.");
        }
        items.remove(product);
    }

    public void removeProduct(Product product, int count){
        if(!items.containsKey(product)){
            throw new IllegalArgumentException("없는 상품입니다.");
        }
        if(items.get(product)<count){
            throw new IllegalArgumentException("갯수를 다시 입력해주세요");
        }
        items.merge(product, count, (oldValue, newValue)-> oldValue - newValue);
    }

    public void showItems(){
        System.out.println("장바구니에 담은 목록:");
        for(Product item : items.keySet()){
            System.out.println(item.getName() + ", " + items.get(item)+ "개");
        }
    }
}
