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
        Map<Node, Node> m=new HashMap<>();
        Node temp=head;
        while(temp!=null){
            Node node=new Node(temp.val);
            m.put(temp, node);
            temp=temp.next;
        }
        temp=head;
        Node curr=m.get(temp);
        while(temp!=null){
            curr.next=m.get(temp.next);
            curr.random=m.get(temp.random);
            temp=temp.next;
            curr=curr.next;
        }
        return m.get(head);
    }
}
