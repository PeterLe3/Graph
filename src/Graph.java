import java.util.ArrayList;
public class Graph {
	ArrayList<Node> graph;
	
	public Graph(){
	}
	
	//adds a node into the graph
	// make sure to fix the fact that two nodes can have same idea later
	public void addNode(Node n){
		boolean nIn = false;
		for(int i = 0; i++ < graph.size();){
			if(graph.get(i).id.equals(n.id)){
				nIn = true;
				break;
			}
		}
		if(!nIn) {
			graph.add(n);
		}
	}
	
	//make sure they have to be in graph first
	public void addEdge(Node n1, Node n2) throws Exception{
		// add n1 to list of n2 and n2 to list of n1 IF it's not already there
		n1.addAdj(n2);
		n2.addAdj(n1);
		
	}
}
