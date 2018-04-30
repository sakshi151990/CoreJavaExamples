import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class sollist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
ArrayList<Integer> list=new ArrayList<Integer>();
		
Map<String, Integer> contact = new HashMap<String, Integer>();
		 Scanner in = new Scanner(System.in);
	       
	      int n=in.nextInt();
	      in.nextLine();
	      for(int i=0;i<n;i++)
	      {
	         String name=in.nextLine();
	         int phone=in.nextInt();
	         in.nextLine();
	         contact.put(name,phone );
	         
	      }
	      while(in.hasNext())
	      {
	         String s=in.nextLine();
	        if(contact.containsKey(s))
	        	System.out.println(s+" "+contact.get(s));
	        else
	        	System.out.println("Not found");
	   
	      }
		
		
	}

	      

}