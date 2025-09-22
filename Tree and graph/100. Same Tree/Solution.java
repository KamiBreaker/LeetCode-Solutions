import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> pnode = new LinkedList<TreeNode>();
        Queue<TreeNode> qnode = new LinkedList<TreeNode>();
        
        pnode.add(p);
        qnode.add(q);
        
        while (!pnode.isEmpty() && !qnode.isEmpty()) {
            TreeNode nodeP = pnode.poll();
            TreeNode nodeQ = qnode.poll();
            
          
            if (nodeP == null && nodeQ == null) {
                continue; 
            }
            
         
            if (nodeP == null || nodeQ == null) {
                return false;
            }
            
      
            if (nodeP.val != nodeQ.val) {
                return false;
            }
            
    
            pnode.add(nodeP.left);
            pnode.add(nodeP.right);
            qnode.add(nodeQ.left);
            qnode.add(nodeQ.right);
        }
        
   
        return pnode.isEmpty() && qnode.isEmpty();
    }
}