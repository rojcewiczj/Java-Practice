import java.util.*;

class Program {

  public boolean cycleInGraph(int[][] edges) {
    int numberOfNodes = edges.length;
		boolean[] visited = new boolean[numberOfNodes];
		boolean[] currentlyInStack = new boolean[numberOfNodes];
		Arrays.fill(visited, false);
		Arrays.fill(currentlyInStack, false);
		
		for(int node =0; node < numberOfNodes; node++){
			if(visited[node]){
				continue;
			}
			
			boolean containsCycle = isNodeInCycle(node, edges, visited, currentlyInStack);
			if(containsCycle){
				return true;
			}
		}
    return false;
  }
	
	public boolean isNodeInCycle(int node, int[][] edges, boolean[] visited, boolean[] currentlyInStack){
		visited[node] = true;
		currentlyInStack[node] = true;
		
		boolean containsCycle = False;
		int[] neighbors = edges[node];
		for(int neighbor : neighbors){
			if(!visited[neighbors]){
				containsCycle = isNodeInCycle(neighbor, edges, visited, currentlyInStack)
			}
			if(containsCycle){
				return true;
			} else if(currentlyInStack[neighbor]){
				return true;
			}
		}
		currentlyInStack[node] = false;
		return false;
	}
}
