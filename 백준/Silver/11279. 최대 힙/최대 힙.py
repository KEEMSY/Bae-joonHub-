import sys
import heapq
input = sys.stdin.readline

n = int(input())
hp = []

for _ in range(n):
    x = int(input())
    if x == 0:
        if len(hp) > 0:
            
            print(heapq.heappop(hp)[1])            
        else:
            print(0)
    else:
        heapq.heappush(hp, (-x,x))