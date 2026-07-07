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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            System.out.println("List is empty");
            return head;
        }
        ListNode temp1=head;
        int j=0;
        while(temp1!=null){
            temp1=temp1.next;
            j++;
        }
        if(j==n){
            head=head.next;
            return head;
        }
        else if(n>j){
            System.out.println("n is out of bound");
            return head;
        }
        int p=j-n;
        ListNode temp=head;
        for(int i=1;i<p;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}
