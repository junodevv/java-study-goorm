package org.example;

public class Main2 {
    public static void main(String[] args){
        MyStack<String> myStack = new MyStack<>();

        System.out.println("----- push test -----");
        myStack.push("일");
        myStack.push("이");
        myStack.push("삼");
        myStack.printAll();

        System.out.println("----- pop test -----");
        System.out.println("pop: " + myStack.pop());
        myStack.printAll();
        System.out.println("pop: " + myStack.pop());
        myStack.printAll();
        System.out.println("pop: " + myStack.pop());
        myStack.printAll();

    }
}
