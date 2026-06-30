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
    public ListNode mergeTwoLists(ListNode h1, ListNode h2) {
        if(h1 == null && h2 == null ){
            return h1;
        }else if( h1 == null ){
            return h2;
        }else if( h2 == null){
            return h1;
        }
        ListNode dummy= new ListNode(0);
        ListNode temp=dummy, n1=h1, n2=h2;

        while(n1 != null && n2 != null){
            if(n2.val<= n1.val){
                temp.next=n2;
                n2=n2.next;
            }else{
                temp.next=n1;
                n1=n1.next;
            }
            temp=temp.next;
        }
        if(n1!=null){
            temp.next=n1;
        }else{
            temp.next=n2;
        }
        return dummy.next;
    
    }
}