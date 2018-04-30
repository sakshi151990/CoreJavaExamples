package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class graph {

	private Map<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();

	public Map<Integer, ArrayList<Integer>> getMap() {
		return map;
	}

	private ArrayList<Integer> adj = new ArrayList<Integer>();

	public graph(int n, int[][] edges) {
		for (int i = 1; i <= n; i++) {
			ArrayList<Integer> adj = new ArrayList<Integer>();
			this.map.put(i, adj);

		}
	
		for (int i = 0; i < edges.length; i++) {
			ArrayList<Integer> adj = new ArrayList<Integer>();

			adj = this.map.get(edges[i][0]);
			adj.add(edges[i][1]);
			this.map.put(edges[i][0], adj);
		}
		

		for (int i = 0; i < edges.length; i++) {
			ArrayList<Integer> adj = new ArrayList<Integer>();
			adj = this.map.get(edges[i][1]);
			adj.add(edges[i][0]);
			this.map.put(edges[i][1], adj);
		}

	

	}

}
