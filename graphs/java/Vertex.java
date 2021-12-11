package graphs.java;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private List<Vertex> children;
     

    private String name;
    public Vertex(String name)
    {
        this.children = new ArrayList<Vertex>();
        this.name = name;

    }

    public List<Vertex> getChildren()
    {
        return this.children;
    }

    public void addChild(Vertex v)
    {
        this.children.add(v);
    }

    @Override
    public String toString()
    {
        return this.name;
    }
    
}
