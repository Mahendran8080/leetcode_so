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
    int flag=0;
    public void PreOrder(TreeNode node)
    {
        if(node==null)
        {
            return;
        }
        if( node.left!=null && node.left.val!=node.val)
        {
            flag=1;
            return;
        }
        if( node.right!=null && node.right.val!=node.val)
        {
            flag=1;
            return;
        }
        PreOrder(node.left);
        PreOrder(node.right);
    }
    public boolean isUnivalTree(TreeNode root) {
        PreOrder(root);
        if(flag==0)
        {
            return true;
        }
        return false;
        
    }
}