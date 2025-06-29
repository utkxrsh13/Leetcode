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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode prev = res;
        for(int i=1;i<left;i++){
            prev = prev.next;
        }

        ListNode st = prev.next;
        ListNode end = st.next;
        for(int i=0;i<right-left;i++){
            st.next = end.next;
            end.next = prev.next;
            prev.next = end;
            end = st.next;
        }
        return res.next;
    }
}