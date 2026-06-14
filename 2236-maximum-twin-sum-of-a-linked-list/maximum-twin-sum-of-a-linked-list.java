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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode w = null;
        ListNode q = slow;
        while(q != null)
        {
            ListNode next=q.next;
            q.next=w;
            w=q;
            q=next;
        }
        int ans=Integer.MIN_VALUE;
        ListNode t = head;
        while(w != null)
        {
            ans=Math.max(ans,w.val+t.val);
            w=w.next;
            t=t.next;
        }
        return ans;
    }
}