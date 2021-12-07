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





# Driver Code
#dfs(visited, graph, 'A')
dfs(v2)