# 27
from collections import deque
def solution(queue1, queue2):
    answer = 0
    sum1 = sum(queue1)
    sum2 = sum(queue2)
    len_ = len(queue1) * 3
    
    queue1 = deque(queue1)
    queue2 = deque(queue2)
    
    for i in range(len_):
        if sum1 > sum2:
            tmp = queue1.popleft()
            sum1 -= tmp
            sum2 += tmp
            queue2.append(tmp)
        elif sum1 < sum2:
            tmp = queue2.popleft()
            sum1 += tmp
            sum2 -= tmp
            queue1.append(tmp)
        else : return answer 
        answer+=1
    else:   return -1