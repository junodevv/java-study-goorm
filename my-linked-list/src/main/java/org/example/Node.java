package org.example;

public class Node<T> {
    private static Node Head;

    private T data;
    private Node<T> next;

    public Node(T data) {
        Head.data = data;
        Head.next = null;
    }

//    // 첫 생성
//    public Node createFirstNode(T data) {
//        Head = new Node<>(data);
//        return Head;
//    }

    public void add(T data) {
        Node newNode = new Node<>(data);

        Node currentNode = Head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }


}
