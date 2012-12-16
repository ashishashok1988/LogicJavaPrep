package binaryTree;

import java.util.List;

public class BinTree {
    BNode theBTRootNode;
    int clumpCount = 0;

    public BinTree() // constructor
    {
        theBTRootNode = null;
    }

    //----------------------------------------------------------------------------------------------------------------
    /**
     * Addition of the node to the BST
     * 
     */
    protected BNode insertAB(BNode theRootNode, BNode myNewNode) {
        if (theRootNode == null) {
            theRootNode = myNewNode;
            //checks if the username is smaller than 
            //the root object, if smaller appends to the left
        } else if (myNewNode.data.value < theRootNode.data.value) {
            theRootNode.left = insertAB(theRootNode.left, myNewNode);
        } else {
            // else if bigger appends to the right
            theRootNode.right = 
               insertAB(theRootNode.right, myNewNode);
        }
        return theRootNode;
    }

    public BNode insertBST(Data data) {
        BNode anyClassBTNode = new BNode(data);
        //calls insert above
        theBTRootNode = insertAB(theBTRootNode, anyClassBTNode);
        
        return anyClassBTNode;
    }

  //----------------------------------------------------------------------------------------------------------------
    /**
     * InOrder Traversal
     * 
     */
    protected void inorder(BNode theRootNode) {
        if (theRootNode != null) {
            inorder(theRootNode.left);
            theRootNode.show();
            inorder(theRootNode.right);
        }
    }

    //calls the method to do in order
    public void inorderBST() {
        inorder(theBTRootNode);
    }
    
  //----------------------------------------------------------------------------------------------------------------
    /**
     * PreOrder Traversal
     * 
     */
    protected void preorder(BNode theRootNode) {
        if (theRootNode != null) {
        	theRootNode.show();
            preorder(theRootNode.left);
            preorder(theRootNode.right);
        }
    }

    //calls the method to do in order
    public void preorderBST() {
        preorder(theBTRootNode);
    }
    
  //----------------------------------------------------------------------------------------------------------------
    /**
     * Search for key name and  returns  
     * ref. to BNode or null if not found--------
     * 
     */

    protected BNode search(BNode theRootNode, String keyName) {
        //if the root is null returns null
        if (theRootNode == null) {
            return null;
        } else {
            //checks if they are equal
            if (keyName.compareTo(theRootNode.data.surname) == 0) {
                return theRootNode;
            //checks id the key is smaller than the current
            //record  if smaller traverses to the left
            } else if (keyName.compareTo(theRootNode.data.surname) < 0) {
                return search(theRootNode.left, keyName);
            } else {
                // if bigger traverses to the left
                return search(theRootNode.right, keyName);
            }
        }
    }

    //returns null if no result else returns 
    //the AnyClass object matched with the keyName
    public Data searchBST(String keyName) {
        BNode temp = search(theBTRootNode, keyName);
        if (temp == null) {
      //noresults found
           return null;
        } else {
         //result found
           return temp.data;
        }
    }
    //----------------------------------------------------------------------------------------------------------------
    /**
     * Populate Binary Tree
     * 
     */
    
    public void populateBinTree(List<Data>  theList) {
        //clearing the root as not to append, 
        //if you want to append just remove the below line
        theBTRootNode = null;
       //keeps looping untill reaches the end of the list
        for(int i = 0;i < theList.size();i++) {
              //  BNode temporaryNode = null; 
             //inserts in the BST
            insertBST((Data)theList.get(i));
            //goes to the next element
        }
    }
  //----------------------------------------------------------------------------------------------------------------
    /**
     * LCA - Least Common Ancestor
     * 
     */
    public BNode findLCA(BNode root, BNode p, BNode q){
    	// no root no LCA.
    	if(root == null){
    		return null;
    	}
    	 // if either p or q is the root then root is LCA.
    	if(root.equals(p) || root.equals(q)){
    		return root;
    	} else {
    		// get LCA of p and q in left subtree.
    		BNode l = findLCA(root.left, p , q);
    		// get LCA of p and q in right subtree.
    		BNode r = findLCA(root.right, p , q);
    		
    		// if one of p or q is in leftsubtree and other is in right subtree
            // then root it the LCA.
    		if(l!= null && r!= null){
    			return root;
    		} else if(l!= null){ // else if l is not null, l is LCA.
    			return l;
    		}else {
    			return r;
    		}
    	}
    }
    
  //----------------------------------------------------------------------------------------------------------------
    /**
     * Minimum distance b/w two nodes
     * 
     */
    
    
    
    
    
    
    
  //----------------------------------------------------------------------------------------------------------------
    /**
     * Check if binary tree is BST
     * 
     */  
    
