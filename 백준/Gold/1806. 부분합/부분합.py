n, s = map(int, input().split())
data = list(map(int,input().split()))

start, end = 0, 0
temp = data[0]
min_len = n+1
temp_len = 1

while start < n and end < n:
    if temp < s:
        end += 1
        if end == n:
            break
        temp += data[end]
        temp_len += 1
    else:
        min_len = min(min_len, temp_len)
        temp -= data[start]
        start += 1
        temp_len -= 1
        if start > end:
            end += 1
            if end == n:
                break
            temp += data[end]
            temp_len += 1
        
print(0 if min_len == n + 1 else min_len)