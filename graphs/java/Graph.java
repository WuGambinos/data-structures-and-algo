package graphs.java;
import java.util.ArrayList;
public class Graph {

    ArrayList<GraphNode> nodeList;
    int[][] adjacencyMatrix;

    boolean type;

    public Graph(ArrayList<GraphNode> nodeList, boolean type) {
        
        if(type) {
            this.nodeList = nodeList;
            this.adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
            this.type = type;
        }

        else {
            this.nodeList = nodeList;
            this.type = type;

        }

    }

    public void addUndirectedEdge(int i, int j) {

        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }

    /*
     * Print out adjacency matrix
     */
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("   ");
        for(int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name  + " ");

        }

        s.append("\n");

        for(int i = 0; i < nodeList.size(); i++ ) {
            s.append(nodeList.get(i).name + ": ");
            for(int j : adjacencyMatrix[i]) {
                s.append((j) + " ");
            }
            s.append("\n");
        }

        return s.toString();
    }
    
}
