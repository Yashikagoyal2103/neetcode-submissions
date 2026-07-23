/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }

        //Add copy LL nodes between Original LL
        Node temp=head;
        while(temp != null){
            Node node = new Node(temp.val);
            node.next=temp.next;
            temp.next=node;
            temp=node.next;
        }

        //Set random pointers in copy LL
        temp=head;
        while(temp!=null){
            if(temp.random == null){
                temp.next.random=null;
            }else{
                temp.next.random=temp.random.next;
            }
            temp=temp.next.next;
        }

        //Separating the copied list from original list
        Node newHead=head.next;
        temp=head;
        while(temp.next.next != null){
            Node copy=temp.next;
            temp.next=temp.next.next;
            temp=temp.next;
            copy.next=temp.next;
        }
        temp.next=null;
        return newHead;
    }
}
