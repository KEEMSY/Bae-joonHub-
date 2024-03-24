import heapq

def solution(jobs):
    jobs.sort()
    n = len(jobs)
    time, total_wait, index = 0, 0, 0
    
    pq = []
    while index < n or pq:
        while index < n and jobs[index][0] <= time:
            heapq.heappush(pq, (jobs[index][1], jobs[index][0]))
            index += 1
        
        if pq:
            duration, request_time = heapq.heappop(pq)
            total_wait += time - request_time + duration
            time += duration
        else:
            time = jobs[index][0]
    
    return total_wait // n