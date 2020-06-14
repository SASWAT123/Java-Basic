package Trees;

public class Main {
	
	public static void main(String[] args) {
		
		BinaryTree binaryTree = new BinaryTree();
		
		//Inserting elements in a binary tree
		binaryTree.insertNode(50); 
		binaryTree.insertNode(30); 
		binaryTree.insertNode(20); 
		binaryTree.insertNode(40); 
		binaryTree.insertNode(70); 
		binaryTree.insertNode(60); 
		binaryTree.insertNode(80); 
		
		//Inorder traversal of binary tree
		binaryTree.inOrderTraversal();
		
		//Inorder traversal of binary tree
		binaryTree.preOrderTraversal();
		
		//Postorder traversal of binary tree
		binaryTree.postOrderTraversal();
	}
	

}
