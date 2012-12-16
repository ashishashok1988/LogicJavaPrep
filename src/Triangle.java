
public class Triangle {
	
	public String getType (int a, int b, int c){
		if(a <=0 || b <=0 || c <= 0){
		   return "error";
		 } else if ((a+b <=c) || (a+c <=b) || (b+c <=a)){
			 return "error";
		 }else if(a==b && b==c){
			 return "equilateral";
		 } else if(a==b || b==c || c==a){
			 return "isosceles";
		 } else {
			 return "scalene";
		 }

	}
}
