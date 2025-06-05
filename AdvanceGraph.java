package kiran;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AdvanceGraph {
	static class graph{
		private Map<Integer,List<Integer>>adjList=new HashMap<Integer,List<Integer>>();
		void addEdge(int u,int v) {
			adjList.computeIfAbsent(u,k -> new ArrayList<>()).add(v);
			adjList.computeIfAbsent(v,k -> new ArrayList<>()).add(u);
			
		}
		void printgraph() {
			for(int node:adjList.keySet()) {
				System.out.print("Node "+ node +" is connected to : ");
				for(int neighbor:adjList.get(node)) {
					System.out.print(neighbor+" ");
				}
				System.out.println(" ");
			}
		}
	}
		
	public static void main(String[] args) {
		graph g1=new graph();
		g1.addEdge(1, 2);
		g1.addEdge(1, 3);
		g1.addEdge(1, 4);
		g1.addEdge(1, 4);
		g1.printgraph();
	}

}
