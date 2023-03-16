def solution(N, stages):
    answer = {}
    s = len(stages)
    for i in range(1, N + 1):
        if s != 0:
            fail_value = stages.count(i)
            answer[i] = fail_value / s
            s -= fail_value
        else:
            answer[i] = 0

    return sorted(answer, key=lambda x: answer[x], reverse=True)