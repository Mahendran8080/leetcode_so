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
    public void PostOrder(TreeNode node)
    {
        if(node==null)
        {
            return;
        }
        PostOrder(node.left);
        PostOrder(node.right);
        li.add(node.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {

        PostOrder(root);

        return li;
        
    }
}