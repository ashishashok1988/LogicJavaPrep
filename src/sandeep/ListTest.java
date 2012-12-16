package sandeep;

import java.util.LinkedList;
import java.util.Scanner;

public class ListTest
{
	private LinkedList< Integer > idList;
	private Scanner scanner;
	public ListTest(){
		idList = new LinkedList< Integer >();
		scanner = new Scanner( System.in );

		getIds();
		searchIds();
	}

	public void getIds(){
	  System.out.println("Add an id to list, use 0 to terminate input:" );
	  Integer inputId= scanner.nextInt();
	
	  while ( inputId != 0){
		  // insert id
			if ( foundList( inputId ) == false ){
				insertName( inputId );
				System.out.println( inputId + " inserted" );
			} // end if
			else // id already exists in list
				System.out.println( inputId + " exists in list" );
	
		    System.out.println("Add an id to list, use 0 to terminate input:" );
		    inputId= scanner.nextInt();
	  } // end while
	} // end method getIds


	public void searchIds(){
	   System.out.println("Search an id, use 0 to terminate searching:" );
	   Integer inputId = scanner.nextInt();
	
	   while ( inputId != 0 ){
	       if ( foundList( inputId ) )
	               System.out.println( inputId + " found in list" );
	       else // name not found
	             System.out.println( inputId + " not found in list");
	
	       System.out.println("Search an id, use 0 to terminate searching:");
	       inputId = scanner.nextInt();
	   }
	}

	public boolean foundList( Integer searchId ){
	  for ( Integer id : idList ){
	   if ( searchId.equals( id ) )
	            return true;
	  }
	
	  return false;
	}
	
	public void insertName( Integer id ){
		idList.add( id );
	}

}
