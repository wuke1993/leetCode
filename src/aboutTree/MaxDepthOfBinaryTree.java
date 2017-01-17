package aboutTree;

// 2016.4.28
// ตÝน้

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class MaxDepthOfBinaryTree {
	public int maxDepth(TreeNode root) {
        int max = 0;
        TreeNode temp = root;
        
        if(temp != null) {
            int maxOfLeft = maxDepth(temp.left);
            int maxOfRight = maxDepth(temp.right);
            max = Math.max(maxOfLeft + 1, maxOfRight + 1);
        }
        return max;
    }
}
