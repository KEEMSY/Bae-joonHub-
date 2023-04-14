def solution(cap, n, deliveries, pickups):
    answer = 0
    deliveries = deliveries[::-1]
    pickups = pickups[::-1]
    
    now_deli = 0
    now_pick = 0
    
    for i in range(n):
        now_deli += deliveries[i]
        now_pick += pickups[i]
        
        while now_deli > 0 or now_pick > 0:
            now_deli -= cap
            now_pick -= cap
            answer += (n-i) * 2
            
    return answer