    public Boolean isBST(){
    	return isBST(theBTRootNode,Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    protected Boolean isBST(BNode root, int min, int max){
    	if(root == null){
    		return true;
    	} else {
    		return root.data.value > min && root.data.value < max &&
    				isBST(root.left,min,root.data.value) && isBST(root.right,root.data.value, max);
    	}
    	
    }
  
 //----------------------------------------------------------------------------------------------------------------
    /**
     * Get Sum, Count And Average
     * 
     */
    public int getCount(){
    	return getCount(theBTRootNode);
    }
    
    protected int getCount(BNode theRootNode) {
    	if(theRootNode == null){
    		return 0;
    	}
		return 1 + getCount(theRootNode.left) + getCount(theRootNode.right) ;
    	
    }
    
    public int getSum(){
    	return getSum(theBTRootNode);
    }
    
    protected int getSum(BNode theRootNode) {
    	if(theRootNode == null){
    		return 0;
    	}
		return theRootNode.data.value + getSum(theRootNode.left) + getSum(theRootNode.right) ;
    	
    }
    
    
    public int[] getSumAndCount(){
    	return getSumAndCount(theBTRootNode);
    }
    
    protected int[] getSumAndCount(BNode theRootNode) {
    	int [] sumCount = new int[2];
    	if(theRootNode == null){
    		sumCount[0]=0; sumCount[1]=0;
    		return sumCount;
    	}
    	int[] sumCountLeft = getSumAndCount(theRootNode.left);
    	int[] sumCountRight = getSumAndCount(theRootNode.right);
    	
    	sumCount[0] = theRootNode.data.value + sumCountLeft[0] + sumCountRight[0];
    	sumCount[1] = 1 + sumCountLeft[1] + sumCountRight[1];
    	
    	return sumCount;
    }
//----------------------------------------------------------------------------------------------------------------

	public int findMax(BNode root) {
		
		if(root == null){
			return Integer.MIN_VALUE;
		}
		
		int leftMax = findMax(root.left);
		int rightMax = findMax(root.right);
		
		if(root.data.value >= leftMax
				&& root.data.value >= rightMax){
			return root.data.value;
		} else {
			return leftMax > rightMax ? leftMax : rightMax ;
		}
	}
 //---------------------------------------------------------------------------------------------------

	public int[] countClumps(BNode root) {
		int[] clumpCount = {0};
		countClumps(root, -1,clumpCount);
		return clumpCount;
	}

	   // R = 0, B = 1, G =2 , No Color = -1
    private int countClumps(BNode root, int parentColor, int[] clumpCount) {
    	
    	if(root != null){
    		if(root.data.value != parentColor) {
    			//possibility of new clump is when currentColor !=  parentColor
    			
    			int curCount = 1
    			             + countClumps(root.left, root.data.value,  clumpCount)
    			             + countClumps(root.right, root.data.value,  clumpCount);
    			if(curCount >= 3){
    				clumpCount[0] += 1;
    			}
    			return 0;
    			//return 0 because it won't add to previous clump
    		} else {
    			return  1 
    					+ countClumps(root.left, root.data.value, clumpCount)
    				    + countClumps(root.right, root.data.value,clumpCount);
    		}
    		
    		
    	} else {
    		return 0;
    	}
    	
    }
	
    
    //----------------------------------------------------------------------------------------------
  /*** The diameter of a tree (sometimes called the width) is the number of nodes on
   *  the longest path between two leaves in the tree.
   *  
   *  http://www.geeksforgeeks.org/archives/5687
   *  
   *   The diameter of a tree T is the largest of the following quantities:
    	* the diameter of T’s left subtree
    	* the diameter of T’s right subtree
    	* the longest path between leaves that goes through the root of T (this can be computed from the heights of the subtrees of T)
    
    */
    
    public int getDiameter(BNode root){
    	if(root == null){
    		return 0;
    	}
    	
    	int leftHeight = getHeight(root.left);
    	int rightHeight = getHeight(root.right);

    	int rootPath = 1 + leftHeight + rightHeight;
    	int maxDiameter = getMax(getDiameter(root.left),getDiameter(root.right));
    	
    	return getMax(maxDiameter, rootPath);
    }
    
    
    public int getDiameterOpt(BNode root, int[] height){
    	
    	int[] lh = {0};
    	int[] rh = {0};
    	
    	int lDiameter = 0, rDiameter = 0;
    	
    	if(root == null){
    		height[0] = 0;
    		return 0;
    	}
    	
    	lDiameter = getDiameterOpt(root.left, lh);
    	rDiameter = getDiameterOpt(root.right, rh);
    	
    	height[0] = 1 + getMax(lh[0],rh[0]); // height of current node
    	
    	int rootPath = 1 + lh[0] + rh[0]; // height of tree
    	int maxDiameter = getMax(lDiameter, rDiameter);
    	
    	return getMax(maxDiameter, rootPath);
    	
    }
    
    
    
    
  //  --------------------------------------------------------------------------------------------
    
    /***
     * Height of binary tree
     */
    
    public int getHeight(BNode root){
    	
    	if(root == null){
    		return 0;
    	}
    	
    	return 1 + getMax(getHeight(root.left),getHeight(root.right));
    	
    }
    
    public int getMax(int i, int j){
    	
    	return i >= j ? i : j;
    }
	
    
}