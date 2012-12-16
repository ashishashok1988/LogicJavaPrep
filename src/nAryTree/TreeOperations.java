package nAryTree;

import java.util.List;

public class TreeOperations<T> {

	
	public Boolean isBinary(GenericTreeNode<T> root){
	  	
		if(root.getChildren().size() > 2){
			return false;
		} else {
			List<GenericTreeNode<T>> children = root.getChildren();
			
			for(GenericTreeNode<T> child : children){
				if(!isBinary(child)){
					return false;
				}
				
			}
		}
		
	    return true;
	}
	
}
