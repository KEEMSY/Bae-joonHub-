def solution(brown, yellow):
    total = brown + yellow
    for b in range(1, total + 1):
        if total % b == 0:
            a = total / b
            if a + b == (brown + 4) // 2:
                return [a, b]