import junit.framework.Assert;

import org.junit.Test;

public class TriangleTest {
	
	@Test
	public void test(){
		Triangle triangle = new Triangle();
		Assert.assertEquals("error", triangle.getType(-1, 5, 4)); //a<=0
		Assert.assertEquals("error", triangle.getType(1, -5, 4)); //b<=0
		Assert.assertEquals("error", triangle.getType(1, 5, -4)); //c<=0
		
		Assert.assertEquals("error", triangle.getType(1, 3, 4)); // a+b <=c
		Assert.assertEquals("error", triangle.getType(3, 4, 1)); // a+c <=b
		Assert.assertEquals("error", triangle.getType(4, 3, 1)); // b+c <=a
		
		Assert.assertEquals("equilateral", triangle.getType(3, 3, 3)); // a==b==c
		Assert.assertEquals("isosceles", triangle.getType(3, 3, 2));  // a == b !=c
		Assert.assertEquals("isosceles", triangle.getType(3, 2, 3));  // a == c !=b
		Assert.assertEquals("isosceles", triangle.getType(2, 3, 3));  // a != b ==c
		Assert.assertEquals("scalene", triangle.getType(3, 4, 5));  // a != b != c

	}
}
