package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class roadandlibraries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		long array[]=new long[q];
		for (int a0 = 0; a0 < q; a0++) {
			int n = in.nextInt();
			int m = in.nextInt();
			long lib = in.nextLong();
			long road = in.nextLong();
			int[][] edges = new int[m][2];
			for (int a1 = 0; a1 < m; a1++) {
				edges[a1][0] = in.nextInt();
				edges[a1][1] = in.nextInt();
			}

		graph g = new graph(n, edges);
		System.out.println(g.getMap());
		//	System.out.println(mincost(g, lib, road));
		array[a0]=mincost(g, lib, road);

		}
for (int i = 0; i < array.length; i++) {
	System.out.println("result" + array[i]);
}
	}

	public static long mincost(graph g, long lib, long road) {
		long cost;
		ArrayList<Long> costmap=new ArrayList<Long>();
	//	long[] costmap = new long[g.getMap().keySet().size()];
		if (lib < road)
			cost = lib * (g.getMap().size());

		else {
			long costv;
			for (Integer i:g.getMap().keySet()) {
				costv=lib;
				

				Set<Integer> visited = new HashSet<Integer>();
				DFSUtil(visited, i, g);
				System.out.println(i);
				System.out.println(visited);
				costv= costv + lib
						* (visited.size() - g.getMap().keySet().size()) + road
						* (visited.size()-1);
				System.out.println(costv);
				costmap.add(costv);
			}
    	Collections.sort(costmap);
			cost = costmap.get(0);
		}
		return cost;

	}

	@SuppressWarnings("unchecked")
	public static void DFSUtil(Set visited, int x, graph g)

	{
		visited.add(x);

		Iterator<Integer> itr = g.getMap().get(x).listIterator();
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			if (!visited.contains(integer)) {
				visited.add(integer);
				DFSUtil(visited, integer, g);
			}

		}
	}

}
