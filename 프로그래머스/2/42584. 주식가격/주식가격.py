def solution(prices):
    answer = []
    l_p = len(prices)
    for i in range(l_p):
        time = 0
        price = prices[i]
        
        for j in range(i+1, l_p):
            next_price = prices[j]
            time += 1
            if price > next_price:
                break
            
        answer.append(time)
        
    return answer