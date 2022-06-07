from collections import deque
import sys

r, c = map(int, sys.stdin.readline().split())
graph = [list(map(str, sys.stdin.readline().strip())) for _ in range(r)]
cnt = 1

dr = [1,-1,0,0]
dc = [0,0,1,-1]

q = set([(0, 0, graph[0][0])])

while q:
    now_r, now_c, now_graph = q.pop()
    cnt = max(cnt, len(now_graph))
    
    for i in range(4):
        nr = now_r + dr[i]
        nc = now_c + dc[i]
        if 0 <= nr < r and 0 <= nc < c and graph[nr][nc] not in now_graph:
            q.add((nr,nc, now_graph + graph[nr][nc]))
print(cnt)