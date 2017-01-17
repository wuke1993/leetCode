package aboutTree;

// 20160531
// �ݹ�
// �ǵݹ��㷨  ʹ�õ�ջ

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }  
}

public class InvertBinaryTree226 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return null;
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }
}
