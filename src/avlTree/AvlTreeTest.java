package avlTree;

public class AvlTreeTest {
	public static void main(String[] args) {

		AvlTree at = new AvlTree();

		AvlNode t;

		AvlNode position;

		int i;

		int j = 0;

		t = at.makeEmpty(null);

		for(i=0; i<50; i++, j = (j+7)%50)

		t = at.insert(j,t);

		for(i=0; i<50; i++)

		if((position = at.find(i,t)) == null ||	 at.retrieve(position) != i)

		System.out.println("Error at"+i);

		System.out.println("Min is "+at.retrieve(at.findMin(t))+" Max is "+at.retrieve(at.findMax(t)));	 at.preOrder(t);

		}
	
	/* Source code from this site : http://knowledgejunk.net/2010/11/09/avltree-java-source-code/
	 * Read about AVL Tree here : http://faculty.simpson.edu/lydia.sinapova/www/cmsc250/LN250_Weiss/L08-AVL.htm
	 * 
	 */
	
}
