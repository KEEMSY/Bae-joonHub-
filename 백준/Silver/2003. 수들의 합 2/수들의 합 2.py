n, m = map(int, input().split())
data = list(map(int, input().split()))

cnt = 0
start, end = 0, 0
temp = data[0]

while end < n:
    if temp < m:
        end += 1
        if end == n:
            break
        temp += data[end]
    elif temp > m:
        temp -= data[start]
        start += 1
        if start > end:
            end += 1
            if end == n:
                break
            temp += data[end]
    else:
        cnt += 1
        end += 1
        if end == n:
            break
        temp += data[end]
print(cnt)