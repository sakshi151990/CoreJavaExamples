package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class shortestpath {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			int N = scan.nextInt();

			int M = scan.nextInt();

			int[][] edges = new int[M][2];

			for (int i = 0; i < M; i++) {

				edges[i][0] = scan.nextInt();
				edges[i][1] = scan.nextInt();

			}
			int x = scan.nextInt();
   
			graph g = new graph(N, edges);
			

			Map<Integer, Integer> paths = BFS(g, x);
			
			for (int i=1;i<= g.getMap().size();i++) {
				if(i != x)
					
					System.out.print( paths.get(i) + " ");

			}

		}
	}

	public static Map<Integer, Integer> BFS(graph g, int s) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		// Set<Integer> visited = new HashSet<Integer>();
		LinkedList<Integer> level = new LinkedList<Integer>();
		for (int i = 1; i <= g.getMap().size(); i++) {
			map.put(i, -1);
		}
		// visited.add(s);
		level.add(s);
		map.put(s, 0);

		while (level.size() != 0) {

			s = level.poll();

			ArrayList<Integer> adjArrayList = g.getMap().get(s);

			Iterator<Integer> itr = adjArrayList.listIterator();
			while (itr.hasNext()) {

				int n = itr.next();
				if(n==18)
				System.out.println(n + " n " + s + " s");

				if (map.get(n) == -1) {

					// visited.add(n);

					map.put(n, map.get(s) + 6);
					level.add(n);
				}

			}
		}

		return map;
	}

}
