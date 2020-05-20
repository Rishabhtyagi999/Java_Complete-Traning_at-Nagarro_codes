package DataStructure_Algorithms;

public class Graph_client {

	public static void main(String[] args) {
		Graph graph=new Graph();
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		graph.addVertex("F");
		graph.addVertex("G");
		
		graph.addEdge("A", "B", 10);
		graph.addEdge("B", "C", 10);
		graph.addEdge("C", "D", 10);
		graph.addEdge("D", "A", 40);
		graph.addEdge("D", "E", 16);
		graph.addEdge("E", "F", 8);
		graph.addEdge("E", "G", 3);
		graph.addEdge("F", "G", 3);

//		System.out.println(graph.numEdges());
//		System.out.println(graph.numvtces());
//		graph.display();
		
		graph.removeEdge("D", "E");
		//graph.display();
		
		//graph.removevertex("E");
		//graph.display();
		
		System.out.println(graph.hasPath("A", "G"));
		graph.bft();
		System.out.println();
		graph.dft();
		System.out.println();
		
		graph.djikstra("A");
		
	}

}
