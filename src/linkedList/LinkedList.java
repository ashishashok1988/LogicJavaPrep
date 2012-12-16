package linkedList;

public class LinkedList<T> {

	public Node<T> head;
	public Node<T> tail;
	
	public LinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public Boolean isEmpty(){
		return (head == null);
	}
	
	public Node<T> insertFirst(T data){
		Node<T> newNode = new Node<T>(data);
		if(isEmpty()){
			newNode.next = null;
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		return  newNode;
	}
	
	public Node<T> insertLast(T data){
		Node<T> newNode = new Node<T>(data);
		if(isEmpty()){
			newNode.next = null;
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		return newNode;
	}
	
	public void removeFirst(){
		if(!isEmpty()){
			head = head.next;
			if(head == null){
				tail  = null;
			}
		}
	}
	
	public void removeLast(){
		if(!isEmpty()){
			Node<T> currentNode = head;
			Node<T> previousNode = null;
			
			while(currentNode.next != null){
				previousNode = currentNode;
				currentNode = currentNode.next;
			}
			if(previousNode == null){
				head = null;tail = null;
			} else {
				tail = previousNode;
				tail.next = null;
			}
		}
	}
	
	public void reverse(){
		// http://www.geeksforgeeks.org/archives/860
			Node<T> current = head;
			Node<T> previous = null;
			Node<T> next ;
			while(current != null){
				next = current.next;
				current.next = previous;
				previous = current;
				current = next;
			}
			head = previous;
	}
	
	
	public void reverseRecursive(Node<T> current){
		// http://www.geeksforgeeks.org/archives/860
		
		//Incorrectly implemented here in java, code on link is good for C++
		Node<T> first ;
		Node<T> rest ;
		
		if(current == null){
			return ;
		}
		first = current;
		rest = current.next;
		if(rest == null){
			return ;
		}
		
		reverseRecursive(rest);
		first.next.next = first;
		
		first.next = null;
		this.head = rest;
		
	}
	
	
	public void printList(){
		System.out.println("List:\n");
		if(!isEmpty()){
			Node<T> currentNode = head;
			while(currentNode != null){
				System.out.print(currentNode.data+"\t");
				currentNode = currentNode.next;
			}
		}
	}
	
}
