package binaryTree;

import java.util.Random;


public class BinTreeTest {

	public static void main(String[] args){
		BinTree binTree = new BinTree();
		Random r = new Random();
		
	/** Insertions here are done to make tree BST, 
	 * but it's not required for binTree
	  * /
		BNode root = binTree.insertBST(new Data("root",r.nextInt(100)));
		
		BNode child1 = binTree.insertBST(new Data("child1",r.nextInt(100)));
		BNode child2 = binTree.insertBST(new Data("child2",r.nextInt(100)));
		
		BNode child3 = binTree.insertBST(new Data("child3",r.nextInt(100)));
		BNode child4 = binTree.insertBST(new Data("child4",r.nextInt(100)));
		BNode child5 = binTree.insertBST(new Data("child5",r.nextInt(100)));
		BNode child6 = binTree.insertBST(new Data("child6",r.nextInt(100)));
	 / *  */
	
//-------------------------------------------------------------------------------		
	/****
	 * 	Below tree creation is a binTree but not BST
	 * /
		BNode root = new BNode(new Data("root",4));
		BNode child1 = new BNode(new Data("child1",2));
		BNode child2 = new BNode(new Data("child2",6));
		BNode child3 = new BNode(new Data("child3",1));
		BNode child4 = new BNode(new Data("child4",3));
		BNode child5 = new BNode(new Data("child5",5));
		BNode child6 = new BNode(new Data("child6",7));
	
	
		binTree.theBTRootNode = root;
		root.leftBNode = child1;
		root.rightBNode = child2;
		
		child1.leftBNode = child3;
		child1.rightBNode = child4;
		
		child3.leftBNode = child5;
		child2.rightBNode = child6;
		
		binTree.preorder(root);
	/ *    */
		
//-----------------------------------------------------------------------------		
		/*** check for BST 
		 * 
		 * /
		System.out.println("Given tree is BST:" +binTree.isBST());
		/ *   */
		
//-----------------------------------------------------------------------------		
		/*** InOrder 
		 * 
		 * /
		binTree.inorder(root);
		/* */
		
//----------------------------------------------------------------------------------		
		/***
		 * 
		 * LCA - Lowest Common Ancestor
		 * /
		
		BNode lca = binTree.findLCA(root, child21, 
				child22);

		System.out.println(lca.data.value);
		/ * */
//-----------------------------------------------------------------------------
		
		/***
		    * Get Sum, Count and Average
		 * /
		
		System.out.println("count = "+binTree.getCount());
		System.out.println("sum = "+binTree.getSum());
		
		int[] sumCount = binTree.getSumAndCount();
		double avg = ((double) sumCount[0]) / ((double)sumCount [1]);
		System.out.println("sum = "+sumCount[0] +" && count ="+sumCount[1]+" && Avg="+avg);
		/ * */
		
//------------------------------------------------------------------------------
		/***
		 * Find max value
		 * /
		System.out.println("Max value:"+binTree.findMax(root));
		
		/ *  */
//----------------------------------------------------------------------------
		// R = 0, B = 1, G =2
		
		BNode root = new BNode(new Data("root",0));
		BNode   n1 = new BNode(new Data("n1",0));
		BNode   n2 = new BNode(new Data("n2",1));
		BNode   n3 = new BNode(new Data("n3",0));
		BNode   n4 = new BNode(new Data("n4",2));
		BNode   n5 = new BNode(new Data("n5",1));
		BNode   n6 = new BNode(new Data("n6",1));
		BNode   n7 = new BNode(new Data("n7",1));
		BNode   n8 = new BNode(new Data("n8",2));
		BNode   n9 = new BNode(new Data("n9",1));
		BNode  n10 = new BNode(new Data("n10",1));
		BNode  n11 = new BNode(new Data("n11",2));
	
		binTree.theBTRootNode = root;
		root.left = n1;
		root.right = n2;
		
		n1.left = n3;
		n1.right = n4;
		
		n2.left = n5;
		n2.right = n6;
		
		n4.left = n7;
		n4.right = n8;
		
		n6.left = n9;
		n6.right = n10;
		
		n8.right = n11;
		
		
		       /*           R                               0
		                  /    \ 				         /    \
		                 R      B						1	   2		
		                / \    / \					   / \     / \
		               R   G   B   B				  3	  4	   5  6
		                  / \     / \                    / \     / \
		                 G   G   B   B				    7   8    9  10    
		                      \                              \
		                       G							  11
		           */
		
		int[] clu = binTree.countClumps(binTree.theBTRootNode);
		
		System.out.println("No. of clumps ="+clu[0]);
		
		System.out.println("Height of tree="+binTree.getHeight(root));
		System.out.println("Diameter of tree="+binTree.getDiameter(root));
		System.out.println("Diameter of tree using optimized algo="+binTree.getDiameterOpt(root,new int[]{0}));
	}
	
}
