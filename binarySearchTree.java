
public class binarySearchTree {
	
	public static boolean isBST(treeNode root) {
		if(root == null) {
			return true;
		}
		
		// 
		if ((root.left != null && root.data < root.left.data) || (root.right != null && root.data > root.right.data)) {
			return false;
		}
		isBST(root.left);
		isBST(root.right);
		return true;
	}

	// Given inputs are out of order, so we return false.
	public static void main(String[] args) {
		treeNode root = new treeNode(6);
		treeNode tmp = root;
		tmp.left = new treeNode(9);
		tmp.right = new treeNode(3);
		tmp = tmp.left;
		tmp.right = new treeNode(2);
		tmp = root.right;
		tmp.right = new treeNode(7);
		tmp.left = new treeNode(10);
		System.out.println(isBST(root));
	}
	
	// Given inputs are in order, so we return true;
//	public static void main(String[] args) {
//		treeNode root = new treeNode(3);
//		treeNode tmp = root;
//		tmp.left = new treeNode(2);
//		tmp.right = new treeNode(4);
//		tmp = tmp.left;
//		tmp.right = new treeNode(1);
//		tmp = root.right;
//		tmp.right = new treeNode(7);
//		tmp.left = new treeNode(10);
//		System.out.println(isBST(root));
//	}
}
