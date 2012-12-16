package sandeep;

   // GenericMethodTest.java
    // Using generic methods to print array of different types.
   
    public class GenericMethodTest
    {
       // generic method printArray                        
       public static < E > void printArray( E[] inputArray )
       {
          // display array elements             
         for ( E element : inputArray )        
            System.out.printf( "%s ", element );
  
         System.out.println();
      } // end method printArray
       
       
      public static < E > int printArray(E[] inputArray, int lowSubscript, int highSubscript ) {
    	  try {
    		  if( highSubscript <= lowSubscript  || lowSubscript < 0 || highSubscript >= inputArray.length){
        		  throw new InvalidSubscriptException();
        	  } else {
        		  for(int i=lowSubscript; i<= highSubscript ; i++){
        			  System.out.printf("%s ", inputArray[i]);
        		  }
        		  System.out.println();
        		  int elementCount = highSubscript - lowSubscript + 1;
        		  return elementCount;
        	  }
    	  } catch(InvalidSubscriptException e){
    		  System.out.println(e.getMessage());
    	  }
		return 0;
      }
 
      public static void main( String args[] )
      {
         // create arrays of Integer, Double and Character
         Integer[] intArray = { 1, 2, 3, 4, 5 };
         Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
         Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
  
         System.out.println( "Array integerArray contains:" );
         printArray( intArray ); // pass an Integer array
        System.out.println( "\nArray doubleArray contains:" );
         printArray( doubleArray ); // pass a Double array
         System.out.println( "\nArray characterArray contains:" );
         printArray( charArray ); // pass a Character array
         
         
         int subscript1 = 1;
         int subscript2 = 4;
         int subscript3 = 5;
         
         System.out.println( "\nArray integerArray from "+subscript1+" to "+subscript2+" contains:" );
         int count = printArray( intArray, subscript1,subscript2 );
         System.out.println("No.of elements printed ="+count);
         
         System.out.println( "\nArray charArray from "+subscript1+" to "+subscript2+" contains:" );
         int count1 = printArray( charArray, subscript1,subscript2 );
         System.out.println("No.of elements printed ="+count1);
         
         System.out.println( "\nArray doubleArray from "+subscript1+" to "+subscript3+" contains:" );
         int count2 = printArray( doubleArray, subscript1,subscript3 );
         System.out.println("No.of elements printed ="+count2);
         
         
         System.out.println( "\nArray integerArray from "+subscript1+" to "+subscript3+" contains:" );
         int count3 = printArray( intArray, subscript1,subscript3 );
         System.out.println("No.of elements printed ="+count3);
         
         System.out.println( "\nArray charArray from "+subscript2+" to "+subscript1+" contains:" );
         int count4 = printArray( charArray, subscript2,subscript1 );
         System.out.println("No.of elements printed ="+count4);
         
      } // end main
    } // end class GenericMethodTest
