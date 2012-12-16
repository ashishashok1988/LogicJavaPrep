package linkedList;

public class LinkedListOperations<T> {
	
	@SuppressWarnings("unchecked")
	
	
	/***
	 * First List  : 3 -> 6 -> 5 // represents : 365
	 * Second List : 2 -> 4 -> 8 // represents : 248
	 * Sum         : 6 -> 1 -> 3 // represents : 613
	 * 
	 * First List  : 6 -> 4 -> 9 -> 5 -> 7  // represents : 64957
	 * Second List :                4 -> 8  // represents :    48
	 * Sum   	   : 6 -> 5 -> 0 -> 0 -> 5  // represents : 65005
	 */
	
	
	//Inspired from www.geeksforgeeks.org/archives/15194
	
	public LinkedList<T> addTwoLists(LinkedList<T> list1, LinkedList<T> list2){
		
		LinkedList<T> newList = new LinkedList<T>();
		
		list1.reverse();
		list2.reverse();
		
		Node<T> list1Node = list1.head;
		Node<T> list2Node = list2.head;
		Node<T> previous = newList.head;
		
		Integer carry =0;
		Integer sum= 0;
		
		while(list1Node != null || list2Node != null){
			if(list1Node != null){
				sum += (Integer) list1Node.data;
				list1Node = list1Node.next;
			}
			if(list2Node != null){
				sum += (Integer) list2Node.data;
				list2Node = list2Node.next;
			}
			
			if(sum >= 10){
				carry = 1;
			}
			sum = sum % 10;
			
			Node<T> newNode = new Node<T>((T) sum);
			if(previous == null){
				newList.head =  newNode;
			} else {
				previous.next = newNode;
			}
			previous = newNode;
			
			sum = carry;
			carry = 0;
		}
		
		if(sum != 0){
			Node<T> newNode = new Node<T>((T) sum);
			previous.next = newNode;
		}
		list1.reverse();
		list2.reverse();
		newList.reverse();
		return newList;
	}
	
	
	
}
