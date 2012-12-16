package binaryTree;

public class TraversalOperations {

	private int index = 0;
	
	public BinTree geBSTFromPreOrder(int[] preOrder){
		BinTree binTree = null;
		
		if(preOrder.length > 0){
			binTree = new BinTree();
			BNode root = getBSTFromPreOrder(preOrder, Integer.MIN_VALUE, Integer.MAX_VALUE);
			binTree.theBTRootNode = root;
		}
		
		
		return binTree;
	}
	
	
	/**
	 * 
	 * Used class variable to increment, find efficient one with local variable
	 */
	
	protected BNode getBSTFromPreOrder(int[] preOrder, int min, int max){
		
		if(index >= preOrder.length){
			return null;
		}
		BNode root = null;
		
		if(preOrder[index]> min && preOrder[index]<max){
			root= new BNode(new Data(preOrder[index]));
			index++;
			root.left  = getBSTFromPreOrder(preOrder,  min, root.data.value);
			root.right = getBSTFromPreOrder(preOrder, root.data.value, max);
		}
		return root;
	}
	
	
	
}
