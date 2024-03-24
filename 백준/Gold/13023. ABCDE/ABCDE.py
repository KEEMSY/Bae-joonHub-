def dfs(node, depth):
    if depth == 4:
        print(1)
        exit()
    
    visited[node] = True
    for friend in friendships[node]:
        if not visited[friend]:
            dfs(friend, depth+1)
    visited[node] = False
    
n, m = map(int, input().split())
friendships = [[] for _ in range(n)]
visited = [False] * n

for _ in range(m):
    a, b = map(int, input().split())
    friendships[a].append(b)
    friendships[b].append(a)
    
for i in range(n):
    dfs(i, 0)
    visited[i] = False

print(0)