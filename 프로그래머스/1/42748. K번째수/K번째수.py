def solution(array, commands):
    answer = []
    for start, end, target in commands:    
        new_arr = sorted(array[start-1:end])
        answer.append(new_arr[target-1])
    return answer