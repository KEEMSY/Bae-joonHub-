from collections import deque
n, m = map(int,input().split())
max_range = 100001
visited = [0] * max_range

def bfs():
    q = deque()
    q.append(n)
    while q:
        now = q.popleft()
        if now == m:
            print(visited[now])
            break
        for i in (now -1, now + 1, now * 2):
            if 0 <= i < max_range and not visited[i]:
                visited[i] = visited[now] + 1
                q.append(i)
bfs()