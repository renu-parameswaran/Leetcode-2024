//206. Reverse Linked List

// Iterative and Recursion

/*
 * Definition of a singly inked list
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val){this.val = val}
 * ListNode(int val, ListNode next){
 * this.val = val;
 * this.next = next;
 * }
 * }
 */

 // Iterative
 
 import java.util.LinkedList;
 class ListNode {
   int val;
   ListNode next;
   ListNode(int val){
     this.val = val;
     this.next = null;
 }
 }
 public class Solution {
     public static ListNode reverseLinkedList(ListNode head){
         ListNode node =  null;
         while(head != null){
             ListNode temp = head.next;
             head.next = node;
             node = head;
             head = temp;
         }
         return node;
 }
 
     public static void printList(ListNode head){
       ListNode current = head;
       while(current != null){
         System.out.print(current.val+ "->");
         current = current.next;
       }
       System.out.println("null");
     }
 
     public static void main(String[] args){
         Solution solution = new Solution();
         ListNode head = new ListNode(1);
         head.next = new ListNode(2);
         head.next.next = new ListNode(3);
         head.next.next.next = new ListNode(4);
         ListNode reversedHead = reverseLinkedList(head);
         System.out.println("reversed linked list:");
         printList(reversedHead);
     }
 } 

 Time Complexity: O(n)
 Space Complexity:0(1)


 // Recursive solution

 import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

class Solution{
    public static ListNode reverseList(ListNode head){
    if(head == null || head.next == null){
        return head;
    }
    ListNode newHead = reverseList(head.next);
    head.next.next = head;
    head.next = null;
    return newHead;
    }

    public static void printList(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.print(current.val + "->");
            current = current.next;
        }
        System.out.println("null");
    } 

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode reversedHead = reverseList(head);
        System.out.println("reversed list:");
        printList(reversedHead);
    }
}


// TC: O(n)
// SC: O(n)