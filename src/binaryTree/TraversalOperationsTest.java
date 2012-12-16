package binaryTree;

public class TraversalOperationsTest {

	public static void main(String[] args) {
		TraversalOperations to = new TraversalOperations();
		int[] preOrder = {4,2,1,3,6,5,7};
		BinTree binTree = to.geBSTFromPreOrder(preOrder);
		binTree.inorder(binTree.theBTRootNode);
	}

}
