package day20220422;

public class SolutionRemoveAll {
    //203.
    //给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {

        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }


    public ListNode removeElements(ListNode head, int val) {

        if(null == head){
            return head;
        }
        ListNode cur = head;
        ListNode prev = null;
        while(cur != null){
            if(cur.val == val){
                //删除结点
                //第一个结点 || 其他结点
                if(prev == null){
                    head = cur.next;
                    cur = head;
                } else{
                    prev .next = cur.next;
                    cur = prev;
                }
            }else{
                prev = cur;
                cur = cur.next;
            }
        }
        return head;
    }
}
