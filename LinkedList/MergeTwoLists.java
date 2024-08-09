// 21. Merge Two Sorted Lists
 class MergeTwoLists {
    int val;
    MergeTwoLists next;
    MergeTwoLists(int val){
      this.val = val;
      this.next = null;
  }
  }
class Solution {
    public static MergeTwoLists mergeTwoLists(MergeTwoLists list1, MergeTwoLists list2){
        MergeTwoLists temp = new MergeTwoLists(-1);
        MergeTwoLists res = temp;
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

    public static void printList(MergeTwoLists head){
        while(head != null){
            System.out.print(head.val+ "->");
            head = head.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args){
        MergeTwoLists list1 = new MergeTwoLists(1);
        list1.next = new MergeTwoLists(2);
        list1.next.next = new MergeTwoLists(3);
        list1.next.next.next = new MergeTwoLists(4);
        MergeTwoLists list2 = new MergeTwoLists(1);
        list2.next = new MergeTwoLists(3);
        list2.next.next = new MergeTwoLists(4);
        MergeTwoLists mergedHead = mergeTwoLists(list1, list2);
        printList(mergedHead);
    }
}

// TC: O(m+n) 
// SC: O(1)