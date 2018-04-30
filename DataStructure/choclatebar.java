
	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class choclatebar {

	    static int solve(int n, int[] s, int d, int m){
	    	
	    	int count=0;
	    if(s.length==1 && s[0]==d)
count=count+1;	    	
	    	for (int i = 0; i < s.length-(m-1); i++) {
				
	    		int sum=0;
	    		
	    		
	    		for (int j = 0; j < m; j++) {
					System.out.print(s[j+i]);
	    			sum=sum+s[j+i];
	    			
				}
	    		System.out.println("sum"+sum);
	    		System.out.println("next");
	    		
	    		if(sum == d)
	    			count++;
			}
	    	
			return count;
	        // Complete this function
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] s = new int[n];
	        for(int s_i=0; s_i < n; s_i++){
	            s[s_i] = in.nextInt();
	        }
	        int d = in.nextInt();
	        int m = in.nextInt();
	        int result = solve(n, s, d, m);
	        System.out.println(result);
	    }
	}
