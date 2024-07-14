/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

 class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){};
 }

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        while(root != null && val != root.val)
            root = val < root.val ? root.left: root.right;     
        return root;
    }
}


// TC: O(H) or O(logn)
// SC: O(1)