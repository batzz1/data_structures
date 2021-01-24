package com.dts.linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
     
        System.out.println(list.size());
        list.addLast(10);
        list.addLast(20);
        System.out.println(list.size());
        list.addLast(30);
        list.addFirst(2);
        list.print();
        list.removeFirst();
        System.out.println();
        list.print();
        System.out.println();
        list.addLast(22);
        list.addLast(100);
        list.print();
        System.out.println();

        list.removeLast();
        System.out.println();

        list.print();
        System.out.println(list.size());
        list.removeFirst();
        System.out.println(list.size());

    }
}
