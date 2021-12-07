package Graphs.Java;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class DFS
{
    private Stack<Vertex> stack;
    Set<Vertex> seen;

    public DFS()
    {

        stack = new Stack<>();
        seen = new HashSet<>();

    }

    public void search(Vertex start)
    {
        stack.push(start);

        while(!stack.isEmpty())
        {
            Vertex curr = stack.pop();

            if(!seen.contains(curr))
            {
                seen.add(curr);
                System.out.println(curr);

                for(Vertex adj: curr.getChildren())
                {
                    if(!seen.contains(adj))
                    {
                        stack.push(adj);
                    }
                }
            }
        }
    }

}