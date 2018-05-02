package cn.guanxiaoda.crackingTheCodingInterview.linkedList;

/**
 * Created by guanxiaoda on 6/3/16.
 * Ë«ÏòÁ´±íÉ¾³ýÔªËØ
 */
public class RemoveNode {



    public static void main(String[] args) {

        LinkedNode node1 = new LinkedNode(1);
        LinkedNode node2 = new LinkedNode(2);
        LinkedNode node3 = new LinkedNode(3);
        LinkedNode node4 = new LinkedNode(4);
        LinkedNode node5 = new LinkedNode(5);


        node1.setNext(node2);
        node2.setPrev(node1);
        node2.setNext(node3);
        node3.setPrev(node2);
        node3.setNext(node4);
        node4.setPrev(node3);
        node4.setNext(node5);
        node5.setPrev(node4);

        LinkedList linkedList = new LinkedList(node1);
        linkedList.print();
        linkedList.reversePrint();

        // remove node3


        node3.getPrev().setNext(node3.getNext());
        node3.getNext().setPrev(node3.getPrev());

        System.out.println("after remove=======");
        linkedList.print();
        linkedList.reversePrint();



    }
}
