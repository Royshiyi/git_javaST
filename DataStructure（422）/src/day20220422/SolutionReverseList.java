package day20220422;

public class SolutionReverseList {
    //206. 反转链表
    //给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }

        ListNode cur = head;
        ListNode prev = null;
        ListNode next = null;
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
