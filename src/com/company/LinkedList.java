package com.company;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = head;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void addNode(int data) {
        Node newNode = new Node();
        newNode.setData(data);

        if(head == null) head = newNode;
        else{
            Node dummyHead = head;
            while(dummyHead.getNext() != null) {
                dummyHead = dummyHead.getNext();
            }
            dummyHead.setNext(newNode);
        }
    }

    public void deleteEnd(int data) {
        Node dummyHead = head;
        Node temp = dummyHead.getNext();

        while(temp != null) {
            if(temp.getData() == data) dummyHead.setNext(null);
            temp = temp.getNext();
            dummyHead = dummyHead.getNext();
        }
    }

    public void deleteHead(int data) {
        head = head.getNext();
    }

    public void deleteAt(int pos) {
        Node dummyHead = head;
        Node temp = null;

        for(int i = 0; i < pos - 1; i++) {
            dummyHead = dummyHead.getNext();
        }
        temp = dummyHead.getNext();
        dummyHead.setNext(temp.getNext());
    }

    public void print() {
        Node dummyHead = head;

        while(dummyHead.getNext() != null) {
            System.out.println(dummyHead.getData());
            dummyHead = dummyHead.getNext();
        }
        System.out.println(dummyHead.getData());
    }
}
