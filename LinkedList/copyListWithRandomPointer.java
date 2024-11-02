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
        Node curr = head;
        // Step 1: to create a new node for each original node and link them together in single list
        while(curr != null){
            Node newNode = new Node(curr.val);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }

        // Step 2: Set up random pointers for the enwly created node
        curr = head;
        while(curr != null){
            if(curr.random != null){
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        // Step 3: Seperate the original list and the copied list
        Node original = head;
        Node copy = head.next;
        Node copyHead = copy;
        while(original != null){
            original.next = original.next.next;
            if(copy.next != null){
                copy.next = copy.next.next;
            }
            original = original.next;
            copy = copy.next;
        }
        return copyHead;
    }
}

// TC: O(N)
// SC: O(1)