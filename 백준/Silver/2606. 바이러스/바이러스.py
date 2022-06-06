from collections import deque
com = int(input())
n = int(input())

visited = [0] * (com + 1)
graph = [[] for _ in range(com+1)]
for i in range(n):
    a, b = map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)

cnt = 0
q = deque([1])
while q:
    now = q.popleft()
    visited[now] = True
    for i in graph[now]:
        if not visited[i]:
            visited[i] = True
            q.append(i)
            cnt += 1
print(cnt)