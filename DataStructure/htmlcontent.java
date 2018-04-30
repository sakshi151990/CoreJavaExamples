import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class Prime{
    
    void checkPrime(int... n)
    {	System.out.println();
        for(int i=0;i<n.length;i++)
        {
        
        if(	isPrime(n[i]))
        	System.out.print(n[i]+" ");
        	
        	}
        	
     	System.out.println();
        
        }
        
        boolean isPrime(int n)
        { if(n < 2)
        	return false;
        	for(int j=2;j<Math.sqrt(n);j++)
        	{
        	
        	if(n%j == 0)
        		return false;
        }
			return true;
        }
    }

public class htmlcontent {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		Prime ob=new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);	
		java.lang.reflect.Method[] methods=Prime.class.getDeclaredMethods();
		Set<String> set=new HashSet<String>();
		boolean overload=false;
		String s="s";
		s.equalsIgnoreCase(arg0)
		for(int i=0;i<methods.length;i++)
		{
			if(set.contains(methods[i].getName()))
			{
				overload=true;
				break;
			}
			set.add(methods[i].getName());
			
		}
		if(overload)
		{
			throw new Exception("Overloading not allowed");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}

	

