def solution(citations):
    answer = 0
    citations.sort(reverse=True)

    for citation in citations:
        h = 0
        for target in citations:
            if citation <= target:
                h += 1
        if h <= citation:
            answer = max(h,  answer)
            
    return answer