def solution(citations):
    citations.sort(reverse=True)
    answer = 0
    
    for i, citation in enumerate(citations, start=1):
        if citation >= i:
            answer = i
        else:
            break 
            
    return answer