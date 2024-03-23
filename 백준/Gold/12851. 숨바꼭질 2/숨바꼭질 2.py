from collections import deque

def bfs(n, k):
    max = 100001
    times = [-1] * max
    ways = [0] * max
    queue = deque([(n, 0)])
    times[n] = 0
    ways[n] = 1

    while queue:
        current_location, current_time = queue.popleft()

        for next_location in [current_location - 1, current_location + 1, current_location * 2]:
            if 0 <= next_location < max:
                if times[next_location] == -1:
                    queue.append((next_location, current_time + 1))
                    times[next_location] = current_time + 1
                    ways[next_location] = ways[current_location]
                elif times[next_location] == current_time + 1:
                    ways[next_location] += ways[current_location]

    return times[k], ways[k]

n, k = map(int, input().split())
time, way = bfs(n, k)
print(time)
print(way)