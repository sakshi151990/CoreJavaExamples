package src;

import java.util.*;

public class graphimplemnt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		//      Map<Integer, ArrayList<Integer> > map=new HashMap<Integer,ArrayList<Integer>>();

		        //Scanner
		        Scanner scan = new Scanner(System.in);
		        int N = scan.nextInt();
		         int M = scan.nextInt();
		         
		     
		         int[][] edges=new int[M][2]; 

		        for (int i = 0; i < M; i++) {
		         
		           
		        	edges[i][0]=scan.nextInt();
		        	edges[i][1]=scan.nextInt();
		        	
		        }
		        
		        graph g=new graph(N,edges);
		          
		        
		        int q=scan.nextInt();
		        String result[]=new String[q];
		        for(int i=0;i<q;i++)
		        {
		            int n1=scan.nextInt();
		            int n2=scan.nextInt();
		            
		         
		            
		            ArrayList<Integer> listn=g.getMap().get(n1);
		             ArrayList<Integer> listm=g.getMap().get(n2);
		            if(listn.contains(n2))
		           result[i]="YES";
		            else if(listm.contains(n1))
		            	 result[i]="YES";
		             else
		            	 result[i]="NO";
		            
		        }
		        
for (int i = 0; i < result.length; i++) {
	System.out.println(result[i]);
}
		       
		    }
		


	}


