def check(n):
    num_list = [int(i) for i in str(n)]
    num_check = 0
    
    for idx in range(1, len(num_list)):
        check = num_list[idx-1] - num_list[idx]
        if idx == 1:
            num_check = check
        else:
            if num_check != check:
                return False
    return True

n = int(input())


result = 0

for i in range(1,n+1):
    if check(i) == True:
        result += 1
print(result)