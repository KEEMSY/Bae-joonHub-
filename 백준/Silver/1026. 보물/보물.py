n = int(input())

a_list = list(map(int,input().split()))
b_list = list(map(int,input().split()))

a_list.sort(reverse=True)
b_list.sort()

answer = 0
for i in range(len(a_list)):
    answer += a_list[i] * b_list[i]
print(answer)