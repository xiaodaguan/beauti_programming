//给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。 
//
// 示例： 
//
// 给定一个链表: 1->2->3->4->5, 和 n = 2.
//
//当删除了倒数第二个节点后，链表变为 1->2->3->5.
// 
//
// 说明： 
//
// 给定的 n 保证是有效的。 
//
// 进阶： 
//
// 你能尝试使用一趟扫描实现吗？ 
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
class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = head;
        ListNode p1 = head;
        ListNode p2 = head;
        int k = 0;
        while (p2.next != null) {
            p2 = p2.next;
            k++;
            if (k >= (n - 1)) {
                p1 = p1.next;
                if (k >= n) {
                    pre = pre.next;
                }
            }
        }
        if (pre == p1) {
            return p1.next;
        } else {
            pre.next = p1.next;
            return head;
        }

    }

    private class ListNode {

        int val;
        ListNode next;

        ListNode(int x) { val = x; }
    }
}