from collections import deque

def solution(priorities, location):
    queue = deque((priority, idx) for idx, priority in enumerate(priorities))
    execution_order = 0

    while queue:
        current = queue.popleft()
        if any(current[0] < other[0] for other in queue):
            queue.append(current)
        else:
            execution_order += 1
            if current[1] == location:
                return execution_order