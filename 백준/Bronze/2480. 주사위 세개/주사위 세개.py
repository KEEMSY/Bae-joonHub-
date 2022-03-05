x = list(map(int,input().split()))
result = 0

if len(set(x)) == 1:
    result = 10000 + (x[0] * 1000) 
    
elif len(set(x)) == 2:
    target = 0
    check = {}
    
    for i in set(x):
        check[i]=0
    for j in x:
        check[j] += 1

    for k in x:
        if check[k] == 2:
            result = 1000 + (k * 100)
    
else:
    result = max(x) * 100

print(result)