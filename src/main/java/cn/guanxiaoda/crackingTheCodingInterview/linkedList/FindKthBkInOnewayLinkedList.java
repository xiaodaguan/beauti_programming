package cn.guanxiaoda.crackingTheCodingInterview.linkedList;

/**
 * Created by guanxiaoda on 6/13/16.
 * 找到单链表中倒数第k个节点
 */
public class FindKthBkInOnewayLinkedList {


    public static OnewayLinkedNode findKthBk(OnewayLinkedList list, int k) {
        int len = 0;
        OnewayLinkedNode node = list.first;
        while (node != null) {
            len++;
            node = node.next;
        }


        if (k <= 0 || k > len) return new OnewayLinkedNode(0);
        if (k == len) return list.first;

        OnewayLinkedNode front = list.first;
        OnewayLinkedNode off = front;

        for (int i = 0; i < k; i++) {
            off = off.next;
        }

        while (off != null) {
            front = front.next;
            off = off.next;
        }
        return front;
    }

    public static void main(String[] args) {
        OnewayLinkedNode node0 = new OnewayLinkedNode(1);
        OnewayLinkedList list = new OnewayLinkedList(node0);
        for (int i = 1; i < 6; i++) {
            OnewayLinkedNode node = new OnewayLinkedNode(i + 1);
            list.append(node);
        }

        list.print();


        OnewayLinkedNode node1 = findKthBk(list, 6);
        OnewayLinkedNode node2 = findKthBk(list, 1);
        OnewayLinkedNode node3 = findKthBk(list, 0);
        OnewayLinkedNode node4 = findKthBk(list, 7);
        OnewayLinkedNode node5 = findKthBk(list, 2);
        System.out.println(node1.data);
        System.out.println(node2.data);
        System.out.println(node3.data);
        System.out.println(node4.data);
        System.out.println(node5.data);
    }
}
