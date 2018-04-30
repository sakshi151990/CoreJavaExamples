package src;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class deapthfirstsreach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int M = scan.nextInt();

		int[][] edges = new int[M][2];

		for (int i = 0; i < M; i++) {

			edges[i][0] = scan.nextInt();
			edges[i][1] = scan.nextInt();

		}
		int x = scan.nextInt();

	//	graph g = new graph(N, edges);
		
		//DFS(x,g);

	}
	
	public static void DFS(int x,graph g)
	{
		Set<Integer> visited = new HashSet<Integer>();
		DFSUtil(visited,x, g);
		System.out.println(visited.size()-g.getMap().keySet().size());
		
	}
	
	@SuppressWarnings("unchecked")
	public static void DFSUtil(Set visited,int x,graph g)
	
	{
		visited.add(x);
		
		Iterator<Integer> itr=g.getMap().get(x).listIterator();
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			if(!visited.contains(integer))
			{ 
				visited.add(integer);
				DFSUtil(visited, integer, g);
			}
			
			
			
		}
		
		
			
		
		
		
	}
}
