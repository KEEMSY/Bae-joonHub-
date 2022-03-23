n = int(input())
n_list = list(map(int,input().split()))
n_list.sort()

if n == 1:
    print(n_list[0]**2)
else:
    print(n_list[0] * n_list[-1])