package org.example;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<T> implements Iterable<T> {
    private Node<T> Head;
    private int size;

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
        size++;
    }
    // 리펙토링 중
    public T get(int index) {
        if (index < 1) {
            throw new IllegalArgumentException("MyLinkedList가 비어있습니다.");
        }
        if (index > size) {
            throw new IllegalArgumentException("MyLinkedList의 크기를 초과했습니다.");
        }
        Node<T> currentNode = Head;
        for(int i=1; i<index; i++){
            currentNode = currentNode.getNext();
        }
        return currentNode.getData();
    }

    public void delete(int index) {
        Node<T> currentNode = Head;
        if (currentNode == null) {
            System.out.println("빈 스택");
        }

        for (int i = 1; i < index - 1; i++) {
            if (currentNode.getNext() == null) {
                throw new IllegalArgumentException("MyLinkedList의 크기를 초과했습니다.");
            }
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(currentNode.getNext().getNext());
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
}
