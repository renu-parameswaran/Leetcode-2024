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
import java.util.*;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }

        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a,b) -> a.val - b.val);

        for(ListNode node: lists){
            if(node != null){
                minHeap.add(node);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while(!minHeap.isEmpty()){
            ListNode minNode = minHeap.poll();
            current.next = minNode;
            current = current.next;

            if(minNode.next != null){
                minHeap.add(minNode.next);
            }
        }
        return dummy.next;
    }
}

// TC: (Nlogk)
// SC: O(k)