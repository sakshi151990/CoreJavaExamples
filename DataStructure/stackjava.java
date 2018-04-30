import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class stackjava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		  
	      
	      while (sc.hasNext()) {
	         String input=sc.next();
	            //Complete the code
	         LinkedList<Character> qu=new LinkedList<Character>() ;
	         int count=0;
	    
		for (int i = 0; i < input.length(); i++) {
			
		
	         
	         if(input.charAt(i)==('{'))
	         qu.add(input.charAt(i));
	         else if(input.charAt(i)==('('))
	        	 qu.add(input.charAt(i));
	         else if(input.charAt(i)==('['))
	        	 qu.add(input.charAt(i));
	         
	         else if(input.charAt(i)==(']') ){if(!qu.isEmpty())
	        	 qu.removeLast();
	         else 
	        	 count++;}
	         else if(input.charAt(i)==(')')) {if(!qu.isEmpty())
	        	 qu.removeLast();
	         else 
	        	 count++;}
	         else if(input.charAt(i)==('}') ){if(!qu.isEmpty())
	        	 qu.removeLast();
	         else 
	        	 count++;}
	         
		}
	      
	      if(count == 0 && qu.size()==0)
	    	 return true;
	      else
	    	  return false;
	      }
	 
	}}


