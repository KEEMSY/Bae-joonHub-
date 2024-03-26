
from collections import deque

def bfs():
    q = deque()
    q.append(n)
    while q:
        v = q.popleft()
        if v == k:
            print(visited[v])
            ans = []
            while v != n:
                ans.append(v)
                v = path[v]
            ans.append(n)
            ans.reverse()  
            print(' '.join(map(str, ans)))
            return
        for next_step in (v-1, v+1, v*2):
            if 0 <= next_step < MAX and not visited[next_step]:
                visited[next_step] = visited[v] + 1
                q.append(next_step)
                path[next_step] = v  

n, k = map(int, input().split())
MAX = 100001
visited = [0] * MAX
path = [0] * MAX
bfs()