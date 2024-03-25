from collections import deque

def bfs(N, K):
    visited = [False] * 100001
    
    queue = deque([(N, 0)])  
    visited[N] = True
    
    while queue:
        current_pos, current_time = queue.popleft()
        
        if current_pos == K:
            return current_time
       
        for next_pos in (current_pos - 1, current_pos + 1, current_pos * 2):
            if 0 <= next_pos <= 100000 and not visited[next_pos]:
                visited[next_pos] = True
                if next_pos == current_pos * 2:
                    queue.appendleft((next_pos, current_time))
                else:
                    queue.append((next_pos, current_time + 1))
    return -1

N, K = map(int, input().split())

print(bfs(N, K))