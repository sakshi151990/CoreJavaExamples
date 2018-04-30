import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class solution {
	
	 public static void main(String[] args) {
		 
		 Scanner scan=new Scanner(System.in);
		 int n=scan.nextInt();
		 int shre=5;
		 int like=(int) Math.floor(shre/2);
		 int total=like;
	while(n != 0)
	{   	shre=like*3;
		like=(int) Math.floor(shre/2);
	
		total=total+like;
		n--;
		
	}
		 System.out.println(total);
		 
		 for (int i = 0; i < args.length; i++) {
			
		}
	 }
	 

}
