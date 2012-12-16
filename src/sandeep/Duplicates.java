package sandeep;

import java.util.*;
public class Duplicates 
{
    //pivate static String string;
    public int countDuplicates( String string )
{
    System.out.println(string);
 
StringTokenizer tokens = new StringTokenizer ( string, " ?!.," );
Integer mapEntry;
Map<String, Integer> map = new HashMap<String, Integer>();
int duplicates = 0;
while ( tokens.hasMoreTokens() ) {
	String token = tokens.nextToken().toLowerCase();
	mapEntry = map.get( token );
	 
		if ( mapEntry == null ){
		map.put( token , new Integer( 1 ) );
		 
		}
		else 
		{
		duplicates++;
		map.put( new String( token ),
		new Integer( mapEntry.intValue() + 1 ) );
		System.out.println("No. of duplicate words ="+duplicates);
		 
		}
}
return duplicates;
}
}