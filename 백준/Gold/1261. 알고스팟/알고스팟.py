from collections import deque

N, M = map(int, input().split())
graph = []
for i in range(M):
    graph.append(list(map(int, input())))

dist = [[-1] * N for _ in range(M)]  # 벽을 깬 횟수를 저장

dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]

def bfs(a, b):
    queue = deque()
    queue.append([a, b])
    dist[0][0] = 0

    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx < 0 or nx >= M or ny < 0 or ny >= N:
                continue

            if dist[nx][ny] == -1:
                if graph[nx][ny] == 0:
                    dist[nx][ny] = dist[x][y]
                    queue.appendleft([nx, ny])  # 벽이 없는 곳을 우선적으로 돌도록 큐의 맨 왼쪽에 넣음

                else:
                    dist[nx][ny] = dist[x][y] + 1  # 전의 벽을 깬 횟수에서 +1
                    queue.append([nx, ny])

bfs(0, 0)
print(dist[M - 1][N - 1])