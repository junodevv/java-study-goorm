package org.example;

public class MyLinkedList<T> {
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

    public void printAll() {
        Node<T> currentNode = Head;
        while(true){
            if(currentNode == null) break;
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();
        }
    }

}
