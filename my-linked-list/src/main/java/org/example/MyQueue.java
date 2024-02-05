package org.example;

public class MyQueue<T> {
    private MyLinkedList list;
    private Node<T> front;
    private Node<T> back;
    private int size;

    public MyQueue(){
        list = new MyLinkedList<T>();
        size=0;
    }

    public void enqueue(T data){
        list.add(data);
        size++;
        if(front==null && back==null){
            front = list.getNode(size);
            back = front;
        }
        back = list.getNode(size);
    }

    public void printAll(){
        list.printAll();
        System.out.println("size: " + size);
        System.out.println("front: " + front.getData());
        System.out.println("back: " + back.getData());
    }

}
