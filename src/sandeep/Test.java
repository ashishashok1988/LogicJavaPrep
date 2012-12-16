package sandeep;

import java.util.LinkedList;
import java.util.Scanner;


public class Test {
	/**
	 * @param ssargs
	 */
	public static void main(String[] args) {
		LinkedList<String> linkedList= new LinkedList<String>();
		
		int i = 0;
		while(i != 3){
			
			System.out.println("Select one of the options from below :");
			System.out.println("1 : To insert data");
			System.out.println("2: To search data");
			System.out.println("3: To exit");
			
			Scanner sc = new Scanner(System.in);
			i = sc.nextInt();
			
			switch (i){
			case 1 :
				System.out.println("Enter firstName to insert:");
				String firstName = sc.next();
				if(linkedList.contains(firstName)){
					System.out.println("Cannot insert: "+firstName+" already exists in linkedList.");
				} else {
					linkedList.add(firstName);
				}
				break;
			case 2 : 
				System.out.println("Enter firstname to search:");
				String firstName1 = sc.next();
				Boolean bool = linkedList.contains(firstName1);
				if(bool){
					System.out.println("Found first name :"+firstName1);
				} else {
					System.out.println("No first name :"+firstName1);
				}
				break;
			case 3 :
				System.out.println("System exiting..");
				break;
			default :
				System.out.println("Invalid option : Enter again");
				break;
			
			}
		}
		
		
		
	}

	
}
