package Trees;

public class BinaryTree {
	
	Node root;
	
	public BinaryTree() {
		root = null;
	}
	
	public void insertNode(int data) {
		root = insertElementBT(root, data);
	}
	
	public void inOrderTraversal() {
		inOrder(root);
	}
	
	public void preOrderTraversal() {
		preOrder(root);
	}
	
	public void postOrderTraversal() {
		postOrder(root);
	}
	
	private Node insertElementBT(Node root, int data) {
		
		//If the tree is empty, return a new node
		if(root == null) {
			root = new Node(data);
			return root;
		}
		
		//Otherwise check for the below condition
		if(data < root.data) {
			root.left = insertElementBT(root.left, data);
		}else if(data > root.data) {
			root.right = insertElementBT(root.right, data);
		}
		
		return root;
	}
	
	//Inorder Traversal of Binary Tree
	private void inOrder(Node root) {
		if(root != null) {
			inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
		}
	}
	
	//Preorder Traversal of Binary Tree
	private void preOrder(Node root) {
		if(root != null) {
			System.out.println(root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	//Postorder Traversal of Binary Tree
	private void postOrder(Node root) {
		if(root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.data);
		}
	}
	
}
