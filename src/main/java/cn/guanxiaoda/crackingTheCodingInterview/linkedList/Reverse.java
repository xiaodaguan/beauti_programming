package cn.guanxiaoda.crackingTheCodingInterview.linkedList;

/**
 * Created by guanxiaoda on 2018/2/2.
 */
public class Reverse {

    static public LinkedNode reverse(LinkedNode head) {
        LinkedNode p = head;
        LinkedNode q = p.next;
        p.next = null;
        while (q != null) {
            LinkedNode t = q.next;
            q.next = p;
            p = q;
            q = t;
        }

        return p;
    }

    public static void main(String[] args) {
        LinkedNode node1 = new LinkedNode(1);
        LinkedNode node2 = new LinkedNode(2);
        LinkedNode node3 = new LinkedNode(3);
        LinkedNode node4 = new LinkedNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;

        node1.print();

        LinkedNode reversed = reverse(node1);

        reversed.print();

    }
}
