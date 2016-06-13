package com.gxd.crackingTheCodingInterview.linkedList;

/**
 * Created by guanxiaoda on 6/3/16.
 *
 */
public class LinkedNode {

    public int data;

    public LinkedNode next;

    public LinkedNode prev;

    public void print(){
        LinkedNode node = this;
        System.out.print(this.data);
        while(node.next!=null){
            node = node.getNext();
            System.out.print("->"+node.data);
        }
        System.out.println();
    }

    public void reversePrint(){
        LinkedNode node = this;
        System.out.print(this.data);
        while(node.getPrev()!=null){
            node = node.getPrev();
            System.out.print("->"+node.data);
        }
        System.out.println();
    }

    public LinkedNode(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LinkedNode getNext() {
        return next;
    }

    public void setNext(LinkedNode next) {
        this.next = next;
    }

    public LinkedNode getPrev() {
        return prev;
    }

    public void setPrev(LinkedNode prev) {
        this.prev = prev;
    }

    public static void main(String[] args) {

    }
}
