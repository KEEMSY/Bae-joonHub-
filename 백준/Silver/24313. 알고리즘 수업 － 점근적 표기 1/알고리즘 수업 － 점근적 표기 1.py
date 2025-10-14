a1, a0 = map(int, input().split())
c = int(input())
n0 = int(input())

if a1 <= c and (a1 - c) * n0 + a0 <= 0:
    print(1)
else:
    print(0)