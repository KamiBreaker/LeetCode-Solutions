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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0)
        {
            return null;
        }
        return gettree(nums , 0 , nums.length - 1);
        
    }
    TreeNode gettree(int[] nums , int start ,int  end)
    {
        if(start > end)
        {
            return null ;
        }
        int middle = (start+end)/2;
        TreeNode tree = new TreeNode(nums[middle]);
        tree.left = gettree(nums , start , middle - 1);
        tree.right = gettree(nums , middle + 1 , end );
        return tree ;
    }
}