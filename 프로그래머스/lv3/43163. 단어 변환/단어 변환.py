from collections import deque

def check(word, target):
    cnt = 0
    for a, b in zip(word, target):
        if a != b:
            cnt += 1
    return True if cnt == 1 else False

def solution(begin, target, words):
    answer = 0
    if target not in words:
        return 0
    
    w = len(words)
    visited = [0] * w
    queue = deque([[begin, 0]])

    while queue:
        start, cnt = queue.popleft()
        for i in range(w):
            if check(words[i], start) and not visited[i]:
                if words[i] == target:
                    return cnt + 1
                visited[i] = 1
                queue.append([words[i], cnt + 1])