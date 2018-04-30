package Sorting;

import java.util.*;

public class Bubblesort {

	/**
	 * @param args
	 */



	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        String[] unsorted = new String[n];
	        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
	            unsorted[unsorted_i] = in.next();
	        }
	        
	Comparator<String> arrcom=new Comparator<String>() {
		
		public int compare(String x, String y) {


			if(x.length() != y.length())
				return x.length()-y.length();
			
			else
			{
				for (int i = 0; i < x.length(); i++)
				{
					char left = x.charAt(i);
					char right = y.charAt(i);
					if (left != right)
						return left - right;
				}

					return 0;
					
				}
			}
			
		
	};
	  
	Arrays.sort(unsorted, arrcom);
	        // your code goes here
	for (int i = 0; i < unsorted.length; i++) {
		
		System.out.println(unsorted[i]);
		
	}
	    }
	


	}


