package org.example;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<T> implements Iterable<T> {
    private Node<T> Head;
    private int size;

    public MyLinkedList() {
        size = 0;
    }

    public void add(T data) {
        Node newNode = new Node<>(data);

        if (Head == null) {
            Head = newNode;
            size++;
            return;
        }

        Node<T> currentNode = Head;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(newNode);
        size++;
    }

    public T get(int index) {
        verifyIndex(index);
        Node<T> currentNode = Head;
        for (int i = 1; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode.getData();
    }

    public void delete(int index) {
        verifyIndex(index);
        // Queue
        if(index==1 && Head.getNext()!=null){
            Head = Head.getNext();
            return;
        }

        if(Head.getNext()==null){
            Head=null;
            return;
        }
        Node<T> currentNode = Head;
        for (int i = 1; i < index - 1; i++) {
            currentNode = currentNode.getNext();
        }

        currentNode.setNext(currentNode.getNext().getNext());
        size--;
    }

    public void printAll() {
        for (T t : this) {
            System.out.println(t);
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
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T data = currentNode.getData();
                currentNode = currentNode.getNext();
                return data;
            }
        };
    }

    public Node<T> getNode(int index) {
        verifyIndex(index);
        Node<T> currentNode = Head;
        for (int i = 1; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    private void verifyIndex(int index) {
        if (size == 0) {
            throw new IllegalArgumentException("MyLinkedList가 비어있습니다.");
        }
        if (index < 1 || index > size) {
            throw new IllegalArgumentException("MyLinkedList의 크기에 맞지 않는 index입니다.");
        }
    }
}
