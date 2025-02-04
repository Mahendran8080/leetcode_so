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
     List<Integer> list=new ArrayList<>();

     public void PreOrder(TreeNode node)
     {
        if(node==null)
        {
            return;
        }
        list.add(node.val);

        PreOrder(node.left);
        PreOrder(node.right);
     }
    public int kthSmallest(TreeNode root, int k) {
        PreOrder(root);

        int[] arr=new int[list.size()];
        int idx=0;

        for(int num:list)
        {
            arr[idx++]=num;
        }

        Arrays.sort(arr);

        return arr[k-1];



        
        
    }
}