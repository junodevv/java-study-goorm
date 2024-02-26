package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        // 상품 목록 생성
        Set<Product> productSet = new HashSet<>();
        //TODO: I/O스트림을 이용해 상품을 상품목록에 넣기.
        BufferedReader br = null;
        var path = Main2.class.getResource("products.csv").getPath();

        List<Product> myProducts = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(path));
            String line;

            while((line = br.readLine())!=null){
                String[] values = line.split(",");

                Product p = new Product(
                        Integer.parseInt(values[0]),
                        values[1],
                        Integer.parseInt(values[2])
                        );
                productSet.add(p);
                myProducts.add(p);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 상품 목록 확인
        System.out.println("고유한 상품 목록:");
        for(Product product: productSet){
            System.out.println(product.getName() + " : " + product.getPrice());
        }

        // 장바구니 생성
        Cart myCart = new Cart();
        //TODO: 상품을 장바구니에 추가
        myCart.addProduct(myProducts.get(0),1);
        myCart.addProduct(myProducts.get(1),1);
        myCart.addProduct(myProducts.get(2),1);

        myCart.showItems();

        //TODO: 상품을 장바구니에서 제거
        myCart.removeProduct(myProducts.get(0));
        myCart.removeProduct(myProducts.get(1));

        //TODO: 장바구니에 현재 담긴 상품들을 출력 (상품이름, 각 상품의 갯수)
        myCart.showItems();
    }
}