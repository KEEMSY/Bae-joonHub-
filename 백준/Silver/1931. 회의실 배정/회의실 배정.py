import sys

n = int(sys.stdin.readline())
time = [[0]*2 for _ in range(n)]
for i in range(n):
    start, end = map(int, sys.stdin.readline().split())
    time[i][0] = start
    time[i][1] = end
    
time.sort(key=lambda x: (x[1], x[0]))

answer = 1
end_time = time[0][1]
for i in range(1, n):
    if time[i][0] >= end_time:
        answer += 1
        end_time = time[i][1]
print(answer)