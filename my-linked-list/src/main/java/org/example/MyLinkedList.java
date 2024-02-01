package org.example;

public class MyLinkedList<T> {
    private Node Head;

    public MyLinkedList() {
    }

    public void add(T data) {
        Node newNode = new Node<>(data);

        if (Head == null) {
            Head = newNode;
            return;
        }

        Node currentNode = Head;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(newNode);
    }

    public void printAll() {
//        if(Head == null){
//            System.out.println("빈 리스트입니다.");
//            return;
//        }
//        Node currentNode = Head;
//        do{
//            System.out.println(currentNode.getData());
//            currentNode = currentNode.getNext();
//        }while(currentNode.getNext() != null);
        Node currentNode = Head;
        while(true){
            if(currentNode == null) break;
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();
        }
    }

}
