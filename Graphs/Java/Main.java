package Graphs.Java;

public class Main {

    public static void main(String args[])
    {
        System.out.println("DEPTH FIRST SEARCH");
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

        dfs.search(v1);

    }
    
}
