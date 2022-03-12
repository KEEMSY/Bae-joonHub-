N = int(input())
n = 0
M=N
while True:
    a = M//10
    b = M%10
    c = (a+b)%10
    d = (10*b)+c
    n+=1
    if d==N:
        break
    M=d
print(n)