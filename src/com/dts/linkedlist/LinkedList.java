package com.dts.linkedlist;

/**
 * Implement a LinkedList class and add
 * Methods: 1.addFirst(item)
 * 2.addLast
 * 3.deleteFirst
 * 4.contains()
 * 5.indexOf
 * 6. removeLast()
 */
public class LinkedList {

    private Node first;
    private Node last;
    private int size;

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    /**
     * Inserts item at the end of a list
     *
     * @param item
     */
    public void addLast(int item) {
        var node = new Node(item);

        if (isEmpty()) {
            first = last = node;
        } else {
            // 1-> 2 -> 3
            last.next = node;
            last = node;
            size++;
        }
    }

    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            // 1 ->2-> 3
            node.next = first;
            first = node;
            size++;
        }
    }

    /**
     * Checks if Linked List is Empty
     *
     * @return
     */
    private boolean isEmpty() {
        return first == null;
    }

    private int getSize() {
        return size;
    }

    /**
     * Returns the index if item exists in list
     *
     * @param item
     * @return
     */
    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) return index;

            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    /**
     * Removes First Node
     */
    public void removeFirst() {
        if (isEmpty()) return;

        // 1 node : 1
        if (first == last)
            first = last = null;
        else {
            // 1->2->3
            var second = first.next;
            first.next = null;
            first = second;
        }
    }

    /**
     * Removes last Node
     */
    public void removeLast() {
        if (isEmpty()) return;

        //1 node
        if (first == last) {
            first = last = null;
        } else {
            // 1-> 2 -> 3
            var previous = getPrevious(last);
            last = previous;
            last.next = null;

        }
    }

    public void print() {
        var current = first;
        while (current != null) {
            System.out.print(+current.value + "  ");
            current = current.next;
        }
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) return current;
            else {
                current = current.next;
            }
        }
        return null;
    }
}




