package graphs.java;
import java.util.*;
public class Main {

    public static void main(String args[])
    {
        /*System.out.println("DEPTH FIRST SEARCH");
        DFS dfs = new DFS();

        Vertex v1 = new Vertex("A");
        Vertex v2 = new Vertex("B");
        Vertex v3 = new Vertex("C");
        Vertex v4 = new Vertex("D");
        Vertex v5 = new Vertex("E");
        Vertex v6 = new Vertex("F");

        v1.addChild(v2);
        v1.addChild(v3);

        v2.addChild(v4);
        v2.addChild(v5);

        v3.addChild(v6);

        v5.addChild(v5);

        dfs.search(v1);*/

        ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
        nodeList.add(new GraphNode("A", 0));
        nodeList.add(new GraphNode("B", 1));
        nodeList.add(new GraphNode("C", 2));
        nodeList.add(new GraphNode("D", 3));
        nodeList.add(new GraphNode("E", 4));

        Graph g = new Graph(nodeList);

        //A to B, B to A
        g.addUndirectedEdge(0, 1);

        //A to C, C to A
        g.addUndirectedEdge(0, 2);

        //A to D, D to A
        g.addUndirectedEdge(0, 3);

        //B to E, E to B
        g.addUndirectedEdge(1, 4);

        //C to D, D to C
        g.addUndirectedEdge(2, 3);
        
        //D to E, E to D
        g.addUndirectedEdge(3, 4);

        System.out.println(g.toString());

    }
    
}
