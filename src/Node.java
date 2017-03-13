import java.util.ArrayList;
public class Node {
	String id;
	ArrayList<Node> adjacencyList;
	Node(String s){
		this.id = s;
	}
	
	public void addAdj(Node n) throws Exception{
		for(int i = 0; i< this.adjacencyList.size(); i++){
			if(this.adjacencyList.get(i).id.equals(n.id)) { 
				throw new Exception("Node" + n.id + "already exists in adjacenylist of " + this.id);
			}
			
			
		}
		this.adjacencyList.add(n);
	}
	//remove node from adjacenylist by comparing the id of n.id with the adjancy list i want to remove from
	public void removeNode(Node n){
		for(int i = 0; i< adjacencyList.size(); i++){
			if(adjacencyList.get(i).id.equals(n.id)){
				adjacencyList.remove(i--);
			}
		}
	}
	// same thing except finds the string
	public void removeNode(String identity){
		for(int i = 0; i < adjacencyList.size();i++){
			if(adjacencyList.get(i).id.equals(identity)){
				adjacencyList.remove(i--);
				
			}
		}
	}
}
