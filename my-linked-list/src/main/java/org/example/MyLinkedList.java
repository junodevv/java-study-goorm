package org.example;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<T> implements Iterable<T>{
    private Node<T> Head;

    public MyLinkedList() {
    }

    public void add(T data) {
        Node newNode = new Node<>(data);

        if (Head == null) {
            Head = newNode;
            return;
        }

        Node<T> currentNode = Head;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(newNode);
    }

    public T get(int index){
        Node<T> currentNode = Head;
        for(int i=1; i<index; i++){
            if(currentNode.getNext()==null){
                throw new IllegalArgumentException("MyLinkedList의 크기를 초과했습니다.");
            }
            currentNode = currentNode.getNext();
        }
        return currentNode.getData();
    }

    public void delete(int index){
        Node<T> currentNode = Head;
        for(int i=1; i<index-1; i++){
            if(currentNode.getNext()==null){
                throw new IllegalArgumentException("MyLinkedList의 크기를 초과했습니다.");
            }
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(currentNode.getNext().getNext());
    }

    public void printAll() {
        Node<T> currentNode = Head;
        while(true){
            if(currentNode == null) break;
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            private Node<T> currentNode = Head;

            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public T next() {
                if(!hasNext()){
                    throw new NoSuchElementException();
                }
                T data = currentNode.getData();
                currentNode = currentNode.getNext();
                return data;
            }
        };
    }
}
