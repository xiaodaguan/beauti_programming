//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。 
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 示例： 
//
// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
// 
//

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
@SuppressWarnings("ALL")
class Solutionlsxj {

//    public static void main(String[] args) {
//        ListNode l11 = new ListNode(5);
////        ListNode l12 = new ListNode(8);
////        ListNode l13 = new ListNode(3);
////        l11.next = l12;
////        l12.next = l13;
//
//        ListNode l21 = new ListNode(5);
////        ListNode l22 = new ListNode(6);
////        ListNode l23 = new ListNode(4);
////        l21.next = l22;
////        l22.next = l23;
//
//        ListNode h = new Solution().addTwoNumbers(l11, l21);
//        System.out.println("ok.");
//
//    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h = new ListNode(0);
        ListNode c = h;

        int carrier = 0;
        while (l1 != null || l2 != null) {
            int sum = carrier;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            int num = sum % 10;
            c.next = new ListNode(num);
            c = c.next;
            carrier = sum / 10;
        }

        if (carrier > 0) {
            c.next = new ListNode(carrier);
        }

        return h.next;
    }

}