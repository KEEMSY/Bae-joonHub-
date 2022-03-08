case = int(input())

for _ in range(case):
    floor = int(input())
    n = int(input())
    floor0 = [x for x in range(1,n+1)]

    for i in range(floor):
        for j in range(1,n):
            floor0[j] += floor0[j-1]
    print(floor0[-1])
