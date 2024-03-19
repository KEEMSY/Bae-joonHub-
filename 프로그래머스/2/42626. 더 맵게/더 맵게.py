import heapq

def solution(scoville, K):
    heapq.heapify(scoville)
    
    answer = 0    
    while scoville[0] < K:
        if len(scoville) < 2:
            return -1
        
        first_scoville = heapq.heappop(scoville)
        second_scoville = heapq.heappop(scoville)
        heapq.heappush(scoville, first_scoville + second_scoville * 2)
        answer += 1
    return answer
