package nAryTree;

import java.util.Arrays;

public class TreeTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		GenericTreeNode<Integer> root = new GenericTreeNode<Integer>();
		GenericTreeNode<Integer> child1 = new GenericTreeNode<Integer>();
		GenericTreeNode<Integer> child2 = new GenericTreeNode<Integer>();
		GenericTreeNode<Integer> child3 = new GenericTreeNode<Integer>();
		root.setChildren(Arrays.asList(child1,child2));
		
		GenericTreeNode<Integer> child4 = new GenericTreeNode<Integer>();
		GenericTreeNode<Integer> child5 = new GenericTreeNode<Integer>();
		GenericTreeNode<Integer> child6 = new GenericTreeNode<Integer>();
		GenericTreeNode<Integer> child7 = new GenericTreeNode<Integer>();
		child1.setChildren(Arrays.asList(child3,child4));
		child4.setChildren(Arrays.asList(child5,child6,child7));
		
		TreeOperations<Integer> treeOperations = new TreeOperations<Integer>();
		System.out.println(treeOperations.isBinary(root));
	}
}
