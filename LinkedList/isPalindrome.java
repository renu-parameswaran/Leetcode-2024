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
    public boolean isPalindrome(ListNode head) {
       if(head == null){
        return true;
       }
       ListNode firstHalfEnd = endofFirstHalf(head);
       ListNode secondHalfStart = reverseList(firstHalfEnd.next);

       ListNode p1 = head;
       ListNode p2 = secondHalfStart;
       boolean result = true;
       while(result && p2 != null){
        if(p1.val != p2.val)
            result = false;
        p1 = p1.next;
        p2 = p2.next;
       }

       firstHalfEnd.next = reverseList(secondHalfStart);
       return result;
    }

    private ListNode endofFirstHalf(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args){
        Solution sol = new Solution();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println(sol.isPalindrome(node1));
    }

}


// TC: O(n)
// SC: O(1)