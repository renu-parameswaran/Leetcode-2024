// 21. Merge Two Sorted Lists
 class ListNode {
    int val;
    ListNode next;
    ListNode(int val){
      this.val = val;
      this.next = null;
  }
  }
class Solution {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode temp = new ListNode(-1);
        ListNode res = temp;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                res.next = list1;
                list1 = list1.next;
            }
            else{
                res.next = list2;
                list2 = list2.next;
            }
            res = res.next;
        }
        if(list1 != null){
            res.next = list1;
        }
        if(list2 != null){
            res.next = list2;
        }
        return temp.next;
    }

    public static void printList(ListNode head){
        while(head != null){
            System.out.print(head.val+ "->");
            head = head.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args){
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(4);
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        ListNode mergedHead = mergeTwoLists(list1, list2);
        printList(mergedHead);
    }
}

// TC: O(m+n) 
// SC: O(1)