import java.util.Random;
import java.util.Scanner;


public class Test {

	public static void main(String[] args){
		int i =0;
		Scanner input=new Scanner(System.in);
		Triangle triangle = new Triangle();
		
		System.out.println("Enter first side length :");
		Integer a = input.nextInt();
		System.out.println("Enter second side length :");
		Integer b = input.nextInt();
		System.out.println("Enter third side length :");
		Integer c = input.nextInt();
		
		String type = triangle.getType(a, b, c);
		System.out.println("type of triangle :: "+type);
		
		CircularQueue cq = new CircularQueue();
		Random r = new Random();
		int[] array1 = {1,2,3,4,5};
		cq.initialize(array1);
		
		for(int i=0; i<100 ; i++ ){
			System.out.println("Select option :");
			int j = r.nextInt(2);
			if(j==0){
				cq.enqueue(r.nextInt(100));
			}else {
				cq.dequeue();
			}
			cq.display();
		}
		
	}
	
}
