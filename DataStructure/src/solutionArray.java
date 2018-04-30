package src;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class solutionArray {

	
    static int sockMerchant(int n, int[] ar) {
        // Complete this function
        List<Integer> list=new ArrayList<Integer>();
     
        int pair=0;
        n=list.size();
        
        for(int i=0;i<n;i++)
        {
        	for(int j=1;j<n;j++)
        	{if(ar[i] !=0){
        		if(ar[i]==ar[j]  )
        		{	ar[i]=0;ar[j]=0;
        			pair++;
        			break;}
        	}
        	}
        }
        for(Integer i: ar)
        {
            for(Integer j: ar)
            { if(i == j )
            {   
            list.remove(j);
             pair++;
           
            }
            list.remove(i);
            
            }}
        
        return pair;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}