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
class Solution {
    int preOrderIndex;
    Map<Integer, Integer> inorderIndexMap;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preOrderIndex = 0;
        // build a hashmap
        inorderIndexMap = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            inorderIndexMap.put(inorder[i], i);
        }
        return arrayToTree(preorder, 0 , preorder.length - 1);
    }

    private TreeNode arrayToTree(int[] preOrder, int left, int right){
        if(left > right){
            return null;
        }

        int root_value = preOrder[preOrderIndex++];
        TreeNode root = new TreeNode(root_value);

        root.left = arrayToTree(preOrder, left, inorderIndexMap.get(root_value) - 1);
        root.right = arrayToTree(preOrder, inorderIndexMap.get(root_value) + 1, right);

        return root;
    }
}


// TC: O(N)
// SC: O(N)