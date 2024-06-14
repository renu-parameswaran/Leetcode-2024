// 24. Swap Nodes in Pairs
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

 // recursive approach
class Solution {
    public ListNode swapPairs(ListNode head) {
        if((head == null) || (head.next == null)){
        return head;
        }
        ListNode firstNode = head;
        ListNode secondNode = head.next;
        firstNode.next = swapPairs(secondNode.next);
        secondNode.next = firstNode;

        return secondNode;
    }
}

// TC: O(n)
// SC: O(n)


// iterative

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
// class Solution {
//     public ListNode swapPairs(ListNode head) {
//         if((head == null) || (head.next == null)){
//         return head;
//         }
//         ListNode dummy = new ListNode(-1);
//         dummy.next = head;
//         ListNode prevNode = dummy;
//         while((head != null) && (head.next != null)){
//             ListNode firstNode = head;
//             ListNode secondNode = head.next;

//             prevNode.next = secondNode;
//             firstNode.next = secondNode.next;
//             secondNode.next = firstNode;

//             prevNode = firstNode;
//             head = firstNode.next;
//         }
//         return dummy.next;
//     }
// }

// TC: O(n)
// SC: O(1)