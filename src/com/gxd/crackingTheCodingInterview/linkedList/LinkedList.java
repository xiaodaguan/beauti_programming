package com.gxd.crackingTheCodingInterview.linkedList;

/**
 * Created by guanxiaoda on 6/4/16.
 */
public class LinkedList {

    private LinkedNode first;
    private LinkedNode last;

    public LinkedList(LinkedNode first) {
        this.first = first;
        LinkedNode node = first;
        while (node.next != null) {
            node = node.next;
        }
        this.last = node;
    }

    public LinkedList() {
        this.first = null;
        this.last = null;
    }

    public void append(LinkedNode node) {
        this.last.setNext(node);
        node.setPrev(this.last);
        this.last = node;
    }

    public LinkedNode getFirst() {
        return first;
    }

    public void setFirst(LinkedNode first) {
        this.first = first;
    }

    public LinkedNode getLast() {
        return last;
    }

    public void setLast(LinkedNode last) {
        this.last = last;
    }

    public void print() {
        this.first.print();
    }

    public void reversePrint() {
        this.last.reversePrint();
    }

    public static void main(String[] args) {
        LinkedNode node1 = new LinkedNode(1);

        LinkedNode node2 = new LinkedNode(2);
        LinkedNode node3 = new LinkedNode(3);
        LinkedNode node4 = new LinkedNode(4);
        LinkedNode node5 = new LinkedNode(5);


        LinkedList linkedList = new LinkedList(node1);
        linkedList.append(node2);
        linkedList.append(node3);
        linkedList.append(node4);
        linkedList.append(node5);


        linkedList.print();
        linkedList.reversePrint();
    }
}
