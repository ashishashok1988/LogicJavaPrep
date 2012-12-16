package sandeep;

public class DuplicateTest {
    public static void main( String args[] )
{
	Duplicates d = new Duplicates();
	String string = "I'm Sandeep. Sandeep is a good boy. Sandeep !!";
	int duplicateCount = d.countDuplicates(string);
	System.out.println("No. of duplicates ="+duplicateCount);
}
    
}