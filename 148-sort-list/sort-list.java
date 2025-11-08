/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode slow = head, fast = head.next;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow.next;
        slow.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }
    private ListNode merge(ListNode l, ListNode r){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while(l!=null && r!=null){
            if(l.val<r.val){
                tail.next = l;
                l = l.next;
            }else{
                tail.next = r;
                r = r.next;
            }
            tail = tail.next;
        }
        tail.next = (l!=null)?l:r;
        return dummy.next;
    }
}