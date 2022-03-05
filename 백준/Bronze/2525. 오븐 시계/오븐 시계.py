x = list(map(int,input().split()))
r = int(input())

if r >= 60:
    x[0] += (r//60)
    r %= 60
    x[1] += r
else:
    x[1] += r
    if x[1] >= 60:
        x[1] -= 60
        x[0] += 1

if x[1] >= 60:
    x[0] += 1
    x[1] -= 60
    
if x[0] >= 24:
    x[0] -= 24


print(x[0], x[1])
    

