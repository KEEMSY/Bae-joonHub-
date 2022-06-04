import sys
from collections import deque

TC = int(sys.stdin.readline())

for _ in range(TC):
    cmd = sys.stdin.readline().strip()
    size = int(sys.stdin.readline())

    line = sys.stdin.readline()[1:-2].split(",")
    queue = deque()
    for each in line:
        if each != '':
            queue.append(each)

    errorflag = 0
    reverse = 0

    for each in cmd:
        if each == "R": 
            if reverse == 0:
                reverse = 1
            else:
                reverse = 0
        else: 
            if queue and queue[0] != '':
                if reverse == 0:
                    queue.popleft()
                else:
                    queue.pop()
            else:
                errorflag = 1
                break

    if errorflag == 1:  
        print("error")
    else:
        if reverse == 1:
            queue.reverse()

        print("[", end='')
        for i in range(len(queue)):
            if i == len(queue)-1:
                print(str(queue[i]),end='')
            else:
                print(queue[i],end=',')
        print("]")