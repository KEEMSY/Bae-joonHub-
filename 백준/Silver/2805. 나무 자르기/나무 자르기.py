n, m = map(int,input().split())
trees = list(map(int,input().split()))

start, end = 0, max(trees)

while start <= end:
    mid = (start + end) // 2
    tree = 0
    for i in trees:
        if i > mid:
            tree += i - mid
    if tree >= m:
        start = mid + 1
    else:
        end = mid -1
print(end)




