package exceptiona;

import java.lang.reflect.TypeVariable;

public class SimpleGenerics {

	



	
	public  <E extends Number> void showObjectType(E[] array)
	{
	
		
	for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);
	}
		}
		
	
	
	
	public static void main(String[] args)
	{
		Integer[] in= {16,45,67};
		Double[] ch= {123.0,45.0};
		SimpleGenerics gen=new SimpleGenerics();
		gen.showObjectType(in);
		gen.showObjectType(ch);
	}
}
