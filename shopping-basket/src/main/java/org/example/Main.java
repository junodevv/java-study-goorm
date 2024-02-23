package org.example;

import java.sql.SQLOutput;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // 상품 목록 생성
        Set<Product> productSet = new HashSet<>();
        //TODO: 상품 클래스를 생성하여 상품목록에 넣는다.

        // 상품 목록 확인
        System.out.println("고유한 상품 목록:");
        for(Product product: productSet){
            System.out.println(product.getName() + " : " + product.getPrice());
        }

        // 장바구니 생성
        Cart myCart = new Cart();

        //TODO: 상품을 장바구니에 추가
        //TODO: 상품을 장바구니에서 제거
        //TODO: 장바구니에 현재 담긴 상품들을 출력 (상품이름, 각 상품의 갯수)
    }
}