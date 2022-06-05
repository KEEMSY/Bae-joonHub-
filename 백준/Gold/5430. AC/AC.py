from collections import deque

t = int(input())
for _ in range(t):
    cmd = input()
    
    n = int(input())
    data = deque(input()[1:-1].split(','))
    if n == 0:
        data = deque()
        
    reverse_flag = False
    error_flag = False
    for c in cmd:
        if c == 'R':
            reverse_flag = not reverse_flag
        elif c == 'D':
            if not data:
                error_flag = True
                break
            if reverse_flag:
                data.pop()
            else: 
                data.popleft()

    if error_flag:
        print('error')
    else:
        if reverse_flag:
            data.reverse()
        print('[' + ','.join(data) +']')
