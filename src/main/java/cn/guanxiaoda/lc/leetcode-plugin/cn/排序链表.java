//在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序。 
//
// 示例 1: 
//
// 输入: 4->2->1->3
//输出: 1->2->3->4
// 
//
// 示例 2: 
//
// 输入: -1->5->3->4->0
//输出: -1->0->3->4->5 
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
class Solutionpxlb {

//    public static void main(String[] args) {
//        ListNode l1 = new ListNode(-1);
//        ListNode l2 = new ListNode(5);
//        ListNode l3 = new ListNode(3);
//        ListNode l4 = new ListNode(4);
//        ListNode l5 = new ListNode(0);
//        l1.next = l2;
//        l2.next = l3;
//        l3.next = l4;
//        l4.next = l5;
//
//        ListNode re = new Solution().sortList(l1);
//        System.out.println("ok");
//    }

    public ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        // 切分成两个part
        ListNode point = partition(head);
        // 递归排序p1,p2
        ListNode h1 = sortList(head);
        ListNode h2 = sortList(point);
        // merge 两个有序链表
        return merge(h1, h2);
    }

    /**
     * 合并有序链表
     *
     * @param h1
     * @param h2
     * @return
     */
    private ListNode merge(ListNode h1, ListNode h2) {
        if (h1 == null) {
            return h2;
        }
        if (h2 == null) {
            return h1;
        }
        ListNode h = new ListNode(-1);
        ListNode c = h;
        while (h1 != null && h2 != null) {
            c.next = h1.val < h2.val ? h1 : h2;
            if (h1.val < h2.val) {h1 = h1.next;} else {h2 = h2.next;}
            c = c.next;
        }
        c.next = h1 != null ? h1 : h2;
        return h.next;
    }

    /**
     * 快慢指针找一个分割点
     * head为空或只有1个节点，返回null
     * head有两个节点，返回第二个节点
     *
     * @param head 头节点，也是切分后第一个链表的头节点
     * @return 第二个链表的头节点
     */
    private ListNode partition(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            if (fast == null) {
                break;
            }
            slow = slow.next;
        }
        ListNode ret = slow.next;
        slow.next = null;
        return ret;
    }
}