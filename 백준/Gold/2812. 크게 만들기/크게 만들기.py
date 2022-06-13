n, k = map(int, input().split())
number = input()
answer = []

for num in number:
    while k > 0 and answer and answer[-1] < num:
        answer.pop()
        k -= 1
    answer.append(num)
print(''.join(answer[:len(answer)-k]))