def check(num):
    if num == 1:
        return False
    else:
        for i in range(2, int(num**0.5) + 1):
            if num % i == 0:
                return False
        return True


temp = []
for x in range(2,246912):
    if check(x):
        temp.append(x)


while True:
    n = int(input())
    answer = 0
    if n == 0:
        break
    else:
        for i in temp:
            if n < i <= 2*n:
                answer += 1
        print(answer)
