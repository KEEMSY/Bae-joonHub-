import heapq

def solution(S, k):
    heapq.heapify(S)
    answer = 0
    while S[0]<k:    
        if len(S) < 2:
            return -1
        heapq.heappush(S,heapq.heappop(S) + (heapq.heappop(S) * 2))
        answer += 1
    return answer