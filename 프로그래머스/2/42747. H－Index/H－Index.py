def solution(citations):
    citations.sort(reverse=True)
    answer = 0
    
    for i, citation in enumerate(citations):
        if citation >= i + 1:
            answer = i + 1
        else:
            break 
            
    return answer