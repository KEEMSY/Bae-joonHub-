def check(num):
    if num == 1:
        return False
    for i in range(2, num):
        if num % i == 0:
            return False
        else:
            continue
    return True
    
n = int(input())

answer = 0

num_list = list(map(int,input().split()))
for i in num_list:
    if check(i) == True:
        answer += 1

print(answer)
