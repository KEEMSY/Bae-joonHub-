import heapq
import sys
input = sys.stdin.readline

n = int(input())
data = []
for _ in range(n):
    data.append(int(input()))
heapq.heapify(data)

ANSWER = 0
while len(data) > 1:
    a = heapq.heappop(data)
    b = heapq.heappop(data)
    ANSWER += (a+b)
    heapq.heappush(data, a+b)
print(ANSWER)