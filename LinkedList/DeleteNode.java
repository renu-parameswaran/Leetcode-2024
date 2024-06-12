// 237. Delete Node in a Linked List
// 237. Delete Node in a Linked List
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public static ListNode deleteNode(ListNode node, ListNode head){
      if(node == null || node.next == null){
        throw new IllegalArgumentException("node to be deleted cannot be null or tail node");
      }
        node.val = node.next.val;
        node.next = node.next.next;
        return head;
    }

    public static void printList(ListNode head){
        while(head != null){
            System.out.print(head.val+ "->");
            head = head.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode node = head.next;
        deleteNode(node, head);
        printList(head);
    }
}

// TC: O(1)
// SC: O(1)