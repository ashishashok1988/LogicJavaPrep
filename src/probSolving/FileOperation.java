package probSolving;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;


public class FileOperation {

	/*********
	 * 
	 * Ignore code over here. Follow this code
	 * http://www.geeksforgeeks.org/archives/26581
	 */
	
	public String getRandomQuote(){
		
	/*	URL url = getClass().getResource(filePath);
		System.out.print(url.getPath());*/
		
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\Users\\Hemanth\\Workspaces\\MyEclipse 9\\Hemanth1\\src\\probSolving\\input.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "no file";
		}
		BufferedReader br = new BufferedReader(fr);
		Random r = new Random();
		
		int rand = r.nextInt(Integer.MAX_VALUE);
		int i = 0;
		String s ="";
		while(i<rand){
				    try {
						s= br.readLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(s != null && s.equals("%%")){
			         i++;
			    } else if(s == null) {
			       rand = r.nextInt(i-1);
			       i =0;
			       try {
					fr.close();
					fr = new FileReader("C:\\Users\\Hemanth\\Workspaces\\MyEclipse 9\\Hemanth1\\src\\probSolving\\input.txt");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			      br = new BufferedReader(fr);
			  }
			    
			}

		try {
			s= br.readLine();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		StringBuilder sb = new StringBuilder();
		while(!s.equals("%%") ){
			try {
				s= br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		try {
			s = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(!s.equals("%%")){
			sb.append(s);
		    try {
				s = br.readLine() ;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}; 
		}
		return sb.toString();
		
	}
	
	
}
