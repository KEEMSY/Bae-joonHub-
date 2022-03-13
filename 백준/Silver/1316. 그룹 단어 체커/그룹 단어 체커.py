case = int(input())
answer = 0
for _ in range(case):
    check = []
    word = input()
    for i in range(1, len(word)):
        if word[i-1] != word[i]:
            check.append(word[i-1])
    check.append(word[len(word)-1])
    if len(check) == len(set(check)):
        answer += 1
print(answer)