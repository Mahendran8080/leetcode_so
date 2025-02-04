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
    List<Integer> li=new ArrayList<>();
    public void PreOrder(TreeNode node)
    {
        if(node==null)
        {
            return;
        }

        li.add(node.val);
        PreOrder(node.left);
        PreOrder(node.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        PreOrder(root);
        return li;
        
    }
}