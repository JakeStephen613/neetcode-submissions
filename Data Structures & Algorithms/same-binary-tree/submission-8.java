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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return checkTree(p, q);
    }
    
    private boolean checkTree(TreeNode a, TreeNode b){
    if (a == null && b == null) return true;  // ✅ first
    if (a == null || b == null) return false; // ✅ second
    if (a.val != b.val) return false;         // ✅ now safe to access .val
    return checkTree(a.left, b.left) && checkTree(a.right, b.right);    }
}
