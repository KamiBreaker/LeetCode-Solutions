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
    public ArrayList<Integer> inorder(TreeNode root , ArrayList list)
    {
        if(root == null)
        {
            return list;
        }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
        
        return list;

    }
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> l1 = inorder(root,l);
        int start = 0;
        int end = l1.size() - 1 ;
        while(start < end)
        {
            if(l.get(start)+ l.get(end) == k )
            {
                return true;
            }
            else if(l.get(start)+ l.get(end) > k)
            {
               end-- ;
            }
            else{
                start++;
            }
        }
        return false;
    }
}