def dfs(dungeons,visited,k,cnt,case):
    global answer
    d = len(dungeons)
    flag = False
    for a,b in dungeons:
        if (a,b) not in visited:
            if k >= a:
                flag = True
                visited.add((a,b))
                case.append((a,b))
                dfs(dungeons, visited, k-b, cnt + 1,case)
                visited.remove((a,b))
                case.pop()
            
    if not flag:
        if answer < cnt:
            answer = cnt
    
def solution(k, dungeons):
    global answer
    answer = -1
    d = len(dungeons)
    visited = set()
    dfs(dungeons, visited, k, 0,[])
    return answer