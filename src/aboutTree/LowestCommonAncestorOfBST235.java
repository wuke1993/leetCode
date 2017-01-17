package aboutTree;

// ��������� 
// ���������ڵ������������ڵ�
// �˴�ע��ڵ㱾���Ϊ�Լ��ĸ��ڵ�
// [6,2,8,0,4,7,9,null,null,3,5]  ��ʱӦ�÷���4����ȴ������2����������ĸ��ڵ㣡����-> return������

public class LowestCommonAncestorOfBST235 {
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode temp = root;
 
        if(temp.val == p.val || temp.val == q.val || (temp.val > p.val && temp.val < q.val) || (temp.val < p.val && temp.val > q.val))
            return temp;
        else if(p.val < temp.val) {
            temp = temp.left;
            // lowestCommonAncestor(temp,p,q);            
            return lowestCommonAncestor(temp,p,q); // ����
        }
        else {
            temp = temp.right;         
            // lowestCommonAncestor(temp,p,q);           
            return lowestCommonAncestor(temp,p,q);
        }   
        // return temp; // ������
    }
	
    public static void main(String[] args) {
    	TreeNode root = new TreeNode(6);
    	TreeNode node1 = new TreeNode(2);
    	TreeNode node2 = new TreeNode(8);
    	TreeNode node3 = new TreeNode(0);
    	TreeNode node4 = new TreeNode(4);
    	TreeNode node5 = new TreeNode(7);
    	TreeNode node6 = new TreeNode(9);
    	TreeNode node7 = new TreeNode(3);
    	TreeNode node8 = new TreeNode(5);
    	
    	root.left = node1;
    	root.right = node2;
    	
    	node1.left = node3;
    	node1.right = node4;
    	
    	node2.left = node5;
    	node2.right = node6;
    	
    	node4.left = node7;
    	node4.right = node8;
    	
    	TreeNode p = new TreeNode(3);
    	TreeNode q = new TreeNode(5);
    	
    	System.out.println(lowestCommonAncestor(root,p,q).val);
    	
    }
}
