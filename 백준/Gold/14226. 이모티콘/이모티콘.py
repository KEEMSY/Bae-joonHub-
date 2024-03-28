from collections import deque

def min_time_to_create_emoticons(S):
    # A visited set to avoid re-visiting the same state
    visited = set()
    queue = deque([(1, 0, 0)])  # (screen, clipboard, time)
    visited.add((1, 0))
    
    while queue:
        screen, clipboard, time = queue.popleft()
        
        if screen == S:
            return time
        
        if screen != clipboard and (screen, screen) not in visited:
            visited.add((screen, screen))
            queue.append((screen, screen, time + 1))
        
        if clipboard > 0 and screen + clipboard <= S and (screen + clipboard, clipboard) not in visited:
            visited.add((screen + clipboard, clipboard))
            queue.append((screen + clipboard, clipboard, time + 1))
        
        if screen > 1 and (screen - 1, clipboard) not in visited:
            visited.add((screen - 1, clipboard))
            queue.append((screen - 1, clipboard, time + 1))
    
    return -1


S = int(input())
print(min_time_to_create_emoticons(S))