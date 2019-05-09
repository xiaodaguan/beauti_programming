//反转一个单链表。 
//
// 示例: 
//
// 输入: 1->2->3->4->5->NULL
//输出: 5->4->3->2->1->NULL 
//
// 进阶: 
//你可以迭代或递归地反转链表。你能否用两种方法解决这道题？ 
//

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
@SuppressWarnings("WrongPackageStatement")
class Solutionfzlb {

//    public static void main(String[] args) {
//        ListNode p1 = new ListNode(1);
//        ListNode p2 = new ListNode(2);
//        ListNode p3 = new ListNode(3);
//        p1.next = p2;
//        p2.next = p3;
//        ListNode p = new Solution().reverseList(p1);
//        System.out.println(p);
//    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p1 = head;
        ListNode p2 = head.next;
        ListNode p3 = p2.next;
        p1.next = null;
        while (p3 != null) {
            p2.next = p1;
            p1 = p2;
            p2 = p3;
            p3 = p3.next;
        }
        p2.next = p1;
        return p2;

    }
}