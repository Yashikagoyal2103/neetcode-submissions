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
            if(!m.containsKey(temp.random) && temp.random !=null){
                // if(temp.random == null) m.put(temp.random, null);
                m.put(temp.random, new Node(temp.random.val));
            }
            if(!m.containsKey(temp)){
                m.put(temp, new Node(temp.val));
            }
            if(!m.containsKey(temp.next) && temp.next !=null){
                m.put(temp.next, new Node(temp.next.val));
            }
            Node curr=m.get(temp);
            curr.next=m.get(temp.next);
            curr.random=m.get(temp.random);  
            temp=temp.next;          
        }
        return m.get(head);
    }
}