package callByValue;

public class CallByValueTest {

	public static void main(String[] args){
		
		int[] a ={1,2,3};
	    modify(a);
		System.out.println(a[0]);
		
		modify1(a);
		System.out.println(a[0]);
		
		int c = 1;
		modify(c);
		System.out.println(c);
		
		
		
	}
	
	
	private static void modify (int[] b){
		b[0]=4;
	}
	
	private static void modify1(int[] b){
		int[] c ={11,12,13};
		b = c;
	}
	
	private static void modify(int b) {
		b=4;
	}
	
	
	/***
	 * 
	 * Java always makes a copy of the argument and passes the copy. The called method has a local copy of the data. If the method changes the data it changes the copy, so the original value is not changed.
		When we pass a primitive like int this make perfect sense. The method gets its own int variable, a copy of the original.

		When we pass an object we have to think very precisely. The value that is copied and sent along is a reference or pointer to the object.
		 The method gets its own copy of the pointer, but it doesn't get its own copy of the object. 
		 *****If the method changes its copy of the pointer to point to a different object the original pointer is not affected.****
		  If the method changes some of the attributes of the object, it changes the original object.

		In short: In Java, object references are passed by value and primitive types are passed by value.
		*********************************************************************************************************
		Primitive data types in Java: byte, short, int, long, float, double, boolean, char
		
		In addition to the eight primitive data types listed above, the Java programming language also provides special support for character 
		strings via the java.lang.String class. Enclosing your character string within double quotes will automatically create a new String object;
		 for example, String s = "this is a string";. String objects are immutable, which means that once created, their values cannot be changed. 
		 The String class is not technically a primitive data type, but considering the special support given to it by the language, 
		 you'll probably tend to think of it as such
	 * 
	 */
	
}
