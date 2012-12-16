package probSolving;

public class StringOperationTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringOperation stringOperation = new StringOperation();
		String str = "My name is Sandeep.What is your name? name! is! question," +
				"something name, name!Sandeep!!";
		stringOperation.getDuplicateWords(str);
	}

}
