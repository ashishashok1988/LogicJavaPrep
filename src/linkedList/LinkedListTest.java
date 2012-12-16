package linkedList;

import java.util.Scanner;

public class LinkedListTest {

	public static void main(String[] args){
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		int i = 0;
		while(i != 4){
			
			System.out.println("\nSelect one of the options from below :");
			System.out.println("1 : To insert data");
			System.out.println("2: To reverse list");
			System.out.println("3: To print list");
			System.out.println("4: To exit");
			
			Scanner sc = new Scanner(System.in);
			i = sc.nextInt();
			
			switch (i){
			case 1 :
				System.out.println("Enter data:");
				Integer data= sc.nextInt();
				linkedList.insertLast(data);
				break;
			case 2 : 
				linkedList.reverseRecursive(linkedList.head);
				break;
			case 3: 
				linkedList.printList();
				break;
			case 4 :
				System.out.println("System exiting..");
				break;
			default :
				System.out.println("Invalid option : Enter again");
				break;
			
			}
		}
		
	}
	
}
