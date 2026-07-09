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
    public void reorderList(ListNode head) {
        //One or two node case
        if(head.next == null || head.next.next == null){
            return ;
        }

        ListNode slow=head, fast=head;
        while(fast.next != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }

        //Reversing the second half
        ListNode prev=null, curr=slow.next, next;
        while(curr != null){
            next=curr.next;
            curr.next= prev;
            prev=curr;
            curr=next;
        }
        slow=head;

        while(slow != null && prev != null){
            fast=slow.next;
            slow.next=prev;
            slow=fast;
            fast=prev.next;
            prev.next=slow;
            prev=fast;
        }
        if(slow != null){
            slow.next=null;
        }
        
    }
}
