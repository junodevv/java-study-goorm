package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // 상품 목록 생성
        Set<Product> productSet = new HashSet<>();
        //TODO: 상품 클래스를 생성하여 상품목록에 넣는다.
        Product milk = new Product(1, "우유", 3000);
        Product coffee = new Product(2, "커피", 4000);
        Product tissue = new Product(3, "화장지", 5000);
        productSet.add(milk);
        productSet.add(coffee);
        productSet.add(tissue);

        // 상품 목록 확인
        System.out.println("고유한 상품 목록:");
        for(Product product: productSet){
            System.out.println(product.getName() + " : " + product.getPrice());
        }

        // 장바구니 생성
        Cart myCart = new Cart();

        myCart.addProduct(milk, 3);
        myCart.addProduct(milk, 2);
        myCart.addProduct(coffee, 1);
        myCart.addProduct(tissue, 1);
        //TODO: 상품을 장바구니에 추가
        //TODO: 상품을 장바구니에서 제거
        //TODO: 장바구니에 현재 담긴 상품들을 출력 (상품이름, 각 상품의 갯수)
    }
}