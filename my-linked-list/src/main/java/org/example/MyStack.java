package org.example;

public class MyStack<T> {
    private MyLinkedList<T> list;
    private T top;
    private int size;

    public MyStack() {
        list = new MyLinkedList<T>();
        size = 0;
    }

    public void push(T data){
        list.add(data);
        top = list.get(++size);
    }

    public T pop(){
        if(size == 0){
            throw new IndexOutOfBoundsException("MyStack이 비었습니다.");
        }
        T popData = top;
        list.delete(size);
        if(size<2){
            size--;
            top=null;
            return popData;
        }
        top = list.get(--size);
        return popData;
    }
    public void printAll(){
        list.printAll();
        System.out.println("top: " + top);
        System.out.println("size: " + size);
    }

}
