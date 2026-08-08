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
    public ListNode reversekLN(ListNode head){
        ListNode prev=null, curr=head, next;
        while(curr != null){
            next=curr.next;
            curr.next= prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    } 
    public ListNode getKthNode(ListNode head, int k){
        ListNode temp=head;
        for(int i=1; i<k; i++){
            if(temp == null){
                return null;
            }else{
                temp=temp.next;
            }
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head.next == null ){
            return head;
        }
        ListNode temp=head, nextNode=null, KthNode=null, prevNode=head;
        
        while(temp != null){
            //get kth node
            KthNode=getKthNode(temp,k);
            if(KthNode == null){
                if(prevNode != null){
                    prevNode.next=temp;
                }
                return head;
            }

            //store next node of kth node
            nextNode=KthNode.next;
            //Seperate k node of LL for reversal
            KthNode.next=null;
            //Reverse K nodes
            reversekLN(temp);

            //Set the head of the LL
            if(temp == head){
                head=KthNode;
            }else{
                prevNode.next= KthNode;
            }
            prevNode=temp;
            temp=nextNode;
        }
        return head;
    }
}
