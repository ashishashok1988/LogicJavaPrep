package linkedList;

import java.util.Scanner;

public class LinkedListOperationsTest {
	public static void main(String[] args) {
		LinkedListOperations<Integer> llo = new LinkedListOperations<Integer>();
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. of digits in list1");
		Integer n = sc.nextInt();
		for(int i=0; i <n ; i++){
			System.out.println("Enter digit"+i+1+"from left");
			Integer digit = sc.nextInt();
			list1.insertLast(digit);
		}
		System.out.println("Enter no. of digits in list2");
		 n = sc.nextInt();
		 for(int i=0; i <n ; i++){
			System.out.println("Enter digit"+i+1+"from left");
			Integer digit = sc.nextInt();
			list2.insertLast(digit);
		}
		 list1.printList();
		 list2.printList();
		 LinkedList<Integer> list3 = llo.addTwoLists(list1, list2); 
		 
		 list3.printList();
	}

}
