import heapq
import sys
input = sys.stdin.readline

n, k = map(int, input().split())
jewel_info = []
for _ in range(n):
    heapq.heappush(jewel_info, list(map(int, input().split())))

bags = []
for _ in range(k):
    bags.append(int(input()))
bags.sort()

answer = 0
temp = []
for bag in bags:
    while jewel_info and bag >= jewel_info[0][0]:
        heapq.heappush(temp, -heapq.heappop(jewel_info)[1])
    if temp:
        answer -= heapq.heappop(temp)
    elif not jewel_info:
        break
print(answer)