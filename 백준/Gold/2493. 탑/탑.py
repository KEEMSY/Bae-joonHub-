import sys
input = sys.stdin.readline
n = int(input())

towers = list(map(int,input().split()))
answer = []
stack = []

for i in range(n):
    while stack:
        if stack[-1][1] > towers[i]:
            answer.append(stack[-1][0]+1)
            break
        else:
            stack.pop()
    if not stack:
        answer.append(0)
    stack.append([i,towers[i]])
    
print(*answer)