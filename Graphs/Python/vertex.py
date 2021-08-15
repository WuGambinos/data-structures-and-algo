class Vertex:
    
    def __init__(self, name):
        self.neighbors = []
        self.name = name
    

    def add_neighbors(self, vertex):
        self.neighbors.append(vertex)

    def __repr__(self):

        return self.name