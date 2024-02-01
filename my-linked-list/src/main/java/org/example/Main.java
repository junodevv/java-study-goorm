package org.example;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        System.out.println("----- add test -----");
        myLinkedList.add("일");
        myLinkedList.add("이");
        myLinkedList.add("삼");

        myLinkedList.printAll();

        System.out.println("----- get test -----");
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(3));
//        System.out.println(myLinkedList.get(4));

        System.out.println("----- delete test -----");
        myLinkedList.delete(2);
        myLinkedList.printAll();
//        myLinkedList.delete(4);
//        myLinkedList.printAll();
    }
}