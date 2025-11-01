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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> hs = new HashSet<>();
        for(int n:nums) hs.add(n);
        ListNode curr = head,prev = null;
        while(curr!=null){
            if(hs.contains(curr.val)){
                if(curr== head){
                    head =head.next;
                }
                else{
                    prev.next = curr.next;
                }
            }else{
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }
}