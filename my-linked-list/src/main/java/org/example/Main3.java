package org.example;

public class Main3 {
    public static void main(String[] args){
        MyQueue<String> myQueue = new MyQueue<>();

        myQueue.enqueue("일");
        myQueue.enqueue("two");
        myQueue.enqueue("삼");

        myQueue.printAll();
        System.out.println("peek: " + myQueue.peek());

        myQueue.dequeue();
//        myQueue.dequeue();
//        myQueue.dequeue();

        myQueue.printAll();
        System.out.println("peek: " + myQueue.peek());
    }
}
