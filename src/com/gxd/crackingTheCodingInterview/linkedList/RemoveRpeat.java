package com.gxd.crackingTheCodingInterview.linkedList;

import java.util.HashSet;

/**
 * Created by guanxiaoda on 6/13/16.
 * 删除未排序链表中重复元素
 */
public class RemoveRpeat {

    /**
     * 以时间换空间
     *
     * @param linkedList
     */
    public static void removeRepeat1(LinkedList linkedList) {
        if (linkedList.getFirst() == null || linkedList.getLast() == null) {
            return;
        }
        LinkedNode mark = linkedList.getFirst();
        while (mark != null) {
            LinkedNode curr = mark.getNext();
            while (curr != null) {
                if (curr.getData() == mark.getData()) {
                    if (curr.getNext() != null) {
                        curr.getPrev().setNext(curr.getNext());
                        curr.getNext().setPrev(curr.getPrev());
                    } else {
                        curr.getPrev().setNext(null);
                        linkedList.setLast(curr.getPrev());
                    }
                }

                curr = curr.getNext();
            }
            mark = mark.getNext();
        }
    }

    /**
     * 以空间换时间
     *
     * @param linkedList
     */
    public static void removeRepeat(LinkedList linkedList) {
        if (linkedList.getFirst() == null || linkedList.getLast() == null) {
            return;
        }
        HashSet<Integer> set = new HashSet<Integer>();

        LinkedNode node = linkedList.getFirst();
        while (node != null) {
            if (set.contains(node.getData())) {
                if (node.getPrev() != null && node.getNext() != null) {
                    node.getPrev().setNext(node.getNext());
                    node.getNext().setPrev(node.getPrev());
                } else if (node.getPrev() != null && node.getNext() == null) {
                    node.getPrev().setNext(null);
                    linkedList.setLast(node.getPrev());
                } else {

                }


            } else {
                set.add(node.getData());
            }

            node = node.getNext();
        }

        return;
    }

    public static void main(String[] args) {
        LinkedNode node1 = new LinkedNode(1);
        LinkedNode node2 = new LinkedNode(3);
        LinkedNode node3 = new LinkedNode(4);
        LinkedNode node4 = new LinkedNode(5);
        LinkedNode node5 = new LinkedNode(2);
        LinkedNode node6 = new LinkedNode(5);
        LinkedNode node7 = new LinkedNode(4);

        LinkedList linkedList = new LinkedList(node1);
        linkedList.append(node2);
        linkedList.append(node3);
        linkedList.append(node4);
        linkedList.append(node5);
        linkedList.append(node6);
        linkedList.append(node7);
        linkedList.print();
        linkedList.reversePrint();


//        removeRepeat(linkedList);
        removeRepeat1(linkedList);
        linkedList.print();
        linkedList.reversePrint();


    }
}
