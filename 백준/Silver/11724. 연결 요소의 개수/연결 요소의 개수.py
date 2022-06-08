from collections import deque
import sys
input = sys.stdin.readline

def bfs(graph, start, visited):
    q = deque([start])
    visited[start] = True
    while q:
        now = q.popleft()
        for i in graph[now]:
            if not visited[i]:
                q.append(i)
                visited[i] = True

n, m = map(int, input().split())
graph = [[]for _ in range(n+1)]
visited = [0] * (n+1)
for _ in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

cnt = 0
for i in range(1, n + 1):
    if not visited[i]:
        bfs(graph, i, visited)
        cnt += 1
print(cnt)