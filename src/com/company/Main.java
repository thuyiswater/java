package com.company;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        // list.deleteEnd(4);
        //list.print();
        //list.deleteHead(1);
        list.deleteAt(2);
        list.print();
    }
}
