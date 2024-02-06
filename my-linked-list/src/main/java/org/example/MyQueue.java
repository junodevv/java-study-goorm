package org.example;

public class MyQueue<T> {
    private MyLinkedList list;
    private Node<T> front;
    private Node<T> back;
    private int size;

    public MyQueue() {
        list = new MyLinkedList<T>();
        size = 0;
    }

    public void enqueue(T data) {
        list.add(data);
        size++;
        if (front == null && back == null) {
            front = list.getNode(size);
            back = front;
        }
        back = list.getNode(size);
    }

    // front 원소 제거 및 반환
    public T dequeue() {
        T data = front.getData();
        list.delete(size - (size-1));
        size--;
        if (front.equals(back)) { // 1개 있는 상황
            front = null;
            back = null;
            return data;
        }
        front = front.getNext();
        return data;
    }
    // front 원소 반환
    public T peek(){
        if(front==null){
            throw new IndexOutOfBoundsException("큐가 비어있습니다.");
        }
        return front.getData();
    }

    public void printAll() {
        list.printAll();
        System.out.println("size: " + size);
        System.out.println("front: " + (front == null ? null : front.getData()));
        System.out.println("back: " + (back == null ? null : back.getData()));
    }

}
