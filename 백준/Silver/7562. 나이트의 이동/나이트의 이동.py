from collections import deque

def bfs(l, start, end):
    moves = [(2, 1), (2, -1), (-2, 1), (-2, -1), (1, 2), (1, -2), (-1, 2), (-1, -2)]
    visited = [[False] * l for _ in range(l)]
    queue = deque([(start[0], start[1], 0)])
    
    while queue:
        x, y, count = queue.popleft()
        if (x, y) == end:
            return count
        for dx, dy in moves:
            nx, ny = x + dx, y + dy
            if 0 <= nx < l and 0 <= ny < l and not visited[nx][ny]:
                visited[nx][ny] = True
                queue.append((nx, ny, count + 1))
    return -1

t = int(input())
for _ in range(t):
    l = int(input())  
    start = tuple(map(int, input().split()))  
    end = tuple(map(int, input().split()))
    print(bfs(l, start, end))