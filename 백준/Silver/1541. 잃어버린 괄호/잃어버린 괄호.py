n = input().split("-")
answer = 0

for x in n[0].split('+'):
    answer += int(x)

for i in n[1:]:
    for j in i.split("+"):
        answer -= int(j)
print(answer)