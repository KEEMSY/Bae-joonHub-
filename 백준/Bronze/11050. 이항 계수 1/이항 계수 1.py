def factorial(n):
    num = 1
    for i in range(1, n+1):
        num *= i
    return num

n,k = map(int,input().split())
answer = factorial(n) // (factorial(k) * factorial(n - k))
print(answer)