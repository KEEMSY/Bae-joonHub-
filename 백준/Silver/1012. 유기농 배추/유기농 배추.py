import sys
sys.setrecursionlimit(10**6)

def dfs(x,y):
    if x<=-1 or x >= n or y <= -1 or y >= m:
        return False
    if graph[x][y] == 1:
        graph[x][y] = 0
        dfs(x+1,y)
        dfs(x,y+1)
        dfs(x-1,y)
        dfs(x,y-1)
        return True
    return False


t = int(input())

for _ in range(t):
    m, n, k = map(int,input().split())
    graph = [[0]*m for _ in range(n)]

    for _ in range(k):
        x, y = map(int,input().split())
        graph[y][x] = 1

    answer = 0
    for i in range(n):
        for j in range(m):
            if dfs(i,j):
                dfs(i,j)
                answer += 1
    print(answer)