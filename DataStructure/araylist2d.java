import java.util.ArrayList;
import java.util.Scanner;


public class araylist2d {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		
		Scanner scan=new Scanner(System.in);
	
		 int n=scan.nextInt();
		for (int i = 0; i < n; i++) {
			
			ArrayList<Integer> inner=new ArrayList<Integer>();
			
			int size=scan.nextInt();
			for (int j = 0; j < size; j++) {
				
				inner.add(scan.nextInt());
				
			}
			
			list.add(inner);
			
		}
		
		int q=scan.nextInt();
		ArrayList<ArrayList<Integer>> query=new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < q; i++) {
			
			int x=scan.nextInt();
			int y=scan.nextInt();
			
		
			if(list.get(x-1).size() < y)
			{
				System.out.println("ERROR!");
			}
			else
			System.out.println(list.get(x-1).get(y-1));
			
		
			
		}
		
		

		 
		 
	}

}
