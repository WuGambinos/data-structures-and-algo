from vertex import Vertex

print("DEPTH FIRST SEARCH")


v1 = Vertex("0")
v2 = Vertex("1")
v3 = Vertex("2")
v4 = Vertex("3")

v1.add_neighbors(v2)
v1.add_neighbors(v3)

v2.add_neighbors(v3)

v3.add_neighbors(v4)

"""
v1 = Vertex("A")
v2 = Vertex("B")
v3 = Vertex("C")
v4 = Vertex("D")
v5 = Vertex("E")
v6 = Vertex("F")

v1.add_neighbors(v2)
v1.add_neighbors(v3)

v2.add_neighbors(v4)
v2.add_neighbors(v5)

v3.add_neighbors(v1)
v3.add_neighbors(v5)

v4.add_neighbors(v2)
v4.add_neighbors(v5)
v4.add_neighbors(v6)

v5.add_neighbors(v2)
v5.add_neighbors(v3)
v5.add_neighbors(v4)
v5.add_neighbors(v6)

v6.add_neighbors(v4)
v6.add_neighbors(v5)
"""



"""
def dfs(root):

    visited = set()
    stack = []
    stack.append(root)
    visited.add(root)

    while(stack != []):

        node = stack.pop()
        
        if(node not in visited):
            print(node , end= " ")
            visited.add(node)
        
        for n in node.neighbors:
            if n not in visited:

                stack.append(n)
            visited.add(node)
    
    print(visited)
"""

# Using a Python dictionary to act as an adjacency list
graph = {
    'A' : ['B','C', 'D', "E"],
    'B' : ['C', 'G'],
    'C' : ['A','B', 'D'],
    'D' : ['A', 'C', 'E', 'H'],
    'E' : ['A', 'D', 'F'],
    'F' : ['E','G', 'H'],
    'G': ['B', 'F'],
    'H': ['D', 'F'],

}

visited = set() # Set to keep track of visited nodes.

"""
def dfs(visited, graph, node):
    if node not in visited:
        print (node)
        visited.add(node)
        for neighbour in graph[node]:
            dfs(visited, graph, neighbour)
"""

def dfs(visited, graph, node):
    stack = []

    stack.append(node)
    while(stack != []):

        n = stack.pop()

        if(n not in visited):
            visited.add(n)
            print(n)
        
        for neighbor in graph[node]:
            if(neighbor not in visited):
                stack.append(neighbor)

# Driver Code
dfs(visited, graph, 'A')
