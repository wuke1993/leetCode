package aboutTree;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// 20160603

public class SameTree100 {
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        if((p == null && q != null) || (p != null && q == null) )
            return false;
            
        else if(p.val == q.val){
            /*isSameTree(p.left, q.left);
            isSameTree(p.right, q.right);
            return true;*/
        	return(isSameTree(p.right, q.right) && isSameTree(p.right, q.right));
        }
        else 
           return false;
    }
}
