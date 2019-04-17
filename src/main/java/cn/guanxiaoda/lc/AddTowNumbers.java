package cn.guanxiaoda.lc;

/**
 * @author guanxiaoda
 * @date 2018-12-17
 */
public class AddTowNumbers {


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode n1 = new ListNode(0);
        ListNode h = n1;
        ListNode lc1 = l1;
        ListNode lc2 = l2;
        int jinwei = 0;
        while (lc1 != null || lc2 != null || jinwei > 0) {

            int sum = (lc1 == null ? 0 : lc1.val) + (lc2 == null ? 0 : lc2.val) + jinwei;
            n1.next = new ListNode(sum % 10);
            jinwei = sum / 10;

            lc1 = lc1 == null ? null : lc1.next;
            lc2 = lc2 == null ? null : lc2.next;
            n1 = n1.next;
        }

        return h.next;
    }

    public static void main(String[] args) {
        ListNode l11 = new ListNode(5);
//        ListNode l12 = new ListNode(8);
//        ListNode l13 = new ListNode(3);
//        l11.next = l12;
//        l12.next = l13;

        ListNode l21 = new ListNode(5);
//        ListNode l22 = new ListNode(6);
//        ListNode l23 = new ListNode(4);
//        l21.next = l22;
//        l22.next = l23;

        ListNode l3 = addTwoNumbers(l11, l21);
        while (l3 != null) {
            System.out.println(l3.val);
            l3 = l3.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) { val = x; }
    }
}
