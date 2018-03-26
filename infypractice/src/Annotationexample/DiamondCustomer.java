package Annotationexample;

import java.lang.reflect.Method;

public class DiamondCustomer {

@MethodInfo(author = "John")
@MethodInfo(author = "sakshi")
	public static void display()
	{System.out.println("display");}

@MethodInfo(author = "John")
@MethodInfo(author = "sakshi")
public static void displayrepeat()
{System.out.println("display");}
	public static void main(String[] args) {
		
		
		Class anoclass=DiamondCustomer.class;
		Method[] methods=anoclass.getMethods();
		for (Method method : methods) {
			if(method.isAnnotationPresent(MethodInfo.class)) {
			MethodInfo[] info=method.getDeclaredAnnotationsByType(MethodInfo.class);
			for (MethodInfo methodInfo : info) {
				
			
			System.out.println(methodInfo.author());
		}}
		}
		DiamondCustomer.display();
	}
}
