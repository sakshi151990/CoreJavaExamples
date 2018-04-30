package staticex;

import java.util.Arrays;

public class VaeargsExercise1 {
	
	
	public static void main(String[] args)
	{
		displayList(1);
		sortList(45,67,89,23);
		maxOfList(4,7,2,5);
	}
	
	public static void displayList(int d,int... input)

	{  for(int x:input) {
		System.out.println(x);
	}
	}
	
	public static void maxOfList(int... input)
	{
		int max = input[0];
		for(int x :input)
		{
			if(x >= max)
				max=x;
			
		}
		System.out.println(max);
	}
	
	
	public static void sortList(int... input)
	{
		Arrays.sort(input);
		for (int i : input) {
			
			System.out.println(i);
			
		}
	}
}
