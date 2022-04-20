import sys
input = sys.stdin.readline

n = int(input())
n_list = list(map(int,input().split()))

m = int(input())
m_list = list(map(int,input().split()))

answer = {}
for n_member in n_list:
    if n_member in answer:
        answer[n_member] += 1
    else:
        answer[n_member] = 1
for target in m_list:
    result = answer.get(target)
    if result == None:
        print(0, end=" ")
    else:
        print(result, end=" ")

