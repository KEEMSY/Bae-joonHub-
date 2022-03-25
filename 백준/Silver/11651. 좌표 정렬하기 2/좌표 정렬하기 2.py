n = int(input())
check = []
for _ in range(n):
    check.append(list(map(int,input().split())))
check.sort(key=lambda x : (x[1],x[0]))

for i in check:
    print(i[0],i[1])