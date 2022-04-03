from collections import deque

def bfs(graph, start, visited):
    q = deque([start])
    visited[start] = True

    while q:
        v = q.popleft()
        print(v,end=' ')
        for i in graph[v]:
            if not visited[i]:
                q.append(i)
                visited[i]=True


def dfs(graph, v, visited):
    visited[v] = True
    print(v, end=' ')
    for i in graph[v]:
        if not visited[i]:
            dfs(graph, i, visited)

n, m, v = map(int,input().split())

graph = [[] for _ in range(n+1)]
visited = [False] * (n + 1)

for __ in range(m):
    a,b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)
for i in range(1, n+1):
    graph[i].sort()


dfs(graph, v, visited)
visited = [False] * (n + 1)
print()
bfs(graph, v, visited)