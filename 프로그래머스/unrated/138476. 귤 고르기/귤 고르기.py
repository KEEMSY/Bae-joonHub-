def solution(k, tangerine):
    answer = 0
    check = {}
    temp_sum = 0
    
    for num in tangerine:
        check[num] = 0
    
    for num in tangerine:
        check[num] += 1

    sorted_check = sorted(check.items(), key = lambda item: -item[1])
    
    for key, value in sorted_check:
        if temp_sum >= k:
            return answer
        temp_sum += value
        answer += 1
    
    return answer
