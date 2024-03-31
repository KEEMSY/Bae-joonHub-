import sys
sys.setrecursionlimit(10**6)
k = int(input())


def DFS(start, visited, graph, group):
    visited[start] = group

    for v in graph[start]:
        if visited[v] == 0:
            result = DFS(v, visited, graph, -group)
            if not result:
                return False
        else:
            if visited[v] == group:  
                return False
    return True


for _ in range(k):
    V, E = map(int, sys.stdin.readline().split())
    graph = [[] for _ in range(V+1)]
    visited = [0] * (V+1)
    for _ in range(E):
        a, b = map(int, sys.stdin.readline().split())
        graph[a].append(b)
        graph[b].append(a)

    for i in range(1, V+1):
        if visited[i] == 0:
            result = (DFS(i, visited, graph, 1))
            if not result:
                break
    print("YES") if result else print("NO")