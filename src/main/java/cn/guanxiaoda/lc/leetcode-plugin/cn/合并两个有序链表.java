//将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
// 示例： 
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4
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
class Solutionhblgyxlb {


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 两个指针，比较当前节点值大小，将小的放入目标链表，其中一个为null时，将剩下的直接加入

        ListNode h = new ListNode(0);
        ListNode c = h;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                c.next = l2;
                l2 = l2.next;
            } else {
                c.next = l1;
                l1 = l1.next;
            }
            c = c.next;
        }
        c.next = l1 != null ? l1 : l2;

        return h.next;

    }

}