def solution(arr):
    answer = []
    before_target = 10
    for target in arr:
        if before_target == target:
            continue
        answer.append(target)
        before_target = target
    return answer