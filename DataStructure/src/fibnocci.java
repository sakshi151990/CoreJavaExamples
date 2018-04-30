package src;

import java.math.BigInteger;
import java.util.Scanner;

public class fibnocci {

	/**
	 * @param args
*/
		  public static void main(String args[] ) throws Exception {
		        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
		        Scanner scan = new Scanner(System.in);
		        BigInteger t0=new BigInteger(scan.next());
		        BigInteger t1=new BigInteger(scan.next());
		        BigInteger n=new BigInteger(scan.next());
		        BigInteger[] fib=new BigInteger[n.intValue()];
		        fib[0]=t0;
		        fib[1]=t1;
		       
		        for(int i=0;i < n.intValue()-2;i++)
		        {  BigInteger  sum = fib[i+1].multiply(fib[i+1]);
		        	
		        	
		        BigInteger sum2= fib[i].add(sum);
		        	fib[i+2]=sum2;
		      
		        }
		        
		        for (int i = 0; i < fib.length; i++) {
				
				}
		      //  System.out.println((long)fib[(int) (n+2)]);
		       System.out.println(fib[n.intValue()-1]);
		    }
		
	}


