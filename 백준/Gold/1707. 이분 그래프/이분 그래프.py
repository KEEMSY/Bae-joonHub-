from collections import deque

def is_bipartite(V, edges):
    color = [-1] * V
    for start_vertex in range(V):
        if color[start_vertex] == -1:
            queue = deque([start_vertex])
            color[start_vertex] = 1  
            while queue:
                u = queue.popleft()
                for v in edges[u]:
                    if color[v] == -1:
                        color[v] = 1 - color[u]
                        queue.append(v)
                    elif color[v] == color[u]:
                        return "NO"
    return "YES"

K = int(input())
for _ in range(K):
    V, E = map(int, input().split())
    edges = [[] for _ in range(V)]
    for _ in range(E):
        u, v = map(int, input().split())
        edges[u-1].append(v-1)  
        edges[v-1].append(u-1)
    print(is_bipartite(V, edges))
